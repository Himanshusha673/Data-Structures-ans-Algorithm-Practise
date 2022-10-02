package ImplementationOfPriorityQueueusingMinHeap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MyPriorityQueue {
   private ArrayList<Integer> heap;
   public MyPriorityQueue(){
       heap=new ArrayList<>();
   }
   //for telling heap is empty or not
    boolean isEmpty(){
       return heap.size()==0;
    }
    //getting minimum Element
    //first element of array of CBT is minElement
   int getMin(){
       try{
           if(heap.isEmpty()) return -1;
       }catch (Exception e){
           System.out.println(e);
       }
       return heap.get(0);
    }
   int size(){
       return heap.size();
   }
   void insert(int val){
       heap.add(val);
       int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;
      //  if child is smaller than parent element then swap untill min no. at top so UpwardHeapify operation
        while(parentIndex>=0){
            if(heap.get(childIndex)<heap.get(parentIndex)){
                //swap
                int temp=heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                //after swap our child index at the Index of previous parent Index
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }else{
                //we reached
                return;
            }
        }
   }
   void removeMinElement(){
       //swap it with last element of heap
       int temp=heap.get(0);
       heap.set(0,heap.get(heap.size()-1));
       heap.remove(heap.size()-1);
       //downward Heapify Operation
       //lasst element is present at 0th minimum Position we need to amek it position correct
       int minIndex;
       int leftChildIndex=1;
       int rightChildIndex=2;
       int positionOfswapperElement=0;
       minIndex=positionOfswapperElement;
       while(leftChildIndex<heap.size()){
           if(heap.get(leftChildIndex)<heap.get(minIndex)){
               minIndex=leftChildIndex;

           }
           if(rightChildIndex<heap.size()&&heap.get(rightChildIndex)<heap.get(minIndex)){
               minIndex=rightChildIndex;

           }
           if(minIndex==positionOfswapperElement){
               //means at prev position only and it is the best position

               break;
           }
           //swapping

           int temporary=heap.get(minIndex);
           heap.set(minIndex,heap.get(positionOfswapperElement));
           heap.set(positionOfswapperElement,temporary);
           positionOfswapperElement=minIndex;
           leftChildIndex=2*positionOfswapperElement+1;
           rightChildIndex=2*positionOfswapperElement+2;
           }




   }
    public static void main(String[] args) {
       MyPriorityQueue mp=new MyPriorityQueue();
       mp.insert(2);
       mp.insert(3);
       mp.insert(24);
       mp.insert(14);
       mp.insert(5);
        System.out.println( mp.size());
        System.out.println(mp.isEmpty());
        mp.removeMinElement();

        mp.removeMinElement();
        mp.removeMinElement();
        mp.removeMinElement();

        mp.removeMinElement();
        System.out.println(mp.getMin());

    }
}
