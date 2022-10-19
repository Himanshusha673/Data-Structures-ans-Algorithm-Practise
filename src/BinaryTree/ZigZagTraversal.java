package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTraversal {
    public static void main(String[] args) {
        BinaryTreeLevelwise<Integer> root = BinaryTreeLevelwise.takeinputlevelwise();
        System.out.println(zigzag(root));

    }

    private static ArrayList<Integer> zigzag(BinaryTreeLevelwise<Integer> root) {
        ArrayList<Integer> arr= new ArrayList<>();
        Stack<BinaryTreeLevelwise> ms= new Stack<>();
        Stack<BinaryTreeLevelwise> childStack= new Stack<>();
        ms.push(root);
        boolean leftTORight=true;

        while(!ms.isEmpty()){
            //remove ,print , addtostack
            BinaryTreeLevelwise<Integer> currNode=ms.pop();
            arr.add(root.data);
            if(leftTORight){
                //means we are moving left to right  then adding elemnt into stack fromleft to right
                if(currNode.left!=null){
                    childStack.add(currNode.left);
                }
                if(currNode.right!=null){
                    childStack.add(currNode.right);
                }
            }else{
                //else add element into right to left in child statck
                if(currNode.right!=null){
                    childStack.add(currNode.right);
                }
                if(currNode.left!=null){
                    childStack.add(currNode.left);
                }
            }
            if(ms.isEmpty()){
                //means one level complete and now main stack
                // becomes child and vice versa child stack is empty because main stack isd empty this time
                leftTORight=!leftTORight;
                Stack<BinaryTreeLevelwise> temp=ms;
                ms=childStack;
                childStack=temp;
            }
        }
        return arr;
    }
}
