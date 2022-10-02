import java.util.ArrayList;
import java.util.Scanner;

public class PlusOne {


    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int val =0;
        while(val!=-1){

           val =sc.nextInt();
          if(val!=-1) list.add(val);
        }
         plusOne(list);
        System.out.println(list);

    }

    private static void plusOne(ArrayList<Integer> list) {
        int carry=1;
        int n=list.size();
        for(int i=n-1;i>=0;i--){
            int  val =list.get(i)+carry;
            list.set(i,(val)%10);
            //System.out.println(i+" "+ carry);
            carry =(val)/ 10;
        }
        if(carry!=0){
            list.add(0);
            list.set(0,1);
        }
    }


}
//leetcode using array only
//public int[] plusOne(int[] list) {
//    int carry=1;
//
//    int n=list.length;
//    for(int i=n-1;i>=0;i--){
//        int  val =list[i]+carry;
//        list[i]=val%10;
//
//        // list.set(i,(val)%10);
//        //System.out.println(i+" "+ carry);
//        carry =(val)/ 10;
//    }
//    if(carry!=0){
//        int [] arr=new int[n+1];
//        arr[0]=1;
//        //r[n]=0;
//        return arr;
//
//    }
//    return list;
//
//
//
//
//
//
//
//}
