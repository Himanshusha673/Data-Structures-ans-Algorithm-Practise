import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



//Question Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

public class removeDuplicates {


    public static void main(String[] args) {
        int []arr={1,2,1,1,3,4,5,3,6};
        System.out.println( removeDuplicates(arr));





        System.out.println(Arrays.toString(arr));





    }
    private  static int removeDuplicates(int [] nums){
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        //ArrayList<Integer> output=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                continue;


            }
           // output.add(nums[i]);
            map.put(nums[i], true);





        }
 return nums.length;





    }



}
