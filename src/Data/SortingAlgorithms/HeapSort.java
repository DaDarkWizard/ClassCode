package Data.SortingAlgorithms;

@SuppressWarnings({"unused", "Duplicates"})
public class HeapSort {

    public static byte[] heapSort(byte[] input) {
        byte[] output = new byte[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        for(int i = 1; i < input.length; i++) {
            upHeap(output, i);
        }

        for(int i = input.length - 1; i > 0; i--) {
            output[i] = removeMax(output, i + 1);
        }
        return output;
    }

    public static short[] heapSort(short[] input) {
        short[] output = new short[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        for(int i = 1; i < input.length; i++) {
            upHeap(output, i);
        }

        for(int i = input.length - 1; i > 0; i--) {
            output[i] = removeMax(output, i + 1);
        }
        return output;
    }

    public static int[] heapSort(int[] input) {
        int[] output = new int[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        for(int i = 1; i < input.length; i++) {
            upHeap(output, i);
        }

        for(int i = input.length - 1; i > 0; i--) {
            output[i] = removeMax(output, i + 1);
        }
        return output;
    }

    public static long[] heapSort(long[] input) {
        long[] output = new long[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        for(int i = 1; i < input.length; i++) {
            upHeap(output, i);
        }

        for(int i = input.length - 1; i > 0; i--) {
            output[i] = removeMax(output, i + 1);
        }
        return output;
    }

    public static float[] heapSort(float[] input) {
        float[] output = new float[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        for(int i = 1; i < input.length; i++) {
            upHeap(output, i);
        }

        for(int i = input.length - 1; i > 0; i--) {
            output[i] = removeMax(output, i + 1);
        }
        return output;
    }

    public static double[] heapSort(double[] input) {
        double[] output = new double[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        for(int i = 1; i < input.length; i++) {
            upHeap(output, i);
        }

        for(int i = input.length - 1; i > 0; i--) {
            output[i] = removeMax(output, i + 1);
        }
        return output;
    }

    public static char[] heapSort(char[] input) {
        char[] output = new char[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        for(int i = 1; i < input.length; i++) {
            upHeap(output, i);
        }

        for(int i = input.length - 1; i > 0; i--) {
            output[i] = removeMax(output, i + 1);
        }
        return output;
    }

    public static <T extends Comparable<T>> T[] heapSort(T[] input) {
        @SuppressWarnings("unchecked")
        T[] output = (T[]) new Comparable[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        for(int i = 1; i < input.length; i++) {
            upHeap(output, i);
        }

        for(int i = input.length - 1; i > 0; i--) {
            output[i] = removeMax(output, i + 1);
        }
        return output;
    }

    private static byte removeMax(byte[] input, int size) {
        byte output = input[0];
        input[0] = input[size - 1];
        downHeap(input, 0, size - 1);
        return output;
    }

    private static short removeMax(short[] input, int size) {
        short output = input[0];
        input[0] = input[size - 1];
        downHeap(input, 0, size - 1);
        return output;
    }

    private static int removeMax(int[] input, int size) {
        int output = input[0];
        input[0] = input[size - 1];
        downHeap(input, 0, size - 1);
        return output;
    }

    private static long removeMax(long[] input, int size) {
        long output = input[0];
        input[0] = input[size - 1];
        downHeap(input, 0, size - 1);
        return output;
    }

    private static float removeMax(float[] input, int size) {
        float output = input[0];
        input[0] = input[size - 1];
        downHeap(input, 0, size - 1);
        return output;
    }

    private static double removeMax(double[] input, int size) {
        double output = input[0];
        input[0] = input[size - 1];
        downHeap(input, 0, size - 1);
        return output;
    }

    private static char removeMax(char[] input, int size) {
        char output = input[0];
        input[0] = input[size - 1];
        downHeap(input, 0, size - 1);
        return output;
    }

    private static <T extends Comparable<T>> T removeMax(T[] input, int size) {
        T output = input[0];
        input[0] = input[size - 1];
        downHeap(input, 0, size - 1);
        return output;
    }

    private static void upHeap(byte[] input, int index) {
        if(index == 0) {
            return;
        }
        int parent = parent(index);
        if(input[parent] < input[index]) {
            swap(input, parent, index);
            upHeap(input, parent);
        }
    }

    private static void upHeap(short[] input, int index) {
        if(index == 0) {
            return;
        }
        int parent = parent(index);
        if(input[parent] < input[index]) {
            swap(input, parent, index);
            upHeap(input, parent);
        }
    }

    private static void upHeap(int[] input, int index) {
        if(index == 0) {
            return;
        }
        int parent = parent(index);
        if(input[parent] < input[index]) {
            swap(input, parent, index);
            upHeap(input, parent);
        }
    }

    private static void upHeap(long[] input, int index) {
        if(index == 0) {
            return;
        }
        int parent = parent(index);
        if(input[parent] < input[index]) {
            swap(input, parent, index);
            upHeap(input, parent);
        }
    }

    private static void upHeap(float[] input, int index) {
        if(index == 0) {
            return;
        }
        int parent = parent(index);
        if(input[parent] < input[index]) {
            swap(input, parent, index);
            upHeap(input, parent);
        }
    }

    private static void upHeap(double[] input, int index) {
        if(index == 0) {
            return;
        }
        int parent = parent(index);
        if(input[parent] < input[index]) {
            swap(input, parent, index);
            upHeap(input, parent);
        }
    }

    private static void upHeap(char[] input, int index) {
        if(index == 0) {
            return;
        }
        int parent = parent(index);
        if(input[parent] < input[index]) {
            swap(input, parent, index);
            upHeap(input, parent);
        }
    }

    private static <T extends Comparable<T>> void upHeap(T[] input, int index) {
        if(index == 0) {
            return;
        }
        int parent = parent(index);
        if(input[parent].compareTo(input[index]) < 0) {
            swap(input, parent, index);
            upHeap(input, parent);
        }
    }

    private static void downHeap(byte[] input, int index, int size) {
        if(hasRight(index, size)) {
            if(input[right(index)] <= input[left(index)]) {
                if(input[left(index)] > input[index]) {
                    swap(input, index, left(index));
                    downHeap(input, left(index), size);
                }
            } else if(input[right(index)] > input[index]) {
                swap(input, index, right(index));
                downHeap(input, right(index), size);
            }
        } else if(hasLeft(index, size) && input[left(index)] > input[index]) {
            swap(input, index, left(index));
        }
    }

    private static void downHeap(short[] input, int index, int size) {
        if(hasRight(index, size)) {
            if(input[right(index)] <= input[left(index)]) {
                if(input[left(index)] > input[index]) {
                    swap(input, index, left(index));
                    downHeap(input, left(index), size);
                }
            } else if(input[right(index)] > input[index]) {
                swap(input, index, right(index));
                downHeap(input, right(index), size);
            }
        } else if(hasLeft(index, size) && input[left(index)] > input[index]) {
            swap(input, index, left(index));
        }
    }

    private static void downHeap(int[] input, int index, int size) {
        if(hasRight(index, size)) {
            if(input[right(index)] <= input[left(index)]) {
                if(input[left(index)] > input[index]) {
                    swap(input, index, left(index));
                    downHeap(input, left(index), size);
                }
            } else if(input[right(index)] > input[index]) {
                swap(input, index, right(index));
                downHeap(input, right(index), size);
            }
        } else if(hasLeft(index, size) && input[left(index)] > input[index]) {
            swap(input, index, left(index));
        }
    }

    private static void downHeap(long[] input, int index, int size) {
        if(hasRight(index, size)) {
            if(input[right(index)] <= input[left(index)]) {
                if(input[left(index)] > input[index]) {
                    swap(input, index, left(index));
                    downHeap(input, left(index), size);
                }
            } else if(input[right(index)] > input[index]) {
                swap(input, index, right(index));
                downHeap(input, right(index), size);
            }
        } else if(hasLeft(index, size) && input[left(index)] > input[index]) {
            swap(input, index, left(index));
        }
    }

    private static void downHeap(float[] input, int index, int size) {
        if(hasRight(index, size)) {
            if(input[right(index)] <= input[left(index)]) {
                if(input[left(index)] > input[index]) {
                    swap(input, index, left(index));
                    downHeap(input, left(index), size);
                }
            } else if(input[right(index)] > input[index]) {
                swap(input, index, right(index));
                downHeap(input, right(index), size);
            }
        } else if(hasLeft(index, size) && input[left(index)] > input[index]) {
            swap(input, index, left(index));
        }
    }

    private static void downHeap(double[] input, int index, int size) {
        if(hasRight(index, size)) {
            if(input[right(index)] <= input[left(index)]) {
                if(input[left(index)] > input[index]) {
                    swap(input, index, left(index));
                    downHeap(input, left(index), size);
                }
            } else if(input[right(index)] > input[index]) {
                swap(input, index, right(index));
                downHeap(input, right(index), size);
            }
        } else if(hasLeft(index, size) && input[left(index)] > input[index]) {
            swap(input, index, left(index));
        }
    }

    private static void downHeap(char[] input, int index, int size) {
        if(hasRight(index, size)) {
            if(input[right(index)] <= input[left(index)]) {
                if(input[left(index)] > input[index]) {
                    swap(input, index, left(index));
                    downHeap(input, left(index), size);
                }
            } else if(input[right(index)] > input[index]) {
                swap(input, index, right(index));
                downHeap(input, right(index), size);
            }
        } else if(hasLeft(index, size) && input[left(index)] > input[index]) {
            swap(input, index, left(index));
        }
    }

    private static <T extends Comparable<T>> void downHeap(T[] input, int index, int size) {
        if(hasRight(index, size)) {
            if(input[right(index)].compareTo(input[left(index)]) <= 0) {
                if(input[left(index)].compareTo(input[index]) > 0) {
                    swap(input, index, left(index));
                    downHeap(input, left(index), size);
                }
            } else if(input[right(index)].compareTo(input[index]) > 0) {
                swap(input, index, right(index));
                downHeap(input, right(index), size);
            }
        } else if(hasLeft(index, size) && input[left(index)].compareTo(input[index]) > 0) {
            swap(input, index, left(index));
        }
    }

    private static void swap(byte[] input, int index1, int index2) {
        byte tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    private static void swap(short[] input, int index1, int index2) {
        short tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    private static void swap(int[] input, int index1, int index2) {
        int tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    private static void swap(long[] input, int index1, int index2) {
        long tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    private static void swap(float[] input, int index1, int index2) {
        float tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    private static void swap(double[] input, int index1, int index2) {
        double tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    private static void swap(char[] input, int index1, int index2) {
        char tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    private static <T> void swap(T[] input, int index1, int index2) {
        T tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    private static int parent(int index) {
        return (index - 1) / 2;
    }

    private static int left(int index) {
        return index * 2 + 1;
    }

    private static int right(int index) {
        return index * 2 + 2;
    }

    private static boolean hasRight(int index, int size) {
        return size > right(index);
    }

    private static boolean hasLeft(int index, int size) {
        return size > left(index);
    }
}