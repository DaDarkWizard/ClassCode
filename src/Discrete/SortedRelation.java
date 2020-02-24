package Discrete;

import java.util.ArrayList;
import java.util.Iterator;

public class SortedRelation<T extends Comparable<T>> implements Relation<T>{

    private SortedSet<RelationPair<T>> set = new SortedSet<>();
    private SortedSet<T> source = new SortedSet<>();

    public SortedRelation(Set<T> source) {
        for(T item : source) {
            this.source.add(item);
        }
    }

    @Override
    public boolean contains(RelationPair<T> pair) {
        return set.contains(pair);
    }

    @Override
    public Iterator<RelationPair<T>> iterator() {
        return set.iterator();
    }

    @Override
    public void add(T key, T value) {
        if(!source.contains(key) || !source.contains(value)) {
            throw new IllegalArgumentException("Relation not on source set!");
        }

        RelationPair<T> pair = new Pair(key, value);
        if(!set.contains(pair)) {
            set.add(pair);
        }
    }

    public ArrayList<T> matches(T input) {
        ArrayList<T> output = new ArrayList<>();

        for(RelationPair<T> pair : set) {
            if(pair.getKey().equals(input)) {
                output.add(pair.getValue());
            }
        }

        return output;
    }

    @Override
    public Relation<T> inverse() {
        SortedRelation<T> output = new SortedRelation<>(this.source);

        for(RelationPair<T> pair : set) {
            output.add(pair.getValue(), pair.getKey());
        }

        return output;
    }

    @Override
    public Relation<T> of(Relation<T> relation) {
        if(!relation.getSource().equals(this.getSource())) {
            throw new IllegalArgumentException("Sets must have the same source!");
        }

        Relation<T> output = new SortedRelation<>(source);

        for(RelationPair<T> primary : relation) {
            ArrayList<T> matches = this.matches(primary.getValue());
            for(T match : matches) {
                output.add(primary.getKey(), match);
            }
        }

        return output;
    }

    @Override
    public String toString() {
        return set.toString();
    }

    @Override
    public Relation<T> union(Relation<T> set) {
        if(!set.getSource().equals(this.getSource())) {
            throw new IllegalArgumentException("Sets must have the same source!");
        }

        SortedRelation<T> output = new SortedRelation<>(source);

        for(RelationPair<T> pair : set) {
            output.add(pair.getKey(), pair.getValue());
        }

        for(RelationPair<T> pair : this) {
            output.add(pair.getKey(), pair.getValue());
        }

        return output;
    }

    @Override
    public Relation<T> junction(Relation<T> set) {
        if(!set.getSource().equals(this.getSource())) {
            throw new IllegalArgumentException("Sets must have the same source!");
        }

        SortedRelation<T> output = new SortedRelation<>(source);

        for(RelationPair<T> pair : set) {
            if(this.contains(pair)) {
                output.add(pair.getKey(), pair.getValue());
            }
        }

        return output;
    }

    @Override
    public Relation<T> difference(Relation<T> set) {
        if(!set.getSource().equals(this.getSource())) {
            throw new IllegalArgumentException("Sets must have the same source!");
        }

        SortedRelation<T> output = new SortedRelation<>(source);

        for(RelationPair<T> pair : this) {
            if(!set.contains(pair)) {
                output.add(pair.getKey(), pair.getValue());
            }
        }

        return output;
    }

    @Override
    public Relation<T> compliment(Relation<T> universal) {


        return universal.difference(this);
    }

    @Override
    public Set<T> getSource() {
        return source;
    }

    public class Pair implements RelationPair<T> {
        private T key;
        private T value;

        public Pair(T key, T value) {
            this.key = key;
            this.value = value;
        }

        public void setKey(T key) {
            this.key = key;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public T getKey() {
            return key;
        }

        public T getValue() {
            return value;
        }

        @Override
        public int compareTo(RelationPair<T> o) {
            if(this.getKey().compareTo(o.getKey()) == 0) {
                return this.getValue().compareTo(o.getValue());
            } else {
                return this.getKey().compareTo(o.getKey());
            }
        }

        @Override
        public String toString() {
            return "(" + this.getKey() + ", " + this.getValue() + ")";
        }

        @Override
        public boolean equals(Object object) {
            if(!(object instanceof RelationPair<?>)) {
                return false;
            }

            RelationPair<?> pair = (RelationPair<?>)object;

            return pair.getKey().equals(this.getKey()) && pair.getValue().equals(this.getValue());
        }
    }


}
