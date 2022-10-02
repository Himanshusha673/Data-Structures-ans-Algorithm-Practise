package BinaryTree;

public class DiameterOfBT {
    public static void main(String[] args) {
        BinaryTreeLevelwise<Integer> root=BinaryTreeLevelwise.takeinputlevelwise();
        System.out.println(findDiameter(root).dia);
        BinaryTreeLevelwise.printInOrderBinaryTree(root);
    }
// method 1 with o(N2)
//    private static int findDiameter(BinaryTreeLevelwise<Integer> root) {
//        int maxHeightL=  height(root.left);
//        int maxHeightR=  height(root.left);
//        return maxHeightL+maxHeightR+1
//    }
//
//    private static int height(BinaryTreeLevelwise<Integer> root) {
//        if(root==null) return 0;
//
//        return Math.max(height(root.left),height(root.right))+1;
//    }

//Mthod@= 2 using two things retrun(dia and height)

public static Pair findDiameter(BinaryTreeLevelwise<Integer> root){
    if(root==null) {
        Pair p = new Pair();
        p.dia=0;
        p.height=0;
        return p;
    }
   Pair leftOutput=findDiameter(root.left);
    Pair rightOutput=findDiameter(root.right);
    int TotalHeight=1+Math.max(leftOutput.height,rightOutput.height);
    int heightThRoot= leftOutput.height+rightOutput.height;
    int leftDia= leftOutput.dia;
    int rightDia=rightOutput.dia;
    int finaldia=Math.max(leftDia,Math.max(rightDia,heightThRoot));
    Pair p=new Pair();
    p.height=TotalHeight;
    p.dia=finaldia;
    return p;
}
}

