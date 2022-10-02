package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {
    public static void main(String[] args) {
        BinaryTreeLevelwise<Integer> root=BinaryTreeLevelwise.takeinputlevelwise();
        System.out.println(reverseLevelOrder(root));
    }

    private static ArrayList<Integer> reverseLevelOrder(BinaryTreeLevelwise<Integer> root) {

        return reversearr(root);
    }

    private static ArrayList<Integer> reversearr(BinaryTreeLevelwise<Integer> root) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<BinaryTreeLevelwise<Integer>> nodes = new LinkedList<>();
        Stack<BinaryTreeLevelwise<Integer>> st = new Stack<>();

        nodes.add(root);
        while (!nodes.isEmpty()) {
            BinaryTreeLevelwise<Integer> front;
            front = nodes.poll();


            if (front.right != null) {
                nodes.add(front.right);
            }
            if (front.left != null) {
                nodes.add(front.left);
            }
            if (front.left == null && front.right == null) {
                System.out.println("no child");
            }
            st.push(front);
        }
        while (!st.isEmpty()) {
            arr.add(st.pop().data);
        }
        return arr;
    }


}
