package Data;

public class GenericsTest {
    public static void main(String[] args) {

    }

    public static <T extends Comparable<T>> void swap(T[] input, int index1, int index2) {
        T tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = input[index1];

    }
}
