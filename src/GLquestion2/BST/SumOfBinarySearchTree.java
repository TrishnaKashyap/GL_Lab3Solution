package GLquestion2.BST;

import java.util.*;

public class SumOfBinarySearchTree {
    public static class Node{
        int data;
        public Node left;
        public Node right;

        public Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    private boolean findSum(Node root, int sum, HashSet set) {
        if(root == null) return false;
        if(findSum(root.left, sum, set)) return true;
        if(set.contains(sum- root.data)){
            System.out.println("Pair found");
            System.out.println(sum-root.data + " + " + root.data);
            return true;
        }
        else{
            set.add(root.data);
        }
        return findSum(root.right, sum, set);
    }
    public void findPairWithSum(Node root, int sum){
        HashSet<Integer> set = new HashSet<>();
        if(!findSum(root, sum, set)){
            System.out.println("No pairs found");
        }
    }
}