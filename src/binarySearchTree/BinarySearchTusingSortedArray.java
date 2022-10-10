package binarySearchTree;

public class BinarySearchTusingSortedArray {
    public static void main(String[] args) {
      int []arr= {1, 3};
       BinarySearchTree<Integer>root= createBSTusingSortedArray(arr,0,arr.length-1);
       BinarySearchTree.printTreeLevelWise(root);


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
}
