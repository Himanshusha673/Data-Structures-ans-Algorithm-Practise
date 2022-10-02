package BinaryTree;

import java.util.*;

public class Topview {

    public static void main(String[] args) {
        BinaryTreeLevelwise<Integer> root = BinaryTreeLevelwise.takeinputlevelwise();
        System.out.println(topView(root));

    }


    // method 1 not opti,=mizwed


    public static ArrayList<Integer> topView(BinaryTreeLevelwise<Integer> root) {
        // making an arraylist to store the values
        ArrayList<Integer> arr = new ArrayList<>();
        // Making a Queue for levelOrder
        Queue<MyPair> queue = new LinkedList<MyPair>();
        // Uses Treemap because we need to Update values in arraylist
        // from map and tree map makes  our values sorted by their keys
        Map<Integer, BinaryTreeLevelwise> map= new TreeMap<Integer,BinaryTreeLevelwise>();
        if(root==null ){
            return null;
        }else{
            // adding root and its keyIndex as 0
            queue.add(new MyPair(0,root));
        }
        while(!queue.isEmpty()){
            MyPair curr=  queue.poll();
            if(!map.containsKey(curr.hd)){
                // if Not contains then we need to just put this value(Node) at KeyIndex in map
                map.put(curr.hd,curr.node);
            }
            // if it contains then no need to update in top view
            //then we need to add more elements into the queue
            if(curr.node.left!=null){
                //for left case keyIndex decreases by 1
                queue.add(new MyPair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                //for left case keyIndex Increases  by 1
                queue.add(new MyPair(curr.hd+1,curr.node.right));
            }
        }
        // now queue  is empty so we need top put out map values data into arraylist
        for (Map.Entry<Integer,BinaryTreeLevelwise> entry:map.entrySet()){
            arr.add((Integer)entry.getValue().data);
        }
        return arr;

    }
    public static ArrayList<Integer> topView2(BinaryTreeLevelwise<Integer> root) {
        // making an arraylist to store the values
        ArrayList<Integer> arr = new ArrayList<>();
        // Making a Queue for levelOrder
        Queue<MyPair> queue = new LinkedList<MyPair>();
        // Uses Treemap because we need to Update values in arraylist
        // from map and tree map makes  our values sorted by their keys
        Map<Integer, BinaryTreeLevelwise> map= new HashMap<Integer,BinaryTreeLevelwise>();
        if(root==null ){
            return null;
        }else{
            // adding root and its keyIndex as 0
            queue.add(new MyPair(0,root));
        }
        int max=0,min=0;
        while(!queue.isEmpty()){
            MyPair curr=  queue.poll();
            if(!map.containsKey(curr.hd)){
                // if Not contains then we need to just put this value(Node) at KeyIndex in map
                map.put(curr.hd,curr.node);
            }
            // if it contains then no need to update in top view
            //then we need to add more elements into the queue
            if(curr.node.left!=null){
                // at left it becomes keyIndex-1
                min=Math.min(min,curr.hd-1);
                //for left case keyIndex decreases by 1
                queue.add(new MyPair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                // at right it becomes keyIndex+1
                max=Math.max(max,curr.hd+1);
                //for left case keyIndex Increases  by 1
                queue.add(new MyPair(curr.hd+1,curr.node.right));
            }
        }
        // now queue  is empty so we need top put out map values data into arraylist
        for (;min<=max;min++){
            arr.add((Integer) map.get(min).data);
        }
        return arr;

    }


}
class MyPair{
    // keyIndex is our hd
    int hd;
    BinaryTreeLevelwise node;
    MyPair(int hd , BinaryTreeLevelwise node){
        this.hd= hd;
        this.node=node;

    }
}
