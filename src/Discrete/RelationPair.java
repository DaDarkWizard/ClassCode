package Discrete;

public interface RelationPair<T extends Comparable<T>> extends Comparable<RelationPair<T>> {
    void setKey(T key);
    void setValue(T value);
    T getKey();
    T getValue();
}
