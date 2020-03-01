package Data;

import java.lang.reflect.Array;

@SuppressWarnings({"WeakerAccess", "unused"}) //All functions here should be available, but might not be used
public class ArrayTools {

    public static <T> void swap(T[] input, int index1, int index2) {
        T tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public static void swap(byte[] input, int index1, int index2) {
        byte tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public static void swap(short[] input, int index1, int index2) {
        short tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public static void swap(int[] input, int index1, int index2) {
        int tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public static void swap(long[] input, int index1, int index2) {
        long tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public static void swap(float[] input, int index1, int index2) {
        float tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public static void swap(double[] input, int index1, int index2) {
        double tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public static void swap(boolean[] input, int index1, int index2) {
        boolean tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public static void swap(char[] input, int index1, int index2) {
        char tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    /*
    public static <T> T[] copyOf(T[] input) {
        return copyOfRange(input, 0, input.length);
    }

    */
    public static byte[] copyOf(byte[] input) {
        return copyOfRange(input, 0, input.length);
    }

    public static short[] copyOf(short[] input) {
        return copyOfRange(input, 0, input.length);
    }

    public static int[] copyOf(int[] input) {
        return copyOfRange(input, 0, input.length);
    }

    public static long[] copyOf(long[] input) {
        return copyOfRange(input, 0, input.length);
    }

    public static float[] copyOf(float[] input) {
        return copyOfRange(input, 0, input.length);
    }

    public static double[] copyOf(double[] input) {
        return copyOfRange(input, 0, input.length);
    }

    public static boolean[] copyOf(boolean[] input) {
        return copyOfRange(input, 0, input.length);
    }

    public static char[] copyOf(char[] input) {
        return copyOfRange(input, 0, input.length);
    }

    //Todo fix array tools
    public static <T> T[] copyOfRange(T[] input, int from, int to) {
        Class<? extends T[]> newType = (Class<? extends T[]>) input.getClass();
        /*
        @SuppressWarnings("unchecked")
        T[] copy = ((Object)newType == (Object)Object[].class)
                ? (T[]) new Object[newLength]
                : VMArray.createObjectArray(componentType, length); //(T[]) Array.newInstance(newType.getComponentType(), newLength);
        System.arraycopy(original, 0, copy, 0,
                Math.min(original.length, newLength));
        return copy;
*/

        T[] output = (T[]) new Object[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
    }

    static native Object boop();

    public static <T,U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType) {
        @SuppressWarnings("unchecked")
        T[] copy = ((Object)newType == (Object)Object[].class)
                ? (T[]) new Object[newLength]
                : (T[]) Array.newInstance(newType.getComponentType(), newLength);
        System.arraycopy(original, 0, copy, 0,
                Math.min(original.length, newLength));
        return copy;
    }

    public static int[] copyOfRange(int[] input, int from, int to) {
        int[] output = new int[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
    }

    public static double[] copyOfRange(double[] input, int from, int to) {
        double[] output = new double[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
    }

    public static long[] copyOfRange(long[] input, int from, int to) {
        long[] output = new long[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
    }

    public static byte[] copyOfRange(byte[] input, int from, int to) {
        byte[] output = new byte[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
    }

    public static short[] copyOfRange(short[] input, int from, int to) {
        short[] output = new short[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
    }

    public static float[] copyOfRange(float[] input, int from, int to) {
        float[] output = new float[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
    }

    public static boolean[] copyOfRange(boolean[] input, int from, int to) {
        boolean[] output = new boolean[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
    }

    public static char[] copyOfRange(char[] input, int from, int to) {
        char[] output = new char[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
    }
}
