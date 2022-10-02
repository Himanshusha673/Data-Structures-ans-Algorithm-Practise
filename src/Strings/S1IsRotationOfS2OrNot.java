package Strings;

import java.util.Scanner;

public class S1IsRotationOfS2OrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        System.out.println(isRotation(s1,s2));
    }
    private static boolean isRotation(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        String total =s1+s2;
       if(total.contains(s2)){
           return true;
       }else return false;

    }


}
