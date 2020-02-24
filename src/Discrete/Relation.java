package Discrete;


public interface Relation<T extends Comparable<T>> extends Iterable<RelationPair<T>>, Logicable<Relation<T>> {
    Relation<T> inverse();
    Relation<T> of(Relation<T> relation);
    boolean contains(RelationPair<T> pair);
    void add(T key, T value);
    Set<T> getSource();
}
