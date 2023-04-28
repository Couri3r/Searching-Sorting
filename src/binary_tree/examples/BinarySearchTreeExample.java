package binary_tree.examples;

import binary_tree.BinarySearchTreeADT;
import binary_tree.LinkedBinarySearchTree;
import search.Utils;

import java.util.Iterator;

public class BinarySearchTreeExample {
    public static void main(String[] args){
        BinarySearchTreeADT bst = new LinkedBinarySearchTree();

        bst.addElement(38);
        bst.addElement(23);
        bst.addElement(55);
        bst.addElement(35);
        bst.addElement(75);
        bst.addElement(72);

        System.out.println("Height:" + bst.getHeight());
        System.out.println(Utils.printTree(bst));

        Iterator iter = bst.iteratorInOrder();
        while(iter.hasNext()){
            System.out.print(iter.next() + ",");
        }
        System.out.println();

        // Adding a large set of numbers in the tree and then perofrm basic operations on the binary search tree
        Integer[] numbers = Utils.getRandomIntegers(100000, 1000000);
        for(Integer i: numbers){
            bst.addElement(i);
        }

        System.out.println("Height:" + bst.getHeight());

        System.out.println("Min:"+ bst.findMin());
        System.out.println("Max:" + bst.findMax());

        System.out.println(bst.contains(3569));
        System.out.println(bst.contains(255));
    }
}
