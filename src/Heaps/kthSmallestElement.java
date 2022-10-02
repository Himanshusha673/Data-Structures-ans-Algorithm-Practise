package Heaps;

import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallestElement {
    public static void main(String[] args) {
        int[] arr={9,4,3,5,7,8,23,54};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println( kthSmallest(arr,k));


    }
    public static int kthSmallest(int[] arr, int k)
    {
        // to- use Maxheap
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int j=k;j<arr.length;j++){
            if(arr[j]<pq.peek()){
                pq.poll();
                pq.add(arr[j]);

            }
        }
        return pq.peek();





    }
}
