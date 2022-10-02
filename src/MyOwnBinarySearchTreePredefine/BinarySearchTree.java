package MyOwnBinarySearchTreePredefine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.BaseStream;

public class BinarySearchTree {
    BinarySearchTreeNode<Integer> root;
    int size=0;



    public void getSize(){
        System.out.println(size);

    }
    public BinarySearchTreeNode<Integer> insertData(int val){
        size++;
        root=insertHelper(root,val);

        return root ;



    }
    public void  isPresent(int x){
        boolean present=isPresentHelper(root,x);
        System.out.println(present);


    }

    private boolean isPresentHelper(BinarySearchTreeNode<Integer> node, int x) {
        if(node==null){
            return false;

        }
        if(x==node.data){
            return true;

        }
        if(node.data>x){
            return isPresentHelper(node.left,x);


        }else{
            return isPresentHelper(node.right,x);
        }



    }

    private static BinarySearchTreeNode<Integer> insertHelper(BinarySearchTreeNode<Integer>node,int value) {
        if (node==null){
            BinarySearchTreeNode<Integer> newRoot= new BinarySearchTreeNode<>(value);
            return newRoot;

        }
        if (value >= node.data) {
            node.right=insertHelper(node.right,value);

        } else {
            node.left=insertHelper(node.left,value);
        }
        return node;


    }
    public void printTree(){

        printTreeHelper(root);
    }
    public void deleteNode(int x){

        BSTdeleteReturn output =deleteNodeHelper(root,x);
        if(output.deleted){
            size--;
            System.out.println( x+" is deleted");
        }else{
            System.out.println(x+" Not Present");
        }
        root= output.root;




    }

    private BSTdeleteReturn deleteNodeHelper(BinarySearchTreeNode<Integer> node, int x) {
        if(node==null){
            return new BSTdeleteReturn(null,false);
        }
        if(x>node.data){
            BSTdeleteReturn outputRight=deleteNodeHelper(node.right,x);
            //adding new root return by this function to the right of the root

            node.right= outputRight.root;
            //we are need to final returning the node which is our final root
            // so if i return only root so boolean deleted or not value lost so i need to return
            outputRight.root=node;
            return outputRight;


        }
        if(x<node.data){
            BSTdeleteReturn outputLeft=deleteNodeHelper(node.left,x);
            //adding new root return by this function to the left of the root

            node.left= outputLeft.root;
            //we are need to final returning the node which is our final root
            // so if i return only root so boolean deleted or not value lost so i need to return
            outputLeft.root=node;
            // this will contain out final root as well as final boolean value
            return outputLeft;


        }
        // when x== root.data then 3 cases arise (i) if there is no child of root.data which has been deleted mean there is only root present
        //(ii) when there is only one child
        // (iii) when there are both childs of the root
        if(node.left==null&&node.right==null){
            // we need to return true beause there is only root present in this case so we hace deleted ot and return null
            return new BSTdeleteReturn(null,true);

        }
        // if there is only left child present so we need to retrun that child only
        if(node.left!=null&&node.right==null){
            return new BSTdeleteReturn(node.left,true);
        }
        if(node.left == null){

            return new BSTdeleteReturn(node.right,true);
        }
        int rightMinimum=minimum(node.right);
        // now we are justn replace root with minimum right element so that it doesnt affect BST condition
        node.data=rightMinimum;
        BSTdeleteReturn finalOutput=deleteNodeHelper(node.right,rightMinimum);
        node.right= finalOutput.root;
        return new BSTdeleteReturn(node,true);




    }
    public static int minimum(BinarySearchTreeNode<Integer> node){
        if(node==null){
            return 0;

        }
        return Math.min(node.data,Math.min(minimum(node.left),minimum(node.right)));


    }

    private void  printTreeHelper(BinarySearchTreeNode<Integer> node){
        Queue<BinarySearchTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            BinarySearchTreeNode<Integer> front;
            front = queue.poll();
            System.out.print(front.data + ": ");
            if (front.left != null) {
                System.out.print("L" + front.left.data + ",");
                queue.add(front.left);
            }
            if (front.right != null) {
                System.out.println("R" + front.right.data);

                queue.add(front.right);
            }
            if (front.left == null && front.right == null) {
                System.out.println("no child");
            }
        }


    }



    public static void main(String[] args) {
       BinarySearchTree bst=new BinarySearchTree();
       bst.insertData(5);
       bst.insertData(3);
       bst.insertData(6);
       bst.printTree();
       bst.getSize();
       bst.isPresent(5);
       bst.isPresent(7);
       bst.deleteNode(3);
       bst.deleteNode(8);
       bst.insertData(5);
       bst.insertData(6);
       bst.deleteNode(5);
       bst.deleteNode(5);
       bst.printTree();
       bst.getSize();
       bst.isPresent(8);



    }



}
 class BinarySearchTreeNode<T> {
    T data;
    BinarySearchTreeNode<Integer> left;
    BinarySearchTreeNode<Integer> right;
    BinarySearchTreeNode( T data ) {
        this.data = data;
        this.right = null;
        this.left = null;
    }}
class BSTdeleteReturn {
    BinarySearchTreeNode<Integer> root;
    boolean deleted;
    BSTdeleteReturn(BinarySearchTreeNode<Integer> root,boolean deleted){
        this.deleted=deleted;
        this.root=root;


    }


}



