package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // using binary bits operations to find subsets
//        for (int i = 0; i <(int)Math.pow(2, arr.length); i++) {
//            int temp=i;
//            String bin="";
//            for (int j = arr.length-1; j>=0; j--) {
//             int r=temp%2;
//             temp=temp/2;
//              if(r==0)
//              { bin = "-\t" + bin;}
//              else {
//                  bin = arr[j] + "\t" + bin;
//              }
//            }
//            System.out.println(bin);
//        }
        // using powersets INtutive Solution
        List<List<Integer>> finalList =findSubset(arr);
        System.out.println(finalList);

    }

    private static List<List<Integer>> findSubset(int[] arr) {
        List<List<Integer>> res= new ArrayList<>();//Powerset
        // adding an empty list first
        res.add(new ArrayList<>());

        //Iterating for each elemnt of array
        for(int i=0;i<arr.length;i++){
            int n=res.size();
            //copying this arr[i] in existing elements in the res list add it into res also
            for(int j=0;j<n;j++){
               // this below code will copy all the elements of list of res[j]
                List<Integer> temp= new ArrayList<>(res.get(j));
                //now adding new value after exissting  all prev values
                temp.add(arr[i]);
                // finally afte adding add it into the  res list
                res.add(temp);


            }




        }
        System.out.println(res.size());
        return res;

    }
}
