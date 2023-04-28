package binary_tree.examples;

import binary_tree.BinaryTreeADT;
import binary_tree.BinaryTreeNode;
import binary_tree.LinkedBinaryTree;
import search.Utils;

import java.util.Iterator;

public class SimpleBinaryTree {

    public static void main(String[] args) {
        // Building nodes with element values
        BinaryTreeNode<String> node_A = new BinaryTreeNode<String>("A");
        BinaryTreeNode<String> node_B = new BinaryTreeNode<String>("B");
        BinaryTreeNode<String> node_C = new BinaryTreeNode<String>("C");
        BinaryTreeNode<String> node_D = new BinaryTreeNode<String>("D");
        BinaryTreeNode<String> node_E = new BinaryTreeNode<String>("E");
        BinaryTreeNode<String> node_F = new BinaryTreeNode<String>("F");
        BinaryTreeNode<String> node_G = new BinaryTreeNode<String>("G");
        BinaryTreeNode<String> node_H = new BinaryTreeNode<String>("H");

        // Defining tree structure
        node_A.setLeft(node_B);
        node_A.setRight(node_C);
        node_B.setLeft(node_D);
        node_B.setRight(node_E);
        node_C.setLeft(node_F);
        node_C.setRight(node_G);
        node_G.setRight(node_H);

        // Creating the tree with node_A as root node
        BinaryTreeADT<String> my_tree = new LinkedBinaryTree<String>(node_A);

        // pre-order traversal of tree
        Iterator<String> iter = my_tree.iteratorPreOrder();
        System.out.print("preorder:");
        while(iter.hasNext()) {
            System.out.print(iter.next() + ",");
        }
        System.out.println("");

        // in-order traversal of tree
        iter = my_tree.iteratorInOrder();
        System.out.print("inorder:");
        while(iter.hasNext()) {
            System.out.print(iter.next() + ",");
        }
        System.out.println("");

        // post-order traversal of tree
        iter = my_tree.iteratorPostOrder();
        System.out.print("postorder:");
        while(iter.hasNext()) {
            System.out.print(iter.next() + ",");
        }
        System.out.println("");

        // level-order traversal of tree
        iter = my_tree.iteratorLevelOrder();
        System.out.print("levelorder:");
        while(iter.hasNext()) {
            System.out.print(iter.next() + ",");
        }
        System.out.println("");

        System.out.println(my_tree.contains("F"));
        System.out.println(my_tree.contains("M"));

        System.out.println(my_tree.find("C"));

        System.out.println(my_tree.getHeight());
        System.out.println(Utils.printTree(my_tree));
    }
}
