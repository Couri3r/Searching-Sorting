package search;

import binary_tree.BinaryTreeADT;
import binary_tree.BinaryTreeNode;
import binary_tree.LinkedBinaryTree;
import list.book_list_implementations.ArrayUnorderedList;
import list.book_list_implementations.UnorderedListADT;

import java.util.Random;

public class Utils {

    // This method is used to generate an integer array filled with random positive integer values
    public static int[] getRandomIntegers(int size) {
        int[] numbers = new int[size];
        Random rand = new Random(20);
        // This loop will initialize the array with random integer values
        for(int i=0; i<numbers.length; i++) {
            int rand_number = Math.abs(rand.nextInt());
            numbers[i] = rand_number;
        }
        return numbers;
    }

    // This method is used to generate an integer array filled with random positive integer values
    public static Integer[] getRandomIntegers(int size, int range) {
        Integer[] numbers = new Integer[size];
        Random rand = new Random(20);
        // This loop will initialize the array with random integer values
        for(int i=0; i<numbers.length; i++) {
            int rand_number = Math.abs(rand.nextInt(range));
            numbers[i] = rand_number;
        }
        return numbers;
    }

    // This method is used to print the list of numbers
    public static void printArray(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");

    }
    // This method is used to print the list of numbers
    public static void printArray(Integer[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");

    }

    public static <T extends Comparable<T>> String printTree(BinaryTreeADT<T> tree)
    {
        UnorderedListADT<BinaryTreeNode<T>> nodes =
                new ArrayUnorderedList<BinaryTreeNode<T>>();
        UnorderedListADT<Integer> levelList =
                new ArrayUnorderedList<>();
        BinaryTreeNode<T> current;
        String result = "";
        int printDepth = tree.getHeight();
        int possibleNodes = (int)Math.pow(2, printDepth + 1);
        int countNodes = 0;

        nodes.addToRear(tree.getRootNode());
        Integer currentLevel = 0;
        Integer previousLevel = -1;
        levelList.addToRear(currentLevel);

        while (countNodes < possibleNodes)
        {
            countNodes = countNodes + 1;
            current = nodes.removeFirst();
            currentLevel = levelList.removeFirst();
            if (currentLevel > previousLevel)
            {
                result = result + "\n\n";
                previousLevel = currentLevel;
                for (int j = 0; j < ((Math.pow(2, (printDepth - currentLevel))) - 1); j++)
                    result = result + " ";
            }
            else
            {
                for (int i = 0; i < ((Math.pow(2, (printDepth - currentLevel + 1)) - 1)) ; i++)
                {
                    result = result + " ";
                }
            }
            if (current != null)
            {
                result = result + (current.getElement()).toString();
                nodes.addToRear(current.getLeft());
                levelList.addToRear(currentLevel + 1);
                nodes.addToRear(current.getRight());
                levelList.addToRear(currentLevel + 1);
            }
            else {
                nodes.addToRear(null);
                levelList.addToRear(currentLevel + 1);
                nodes.addToRear(null);
                levelList.addToRear(currentLevel + 1);
                result = result + " ";
            }

        }

        return result;
    }
}
