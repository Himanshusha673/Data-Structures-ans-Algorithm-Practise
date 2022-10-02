import java.util.Scanner;

public class reverse {



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();
        System.out.println("your String is "+str);
        String rstr=reverseString(str);
        System.out.println("your Reversed String is "+rstr);

    }
    static String  reverseString( String S){
        StringBuilder newS= new StringBuilder();


        for( int i=S.length()-1;i>=0;i--){
            char ch=S.charAt(i);

            newS.append(ch);

        }
        return newS.toString();


    }

}
