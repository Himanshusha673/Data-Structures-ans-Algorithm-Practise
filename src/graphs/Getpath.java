package graphs;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Getpath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //v-> no. of vertices
        //e-> no. of edges
        int v=sc.nextInt();
        int e=sc.nextInt();
        //we need to create a matrix with v cross v
        int [][] mat=new int[v][v];
        GraphImplAdceMatrix.makeInputMatrix(mat,e);


       ArrayList<Integer> output= getPathDFS(mat);
        System.out.println(output);
    }

    private static ArrayList<Integer> getPathDFS(int[][] mat) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source ");
        int s=sc.nextInt();
        System.out.println("Enter destination ");
        int d=sc.nextInt();
        boolean [] visited= new boolean[mat.length];
        return helperGetpathDFS(mat,s,d,visited);
    }

    private static ArrayList<Integer> helperGetpathDFS(int[][] mat, int s, int d,boolean [] visited) {
        // we are updating the source by their call
        if(s==d){
            ArrayList<Integer> singleArr=new ArrayList<>();
            //adding last path
            singleArr.add(s);
            return singleArr;
        }
        //mark visited at source true
        visited[s]=true;
        for(int i=0;i<mat.length;i++){
            if(mat[s][i]==1&&!visited[i]){
                ArrayList<Integer> ans=helperGetpathDFS(mat,i,d,visited);
                if (ans!=null) {
                    ans.add(s);
                    return ans;
                }
            }
        }
        return null;



    }


}
