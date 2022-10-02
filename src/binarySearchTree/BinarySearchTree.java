package binarySearchTree;

import com.sun.source.tree.BinaryTree;
import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree<T> {
    T data;
    BinarySearchTree<T> left;
    BinarySearchTree<T> right;
    BinarySearchTree( T data ){
        this.data=data;
        this.right=null;
        this.left =null;





}
    static BinarySearchTree<Integer> takeinputlevelwise(){
        Scanner s=new Scanner(System.in);
        Queue< BinarySearchTree<Integer>> pendingnodes=new LinkedList<>();
        System.out.println("Enter the root");
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinarySearchTree<Integer> root=new  BinarySearchTree<Integer>(rootdata);
        pendingnodes.add(root);
        ///iteratiive approach
        while(!pendingnodes.isEmpty()){
            BinarySearchTree<Integer> front;

            try {
                front = pendingnodes.poll();
            }catch(Exception e){
                System.out.println(e);
                return null;
            }
            System.out.println("Enter Left child of "+front.data);
            int leftchild=s.nextInt();
            if (leftchild!=-1) {
                BinarySearchTree<Integer> child = new  BinarySearchTree<>(leftchild);
                pendingnodes.add(child);
                front.left = child;

            }
            System.out.println("Enter right child of "+front.data);
            int rightchild=s.nextInt();
            if (rightchild!=-1) {
                BinarySearchTree<Integer> child = new BinarySearchTree<>(rightchild);
                pendingnodes.add(child);
                front.right = child;

            }


        }
        return root;



    }
    public static boolean  searchBst( BinarySearchTree<Integer> root ,int  k){
        if(root ==null){
            return false ;
        }
        if(root.data ==k){
            return true;

        }
        if(root.data<k){
           return searchBst(root.right,k);
        }else{
            return searchBst(root.left,k);
        }





    }
    public static void printInRange(BinarySearchTree<Integer> root,int k1,int k2){
        if (root == null) {
            return;

        }
        if(root.data<k1){
            printInRange(root.right,k1,k2);

        }else if(root.data>k2){
            printInRange(root.left,k1,k2);

        }else{
            System.out.println(root.data);
            printInRange(root.left,k1,k2);
            printInRange(root.right,k1,k2);
        }
    }



    public static void printTreeLevelWise(BinarySearchTree<Integer> root) {
        Queue<BinarySearchTree<Integer>> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            BinarySearchTree<Integer> front;
            front = nodes.poll();
            System.out.print(front.data + ": ");
            if (front.left != null) {
                System.out.print("L" + front.left.data + ",");
                nodes.add(front.left);
            }
            if (front.right != null) {
                System.out.println("R" + front.right.data);

                nodes.add(front.right);
            }
            if (front.left == null && front.right == null) {
                System.out.println("no child");
            }
        }
    }




        public static void main(String[] args) {
         BinarySearchTree<Integer> root =takeinputlevelwise();
          printTreeLevelWise(root);
//            System.out.println(searchBst(root,10));
//            printInRange(root,3,9);

//            int [ ] arr={1,2,3,4,5,6,7,8,9,10,11,12};
//            int middle;
//            if(arr.length%2==0){
//                middle= arr.length;
//
//            }else{
//                middle= (arr.length-1)/2;
//
//            }
           // arr.length%2==0?middle= arr.length/2:middle= (arr.length-1)/2;
//           BinarySearchTree<Integer> newRoot= createBSTusingSortedArray(arr,0,arr.length-1);
//           printTreeLevelWise(newRoot);
           if(isBST(root) ){
               System.out.println(" this is BSt");

           }else{
               System.out.println(" It i not a BSt");

           }
     // isBST(newRoot) ? System.out.println("no Bst") : System.out.println("not a BSt");

    }

    private static BinarySearchTree<Integer> createBSTusingSortedArray(int[] arr,int s,int e) {
        if(s>e) {
            return null;

        }
        int middle=(s+e)/2;
        BinarySearchTree<Integer> root=new BinarySearchTree<Integer>(arr[middle]);
//        if(s==e){
//            return root;
//        }
        root.left=createBSTusingSortedArray(arr,s,middle-1);
        root.right=createBSTusingSortedArray(arr,middle+1,e);
        return root;





    }
   static BinarySearchTree<Integer> prev=null;

    public static boolean isBST(BinarySearchTree<Integer> root){

        // First Assumption
//        if(root==null){
//            return true;
//        }
//        if(!isBST((root.left))){
//            return false;
//
//        }
//        if(prev!=null&&prev.data>=root.data){
//            return false;
//
//        }
//        prev=root;
//        return isBST(root.right);
//

        //// Second Assumption and easy to UnderStand
        return helperISBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);



    }

    private static boolean  helperISBST(BinarySearchTree<Integer> root, int minValue, int maxValue) {
        if( root == null){
            return true;
        }
        if( root.data<minValue||root.data>maxValue){
            return false;

        }
        return (  helperISBST(root.left,minValue,root.data-1)&&helperISBST(root.right,root.data+1,maxValue));


    }

}
