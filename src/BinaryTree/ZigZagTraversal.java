package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTraversal {
    public static void main(String[] args) {
        BinaryTreeLevelwise<Integer> root = BinaryTreeLevelwise.takeinputlevelwise();
        System.out.println(zigzag(root));

    }

    private static ArrayList<Integer> zigzag(BinaryTreeLevelwise<Integer> root) {
        ArrayList<Integer> arr= new ArrayList<>();
        Queue<BinaryTreeLevelwise> node= new LinkedList<>();
        boolean ritoLe=false;
        if(root==null) return null;
        else node.add(root);
        while(!node.isEmpty()){
            BinaryTreeLevelwise curr= node.poll();
            ritoLe=!ritoLe;
            if(ritoLe){

                if(curr.right!=null){
                    System.out.println( "R"+curr.right.data);

                    node.add(curr.right);
                }
                if(curr.left!=null){
                    System.out.print(  "L"+curr.left.data+",");
                    node.add(curr.left);
                }
            }else{
                if(curr.left!=null){
                    System.out.print(  "L"+curr.left.data+",");
                    node.add(curr.left);
                }
                if(curr.right!=null){
                    System.out.println( "R"+curr.right.data);

                    node.add(curr.right);
                }


            }
            arr.add((Integer) curr.data);
        }
        return arr;

    }
}
