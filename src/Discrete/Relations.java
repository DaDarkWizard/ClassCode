package Discrete;

import jdk.internal.dynalink.beans.StaticClass;

import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Relations {

    public static <T extends Comparable<T>> Relation<T> copyOf(Relation<T> relation) {
        SortedRelation<T> output = new SortedRelation<>(relation.getSource());
        for(RelationPair<T> pair : relation) {
            output.add(pair.getKey(), pair.getValue());
        }

        return output;
    }

    public static <T extends Comparable<T>> Relation<T> diagonal(Set<T> base) {
        SortedRelation<T> output = new SortedRelation<>(base);
        for(T item : base) {
            output.add(item, item);
        }

        return output;
    }

    public static <T extends Comparable<T>> Relation<T> reflexiveClosure(Relation<T> relation) {
        return relation.union(Relations.diagonal(relation.getSource()));
    }

    public static <T extends Comparable<T>> Relation<T> symmetricClosure(Relation<T> relation) {
        Relation<T> inverse = relation.inverse();
        //System.out.println(inverse.toString());

        return inverse.union(relation);
    }

    public static <T extends Comparable<T>> Relation<T> transitiveClosure(Relation<T> relation) {
        Relation<T> output = copyOf(relation);
        Relation<T> current = relation.of(relation);
        output = output.union(current);
        for(int i = 1; i < relation.getSource().size(); i++) {
            current = relation.of(current);
            output = output.union(current);
        }

        return output;
    }

    public static <T extends Comparable<T>> String toTikzGraph(Relation<T> relation, double radius, boolean isDirected) {
        SortedSet<T> set = (SortedSet<T>)relation.getSource();
        PriorityQueue<T> nodes = new PriorityQueue<>(set.list);
        int size = set.size();
        StringBuilder output = new StringBuilder();
        output.append("\\begin{tikzpicture}\n" +
                "\\tikzset{vertex/.style = {shape=circle,draw,minimum size=1.5em}}\n" +
                "\\tikzset{edge/.style = {-" + (isDirected ? ">" : "") +",> = latex'}}\n");
        double angle = 2. * Math.PI / (double)size;
        ArrayList<GraphPair> pairs = new ArrayList<>();
        for(int i = 0; i < size && nodes.size() > 0; i++) {
            output.append("\\node[vertex] (").append(i + 1).append(") at (");
            output.append(Math.cos(i * angle)*radius).append(",");
            output.append(Math.sin(i * angle)*radius).append(") {");
            T element = nodes.poll();
            GraphPair pair = new GraphPair(element, i + 1);
            pairs.add(pair);
            output.append(element.toString());
            output.append("};\n");
        }

        output.append("\n\n");

        for(RelationPair<T> relationPair : relation) {
            output.append("\\draw[edge] (");
            output.append(findValue(relationPair.getKey(), pairs));
            output.append(") to ");
            if(relationPair.getKey().equals(relationPair.getValue())) {
                output.append("[out=200, in = 160, looseness=8] ");
            }
            output.append("(");

            output.append(findValue(relationPair.getValue(), pairs));
            output.append(");\n");
        }

        output.append("\n\\end{tikzpicture}");

        return output.toString();
    }

    private static int findValue(Object o, ArrayList<GraphPair> list) {
        for(GraphPair pair : list) {
            if(pair.contains(o)) {
                return pair.getValue();
            }
        }
        return -1;
    }

    private static class GraphPair {

        private Object key;
        private int value;

        public GraphPair(Object key, int value) {
            this.key = key;
            this.value = value;
        }

        public boolean contains(Object o) {
            return key.equals(o);
        }

        public int getValue() {
            return this.value;
        }
    }
}
