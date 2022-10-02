import java.util.Scanner;
public class RatInMaze{
  public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the maze");
      int n = sc.nextInt();
      int[][] maze = new int[n][n];
      System.out.println("Enter path for rat '1' for go and '0' for block area");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              maze[i][j] = sc.nextInt();
          }
          System.out.println();
      }
      System.out.println("your entered path look like this");
      print(maze);
      printmaze(maze);
  }
  static boolean printmaze(int [][] maze){
    int n=maze.length;
      int [][] path=new int [n][n];
      if(!solvemaze(maze,0,0,path)){
          System.out.println("rat can't reach at destination");
          System.out.println("wrong path");
          return false;
      }
      System.out.println("path of rat loo like this in 1");
      print(path);
      return true;
    }
    static boolean solvemaze(int [][] maze,int i,int j,int[][] path) {
        int N = maze.length;
        //condin for reach at destination
        if (i==N-1&&j==N-1&&maze[i][j] == 1) {
            path[i][j] = 1;
            return true;
        }
        if (issafe(maze, i, j, path)) {
            path[i][j] = 1;
            //for movement at top
            if (solvemaze(maze, i - 1, j, path)) {
                return true;
                //right
            }
            if (solvemaze(maze, i, j + 1, path)) {
                return true;
                //down
            }
            if (solvemaze(maze, i + 1, j, path)) {
                return true;
                //left
            }
            if (solvemaze(maze, i, j - 1, path)) {
                return true;

            }
            path[i][j] = 0;
        }
        return false;
    }
    static boolean issafe(int[][] maze,int i,int j,int[][]path){
      int N=maze.length;
      if(i>=0&&i<N&&j>=0&&j<N&&maze[i][j]==1&&path[i][j]==0) {
          return true;
      }
      return false;
    }
      static void print(int[][] input){
      int n=input.length;
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              System.out.print(input[i][j]+" ");
          }
          System.out.println();
      }
}
}
