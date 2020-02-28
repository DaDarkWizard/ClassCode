package Data.SortingAlgorithms;

@SuppressWarnings({"Duplicates", "unused"})
public class QuickSort {

    public static byte[] quickSort(byte[] input) {
        byte[] output = new byte[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        quickSort(output, 0, output.length - 1);
        return output;
    }

    public static short[] quickSort(short[] input) {
        short[] output = new short[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        quickSort(output, 0, output.length - 1);
        return output;
    }

    public static int[] quickSort(int[] input) {
        int[] output = new int[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        quickSort(output, 0, output.length - 1);
        return output;
    }

    public static long[] quickSort(long[] input) {
        long[] output = new long[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        quickSort(output, 0, output.length - 1);
        return output;
    }

    public static float[] quickSort(float[] input) {
        float[] output = new float[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        quickSort(output, 0, output.length - 1);
        return output;
    }

    public static double[] quickSort(double[] input) {
        double[] output = new double[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        quickSort(output, 0, output.length - 1);
        return output;
    }

    public static char[] quickSort(char[] input) {
        char[] output = new char[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        quickSort(output, 0, output.length - 1);
        return output;
    }

    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> T[] quickSort(T[] input) {
        T[] output = (T[]) new Comparable[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        quickSort(output, 0, output.length - 1);
        return output;
    }

    private static void quickSort(byte[] input, int lowerBound, int upperBound) {
        //The base case
        if(upperBound == lowerBound) {
            return;
        }

        //Set up variables for limits
        int xIndex = upperBound;
        int j = xIndex;
        int i = lowerBound;

        //Iterate through, swapping values as needed
        while(j > i) {
            while(i <= upperBound && i <= j && input[i] <= input[xIndex]) {
                i++;
            }
            while(j >= lowerBound && j >= i && input[j] >= input[xIndex]) {
                j--;
            }

            if(j > i && input[j] < input[xIndex] && input[i] > input[xIndex]) {
                swap(input, i, j);
            }
        }

        //Decide whether to swap with j or i
        if(i <= upperBound && input[i] >= input[xIndex]) {
            swap(input, xIndex, i);
            xIndex = i;
        } else {
            swap(input, xIndex, j);
            xIndex = j;
        }

        //Recursively call for each of the sides, if they exist
        if(xIndex < upperBound) {
            quickSort(input, xIndex + 1, upperBound);
        }

        if(xIndex > lowerBound) {
            quickSort(input, lowerBound, xIndex - 1);
        }
    }

    private static void quickSort(short[] input, int lowerBound, int upperBound) {
        //The base case
        if(upperBound == lowerBound) {
            return;
        }

        //Set up variables for limits
        int xIndex = upperBound;
        int j = xIndex;
        int i = lowerBound;

        //Iterate through, swapping values as needed
        while(j > i) {
            while(i <= upperBound && i <= j && input[i] <= input[xIndex]) {
                i++;
            }
            while(j >= lowerBound && j >= i && input[j] >= input[xIndex]) {
                j--;
            }

            if(j > i && input[j] < input[xIndex] && input[i] > input[xIndex]) {
                swap(input, i, j);
            }
        }

        //Decide whether to swap with j or i
        if(i <= upperBound && input[i] >= input[xIndex]) {
            swap(input, xIndex, i);
            xIndex = i;
        } else {
            swap(input, xIndex, j);
            xIndex = j;
        }

        //Recursively call for each of the sides, if they exist
        if(xIndex < upperBound) {
            quickSort(input, xIndex + 1, upperBound);
        }

        if(xIndex > lowerBound) {
            quickSort(input, lowerBound, xIndex - 1);
        }
    }

    private static void quickSort(int[] input, int lowerBound, int upperBound) {
        //The base case
        if(upperBound == lowerBound) {
            return;
        }

        //Set up variables for limits
        int xIndex = upperBound;
        int j = xIndex;
        int i = lowerBound;

        //Iterate through, swapping values as needed
        while(j > i) {
            while(i <= upperBound && i <= j && input[i] <= input[xIndex]) {
                i++;
            }
            while(j >= lowerBound && j >= i && input[j] >= input[xIndex]) {
                j--;
            }

            if(j > i && input[j] < input[xIndex] && input[i] > input[xIndex]) {
                swap(input, i, j);
            }
        }

        //Decide whether to swap with j or i
        if(i <= upperBound && input[i] >= input[xIndex]) {
            swap(input, xIndex, i);
            xIndex = i;
        } else {
            swap(input, xIndex, j);
            xIndex = j;
        }

        //Recursively call for each of the sides, if they exist
        if(xIndex < upperBound) {
            quickSort(input, xIndex + 1, upperBound);
        }

        if(xIndex > lowerBound) {
            quickSort(input, lowerBound, xIndex - 1);
        }
    }

    private static void quickSort(long[] input, int lowerBound, int upperBound) {
        //The base case
        if(upperBound == lowerBound) {
            return;
        }

        //Set up variables for limits
        int xIndex = upperBound;
        int j = xIndex;
        int i = lowerBound;

        //Iterate through, swapping values as needed
        while(j > i) {
            while(i <= upperBound && i <= j && input[i] <= input[xIndex]) {
                i++;
            }
            while(j >= lowerBound && j >= i && input[j] >= input[xIndex]) {
                j--;
            }

            if(j > i && input[j] < input[xIndex] && input[i] > input[xIndex]) {
                swap(input, i, j);
            }
        }

        //Decide whether to swap with j or i
        if(i <= upperBound && input[i] >= input[xIndex]) {
            swap(input, xIndex, i);
            xIndex = i;
        } else {
            swap(input, xIndex, j);
            xIndex = j;
        }

        //Recursively call for each of the sides, if they exist
        if(xIndex < upperBound) {
            quickSort(input, xIndex + 1, upperBound);
        }

        if(xIndex > lowerBound) {
            quickSort(input, lowerBound, xIndex - 1);
        }
    }

    private static void quickSort(float[] input, int lowerBound, int upperBound) {
        //The base case
        if(upperBound == lowerBound) {
            return;
        }

        //Set up variables for limits
        int xIndex = upperBound;
        int j = xIndex;
        int i = lowerBound;

        //Iterate through, swapping values as needed
        while(j > i) {
            while(i <= upperBound && i <= j && input[i] <= input[xIndex]) {
                i++;
            }
            while(j >= lowerBound && j >= i && input[j] >= input[xIndex]) {
                j--;
            }

            if(j > i && input[j] < input[xIndex] && input[i] > input[xIndex]) {
                swap(input, i, j);
            }
        }

        //Decide whether to swap with j or i
        if(i <= upperBound && input[i] >= input[xIndex]) {
            swap(input, xIndex, i);
            xIndex = i;
        } else {
            swap(input, xIndex, j);
            xIndex = j;
        }

        //Recursively call for each of the sides, if they exist
        if(xIndex < upperBound) {
            quickSort(input, xIndex + 1, upperBound);
        }

        if(xIndex > lowerBound) {
            quickSort(input, lowerBound, xIndex - 1);
        }
    }

    private static void quickSort(double[] input, int lowerBound, int upperBound) {
        //The base case
        if(upperBound == lowerBound) {
            return;
        }

        //Set up variables for limits
        int xIndex = upperBound;
        int j = xIndex;
        int i = lowerBound;

        //Iterate through, swapping values as needed
        while(j > i) {
            while(i <= upperBound && i <= j && input[i] <= input[xIndex]) {
                i++;
            }
            while(j >= lowerBound && j >= i && input[j] >= input[xIndex]) {
                j--;
            }

            if(j > i && input[j] < input[xIndex] && input[i] > input[xIndex]) {
                swap(input, i, j);
            }
        }

        //Decide whether to swap with j or i
        if(i <= upperBound && input[i] >= input[xIndex]) {
            swap(input, xIndex, i);
            xIndex = i;
        } else {
            swap(input, xIndex, j);
            xIndex = j;
        }

        //Recursively call for each of the sides, if they exist
        if(xIndex < upperBound) {
            quickSort(input, xIndex + 1, upperBound);
        }

        if(xIndex > lowerBound) {
            quickSort(input, lowerBound, xIndex - 1);
        }
    }

    private static void quickSort(char[] input, int lowerBound, int upperBound) {
        //The base case
        if(upperBound == lowerBound) {
            return;
        }

        //Set up variables for limits
        int xIndex = upperBound;
        int j = xIndex;
        int i = lowerBound;

        //Iterate through, swapping values as needed
        while(j > i) {
            while(i <= upperBound && i <= j && input[i] <= input[xIndex]) {
                i++;
            }
            while(j >= lowerBound && j >= i && input[j] >= input[xIndex]) {
                j--;
            }

            if(j > i && input[j] < input[xIndex] && input[i] > input[xIndex]) {
                swap(input, i, j);
            }
        }

        //Decide whether to swap with j or i
        if(i <= upperBound && input[i] >= input[xIndex]) {
            swap(input, xIndex, i);
            xIndex = i;
        } else {
            swap(input, xIndex, j);
            xIndex = j;
        }

        //Recursively call for each of the sides, if they exist
        if(xIndex < upperBound) {
            quickSort(input, xIndex + 1, upperBound);
        }

        if(xIndex > lowerBound) {
            quickSort(input, lowerBound, xIndex - 1);
        }
    }

    private static <T extends Comparable<T>> void quickSort(T[] input, int lowerBound, int upperBound) {
        //The base case
        if(upperBound == lowerBound) {
            return;
        }

        //Set up variables for limits
        int xIndex = upperBound;
        int j = xIndex;
        int i = lowerBound;

        //Iterate through, swapping values as needed
        while(j > i) {
            while(i <= upperBound && i <= j && input[i].compareTo(input[xIndex]) <= 0) {
                i++;
            }
            while(j >= lowerBound && j >= i && input[j].compareTo(input[xIndex]) >= 0) {
                j--;
            }

            if(j > i && input[j].compareTo(input[xIndex]) < 0 && input[i].compareTo(input[xIndex]) > 0) {
                swap(input, i, j);
            }
        }

        //Decide whether to swap with j or i
        if(i <= upperBound && input[i].compareTo(input[xIndex]) >= 0) {
            swap(input, xIndex, i);
            xIndex = i;
        } else {
            swap(input, xIndex, j);
            xIndex = j;
        }

        //Recursively call for each of the sides, if they exist
        if(xIndex < upperBound) {
            quickSort(input, xIndex + 1, upperBound);
        }

        if(xIndex > lowerBound) {
            quickSort(input, lowerBound, xIndex - 1);
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

    private static void swap(boolean[] input, int index1, int index2) {
        boolean tmp = input[index1];
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
}
