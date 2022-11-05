package BitManipulation;

import java.util.Scanner;

public class PowerOFTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(powerOfTwo(n));
    }

    private static boolean powerOfTwo(int n) {
        // 1st Method  Oh(1) using bit manipulation
//        if(n<=0)
//            return false;
//        return (n & (n - 1)) == 0;
        ///////////////////////////////
        // Second Method by usiong log Oh(1)
        double result = Math.log(n)/Math.log(2);
        double res= result-(int) result;
        if(res==0)// means whole number and it is completey divisible
            return true;
        else return false ;
        /////////////////////

        // third  method using O(logn)
//        if( n==0) return false;
//        while(n!=1){
//            if(n%2!=0) return false;
//            n=n/2;
//        }
//        return true;




    }


}
