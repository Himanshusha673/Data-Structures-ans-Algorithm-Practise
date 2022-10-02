package Arrays;
//Ques: Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
//Input: nums = [4,2,5,7]
//Output: [4,5,2,7]
//Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

public class SortByParity2 {


    public static void main(String[] args) {
        int []arr={4,2,5,7};
        sortArrayByParity2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i]+" ");


        }

    }
   private static  int[] sortArrayByParity2(int[] nums) {
        int evenIndex=0; // for even
        int oddIndex=1;// iterate for odd
        while(evenIndex< nums.length&&oddIndex<nums.length){
            //below commented code of two whiile loop also replaced by
            // if(nums[evenIndex]%2==evenIndex%2){
            //
            //                evenIndex+=2;
            //                continue;
            //            }
            //            if(nums[oddIndex]%2==oddIndex%2){
            //                oddIndex+=2;
            //                continue;
            //
            //            }
            while(evenIndex< nums.length&&nums[evenIndex]%2==evenIndex%2){

                evenIndex+=2;

            }
            while(oddIndex<nums.length&&nums[oddIndex]%2==oddIndex%2){


                oddIndex+=2;

            }
            if(oddIndex< nums.length&&evenIndex< nums.length){
                int temp=nums[evenIndex];
                nums[evenIndex]=nums[oddIndex];
                nums[oddIndex]=temp;


            }

        }
        return nums;
    }




}
