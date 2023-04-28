package binary_tree.examples;

import binary_tree.heap.HeapADT;
import binary_tree.heap.LinkedHeap;
import search.Utils;

public class HeapExample {
    public static void main(String[] args) {
        HeapADT<Integer> my_heap = new LinkedHeap<Integer>();

        my_heap.addElement(2001);
        my_heap.addElement(26);
        my_heap.addElement(55);
        my_heap.addElement(35);
        my_heap.addElement(22);
        my_heap.addElement(72);
        my_heap.addElement(2005);
        my_heap.addElement(18);
        my_heap.addElement(21);
        System.out.println(my_heap.size());
        System.out.println(Utils.printTree(my_heap));

//        System.out.println(Utils.printTree(my_heap));

        while(!my_heap.isEmpty()) {
            System.out.println(my_heap.removeMin());
        }
    }
}
