import java.util.Arrays;
//Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
//Example 1:
//
//Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_]
//Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
//Example 2:
//
//Input: nums = [0,0,1,1,1,1,2,3,3]
//Output: 7, nums = [0,0,1,1,2,3,3,_,_]
//Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).

public class removeDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int []arr={0,0,1,1,1,2};
        System.out.println( removeDuplicates(arr));





        System.out.println(Arrays.toString(arr));
    }
    private static int removeDuplicates(int [] nums){
        int i=2;
        int elemIndex=2;
        while(elemIndex< nums.length){
            if(nums[elemIndex]!=nums[i-2]){
                if(i<elemIndex){
                    nums[i]=nums[elemIndex];

                    i++;
                    elemIndex++;
                }
                else{
                    elemIndex++;
                    i++;

                }

            }else{
                elemIndex++;


            }


        }
        return i;











    }
}
