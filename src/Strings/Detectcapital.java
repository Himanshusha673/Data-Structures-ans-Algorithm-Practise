package Strings;
//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//1st condition -All letters in this word are capitals, like "USA".
//2 All letters in this word are not capitals, like "leetcode".
//3 Only the first letter in this word is capital, like "Google".
//Given a string word, return true if the usage of capitals in it is right.

import java.util.Scanner;

public class Detectcapital {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(capitalOrNot(str));
    }
   static boolean isUppercase(char ch){
       int range = (int)ch;
       if(range<=90&&range >= 65) return true;
       else return false;

    }


    private static boolean capitalOrNot(String str) {
       // count Capital Letters
        int count=0;
        for (int i=0;i<str.length();i++){
            if(isUppercase(str.charAt(i))) count++;
        }

        if(count==str.length())// means all letters are capital
        return true;
        else if(count==1&&isUppercase(str.charAt(0)))// means only first letter is Capital
            return true;
        else if(count==0) return true;//means all letters are small
        else return false;

    }
}
