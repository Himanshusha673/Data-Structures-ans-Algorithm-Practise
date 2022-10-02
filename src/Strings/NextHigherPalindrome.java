package Strings;
//Input:
//        N = "35453"
//        Output:
//        53435
//        Explanation: Next higher palindromic
//        number is 53435.
//        Example 2:
//
//        Input: N = "33"
//        Output: -1
//        Explanation: Next higher palindromic n


import java.util.Scanner;

public class NextHigherPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Next is"+findAnotherPalindrome(str));


    }

    private static String findAnotherPalindrome(String str) {
        if(str.length()==1||str.length()==2||str.length()==3){
            return "-1";
        }
        return " ";


    }
}
