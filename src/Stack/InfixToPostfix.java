package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(inToPosfix(str));
    }

    private static String  inToPosfix(String str) {
        String result="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            if(currChar=='(')
                st.push(currChar);
            else if(currChar==')'){
                // if we get closing bracket then
                // we need to just pop untill stack is
                // empty or any opening bracket encounteerd
                while(!st.isEmpty()&&st.peek()!='('){
                  result+= st.pop();
                }
                //finally we need to remove extra ) this bracket
                st.pop();
            }//if we encounter an operator
            else if(precedence(currChar)>0){
                while(!st.isEmpty()&&precedence(currChar)<=precedence(st.peek())){
                    result+=st.pop();
                }
                //pop and add in reuslt
                st.push(currChar);
            }
            else
            {//only operands
                result+=currChar;
            }
        }
        //now we need to add all remaining element of stack
        while (!st.isEmpty()) result+=st.pop();
        return result;
    }
    private static int  precedence(char currChar) {
        return switch (currChar) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
}
