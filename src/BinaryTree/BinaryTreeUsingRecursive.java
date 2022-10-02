import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class BinaryTreeUsingRecursive<T> {
    public T data;
    public BinaryTreeUsingRecursive<T> root;
    public BinaryTreeUsingRecursive<T> left;
    public BinaryTreeUsingRecursive<T> right;
    BinaryTreeUsingRecursive( T data){
        this.data=data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
       BinaryTreeUsingRecursive<Integer> root= takeInpt(sc);
       printTree(root);

    }
     public static void printTree( BinaryTreeUsingRecursive<Integer> root){
        if(root==null){
            return;
        }
        String finaldata= root.data+"-->";
         if(root.left!=null){
             finaldata+=","+"L"+root.left.data;
         }
         if(root.right!=null){
             finaldata+=","+"R"+root.right.data;
         }
         System.out.println(finaldata);
         printTree(root.left);
         printTree(root.right);
     }

    private static BinaryTreeUsingRecursive<Integer> takeInpt(Scanner sc) {
        int rootdata;
        System.out.println("Enter root and if you want to add nothing into it then simply press -1");
        rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryTreeUsingRecursive<Integer> root= new BinaryTreeUsingRecursive<>(rootdata);
        root.left=takeInpt(sc);
        root.right=takeInpt(sc);
        return root;

    }

}
