package Discrete;

import java.util.Iterator;

public class SortedSet<T extends Comparable<T>> implements Set<T> {
    SortedList<T> list = new SortedList<T>();

    @Override
    public Set<T> compliment(Set<T> universal) {
        return universal.difference(this);
    }

    @Override
    public Set<T> difference(Set<T> set) {
        Set<T> output = new SortedSet<T>();

        for(T item : this) {
            output.add(item);
        }

        for(T item : set) {
            if(output.contains(item)) {
                output.remove(item);
            }
        }

        return output;
    }

    @Override
    public Set<T> junction(Set<T> set) {
        Set<T> output = new SortedSet<T>();

        for(T item : set) {
            if(this.contains(item)) {
                output.add(item);
            }
        }

        return output;
    }

    @Override
    public Set<T> union(Set<T> set) {
        Set<T> output = new SortedSet<T>();
        for(T item : set) {
            output.add(item);
        }

        for(T item : this) {
            output.add(item);
        }

        return output;
    }

    @Override
    public boolean contains(Object item) {
        return list.contains(item);
    }

    @Override
    public boolean remove(T item) {
        return list.remove(item);
    }

    @Override
    public void add(T item) {
        if(!contains(item)) {
            list.add(item);
        }
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Set<?>)) {
            return false;
        }

        Set<?> set = (Set<?>)object;

        for(T item : this) {
            if(!set.contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for(int i = 0; i < list.size() - 1; i++) {
            stringBuilder.append(list.get(i).toString()).append(", ");
        }
        stringBuilder.append(list.get(list.size() - 1).toString()).append("}");

        return stringBuilder.toString();
    }
}
