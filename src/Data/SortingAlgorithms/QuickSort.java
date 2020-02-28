package Data.SortingAlgorithms;

import Data.ArrayTools;
import Data.GenericsTest;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] input = {45, 43, 12, 89, 62, 50};
        System.out.println(Arrays.toString(quickSort(input)));
    }

    public static int[] quickSort(int[] input) {
        int[] output = new int[input.length];
        System.arraycopy(input, 0, output, 0, input.length);
        quickSort2(output, 0, output.length - 1);
        return output;
    }

    private static void quickSort2(int[] input, int lowerBound, int upperBound) {
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
                ArrayTools.swap(input, i, j);
            }
        }

        //Decide whether to swap with j or i
        if(i <= upperBound && input[i] >= input[xIndex]) {
            ArrayTools.swap(input, xIndex, i);
            xIndex = i;
        } else {
            ArrayTools.swap(input, xIndex, j);
            xIndex = j;
        }

        //Recursively call for each of the sides, if they exist
        if(xIndex < upperBound) {
            quickSort2(input, xIndex + 1, upperBound);
        }

        if(xIndex > lowerBound) {
            quickSort2(input, lowerBound, xIndex - 1);
        }
    }
}
