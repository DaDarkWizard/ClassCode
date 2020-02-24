package Data;

@SuppressWarnings({"unused"})
public class SelectionSort {

    public static byte[] selectionSort(byte[] input) {
        byte[] output = ArrayTools.copyOf(input);

        for(int i = 0; i < output.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < output.length; j++) {
                if (output[j] < output[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            byte tmp = output[smallestIndex];
            output[smallestIndex] = output[i];
            output[i] = tmp;
        }

        return output;
    }

    public static short[] selectionSort(short[] input) {
        short[] output = ArrayTools.copyOf(input);

        for(int i = 0; i < output.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < output.length; j++) {
                if (output[j] < output[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            short tmp = output[smallestIndex];
            output[smallestIndex] = output[i];
            output[i] = tmp;
        }

        return output;
    }

    public static int[] selectionSort(int[] input) {
        int[] output = ArrayTools.copyOf(input);

        for(int i = 0; i < output.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < output.length; j++) {
                if (output[j] < output[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int tmp = output[smallestIndex];
            output[smallestIndex] = output[i];
            output[i] = tmp;
        }

        return output;
    }

    public static long[] selectionSort(long[] input) {
        long[] output = ArrayTools.copyOf(input);

        for(int i = 0; i < output.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < output.length; j++) {
                if (output[j] < output[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            long tmp = output[smallestIndex];
            output[smallestIndex] = output[i];
            output[i] = tmp;
        }

        return output;
    }

    public static float[] selectionSort(float[] input) {
        float[] output = ArrayTools.copyOf(input);

        for(int i = 0; i < output.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < output.length; j++) {
                if (output[j] < output[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            float tmp = output[smallestIndex];
            output[smallestIndex] = output[i];
            output[i] = tmp;
        }

        return output;
    }

    public static double[] selectionSort(double[] input) {
        double[] output = ArrayTools.copyOf(input);

        for(int i = 0; i < output.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < output.length; j++) {
                if (output[j] < output[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            double tmp = output[smallestIndex];
            output[smallestIndex] = output[i];
            output[i] = tmp;
        }

        return output;
    }

    public static char[] selectionSort(char[] input) {
        char[] output = ArrayTools.copyOf(input);

        for(int i = 0; i < output.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < output.length; j++) {
                if (output[j] < output[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            char tmp = output[smallestIndex];
            output[smallestIndex] = output[i];
            output[i] = tmp;
        }

        return output;
    }

    public static <T extends Comparable<T>> T[] selectionSort(T[] input) {
        T[] output = ArrayTools.copyOf(input);

        for(int i = 0; i < output.length - 1; i++) {
            int minimum = i;
            for(int j = i; j < output.length; j++) {
                if(output[j].compareTo(output[i]) < 0) {
                    minimum = j;
                }
            }

            T tmp = output[minimum];
            output[minimum] = output[i];
            output[i] = tmp;
        }

        return output;
    }
}
