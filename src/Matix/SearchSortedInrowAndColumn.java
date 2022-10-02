package Matix;

import java.util.Scanner;

public class SearchSortedInrowAndColumn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int mat[][] = {{ 3, 30, 38},
                {36, 43, 60},
                {40, 51, 69}};
        int x=sc.nextInt();

        System.out.println(findElement(mat,x));

    }

    private static boolean  findElement(int [][] mat,int x) {
        int idx=0;
        int c=mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][c]==x){
                return true;
            }else if(x<mat[i][0]){
                idx=i-1;
                break;
            }else{
                // just for last row
                idx=i;
            }
        }
        if(idx>=0){
            for(int i=0;i<mat[0].length;i++){
                if(mat[idx][i]==x){
                    return true;
                }
            }
        }
        return false;


    }

}
