package Strings;

import java.util.Scanner;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n= sc.nextLine();
        System.out.println(titleToNumber(n));
    }

    public static int titleToNumber(String columnTitle) {
        if(columnTitle.length()==0) return (int) columnTitle.charAt(0)-64;
       int degree=columnTitle.length()-1;
      int i=0;
      int ans=0;
       while(degree>=0){
           ans+=Math.pow(26,degree)*((int)columnTitle.charAt(i)-64);
           degree--;
           i++;
       }
       return ans;



    }
}
