package HackerRankjava.Introduction;
//hello
// java
//        Sample Output 0
//
//        9
//        No
//        Hello Java
//        Explanation 0
//
//        String  is "hello" and  is "java".
//
//        has a length of , and  has a length of ; the sum of their lengths is .
//        When sorted alphabetically/lexicographically, \
//        "hello" precedes "java"; therefore,  is not greater than  and the answer is No.
//
//        When you capitalize the first letter of both
//        and  and then print them separated by a space, you get "Hello Java".


import java.util.*;

public class Intro1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        System.out.println(str1.length()+str2.length());

        String[] arr= {str1,str2};
        char c1=Character.toUpperCase(str1.charAt(0));
        char c2= Character.toUpperCase(str2.charAt(0));


         if(str1.compareTo(str2)>0)
              System.out.println("Yes");
              else  System.out.println("No");


        //we can also used this
//        Arrays.sort(arr);
//        if(arr[0]==str1){
//            System.out.println("No");
//
//        }else{
//            System.out.println("Yes");
//        }

        System.out.print(((str1.substring(0,1)).toUpperCase().concat(str1.substring(1,str1.length())))+" "+
                (str2.substring(0,1)).toUpperCase().concat(str2.substring(1,str2.length())));
    }


}
