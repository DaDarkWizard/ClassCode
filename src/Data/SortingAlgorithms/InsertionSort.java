package Data.SortingAlgorithms;

import java.util.Arrays;

@SuppressWarnings({"Duplicates", "unused"})
public class InsertionSort {

    //ToDo: Fix sort based on eclipse code
    public static void main(String[] args) {
        Integer[] box = {98, 123, 24, 23, 1};
        System.out.println(Arrays.deepToString(insertionSort(box)));
    }

    public static byte[] insertionSort(byte[] input) {
        byte[] output = new byte[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        //Iterate over each element
        for(int i = 1; i < output.length; i++) {

            //Set up variables to find place to insert
            int lowerBound = 0;
            int upperBound = i - 1;
            int insertPoint = (upperBound - lowerBound) / 2;

            //Loop until element is inserted
            while (true) {
                //Check if insert point has been found
                if(upperBound == lowerBound) {
                    //Check whether to insert above or below
                    if(output[insertPoint] < output[i]) {
                        insertPoint++;
                    }

                    //Copy all elements up
                    byte tmp = output[i];
                    System.arraycopy(output, insertPoint, output, insertPoint + 1, i - insertPoint);
                    output[insertPoint] = tmp;

                    //Break out of the loop to go to the next element
                    break;
                }

                //Decide whether to bring lower bound up or upper bound down
                if(output[insertPoint] > output[i]) {
                    System.out.println(insertPoint - 1);
                    upperBound = Math.max(insertPoint - 1, 0);
                } else if (output[insertPoint] < output[i]) {
                    System.out.println(insertPoint + 1);
                    lowerBound = Math.min(insertPoint + 1, i);
                }

                //Get new insertion point
                insertPoint = ((upperBound - lowerBound) / 2) + lowerBound;
            }
        }

        return output;
    }

    public static short[] insertionSort(short[] input) {
        short[] output = new short[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        //Iterate over each element
        for(int i = 1; i < output.length; i++) {

            //Set up variables to find place to insert
            int lowerBound = 0;
            int upperBound = i - 1;
            int insertPoint = (upperBound - lowerBound) / 2;

            //Loop until element is inserted
            while (true) {
                //Check if insert point has been found
                if(upperBound == lowerBound) {
                    //Check whether to insert above or below
                    if(output[insertPoint] < output[i]) {
                        insertPoint++;
                    }

                    //Copy all elements up
                    short tmp = output[i];
                    System.arraycopy(output, insertPoint, output, insertPoint + 1, i - insertPoint);
                    output[insertPoint] = tmp;

                    //Break out of the loop to go to the next element
                    break;
                }

                //Decide whether to bring lower bound up or upper bound down
                if(output[insertPoint] > output[i]) {
                    System.out.println(insertPoint - 1);
                    upperBound = Math.max(insertPoint - 1, 0);
                } else if (output[insertPoint] < output[i]) {
                    System.out.println(insertPoint + 1);
                    lowerBound = Math.min(insertPoint + 1, i);
                }

                //Get new insertion point
                insertPoint = ((upperBound - lowerBound) / 2) + lowerBound;
            }
        }

        return output;
    }

    public static int[] insertionSort(int[] input) {
        int[] output = new int[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        //Iterate over each element
        for(int i = 1; i < output.length; i++) {

            //Set up variables to find place to insert
            int lowerBound = 0;
            int upperBound = i - 1;
            int insertPoint = (upperBound - lowerBound) / 2;

            //Loop until element is inserted
            while (true) {
                //Check if insert point has been found
                if(upperBound == lowerBound) {
                    //Check whether to insert above or below
                    if(output[insertPoint] < output[i]) {
                        insertPoint++;
                    }

                    //Copy all elements up
                    int tmp = output[i];
                    System.arraycopy(output, insertPoint, output, insertPoint + 1, i - insertPoint);
                    output[insertPoint] = tmp;

                    //Break out of the loop to go to the next element
                    break;
                }

                //Decide whether to bring lower bound up or upper bound down
                if(output[insertPoint] > output[i]) {
                    System.out.println(insertPoint - 1);
                    upperBound = Math.max(insertPoint - 1, 0);
                } else if (output[insertPoint] < output[i]) {
                    System.out.println(insertPoint + 1);
                    lowerBound = Math.min(insertPoint + 1, i);
                }

                //Get new insertion point
                insertPoint = ((upperBound - lowerBound) / 2) + lowerBound;
            }
        }

        return output;
    }

    public static long[] insertionSort(long[] input) {
        long[] output = new long[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        //Iterate over each element
        for(int i = 1; i < output.length; i++) {

            //Set up variables to find place to insert
            int lowerBound = 0;
            int upperBound = i - 1;
            int insertPoint = (upperBound - lowerBound) / 2;

            //Loop until element is inserted
            while (true) {
                //Check if insert point has been found
                if(upperBound == lowerBound) {
                    //Check whether to insert above or below
                    if(output[insertPoint] < output[i]) {
                        insertPoint++;
                    }

                    //Copy all elements up
                    long tmp = output[i];
                    System.arraycopy(output, insertPoint, output, insertPoint + 1, i - insertPoint);
                    output[insertPoint] = tmp;

                    //Break out of the loop to go to the next element
                    break;
                }

                //Decide whether to bring lower bound up or upper bound down
                if(output[insertPoint] > output[i]) {
                    System.out.println(insertPoint - 1);
                    upperBound = Math.max(insertPoint - 1, 0);
                } else if (output[insertPoint] < output[i]) {
                    System.out.println(insertPoint + 1);
                    lowerBound = Math.min(insertPoint + 1, i);
                }

                //Get new insertion point
                insertPoint = ((upperBound - lowerBound) / 2) + lowerBound;
            }
        }

        return output;
    }

    public static float[] insertionSort(float[] input) {
        float[] output = new float[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        //Iterate over each element
        for(int i = 1; i < output.length; i++) {

            //Set up variables to find place to insert
            int lowerBound = 0;
            int upperBound = i - 1;
            int insertPoint = (upperBound - lowerBound) / 2;

            //Loop until element is inserted
            while (true) {
                //Check if insert point has been found
                if(upperBound == lowerBound) {
                    //Check whether to insert above or below
                    if(output[insertPoint] < output[i]) {
                        insertPoint++;
                    }

                    //Copy all elements up
                    float tmp = output[i];
                    System.arraycopy(output, insertPoint, output, insertPoint + 1, i - insertPoint);
                    output[insertPoint] = tmp;

                    //Break out of the loop to go to the next element
                    break;
                }

                //Decide whether to bring lower bound up or upper bound down
                if(output[insertPoint] > output[i]) {
                    System.out.println(insertPoint - 1);
                    upperBound = Math.max(insertPoint - 1, 0);
                } else if (output[insertPoint] < output[i]) {
                    System.out.println(insertPoint + 1);
                    lowerBound = Math.min(insertPoint + 1, i);
                }

                //Get new insertion point
                insertPoint = ((upperBound - lowerBound) / 2) + lowerBound;
            }
        }

        return output;
    }

    public static double[] insertionSort(double[] input) {
        double[] output = new double[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        //Iterate over each element
        for(int i = 1; i < output.length; i++) {

            //Set up variables to find place to insert
            int lowerBound = 0;
            int upperBound = i - 1;
            int insertPoint = (upperBound - lowerBound) / 2;

            //Loop until element is inserted
            while (true) {
                //Check if insert point has been found
                if(upperBound == lowerBound) {
                    //Check whether to insert above or below
                    if(output[insertPoint] < output[i]) {
                        insertPoint++;
                    }

                    //Copy all elements up
                    double tmp = output[i];
                    System.arraycopy(output, insertPoint, output, insertPoint + 1, i - insertPoint);
                    output[insertPoint] = tmp;

                    //Break out of the loop to go to the next element
                    break;
                }

                //Decide whether to bring lower bound up or upper bound down
                if(output[insertPoint] > output[i]) {
                    System.out.println(insertPoint - 1);
                    upperBound = Math.max(insertPoint - 1, 0);
                } else if (output[insertPoint] < output[i]) {
                    System.out.println(insertPoint + 1);
                    lowerBound = Math.min(insertPoint + 1, i);
                }

                //Get new insertion point
                insertPoint = ((upperBound - lowerBound) / 2) + lowerBound;
            }
        }

        return output;
    }

    public static char[] insertionSort(char[] input) {
        char[] output = new char[input.length];
        System.arraycopy(input, 0, output, 0, input.length);

        //Iterate over each element
        for(int i = 1; i < output.length; i++) {

            //Set up variables to find place to insert
            int lowerBound = 0;
            int upperBound = i - 1;
            int insertPoint = (upperBound - lowerBound) / 2;

            //Loop until element is inserted
            while (true) {
                //Check if insert point has been found
                if(upperBound == lowerBound) {
                    //Check whether to insert above or below
                    if(output[insertPoint] < output[i]) {
                        insertPoint++;
                    }

                    //Copy all elements up
                    char tmp = output[i];
                    System.arraycopy(output, insertPoint, output, insertPoint + 1, i - insertPoint);
                    output[insertPoint] = tmp;

                    //Break out of the loop to go to the next element
                    break;
                }

                //Decide whether to bring lower bound up or upper bound down
                if(output[insertPoint] > output[i]) {
                    System.out.println(insertPoint - 1);
                    upperBound = Math.max(insertPoint - 1, 0);
                } else if (output[insertPoint] < output[i]) {
                    System.out.println(insertPoint + 1);
                    lowerBound = Math.min(insertPoint + 1, i);
                }

                //Get new insertion point
                insertPoint = ((upperBound - lowerBound) / 2) + lowerBound;
            }
        }

        return output;
    }

    public static <T extends Comparable<T>> T[] insertionSort(T[] input) {
        @SuppressWarnings("unchecked")
        T[] output = (T[]) new Comparable[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        //Iterate over each element
        for(int i = 1; i < output.length; i++) {

            //Set up variables to find place to insert
            int lowerBound = 0;
            int upperBound = i - 1;
            int insertPoint = (upperBound - lowerBound) / 2;

            //Loop until element is inserted
            while (true) {
                //Check if insert point has been found
                if(upperBound == lowerBound) {
                    //Check whether to insert above or below
                    if(output[insertPoint].compareTo(output[i]) < 0) {
                        insertPoint++;
                    }

                    //Copy all elements up
                    T tmp = output[i];
                    System.arraycopy(output, insertPoint, output, insertPoint + 1, i - insertPoint);
                    output[insertPoint] = tmp;

                    //Break out of the loop to go to the next element
                    break;
                }

                //Decide whether to bring lower bound up or upper bound down
                if(output[insertPoint].compareTo(output[i]) > 0) {
                    System.out.println(insertPoint - 1);
                    upperBound = Math.max(insertPoint - 1, 0);
                } else if (output[insertPoint].compareTo(output[i]) < 0) {
                    System.out.println(insertPoint + 1);
                    lowerBound = Math.min(insertPoint + 1, i);
                }

                //Get new insertion point
                insertPoint = ((upperBound - lowerBound) / 2) + lowerBound;
            }
        }

        return output;
    }
}
