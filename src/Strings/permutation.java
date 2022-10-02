import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        printPermutations(str);

    }

    private static void printPermutations(String str) {
        permute(str, 0);
    }

    public static  String swap(String str, int l, int i) {
        StringBuilder sb=new StringBuilder(str);
        sb.setCharAt(l,str.charAt(i));
        sb.setCharAt(i,str.charAt(l));
        return sb.toString();
    }


    private static ArrayList<String> permute(String str, int l) {
        ArrayList<String> list;
        //base case
        if (l==str.length()) {
            System.out.print(str+" ");
        }

        //iterating over every character of String
        for (int i = l; i < str.length(); i++) {
          str= swap(str,l,i);
            permute(str,l+1);
           // str=swap(str,l,i);
        }
        list=new ArrayList<>(Arrays.asList(str));


        return list;


    }
}
