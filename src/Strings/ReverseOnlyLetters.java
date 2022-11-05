package Strings;



import java.util.Scanner;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(reverseOnlyLetters(str));

    }

    private static String reverseOnlyLetters(String s) {
        char []c = s.toCharArray();
        int i = 0, j = c.length-1;
        while(i<j){
            if(Character.isLetter(c[i]) && Character.isLetter(c[j])){
                // means both character are letters so swap it
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            else{
                //means left side char is not letter
                if(!Character.isLetter(c[i]) && Character.isLetter(c[j])){
                    i++;
                }
                else if(Character.isLetter(c[i]) && !Character.isLetter(c[j])){
                    //right side char is not letetr

                    j--;
                }
                else{
                    // means both are not letters
                    i++;
                    j--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : c){
            sb.append(ch);
        }
        return sb.toString();
    }


}
