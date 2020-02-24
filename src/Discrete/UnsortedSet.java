package Discrete;

import javax.swing.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Iterator;

public class UnsortedSet<T> implements Set<T> {

    private ArrayList<T> list = new ArrayList<>();

    public UnsortedSet() {

    }

    public UnsortedSet(T[] objects) {
        for(int i = 0; i < objects.length; i++) {
            this.add(objects[i]);
        }
    }

    @Override
    public void add(T thing) {
        if(!list.contains(thing)) {
            list.add(thing);
        }
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
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
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public boolean equals(Object thing) {
        try {
            UnsortedSet<T> unsortedSet = (UnsortedSet<T>) thing;

            if(unsortedSet.size() != this.size()) {
                return false;
            }

            for(T data : this) {
                if(!unsortedSet.contains(data)) {
                    return false;
                }
            }

            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public Set<T> union(Set<T> set) {
        return null;
    }

    @Override
    public Set<T> junction(Set<T> set) {
        return null;
    }

    @Override
    public Set<T> difference(Set<T> set) {
        return null;
    }

    @Override
    public Set<T> compliment(Set<T> universal) {
        return null;
    }
}
