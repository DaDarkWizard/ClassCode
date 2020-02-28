import Discrete.*;

import java.time.format.TextStyle;

public class Main {
    public static void main(String[] args) {
        /*SortedSet<String> A = new SortedSet<>();
        A.add("Atlanta");
        A.add("Boston");
        A.add("Chicago");
        A.add("Denver");
        A.add("Los Angeles");
        A.add("Miami");
        A.add("New York");
        A.add("San Francisco");

        SortedRelation<String> R = new SortedRelation<>(A);

        R.add("Atlanta", "Boston");
        R.add("Boston", "Chicago");
        R.add("Chicago", "Denver");
        R.add("Denver", "Los Angeles");
        R.add("Los Angeles", "Miami");
        R.add("Miami", "New York");
        R.add("New York", "San Francisco");
        R.add("San Francisco", "Atlanta");*/

        SortedSet<String> A = new SortedSet<>();
        A.add("a");
        A.add("b");
        A.add("c");
        A.add("d");
        A.add("e");

        SortedRelation<String> R = new SortedRelation<>(A);

        R.add("a", "e");
        R.add("b", "a");
        R.add("c", "d");
        R.add("d", "b");
        R.add("e", "e");

        System.out.println(Relations.transitiveClosure(R));
        //System.out.println(R.inverse());
        //System.out.println(Relations.toTikzGraph(R, 4, true));
    }
}
