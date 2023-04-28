package search;

public class GenericLinearSearch {

    // Worst case time complexity: O(n)
    // Best case time complexity: O(1)
    public static <T extends Comparable<T>> boolean linearSearch(T[] elements, int min, int max, T targetElement) {
        System.out.println("Trying to find:" + targetElement);
        if (min>max) return false;
        int array_length = elements.length - 1;
        if (min>array_length || max>array_length) return false;
        if (min<0 || max<0) return false;

        // Go over the entire list/array and see if it contains the numberToFind
        for (int i=min; i<=max; i++) {
            System.out.println("Comparing:" + elements[i] + " with "+ targetElement );
            if (elements[i].compareTo(targetElement)==0) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String[] myValues = {"Dog", "Apple", "Jeans", "Cotton", "Field", "Class"};

        boolean returnValue = false;

        returnValue = linearSearch(myValues,0,myValues.length-1,"Ball");
        System.out.println(returnValue);

        System.out.println(myValues[5].compareTo("Class"));
    }


}
