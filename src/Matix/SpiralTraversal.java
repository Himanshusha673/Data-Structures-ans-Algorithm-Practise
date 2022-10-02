package Matix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Rows");
        int n=sc.nextInt();
        System.out.println("Enter the no. of columns" );
        int m=sc.nextInt();
     int mat[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}};
        ArrayList<Integer> arr= new ArrayList<>();

       arr= findSpriral(mat,m);
        System.out.println(arr);
    }
    private static ArrayList<Integer> findSpriral(int[][] mat, int m) {
        ArrayList<Integer> ans=new ArrayList<>();
        //declaring four pointers
        int top=0,left=0,down=mat.length-1,right=mat[0].length-1;
        //declaring direction variable
        int dir=0;
        while(top<=down&&left<=right){
            if(dir==0){
                //left to right
                for(int i=left;i<=right;i++){
                    ans.add(mat[top][i]);
                }
                //increase top by 1 so that we can't take last mat[top][mat[0].length-1] (0,4)
                top+=1;
            }else if(dir==1) {
                //right to left
                for(int i=top;i<=down;i++){
                    //right is constant and top is variable
                    ans.add(mat[i][right]);
                }
                //decrease right by 1 so that we can't take last one
                right-=1;
            }else if(dir==2){
   //   **********   loop condition       //right to left ************
                for(int i=right;i>=left;i--){
                    //down is constant and top is variable
                    ans.add(mat[down][i]);
                }
                //deccrease down by 1 so that we can't take last one
               down-=1;
            }else if(dir==3){
                // bottom to top
                for(int i=down;i>=top;i--){
                    //left is constant
                    ans.add(mat[i][left]);
                }
                //increase left by 1 so that we can't take last one
                left+=1;

            }
            //there is only 4 direction so
            dir=(dir+1)%4;

        }
        return ans;
    }
//    int r = matrix.length; int c = matrix[0].length;
//    int top = 0; int right = c-1;
//    int bottom = r-1; int left = 0;
//
//    List<Integer> ans = new ArrayList<>(); // ans stores the number by the function '.add'
//
//    while(top<=bottom && left<=right){
//
//        for(int i=top; i<=right; i++) ans.add(matrix[top][i]);
//        top++;
//
//        for(int i=top; i<=bottom; i++) ans.add(matrix[i][right]);
//        right--;
//
//        if(top<=bottom){
//            for(int i=right; i>=left; i--) ans.add(matrix[bottom][i]);
//            bottom--;
//        }
//
//        if(left<=right){
//            for(int i=bottom; i>=top; i--) ans.add(matrix[i][left]);
//            left++;
//        }
//    }
//
//    return ans;
//}



}
