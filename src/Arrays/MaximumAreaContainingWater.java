package Arrays;

public class MaximumAreaContainingWater {
    public static void main(String[] args) {
        int [] arr = {8,8,2,4,5,5,1};
        System.out.println(maxArea(arr));

    }

    public static int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int maxArea=0;
        int leftHeight=0;
        int rightHeight=0;

        while(i<j){
            int currArea=0;
            leftHeight=arr[i];
            rightHeight=arr[j];
            if(leftHeight<rightHeight){
                currArea=leftHeight*(j-i);
                i++;
            }else{
                currArea=rightHeight*(j-i);
                j--;
            }
            if(currArea>maxArea) maxArea=currArea;


        }
        return maxArea;


    }


}
