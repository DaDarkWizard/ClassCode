package Data;

@SuppressWarnings({"WeakerAccess", "unused"}) //All functions here should be available, but might not be used
public class ArrayTools {

    public static <T> T[] copyOf(T[] input) {
        return copyOfRange(input, 0, input.length);
    }

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

    @SuppressWarnings("unchecked")
    public static <T> T[] copyOfRange(T[] input, int from, int to) {
        T[] output = (T[]) new Object[to - from + 1];
        System.arraycopy(input, from, output, 0, output.length);
        return output;
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
