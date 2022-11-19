package Heaps;
import java.util.*;

public class nearestToKwithorigin {
    public static  void main( String [] args){
        int [] []  points = {{3, 3}, {5, -1}, {-2, 4}};
        Scanner sc= new Scanner( System.in);
        int k=sc.nextInt();

        int [][] ans =findKNearestPointsToOrigin(points,k);
        for(int []arr: points){
            System.out.println(Arrays.toString(arr));
        }
    }
    // Class for which we are just compare one object to anotehr
    // on the basis of ditance and store it into P.Q.
    // now when we add points into pq ten it will hepify acc to their distance
    static class Point  implements Comparable<Point>{
        int x;
        int y;
        int distsq;
        int i;
        public Point(int x,int y, int dist,int i){
            this.x=x;
            this.y=y;
            this.distsq =dist;
            this.i=i;
        }

        @Override
        public int compareTo(Point o) {
            return this.distsq -o.distsq;
        }
    }
    private static int[][] findKNearestPointsToOrigin(int[][] points,int k) {
        PriorityQueue<Point> pq= new PriorityQueue<>();
        int [][] ans = new int[k][2];
        for(int i=0;i<points.length;i++){
            int distSq =points[i][0]*points[i][0]+ points[i][1]*points[i][1];
            pq.add(new Point(points[i][0],points[i][1],distSq,i));
        }

        for(int i=0;i<k;i++){
           Point p=pq.poll();
           ans[i][0]=p.x;
           ans[i][1]=p.y;
        }
        return ans;
    }
}
