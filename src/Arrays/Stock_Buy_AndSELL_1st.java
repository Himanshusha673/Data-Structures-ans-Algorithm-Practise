package Arrays;

public class Stock_Buy_AndSELL_1st {
    public static void main(String[] args) {
        int[] arr={4,2,2,2,4};
        System.out.println(  findMaxProfit(arr));

    }

    private static int  findMaxProfit(int[] arr) {
        int minSoFar=arr[0];
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minSoFar) minSoFar=arr[i];
            int currProfit=arr[i]-minSoFar;
            if(currProfit>maxProfit) maxProfit=currProfit;
        }
        return maxProfit;
    }
}
