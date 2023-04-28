package search;

import java.util.Arrays;
import java.util.Random;

public class SimpleBinarySearch {
    /**
     * Searches the specified array of objects using a binary search
     * algorithm.
     *
     * @param data   the array to be searched
     * @param min    the integer representation of the minimum value
     * @param max    the integer representation of the maximum value
     * @param target the element being searched for
     * @return       true if the desired element is found
     */

    // Worst Case: O(logn)
    public static boolean binarySearch(int[] data, int min, int max, int target)
    {
        boolean found = false;
        int midpoint = (min + max) / 2;  // determine the midpoint
        System.out.println("Find:" + target + " in min:" + min + " max:" + max + " midpoint:" + midpoint + ", data[midpoint]:" + data[midpoint]);

        if (data[midpoint] == target)
            found = true;

        else if (target < data[midpoint])
        {
            // search in the left half of array
            if (min <= midpoint - 1)
                found = binarySearch(data, min, midpoint - 1, target);
        }
        else if (midpoint + 1 <= max)
            // search in the right half of array
            found = binarySearch(data, midpoint + 1, max, target);

        return found;
    }

    public static void main(String[] args) {
        long startTime, elapsedTime = 0;
        int target = 0;
//        int[] numbers = Utils.getRandomIntegers(10*1000*1000);
        int[] numbers = Utils.getRandomIntegers(16);

//        Utils.printArray(numbers);

        // Binary search assumes that the array is already sorted
        Arrays.sort(numbers, 0, numbers.length);
//        Utils.printArray(numbers);

        // worst case (find a value not in the array or one stored at first or last index)
        target = 12;
        startTime = System.currentTimeMillis();
        boolean flag  = binarySearch(numbers, 0, numbers.length-1, target);
        elapsedTime = System.currentTimeMillis()-startTime;
        System.out.println("Binary Search (Worst Case) Elapsed Time: " +  elapsedTime + " ms");
        System.out.println(flag);

    }

}
