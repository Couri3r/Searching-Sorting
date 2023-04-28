package search;

import java.util.Arrays;

public class GenericBinarySearch {
    /**
     * Searches the specified array of objects using a binary search
     * algorithm.
     *
     * @param elements   the array to be searched
     * @param min    the integer representation of the minimum value
     * @param max    the integer representation of the maximum value
     * @param target the element being searched for
     * @return       true if the desired element is found
     */
    public static <T extends Comparable<T>> boolean binarySearch(T[] elements, int min, int max, T target)
    {
        boolean found = false;
        int midpoint = (min + max) / 2;  // determine the midpoint
        System.out.println("Find:" + target + " in min:" + min + " max:" + max + " midpoint:" + midpoint + ", elements[midpoint]:" + elements[midpoint]);

        if (elements[midpoint].compareTo(target) == 0)
            found = true;

        else if (target.compareTo(elements[midpoint]) < 0)
        {
            // search in the left half of array
            if (min <= midpoint - 1)
                found = binarySearch(elements, min, midpoint - 1, target);
        }
        else if (midpoint + 1 <= max)
            // search in the right half of array
            found = binarySearch(elements, midpoint + 1, max, target);

        return found;
    }

    public static void main(String[] args) {
        String[] myValues = { "Apple", "Class", "Cotton", "Dog", "Elephant", "Field", "Jeans", "Jogger"};

        boolean returnValue = false;

        returnValue = binarySearch(myValues,0,myValues.length-1,"Elephant");
        System.out.println(returnValue);

        System.out.println(myValues[5].compareTo("Class"));

    }

}
