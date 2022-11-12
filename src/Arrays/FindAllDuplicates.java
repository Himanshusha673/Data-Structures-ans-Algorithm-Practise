package Arrays;



import java.util.*;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int [] arr= {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(finadAllDuplicates(arr));
    }
    private static List<Integer> finadAllDuplicates(int[] arr) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for( int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        // now finding all the counts
        Set<Integer> keys=map.keySet();
        for(Integer currkey:keys){
            if(map.containsKey(currkey)){
                if(map.get(currkey)>1){
                    list.add(currkey);

                }

            }
        }
       return list;
        ///////////////
        //Second Approach to put at Index
//        int n=nums.length;
//        int[] arr=new int [n];
//
//        for(int i=0;i<n;i++){
//            int x=nums[i];
//            arr[x-1]++;
//        }
//        ArrayList<Integer>l=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            if(arr[i]==2){
//                l.add(i+1);
//            }
//        }
//        return l;

    }

}
