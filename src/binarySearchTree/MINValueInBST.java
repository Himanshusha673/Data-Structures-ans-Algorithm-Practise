package binarySearchTree;

public class MINValueInBST {
    public static void main(String[] args) {
        BinarySearchTree<Integer> root=BinarySearchTree.takeinputlevelwise();

        System.out.println(findMinValue(root));
    }

    private static int  findMinValue(BinarySearchTree<Integer> root) {
        if (root==null) return -1;
        return helperMin(root);
    }

    private static int helperMin(BinarySearchTree<Integer> root) {
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(helperMin(root.left),helperMin(root.right)));


    }
}
