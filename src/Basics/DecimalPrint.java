import java.util.Scanner;
public class DecimalPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number not more than 5 digits");
        int a = sc.nextInt();
        int count = 1;
        for (int i = 10; i < 100000; i = i * 10) {
            int m = a;
            m = m / i;
            if (m >= 1) {
                count++;
            }
        }
        System.out.println("TOTAL   "+count+"  digits present in your entered no.");
        int [] arr = new int[count];
        for (int j = count - 1; j >= 0; j--) {
            int n = a % 10;
            arr[j] = n;
            a = a / 10;
        }
//for printing values
    for (int k=0;k<count;k++)
    {
        System.out.println(arr[k]);
    }
    }
}

