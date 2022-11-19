package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class StockBuyAndSellReturnPOwersetOforders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {100, 180, 260, 310, 40, 535, 695};
        //System.out.println(findOrderedPairs(A));

    }// loop breaks when prev is greater than curr

    private static ArrayList<ArrayList<Integer>> findOrderedPairs(int[] a) {
        ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
        if(a.length==1) return bigList;

        int i = 0;

        while (i < a.length-1) {
            ArrayList<Integer> list = new ArrayList<>();
            // finding day of buy
            // loop breaks when next greater than curr
            while(i<a.length-1&&a[i+1]<=a[i]){
                i++;
            }
            if(i==a.length-1) break;
            // at this p[oint we have curr min no. to buy
            list.add(i);
            i++;
            // finding index for sell checking if prev is greater than
            // the curr means prev elem is better to sell and store taht index as sell at i-1
            // moving this loop till end because we need to compare till last element to sell
            while(i<a.length&&a[i-1]<=a[i]){
                i++;
            }
            list.add(i-1);

            bigList.add(list);



        }
        return bigList;



    }
}

