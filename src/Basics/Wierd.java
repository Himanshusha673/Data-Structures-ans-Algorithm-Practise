package Basics;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Wierd {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter a number");
        int n= scanner.nextInt();
        if (n%2==0 && n>2 && n<5 || n>20) {
            System.out.println("Not Weird");
        } else if( n>6 || n<20) {
            System.out.println("Weird");
        } else {
            System.out.println("Weird");
        }


        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
