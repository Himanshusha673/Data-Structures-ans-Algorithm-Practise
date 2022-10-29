package DynamicProgramming.Knapsack_variations;


import java.util.Arrays;

public class TargetSum {
    static int mod =(int)Math.pow(10,9)+7;
    public static void main(String[] args) {
        int [] arr= {1, 1, 1, 1, 1};
        int target= 3;
        System.out.println(findWaysTargetSum(arr,target));
    }

    private static int findWaysTargetSum(int[] a, int target) {
        int totalSum=0;
        int n=a.length;
        for (int val:a) totalSum+=val;
        int s1=(target+totalSum)/2;

        if(totalSum < target || (totalSum + target)%2 != 0|| s1<0)
            return 0;


        int tab[][] = new int[n + 1][s1 + 1];

        // Initializing the first value of matrix
        tab[0][0] = 1;

        for (int i = 1; i <= s1; i++)
            tab[0][i] = 0;


        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= s1; j++) {

                // If the value is greater than the sum
                if (a[i - 1] > j)
                    tab[i][j] = tab[i - 1][j] ;

                else {
                    tab[i][j] = (tab[i - 1][j] +
                            tab[i - 1][j - a[i - 1]]);
                }
            }
        }

        return tab[n][s1];
    }




}
