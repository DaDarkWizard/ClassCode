package Data;

@SuppressWarnings({"WeakerAccess", "Duplicates", "unused"}) //Most functions should be available
public class MergeSort {

    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> T[] mergeSort(T[] input) {
        T[] output = (T[]) new Comparable[input.length];

        if(output.length < 2) {
            return output;
        }

        int mid = input.length / 2;

        T[] a = ArrayTools.copyOfRange(output, 0, mid);
        T[] b = ArrayTools.copyOfRange(output, mid + 1, output.length - 1);

        a = mergeSort(a);
        b = mergeSort(b);

        return merge(a, b, output);
    }

    public static byte[] mergeSort(byte[] input) {
        byte[] output = new byte[input.length];

        if(output.length < 2) {
            return output;
        }

        int mid = input.length / 2;

        byte[] a = ArrayTools.copyOfRange(output, 0, mid);
        byte[] b = ArrayTools.copyOfRange(output, mid + 1, output.length - 1);

        a = mergeSort(a);
        b = mergeSort(b);

        return merge(a, b, output);
    }

    public static short[] mergeSort(short[] input) {
        short[] output = new short[input.length];

        if(output.length < 2) {
            return output;
        }

        int mid = input.length / 2;

        short[] a = ArrayTools.copyOfRange(output, 0, mid);
        short[] b = ArrayTools.copyOfRange(output, mid + 1, output.length - 1);

        a = mergeSort(a);
        b = mergeSort(b);

        return merge(a, b, output);
    }

    public static int[] mergeSort(int[] input) {
        int[] output = new int[input.length];

        if(output.length < 2) {
            return output;
        }

        int mid = input.length / 2;

        int[] a = ArrayTools.copyOfRange(output, 0, mid);
        int[] b = ArrayTools.copyOfRange(output, mid + 1, output.length - 1);

        a = mergeSort(a);
        b = mergeSort(b);

        return merge(a, b, output);
    }

    public static float[] mergeSort(float[] input) {
        float[] output = new float[input.length];

        if(output.length < 2) {
            return output;
        }

        int mid = input.length / 2;

        float[] a = ArrayTools.copyOfRange(output, 0, mid);
        float[] b = ArrayTools.copyOfRange(output, mid + 1, output.length - 1);

        a = mergeSort(a);
        b = mergeSort(b);

        return merge(a, b, output);
    }

    public static double[] mergeSort(double[] input) {
        double[] output = new double[input.length];

        if(output.length < 2) {
            return output;
        }

        int mid = input.length / 2;

        double[] a = ArrayTools.copyOfRange(output, 0, mid);
        double[] b = ArrayTools.copyOfRange(output, mid + 1, output.length - 1);

        a = mergeSort(a);
        b = mergeSort(b);

        return merge(a, b, output);
    }

    public static long[] mergeSort(long[] input) {
        long[] output = new long[input.length];

        if(output.length < 2) {
            return output;
        }

        int mid = input.length / 2;

        long[] a = ArrayTools.copyOfRange(output, 0, mid);
        long[] b = ArrayTools.copyOfRange(output, mid + 1, output.length - 1);

        a = mergeSort(a);
        b = mergeSort(b);

        return merge(a, b, output);
    }

    public static char[] mergeSort(char[] input) {
        char[] output = new char[input.length];

        if(output.length < 2) {
            return output;
        }

        int mid = input.length / 2;

        char[] a = ArrayTools.copyOfRange(output, 0, mid);
        char[] b = ArrayTools.copyOfRange(output, mid + 1, output.length - 1);

        a = mergeSort(a);
        b = mergeSort(b);

        return merge(a, b, output);
    }

    private static <T extends Comparable<T>> T[] merge(T[] a, T[] b, T[] output) {
        if(output.length != a.length + b.length) {
            throw new IllegalArgumentException("Inputs do not match!");
        }

        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < output.length; i++) {
            if(aIndex >= a.length) {
                output[i] = b[bIndex];
                bIndex++;
            } else if (bIndex >= b.length) {
                output[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex].compareTo(b[bIndex]) < 0) {
                output[i] = a[aIndex];
                aIndex++;
            } else {
                output[i] = b[bIndex];
                bIndex++;
            }
        }
        return output;
    }

    private static byte[] merge(byte[] a, byte[] b, byte[] output) {
        if(output.length != a.length + b.length) {
            throw new IllegalArgumentException("Inputs do not match!");
        }

        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < output.length; i++) {
            if(aIndex >= a.length) {
                output[i] = b[bIndex];
                bIndex++;
            } else if (bIndex >= b.length) {
                output[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                output[i] = a[aIndex];
                aIndex++;
            } else {
                output[i] = b[bIndex];
                bIndex++;
            }
        }
        return output;
    }

    private static short[] merge(short[] a, short[] b, short[] output) {
        if(output.length != a.length + b.length) {
            throw new IllegalArgumentException("Inputs do not match!");
        }

        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < output.length; i++) {
            if(aIndex >= a.length) {
                output[i] = b[bIndex];
                bIndex++;
            } else if (bIndex >= b.length) {
                output[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                output[i] = a[aIndex];
                aIndex++;
            } else {
                output[i] = b[bIndex];
                bIndex++;
            }
        }
        return output;
    }

    private static int[] merge(int[] a, int[] b, int[] output) {
        if(output.length != a.length + b.length) {
            throw new IllegalArgumentException("Inputs do not match!");
        }

        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < output.length; i++) {
            if(aIndex >= a.length) {
                output[i] = b[bIndex];
                bIndex++;
            } else if (bIndex >= b.length) {
                output[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                output[i] = a[aIndex];
                aIndex++;
            } else {
                output[i] = b[bIndex];
                bIndex++;
            }
        }
        return output;
    }

    private static float[] merge(float[] a, float[] b, float[] output) {
        if(output.length != a.length + b.length) {
            throw new IllegalArgumentException("Inputs do not match!");
        }

        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < output.length; i++) {
            if(aIndex >= a.length) {
                output[i] = b[bIndex];
                bIndex++;
            } else if (bIndex >= b.length) {
                output[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                output[i] = a[aIndex];
                aIndex++;
            } else {
                output[i] = b[bIndex];
                bIndex++;
            }
        }
        return output;
    }

    private static double[] merge(double[] a, double[] b, double[] output) {
        if(output.length != a.length + b.length) {
            throw new IllegalArgumentException("Inputs do not match!");
        }

        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < output.length; i++) {
            if(aIndex >= a.length) {
                output[i] = b[bIndex];
                bIndex++;
            } else if (bIndex >= b.length) {
                output[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                output[i] = a[aIndex];
                aIndex++;
            } else {
                output[i] = b[bIndex];
                bIndex++;
            }
        }
        return output;
    }

    private static char[] merge(char[] a, char[] b, char[] output) {
        if(output.length != a.length + b.length) {
            throw new IllegalArgumentException("Inputs do not match!");
        }

        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < output.length; i++) {
            if(aIndex >= a.length) {
                output[i] = b[bIndex];
                bIndex++;
            } else if (bIndex >= b.length) {
                output[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                output[i] = a[aIndex];
                aIndex++;
            } else {
                output[i] = b[bIndex];
                bIndex++;
            }
        }
        return output;
    }

    private static long[] merge(long[] a, long[] b, long[] output) {
        if(output.length != a.length + b.length) {
            throw new IllegalArgumentException("Inputs do not match!");
        }

        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < output.length; i++) {
            if(aIndex >= a.length) {
                output[i] = b[bIndex];
                bIndex++;
            } else if (bIndex >= b.length) {
                output[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                output[i] = a[aIndex];
                aIndex++;
            } else {
                output[i] = b[bIndex];
                bIndex++;
            }
        }
        return output;
    }
}
