package Arrays;//
//Input:
//        N = 5
//        A[] = {0, 1, 2, 3, 4}
//        Output:
//        1 1 2 6 24
//        Explanation:
//        Factorial of 0 is 1,
//        factorial of 1 is 1, factorial of 2 is 2,
//        factorial of 3 is 6 and so on.
//
//        Example 2:
//
//        Input:
//        N = 3
//        A[] = {5, 6, 3}
//        Output:
//        120 720 6
//        Explanation:
//        Factorial of 5 is 120,
//        factorial of 6 is 720,
//        factorial of 3 is 6.
//


import java.util.Arrays;

public class largefactorial {


    public static void main(String[] args) {
        int mod=1000000000+7;

        int arr[] ={0, 1, 2, 3, 4};
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        long[] factorial=new long[max-1];
        factorial[0]=1;

        for(int i=1;i<=max;i++){
            factorial[i]=i*factorial[i-1];
        }
        long[] finalArray=new long[arr.length];
        for(int i=0;i<arr.length;i++){
            finalArray[i]=factorial[arr[i]];

        }
        System.out.println(Arrays.toString(finalArray));


    }
}
