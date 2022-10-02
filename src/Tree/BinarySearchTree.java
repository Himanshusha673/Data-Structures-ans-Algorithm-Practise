import BinaryTree.BinaryTreeLevelwise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

 class BinarySearchTree {
    static BinaryTreeLevelwise<Integer> takeinputlevelwise() {
        Scanner s = new Scanner(System.in);
        Queue<BinaryTreeLevelwise<Integer>> pendingnodes = new LinkedList<>();
        System.out.println("Enter the root");
        int rootdata = s.nextInt();
        if (rootdata == -1) {
            return null;
        }
        BinaryTreeLevelwise<Integer> root = new BinaryTreeLevelwise<Integer>(rootdata);
        pendingnodes.add(root);
        ///iteratiive approach
        while (!pendingnodes.isEmpty()) {
            BinaryTreeLevelwise<Integer> front;

            try {
                front = pendingnodes.poll();
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
            System.out.println("Enter Left child of " + front.data);
            int leftchild = s.nextInt();
            if (leftchild != -1) {
                BinaryTreeLevelwise<Integer> child = new BinaryTreeLevelwise<>(leftchild);
                pendingnodes.add(child);
                front.left = child;

            }
            System.out.println("Enter right child of " + front.data);
            int rightchild = s.nextInt();
            if (rightchild != -1) {
                BinaryTreeLevelwise<Integer> child = new BinaryTreeLevelwise<>(rightchild);
                pendingnodes.add(child);
                front.right = child;

            }


        }
        return root;
    }

     public static void main(String[] args) {
       BinaryTreeLevelwise<Integer>root=  takeinputlevelwise();
       Scanner sc= new Scanner(System.in);
         System.out.println("Enter element which you  want to search");
         int k=sc.nextInt();
         searchElementinBinarytree(root,k);

    
    
    }

      static boolean searchElementinBinarytree(BinaryTreeLevelwise<Integer> root , int k) {
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;

        }
        if(k>root.data){
           return  searchElementinBinarytree(root.right,k);

        }

            return searchElementinBinarytree(root.right,k);


     }
 }


