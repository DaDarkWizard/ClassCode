package Data.SortingAlgorithms;

import Data.ArrayTools;

public class InsertSort {


    /**
     * Sorting function to insert an element into a sorted array
     * If the array is not large enough, it will double the size
     *
     * @param input A sorted array
     * @param size The number of elements in the array
     * @param element The element to insert into the array
     * @return
     */
    public static int[] insert(int[] input, int size, int element) {
        if(input.length < size || size < 0) {
            throw new IllegalArgumentException("Size doesn't match up!");
        }

        if(input.length == size) {
            int[] tmp = new int[input.length * 2];
            System.arraycopy(input, 0, tmp, 0, size);
            input = tmp;
        }

        return input;
    }
}
