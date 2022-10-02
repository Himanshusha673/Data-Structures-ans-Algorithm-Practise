package BinaryTree;

public class ConvertMirror {
    public static void main(String[] args) {
        BinaryTreeLevelwise<Integer> root=BinaryTreeLevelwise.takeinputlevelwise();
        makeMirror(root);
        BinaryTreeLevelwise.printInOrderBinaryTree(root);
    }

    private static BinaryTreeLevelwise<Integer> makeMirror(BinaryTreeLevelwise<Integer> root) {
        if(root==null) return null;
        BinaryTreeLevelwise<Integer> temp=makeMirror(root.left);
        root.left=makeMirror(root.right);
        root.right=temp;
        return root;
    }
}
