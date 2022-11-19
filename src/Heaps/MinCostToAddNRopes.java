package Heaps;

import java.util.PriorityQueue;

public class MinCostToAddNRopes {
    public static void main( String [] args){
        long [] arr = {4, 2, 7, 6, 9};
        System.out.println(findMinCost(arr));
    }

    private static long findMinCost(long[] arr) {
        PriorityQueue<Long> pq= new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        long cost =0;
        //because at last when our and comes then we are also
        // addind that ans into pq at that time there is no any
        // other element remain to add means that is our ans

        while(pq.size()>1){
            long firstMin=pq.remove();
            long secondMin=pq.remove();
            cost+=firstMin+secondMin;
            pq.add(firstMin+secondMin);
        }
        return cost;
    }
}
