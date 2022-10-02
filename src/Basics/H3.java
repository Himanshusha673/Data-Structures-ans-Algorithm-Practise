import java.util.Scanner;
class H3{
    public static void main(String[] args) {
        int i = 2;
        Scanner p = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = p.nextInt();
        System.out.print("your prime Fcatorization is:\n");
        while (i <= n) {
            if (n % i == 0) {
                n = n / i;
                System.out.println(i);
            } else i++;
        }
    }
}