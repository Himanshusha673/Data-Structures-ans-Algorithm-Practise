package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KlargestElements {

    public static void main(String[] args) {
        int [] arr={1, 23, 12, 9, 30, 2, 50};
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter k ");
        int k=sc.nextInt();
        System.out.println(Arrays.toString(findklargests(arr,k)));
    }

    private static int[] findklargests(int[] arr,int k) {
        int []temp=new int[k];
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int j=k;j< arr.length;j++){
            if(arr[j] > pq.peek()){
                pq.poll();
                pq.add(arr[j]);

            }
        }
        for(int i=k-1;i>=0;i--){
            temp[i]=pq.peek();
            pq.poll();
        }
        return temp;










    }
}
