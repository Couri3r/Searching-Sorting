package search;

import java.util.Arrays;
import java.util.Random;

public class SimpleLinearSearch {

    // Worst case time complexity: O(n)
    // Best case time complexity: O(1)
    public static boolean linearSearch(int[] nums, int min, int max, int numberToFind) {
        System.out.println("Trying to find:" + numberToFind);
        if (min>max) return false;
        int array_length = nums.length - 1;
        if (min>array_length || max>array_length) return false;
        if (min<0 || max<0) return false;

        // Go over the entire list/array and see if it contains the numberToFind
        for (int i=min; i<=max; i++) {
            if (nums[i] == numberToFind) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        long startTime, elapsedTime = 0;
        int[] numbers = Utils.getRandomIntegers(10*1000*1000);
//        int[] numbers = Utils.getRandomIntegers(16);

//        Utils.printArray(numbers);
        int target  =0;

        // worst case, linear search
        target = numbers[numbers.length-1]; // worst case, find a number not in the list or the last number
        startTime = System.currentTimeMillis();
        boolean flag  = linearSearch(numbers, 0, numbers.length-1, target);
        elapsedTime = System.currentTimeMillis()-startTime;
        System.out.println("Linear Search (Worst Case) Elapsed Time: " +  elapsedTime + " ms");
        System.out.println(flag);

        // best case, linear search
        target = numbers[0]; // best case, find number which is stored at index 0
        startTime = System.currentTimeMillis();
        flag  = linearSearch(numbers, 0, numbers.length-1, target);
        elapsedTime = System.currentTimeMillis()-startTime;
        System.out.println("Linear Search (Best Case) Elapsed Time: " +  elapsedTime + " ms");
        System.out.println(flag);


    }


}
