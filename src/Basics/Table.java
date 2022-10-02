import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;
        do {
            System.out.println("press:1 for search mathematical table");
            System.out.println("press:2 for exit");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Enter a number which table you want to search");
                    int a = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        int result = a * i;
                        System.out.println(a + "x" + i + "=" + result);
                    }
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");

                    return ;
            }
        } while (b!=2);
        b++; }
}