package DynamicProgramming.Knapsack_variations;

import java.util.Scanner;

public class CountSubsetWithGivebDiff {
    static int mod =(int)Math.pow(10,9)+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int diff = sc.nextInt();
        int totalSum=0;
        for (int val:arr) totalSum+=val;
        int s1=(diff+totalSum)/2;

        System.out.println(countSubsetSum(arr,s1));
    }

    private static int countSubsetSum(int[] a,int sum) {
        int n=a.length;


        int tab[][] = new int[n + 1][sum + 1];

        // Initializing the first value of matrix
        tab[0][0] = 1;

        for (int i = 1; i <= sum; i++)
            tab[0][i] = 0;


        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {

                // If the value is greater than the sum
                if (a[i - 1] > j)
                    tab[i][j] = tab[i - 1][j] % mod;

                else {
                    tab[i][j] = (tab[i - 1][j] +
                            tab[i - 1][j - a[i - 1]]) % mod;
                }
            }
        }
//        System.out.println(Arrays.toString(tab[0]));
//        System.out.println(Arrays.toString(tab[1]));
//        System.out.println(Arrays.toString(tab[2]));
//        System.out.println(Arrays.toString(tab[3]));
//        System.out.println(Arrays.toString(tab[4]));

        return tab[n][sum] % mod;
    }

}
