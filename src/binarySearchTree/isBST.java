package binarySearchTree;

public class isBST {

        public static void main(String[] args) {
            BinarySearchTree<Integer> root=BinarySearchTree.takeinputlevelwise();

            if(isBST(root) ){
                System.out.println(" this is BSt");

            }else{
                System.out.println(" It i not a BSt");

            }
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
          //  if(root.right!=null&& root.right.data.equals(root.data)) return false;
        if( root.data<minValue||root.data>=maxValue){
            return false;
        }
        return (  helperISBST(root.left,minValue,root.data-1)&&helperISBST(root.right,root.data+1,maxValue));


    }

}
