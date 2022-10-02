package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphImplAdceMatrix {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //v-> no. of vertices
        //e-> no. of edges
        int v=sc.nextInt();
        int e=sc.nextInt();
        //we need to create a matrix with v cross v
        int [][] mat=new int[v][v];
        makeInputMatrix(mat,e);
        depthFirstSearch(mat);
        BFSTraversal(mat);


    }
    private static void BFSTraversal(int [][] mat){
        System.out.println("In BFS");
        Queue<Integer> pendingVertices=new LinkedList<>();
        boolean [] visited=new boolean[mat.length];
        pendingVertices.add(0);
        visited[0]=true;
        while(!pendingVertices.isEmpty()){
            int currentVertex=pendingVertices.poll();
            System.out.print(currentVertex+" ");
            for (int i=0;i<mat.length;i++){
                if(mat[currentVertex][i]==1&&!visited[i]){
                    pendingVertices.add(i);
                    visited[i]=true;
                }
            }





        }


    }

    private static void depthFirstSearch(int[][] mat) {
        System.out.println("In DFS");
     boolean [] visited=new boolean[mat.length];
       //all values initialized with false
        // System.out.println(visited[1]);
       helperDFS(mat,0,visited);
    }

    private static void helperDFS(int[][] mat, int currentIndex, boolean[] visited) {

        // marking as if we visited at vertex  as true
        visited[currentIndex]=true;
        //printing the path according to current Index to which we are going
        System.out.println(currentIndex);
        for(int i=0;i<mat.length;i++){
            //currentIndex tells the row of the matrices and i tells the column
            if (mat[currentIndex][i]==1 && !visited[i]) {
                //means at the location where current and i are connected
                // and at that index we not visited then go to next row
                helperDFS(mat,i,visited);
            }
        }
    }
    public static void makeInputMatrix(int[][] mat,int e) {
        Scanner sc=new Scanner(System.in);
        //now all elements are initialized with 0 and
        // we need to pass vertices which are connected in pair

        for( int i=0;i<e;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            //after getting par we need to put 1 at that location
            mat[v1][v2]=1;
            mat[v2][v1]=1;
        }
    }
}
