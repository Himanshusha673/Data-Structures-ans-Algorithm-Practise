package Strings;

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(findPalindromOrNot(str));
    }

    private static boolean findPalindromOrNot(String str) {
        if(str.length()==1) return true;
        StringBuilder s=new StringBuilder();
        // first removing spaces and , and :
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))){
                s.append(str.charAt(i));
            }
        }
        return checkPalindriome(s.toString());
    }

    private static boolean checkPalindriome(String str) {
        if(str.length()==1) return true;

        int i=0;
        int j=str.length()-1;
        str=str.toLowerCase();

        while(i<j){

            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
