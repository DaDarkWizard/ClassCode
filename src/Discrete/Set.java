package Discrete;

public interface Set<T> extends Iterable<T>, Logicable<Set<T>> {
    boolean contains(Object item);
    boolean remove(T item);
    void add(T item);
    T get(int index);
    int size();
    boolean isEmpty();
}
