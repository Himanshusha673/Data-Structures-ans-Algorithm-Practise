import java.util.Scanner;
import java.util.Stack;

public class RestrictiveCandyCrush {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k");
        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("reducedNo. is " + reducedbyK(str, k));

    }

    private static String reducedbyK(String str, int k) {
        if(k==1) return "";
        Stack<Pair> st = new Stack<Pair>();
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //if element top and curr are same then check their values+1 is equal to k or not
            if (st.size()!=0) {
                if (st.peek().c == curr) {
                    int currVal = st.peek().val + 1;
                    Pair P = new Pair(st.peek().c, currVal);
                    if (currVal == k) {
                        //if curr val == k then pop
                        while (!st.isEmpty()) {
                            if (st.peek().c == curr) {
                                st.pop();
                            } else {
                               break;
                            }
                        }
                    } else {
                        // add and push it into the stack
                        st.push(P);
                    }
                }else{
                    st.push(new Pair(curr,1));
                }


                } else {
                    // if new value comes then simply add into the stack
                   // System.out.println("pushed " + curr);
                    st.push(new Pair(curr, 1));
                }




        }
        // not add reduced stack characters into new string
        while (!st.isEmpty()) {
            // System.out.println(st.peek().c);

            output = st.pop().c + output;
        }
        return output;

    }
}
class Pair {
    char c;
    int val;
    Pair(char c,int val){
        this.c=c;
        this.val=val;

    }



        }
