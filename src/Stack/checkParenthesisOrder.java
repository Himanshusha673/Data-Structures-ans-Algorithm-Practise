package Stack;

import java.util.Scanner;
import java.util.Stack;

public class checkParenthesisOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String parenthesis=sc.nextLine();
        System.out.println( checkBalancedParenthesis(parenthesis));








    }

    private static boolean checkBalancedParenthesis(String s) {




        Stack<Character> stack=new Stack<>();
        char curr;


        for(int i=0;i<s.length();i++){
            curr=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(curr);
            }else if((curr==')'&&stack.peek()=='(')||(curr=='}'&&stack.peek()=='{')||(curr==']'&&stack.peek()=='[')){
                stack.pop();
            }else {
                stack.push(curr);
            }
        }
        return stack.isEmpty();







    }


}
