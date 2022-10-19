package binarySearchTree;

import BinaryTree.BinaryTreeLevelwise;


import java.util.Scanner;

public class PrecedessorAndSuccessor {
    public static void main(String[] args) {
        BinarySearchTree<Integer> root=BinarySearchTree.takeinputlevelwise();
        Scanner sc= new Scanner(System.in);
        BinarySearchTree<Integer> pred=null;
        BinarySearchTree<Integer> succ=null;
        int k= sc.nextInt();


       findPredAndSuce(root,pred,succ,k);
        System.out.println(pred.data);
        System.out.println(succ.data);
    }
// wrong answer
    private static void findPredAndSuce(BinarySearchTree<Integer> root,
                                        BinarySearchTree<Integer> pred, BinarySearchTree<Integer> succ, int k) {
        if(root==null){
             return ;
        }
        if(root.data==k){
            pred=root.left;
            succ=root.right;
            return;
        }
        if(root.data>k){
            findPredAndSuce(root.left,pred,succ,k
            );
        }else{
            findPredAndSuce(root.left,pred,succ,k
            );

        }

    }
}
