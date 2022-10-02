package Strings;

import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println(findPattern(n));
    }

    private static String findPattern(int n) {
        if(n==1) return "1";
        //call recursin for prev numbers pattern
        //because we can find only nth patter with the help of (n-1)th Pattern
        // so we need to find n-1th using n-2 upto n==1
        String s=findPattern(n-1);
        int count=1,num=s.charAt(0)-'0';
        int i=1;
        StringBuilder t=new StringBuilder();
        while (i<s.length()){
            if(s.charAt(i)-'0'==num){
                //count if there are doublets and triplets
                count++;

            }else{
                //appenfthis into t
                t.append(count).append(num);
                num=s.charAt(i)-'0';
                count=1;

            }
            i++;
        }
        t.append(count).append(num);
        return t.toString();


    }
}
