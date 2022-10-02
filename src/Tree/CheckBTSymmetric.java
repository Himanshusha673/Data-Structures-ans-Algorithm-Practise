package Tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckBTSymmetric<T> {
    T data;
    CheckBTSymmetric<T> left;
    CheckBTSymmetric<T> right;
    CheckBTSymmetric<T>root;
    CheckBTSymmetric(T data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
    static CheckBTSymmetric<Integer> takeinputlevelwise(){
        Scanner s=new Scanner(System.in);
        Queue<CheckBTSymmetric<Integer>> pendingnodes;
        pendingnodes = new LinkedList<>();
        System.out.println("Enter the root");
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        CheckBTSymmetric<Integer> root=new CheckBTSymmetric<Integer>(rootdata);
        pendingnodes.add(root);
        ///iteratiive approach
        while(!pendingnodes.isEmpty()){
            CheckBTSymmetric<Integer> front;

            try {
                front = pendingnodes.poll();
            }catch(Exception e){
                System.out.println(e);
                return null;
            }
            System.out.println("Enter Left child of "+front.data);
            int leftchild=s.nextInt();
            if (leftchild!=-1) {
                CheckBTSymmetric<Integer> child = new CheckBTSymmetric<>(leftchild);
                pendingnodes.add(child);
                front.left = child;

            }
            System.out.println("Enter right child of "+front.data);
            int rightchild=s.nextInt();
            if (rightchild!=-1) {
                CheckBTSymmetric<Integer> child = new CheckBTSymmetric<>(rightchild);
                pendingnodes.add(child);
                front.right = child;

            }


        }
        return root;



    }
     static boolean checkSymmetricOrNot(CheckBTSymmetric<Integer> root){
        if(root==null) return true;
        return checkSymmet(root.left,root.right);







     }

    private static boolean checkSymmet(CheckBTSymmetric<Integer> node1, CheckBTSymmetric<Integer> node2) {
        if (node1 == null && node2 == null)  return true;

        if (node1==null||node2==null)  return false;

        if(node1.data==node2.data){
            if(checkSymmet(node1.left,node2.right)&&checkSymmet(node1.right,node2.left)) return true;
        }



        return false;



    }

    public static void main(String[] args) {
        CheckBTSymmetric<Integer> root=takeinputlevelwise();
        System.out.println(checkSymmetricOrNot(root));

    }

}
