package Discrete;

import javafx.scene.layout.Pane;

import java.lang.reflect.Array;
import java.util.*;

public class SortedList<T extends Comparable<T>> implements List<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return list.toArray(a);
    }

    int count = 0;

    @Override
    public boolean add(T t) {
        //TODO
        count = 0;
        if(list.size() == 0) {
            list.add(t);
            return true;
        }

        int bottom = 0;
        int top = list.size() - 1;
        int insert = (top - bottom)/2 + bottom;

        boolean search = true;

        while (top != bottom) {
            count++;
            if(count > 30) {
                System.out.println("Yeet");
            }
            if(t.compareTo(list.get(insert)) == 0) {
                list.add(insert, t);
                return true;
            } else if(t.compareTo(list.get(insert)) > 0) {
                bottom = insert + 1;
                insert = (top - bottom)/2 + bottom;
            } else {
//                if(insert < 1) {
//                    list.add(0, t);
//                    return true;
//                }
                top = Math.max(insert - 1, bottom);
                insert = (top - bottom)/2 + bottom;
            }
        }

        if(t.compareTo(list.get(insert)) > 0) {
            list.add(insert + 1, t);
        } else {
            list.add(insert, t);
        }

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for(T item : c) {
            this.add(item);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for(Object o : c) {
            this.remove(o);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        SortedList<T> output = new SortedList<>();

        for(T item : list) {
            if(c.contains(item)) {
                output.add(item);
            }
        }

        list = output.toArrayList();

        return true;
    }

    @Override
    public void clear() {
        list = new ArrayList<T>();
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public T set(int index, T element) {
        return list.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        add(element);
    }

    @Override
    public T remove(int index) {
        return list.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    private ArrayList<T> toArrayList() {
        return new ArrayList<T>(list);
    }
}
