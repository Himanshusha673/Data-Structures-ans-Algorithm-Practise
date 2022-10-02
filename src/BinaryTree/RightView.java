package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;

public class RightView {
    public static void main(String[] args) {
        BinaryTreeLevelwise<Integer> root = BinaryTreeLevelwise.takeinputlevelwise();
        System.out.println(rightView(root));

    }


    public static ArrayList<Integer> rightView(BinaryTreeLevelwise<Integer> root)
    {

        ArrayList<Integer> arr= new ArrayList<>();





        Helper(arr,root,0);
        return arr;
    }
    public static ArrayList<Integer> Helper(ArrayList<Integer> arr,BinaryTreeLevelwise<Integer> root,int level){

        if(root==null) return null;
        arr.set(level,root.data);


        Helper(arr,root.left,level+1);
        Helper(arr,root.right,level+1);

        return arr;



    }
}
