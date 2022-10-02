
//Input:
//        N = 5
//        arr[] = {2, 3, 2, 3, 5}
//        P = 5
//        Output:
//        0 2 2 0 1
//        Explanation:
//        Counting frequencies of each array element
//        We have:
//        1 occurring 0 times.
//        2 occurring 2 times.
//        3 occurring 2 times.
//        4 occurring 0 times.
//        5 occurring 1 time.
//        Example 2:
//
//        Input:
//        N = 4
//        arr[] = {3,3,3,3}
//        P = 3
//        Output:
//        0 0 4 0
//        Explanation:
//        Counting frequencies of each array element
//        We have:
//        1 occurring 0 times.
//        2 occurring 0 times.
//        3 occurring 4 times.
//        4 occurring 0 times.

import java.util.HashMap;

public class frequencyInRange {
    public static void main(String[] args) {
        int []arr = {3,3,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=arr.length;i++){
            map.put(i,0);
        }
        for(int i=1;i<=arr.length;i++){
           int val=arr[i-1];
           // System.out.println(arr[i-1]);
          if(map.containsKey(arr[i-1])){
              map.put(arr[i-1],map.get(arr[i-1])+1);
          }
        }
        for (int i=1;i<=arr.length;i++){
            System.out.print(map.get(i)+" ");
        }

    }
}
