package GLquestion2.driver;

import GLquestion2.BST.SumOfBinarySearchTree;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        SumOfBinarySearchTree.Node root;
        SumOfBinarySearchTree bst = new SumOfBinarySearchTree();

        root = new SumOfBinarySearchTree.Node(30);
        root.left = new SumOfBinarySearchTree.Node(20);
        root.right = new SumOfBinarySearchTree.Node(40);
        root.left.left = new SumOfBinarySearchTree.Node(10);
        root.left.right = new SumOfBinarySearchTree.Node(25);
        root.right.left = new SumOfBinarySearchTree.Node(35);
        root.right.right = new SumOfBinarySearchTree.Node(45);

        System.out.println("Enter the sum to be found: ");
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        bst.findPairWithSum(root, sum);
    }
}
