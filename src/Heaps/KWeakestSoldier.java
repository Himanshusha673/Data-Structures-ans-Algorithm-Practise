package Heaps;
import java.util.*;
//Queue<Row> heap = new PriorityQueue<>((r1, r2) -> {
//        if (r1.ones == r2.ones) return r2.index - r1.index;
//        return r2.ones - r1.ones;
//        });
public class KWeakestSoldier {
    public static void main( String [] args){
         int [][] mat = {{1, 1, 0, 0, 0},
        {
            1, 1, 1, 1, 0
        },
        {
            1, 0, 0, 0, 0
        },
        { 1, 1, 0, 0, 0},
        {
            1, 1, 1, 1, 1
        }
         };
         int k=4;

        System.out.println(Arrays.toString(fidnIndexesOfKWeakestSoldiers(mat,k)));


    }
    //wwe ImplementComparable because we need to sort  Row on the basis of
    // soldierCount(no. of ones) and after that idx
    // we can also do it by TreeMap
    static class Row implements Comparable<Row>{
        int soldierCount;
        int idxInMat;
        public Row(int soldierCount,int idxInMat) {
            this.soldierCount = soldierCount;
            this.idxInMat = idxInMat;

        }
        @Override
        public int compareTo(Row r) {
            // if both rows soldierCount equals the compare ion the basis of index
           if(this.soldierCount==r.soldierCount){
               return this.idxInMat-r.idxInMat;
           }
           return this.soldierCount-r.soldierCount;
        }
    }
    private static int[] fidnIndexesOfKWeakestSoldiers(int[][] mat,int k) {
        PriorityQueue<Row> pq= new PriorityQueue<>();
        // if we dont want to put that compare to method code thier so we can do it by below way
        ////Queue<Row> heap = new PriorityQueue<>((r1, r2) -> {
        ////        if (r1.ones == r2.ones) return r2.index - r1.index;
        ////        return r2.ones - r1.ones;
        ////        });

        for(int i=0;i<mat.length;i++){
            int soldierCount=0;
            for(int j=0;j<mat[0].length;j++){
                soldierCount+=mat[i][j]==1?1:0;
            }
            //adding into the pq
            System.out.println(i);
            pq.add(new Row(soldierCount,i));

        }

        int [] ans=new int[k];
        for(int i=0;i<k;i++){
            System.out.println(pq.peek().idxInMat);
           Row r= pq.remove();

           ans[i]=r.idxInMat;
        }
        return ans;

    }

}
