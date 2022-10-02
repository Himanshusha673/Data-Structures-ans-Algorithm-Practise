import java.util.Scanner;

public class ReverseZWords {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();
        System.out.println(str.substring(0,0));
       // System.out.println("your String is "+str);
        String rstr=reverseWord(str);
        System.out.println(rstr);

    }

    private static String reverseWord(String s) {
        String ans="";
        int i=s.length()-1;

        while(i>=0){
            while(i>=0&&s.charAt(i)==' ') i--;
            //now i at last character of word
            int j=i;
            if(i<0) break;
            //above code is to prevent the add spaces at begining in ans


            while(i>=0&&s.charAt(i)!=' ') i--;
            //now i at space or dot
            if(ans.isEmpty()){
                ans=ans.concat( s.substring(i+1,j+1));
            }else{
                ans=ans.concat( " "+s.substring(i+1,j+1));
            }
        }
        return ans;
    }
}
