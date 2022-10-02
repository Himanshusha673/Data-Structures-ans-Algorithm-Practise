package BinaryTree;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BinaryTreeLevelwise<T>  {


    public T data;
    public BinaryTreeLevelwise<T> root;
   public BinaryTreeLevelwise<T> left;
   public BinaryTreeLevelwise<T> right;
    public BinaryTreeLevelwise(T data){
        this.data=data;

    }

    static BinaryTreeLevelwise<Integer> takeinputlevelwise(){
        Scanner s=new Scanner(System.in);
        Queue<BinaryTreeLevelwise<Integer>> pendingnodes=new LinkedList<>();
        System.out.println("Enter the root");
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryTreeLevelwise<Integer> root=new BinaryTreeLevelwise<Integer>(rootdata);
        pendingnodes.add(root);
        ///iteratiive approach
        while(!pendingnodes.isEmpty()){
            BinaryTreeLevelwise<Integer> front;

            try {
                front = pendingnodes.poll();
            }catch(Exception e){
                System.out.println(e);
                return null;
            }
            System.out.println("Enter Left child of "+front.data);
            int leftchild=s.nextInt();
            if (leftchild!=-1) {
                BinaryTreeLevelwise<Integer> child = new BinaryTreeLevelwise<>(leftchild);
                pendingnodes.add(child);
                front.left = child;

            }
            System.out.println("Enter right child of "+front.data);
            int rightchild=s.nextInt();
            if (rightchild!=-1) {
                BinaryTreeLevelwise<Integer> child = new BinaryTreeLevelwise<>(rightchild);
                pendingnodes.add(child);
                front.right = child;

            }


        }
        return root;



    }
    public static void printTree( BinaryTreeLevelwise<Integer> root){
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
    public static void printTreeLevelWise( BinaryTreeLevelwise<Integer> root){
        Queue<BinaryTreeLevelwise<Integer>> nodes=new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            BinaryTreeLevelwise<Integer> front;
            front=nodes.poll();
            System.out.print(front.data+ ": ");
            if(front.left!=null){
                System.out.print(  "L"+front.left.data+",");
                nodes.add(front.left);
            }
            if(front.right!=null){
                System.out.println( "R"+front.right.data);

                nodes.add(front.right);
            }
            if(front.left==null&&front.right==null){
                System.out.println("no child");
            }
        }

    }
    public static void printInOrderBinaryTree(BinaryTreeLevelwise<Integer> root ){
        if (root==null){
            return ;
        }
        printInOrderBinaryTree(root.left);
        System.out.println(root.data);
        printInOrderBinaryTree(root.right);



    }
    public static void printPreOrder(BinaryTreeLevelwise<Integer> root ){
        if (root==null){
            return ;
        }
        System.out.println(root.data);
        printPreOrder(root.left);

        printPreOrder(root.right);
    }
    public static void printPostOrder(BinaryTreeLevelwise<Integer> root ){
        if (root==null){
            return ;
        }

        printPostOrder(root.left);

        printPostOrder(root.right);
        System.out.println(root.data);
    }





    public static int countNodes(BinaryTreeLevelwise<Integer> root){
        if(root==null){
            return  0;

        }
        int  leftCount= countNodes(root.left);
        int rightCount=countNodes(root.right);

        return 1+leftCount+rightCount;

    }
    public static int largestDataFinding(BinaryTreeLevelwise<Integer> root){
        if(root==null){
            return -1;
        }
        int leftLargest=largestDataFinding(root.left);
        int rightLargest=largestDataFinding(root.right);
        return Math.max(root.data,Math.max(leftLargest,rightLargest));


    }
    public static int sumOfNodes(BinaryTreeLevelwise<Integer> root){
        if(root==null){
            return 0;
        }
        int  totalSum=root.data;
        totalSum+=sumOfNodes(root.left);
        totalSum+=sumOfNodes(root.right);
        return totalSum;

    }
    public static int numLeaves(BinaryTreeLevelwise<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return (numLeaves(root.left)+numLeaves(root.right));

    }
    public static int heightOfTree(BinaryTreeLevelwise<Integer> root){
        if(root==null){
            return 0;
        }
        return( Math.max(heightOfTree(root.left),heightOfTree(root.right))+1);




    }
    public static void printNodesAtDepthK(BinaryTreeLevelwise<Integer> root , int k){
        if(root==null){
            return ;
        }
        if(k==0){
            System.out.println(root.data);
            return ;
        }
        printNodesAtDepthK(root.left,k-1);
        printNodesAtDepthK(root.right,k-1);


    }
    public static ArrayList<Integer> nodeTORootPath(BinaryTreeLevelwise<Integer> root,int k) {
        if (root == null) {
            return null;

        }
        if (root.data == k) {
            ArrayList<Integer> singlePath = new ArrayList<>();
            singlePath.add(root.data);
            return singlePath;
        }
        //if not found at root lets check it on a left Side
        ArrayList<Integer> leftPath = nodeTORootPath(root.left, k);
        // if we Found on Left then it should return an arraylist not null
        if (leftPath != null) {
            leftPath.add(root.data);
            return leftPath;

        }
        // else if we Not found it on left so we need to check t on right side
        ArrayList<Integer> rightPath = nodeTORootPath(root.right, k);
        // if we Found on Left then it should return an arraylist not null
        if (rightPath != null) {
            rightPath.add(root.data);
            return rightPath;



        }
        // and if we not found it on anywhere then we simply return null
        return null;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        BinaryTreeLevelwise<Integer> root=takeinputlevelwise();
//
//
//
        printTreeLevelWise(root);
//        int totalCounts=countNodes(root);
//        System.out.println("Total Number Of counts : "+totalCounts);
//
//      int   largestData=largestDataFinding(root);
//      if(largestData==-1){
//          System.out.println("there is No any Node");
//      }
//        System.out.println("Largest Data is :"+largestData);
//        int totalSumOfNodes=sumOfNodes(root);
//        System.out.println("Total  sum Of nodes : "+totalSumOfNodes);
//        int TotalheightOfTree=heightOfTree(root);
//        System.out.println("Height of the tree is "+ TotalheightOfTree);
//        System.out.println("InOrder Binary Tree");
//        printInOrderBinaryTree(root);
//        System.out.println("PreOrder Binary Tree");
//        printPreOrder(root);
//        System.out.println("PostOrder Binary tree");
//        printPostOrder(root);
//        int totalLeafNodes=numLeaves(root);
//        System.out.println("Number of lead nodes are "+ totalLeafNodes);
//        System.out.println("Enter at Which depth you want to Print Nodes");
//        int depth=sc.nextInt();
//        printNodesAtDepthK(root,depth);
//        System.out.print("Enter the size of array");
//        int size = sc.nextInt();
//        int[] preArr = new int[size];
//        int[] inArr = new int[size];
//        System.out.println("Enter Preorder Data ");
//
//        for(int i = 0; i < preArr.length; i++) {
//            preArr[i] = sc.nextInt();
//        }
//        System.out.println("Enter Inorder Data ");
//
//        for(int i = 0; i < inArr.length; i++) {
//            inArr[i] = sc.nextInt();
//        }
//
//        BinaryTreeLevelwise<Integer> rootOfUniqueTree = createUniqueBinaryTree(preArr,inArr);
//        printTree(rootOfUniqueTree);
        System.out.println("Enter whidh value youb want to search ");
        int key=sc.nextInt();
        ArrayList<Integer> path=nodeTORootPath(root,key);
        //checking for if it gives null
        if (path==null){
            System.out.println("not found anywhere");
        }
        for(int i: path){
            System.out.print(i+"--> ");
        }








    }

    private static BinaryTreeLevelwise<Integer> createUniqueBinaryTree(int[] preArr, int[] inArr) {
        return createTreeHelper(preArr,inArr,0,inArr.length-1);



    }

    static int preIndex=0;


    // we are Traversin on Iorder tree using si and ei  for each node of preOrder and in preOrder only using preIndex
    private static BinaryTreeLevelwise<Integer> createTreeHelper(int[] preArr, int[] inArr, int si, int ei) {


        if(si>ei){
            return null;
        }



        BinaryTreeLevelwise<Integer> root=new BinaryTreeLevelwise<>(preArr[preIndex++]);



        if(si==ei){

            return root;
        }
        int  rootIndex=-1;
        for (int i= 0;i< inArr.length;i++){
            if(inArr[i]==root.data){
                rootIndex=i;

            }

        }






        root.left=createTreeHelper(preArr,inArr,si,rootIndex-1);
        root.right=createTreeHelper(preArr,inArr,rootIndex+1,ei);
        return root;







    }


}
