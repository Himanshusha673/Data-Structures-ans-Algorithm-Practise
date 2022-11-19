package Arrays;

import java.util.Scanner;

public class GreatestCommonDivisior {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] arr= {2, 5, 6, 9, 10};
    }
    public int findGCD(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if( arr[i]<min){
                min=arr[i];
            }
            if( arr[i]>max){
                max=arr[i];
            }
        }
        int j=2;
        int gcf=1;
        while(j<=min)
        {
            if(min%j==0&&max%j==0) gcf=j;
            j++;
        }
        return gcf;
    }
}
