package Arrays;
public class SortArrayByParity {
//Given an integer array nums, move all the even integers
// at the beginning of the array followed by all the odd integers.


    public static void main(String[] args) {
        int []arr={3,1,2,4};
        sortArrayByParity(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i]+" ");


        }

    }
    public static  int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]%2==0){
                i++;
                continue;

            }
            if(nums[j]%2!=0){
                j--;
                continue;
            }
            if(nums[i]%2!=0&&nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        return nums;
    }
}
