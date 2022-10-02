package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Nextgreaterelright {
       public static void main(String []args){
              Scanner sc=new Scanner(System.in);
              int n = sc.nextInt();
              int[] arr = new int[n];
              for (int i = 0; i < n; i++) {
                     arr[i] = sc.nextInt();
              }
              Nextgreater(arr);
       }

       private static void Nextgreater(int[] arr) {
              int [] nge =new int[arr.length];
              Stack<Integer>st=new Stack<>();
              st.push(arr[arr.length-1]);
              nge[arr.length-1]=-1;
              for(int i=arr.length-2;i>=0;i--){
                     //remove untill greater element present and stack size is empty
                     while(st.size()>0&&arr[i]>=st.peek()){
                            st.pop();
                     }
                     // if stack empty eans there is not any greater elemtn than on the right so put -1
                     if(st.size()==0){
                            nge[i]=-1;
                     }else {
                            // if after popping ssmaller
                            // it founds greater elemetn on stack means top is greater among all
                            nge[i]=st.peek();
                     }
                     //after adding greater to nge we need to push ity into stack
                     st.push(arr[i]);
              }
              System.out.println(Arrays.toString(nge));

       }
}
