package DynamicProgramming.Knapsack_variations;
//0-1 knapsack

public class Knapsack {
    public static void main(String[] args) {
       int  values[] = {4,5,3,7};
      int   weight[] = {2,3,1,4};
     int capacity=5;
        System.out.println(findMaxProfitInBag(values,weight,capacity));
    }

    private static int findMaxProfitInBag(int[] values, int[] weight,int capc) {
        int [][] dp= new int[values.length+1][capc+1];
        for(int i=1;i<=values.length;i++){
            for(int j=1;j<=capc;j++){
                //value when not putting into bag
                int valueWhenNotComes=dp[i-1][j];
                if(j>=weight[i-1]){
                    //value when it putting
                    int remainCap=j - weight[i - 1];
                       int  valueWhenComes=dp[i - 1][remainCap]+values[i-1];
                    dp[i][j] = Math.max(valueWhenComes, valueWhenNotComes);
                }else{
                    dp[i][j]=valueWhenNotComes;
                }
            }
        }
        return dp[values.length][capc];


    }

}
