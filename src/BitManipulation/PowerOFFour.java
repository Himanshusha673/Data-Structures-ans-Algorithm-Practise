package BitManipulation;

import java.util.Scanner;

public class PowerOFFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(powerOfTwo(n));
    }
    private static boolean powerOfTwo(int n) {
        // 1st Method  Oh(1) using log
        double result = Math.log(n)/Math.log(4);
        double res= result-Math.ceil(result);
        return res==0.0;
        ///////////////////////////////
        // second method using O(logn)
//        if( n==0) return false;
//        while(n!=1){
//            if(n%4!=0) return false;
//            n=n/4;
//        }
//        return true;
    }

}
