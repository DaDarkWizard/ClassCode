package Discrete;

public interface Logicable<T> {
    T union(T set);
    T junction(T set);
    T difference(T set);
    T compliment(T universal);
}
