package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackWithGetMIn {
    int min=Integer.MAX_VALUE;

    public void push(int a,Stack<Integer> s)
    {
        if(s.isEmpty()){
            s.push(a);
            min=a;
        }else{
            if(a<min){
                int encodeVal=2*a-min;
                s.push(encodeVal);
                min=a;
            }else{
                s.push(a);
            }

        }


    }
    public int pop(Stack<Integer> s)
    {

       if(s.peek()<min) {
           min = 2 * min - s.peek();
       }
       return s.pop();

    }
    public int min(Stack<Integer> s)
    {
       return min;
    }
    public boolean isFull(Stack<Integer>s, int n)
    {
        return s.size()==n;
    }
    public boolean isEmpty(Stack<Integer>s)
    {
       return s.size()==0;
    }

    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        StackWithGetMIn sta=new StackWithGetMIn();
        sta.push(5,stack);
        sta.push(8,stack);
        sta.push(4,stack);
        sta.push(1,stack);
        sta.push(6,stack);
        sta.push(7,stack);
        System.out.println(sta.min(stack));
        System.out.println( sta.pop(stack));
        System.out.println( sta.pop(stack));
        System.out.println( sta.pop(stack));
        System.out.println(sta.min(stack));
        System.out.println( sta.pop(stack));
        System.out.println( sta.pop(stack));
        System.out.println(sta.min(stack));


    }
}
