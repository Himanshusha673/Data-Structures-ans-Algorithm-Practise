import java.util.Scanner;
public class WineMaximumProfit {

    public void maxprofit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many wines you have");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter price of each wine");
        for (int i = 0; i < len; i++) {
           arr[i]=sc.nextInt();
        }
        int sum=0;
        int count = 1;
        int j = 0;
        int k = len-j - 1;
        while (j > k) {
            if (arr[j] <= arr[k]) {
                sum = sum+arr[j]*count;
                count++;
                sum=sum+arr[k]*count;
                count++;
            } if (arr[k] <= arr[j]) {
                sum = sum+arr[k] * count;
                count++;
                sum=sum+arr[j]*count;
                count++;
            } if (j==k) {
               sum=sum+arr[j]*count;
               count++;
                }
            j++;
            k--;
            }
        System.out.println("your profit is"+sum);
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("Enter no.of tasks which you want to do");
        int t=h.nextInt();
        WineMaximumProfit w=new WineMaximumProfit();
        for(int i=0;i<t;i++){
            w.maxprofit();
        }

    }

}
