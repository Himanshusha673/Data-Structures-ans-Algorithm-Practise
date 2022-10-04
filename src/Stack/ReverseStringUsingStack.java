package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));


    }

    private static String reverse(String str) {
        Stack<Character> st= new Stack<>();
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<str.length();i++){
            st.add(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}
