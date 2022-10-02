import java.util.Scanner;
public class Replacepi {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter a String ");
       String s=sc.nextLine();
        System.out.println("before string\n"+s);
        System.out.println("After string");
      replacepi(s);
    }
    static void replacepi(String str){
        for(int i=0;i<str.length();i++)
       if(str.charAt(i)=='p'&&str.charAt(i+1)=='i')
          str= str.replace("pi","3.14");

    }

}
