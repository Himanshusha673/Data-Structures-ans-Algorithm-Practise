package HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {



        // remove Duplicates from Hashmap
        int [] arr= {1,2,3,4,4,7,5,8,7,6,9,11,32,11,8,5};
        System.out.println(" Before Array looks lIke this"+Arrays.toString(arr));
        ArrayList<Integer> output=removeDuplicates(arr);
        System.out.println(" After Array looks lIke this"+output);



        // finding maximum occuring elemnt
        int [] arr1= {1,2,3,4,4,7,5,8,7,6,9,11,32,11,8,5,4,2};

        System.out.println("Maximum Occuring element is "+ findMaxFrequency(arr1));





        int [] array1={2,3,8,5,6,1,2,3,5,4,6,7 ,8};
        int [] array2={2,4,8,5,5,1,2,6,5,4,6,9 ,8,10,11};



        printInterSection(array1,array2);







    }

    private static void printInterSection(int[] array1, int[] array2) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i=0;i<array1.length;i++){


            if (map.containsKey(array1[i])){
                int currentfreq=map.get(array1[i]);
                map.put(array1[i],currentfreq+1);

            }else{
                map.put(array1[i],1);


            }
        }
        // another for loop for Iterating on second array
        System.out.println("InteSection of array1 and array 2 is");
        for (int j=0;j<array2.length;j++){



            if (map.containsKey(array2[j])){
                // mil gya
                int frequency= map.get(array2[j]);

                if(frequency>0){
                    System.out.print(array2[j]+" ");
                    map.put(array2[j],frequency-1);
                }


            }


            }




    }

    private static int findMaxFrequency(int[]arr) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
               int count= map.get(arr[i]);
               count++;
                map.put(arr[i],count);
            }else{
                map.put(arr[i],0);

            }


        }
        Set<Integer> setOfKeys=map.keySet();
       for (Integer s: setOfKeys){
           if(max<map.get(s)){
               max=s;
           }

       }
       return max;




    }

    private static ArrayList<Integer> removeDuplicates(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        ArrayList<Integer> output=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
//            if (!map.containsKey(arr[i])) {
//                map.put(arr[i], true);
//
//            }
            if (map.containsKey(arr[i])) {
                continue;


            }
            output.add(arr[i]);
            map.put(arr[i], true);
            




        }
//        Set<Integer> keys=map.keySet();
//        for (Integer s: keys){
//            if(map.containsValue(true)){
//                output.add(s);
//
//            }
//
//
//        }
        return output;






    }


}
