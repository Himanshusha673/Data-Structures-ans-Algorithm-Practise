package Arrays;
import java.util.Scanner;


public class AddDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fidnDigitSum(n));
    }
    public static int fidnDigitSum(int n) {
        int sum=0;
        int temp=n;

        while(n>=10){
            sum+=temp%10;
            temp=temp/10;
            if(sum>=10&&temp==0){
                temp=sum;
                n=sum;
                sum=0;
            }
            if(sum%10==sum&&temp==0){
                n=sum;
            }
        }
        return n;
    }
    //////One line code
    // return num == 0 ? 0 : 1 + (num - 1) % 9;

}
