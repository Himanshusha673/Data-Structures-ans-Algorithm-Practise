package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class leftViewOfBT {
    static int max_level=0;
    public static void main(String[] args) {
        BinaryTreeLevelwise<Integer> root = BinaryTreeLevelwise.takeinputlevelwise();
        System.out.println(leftView(root));

    }


    public static ArrayList<Integer> leftView(BinaryTreeLevelwise<Integer> root)
    {
        max_level=0;
        ArrayList<Integer> arr= new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();



        // Helper(arr,map,root,0);
        Helper2(arr,root,1);
         return arr;
    }
    public static ArrayList<Integer> Helper(ArrayList<Integer> arr,HashMap<Integer,Integer> map,BinaryTreeLevelwise<Integer> root,int level){

        if(root==null) return null;

        if(map.get(level)==null) {
            map.put(level,root.data);
            arr.add(root.data);
        }
        Helper(arr,map,root.left,level+1);
        Helper(arr,map,root.right,level+1);

        return arr;



    }
    //method -2 not using hashmap using Arrays
    public static ArrayList<Integer> Helper2(ArrayList<Integer> arr,BinaryTreeLevelwise<Integer> root,int level){

        if(root==null) return null;

        if(max_level<level) {
            arr.add(root.data);
            max_level=level;
            System.out.println(max_level);
        }
        Helper2(arr,root.left,level+1);
        Helper2(arr,root.right,level+1);

        return arr;



    }
}
