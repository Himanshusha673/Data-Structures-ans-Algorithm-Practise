import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter how much pattern you wabt to like");
        int a=sc.nextInt();
        for (int i=1;i<2*a;i++) {
      int j=1;
      while(j<=i&&j>0) {
          if (j<=a) {
              System.out.print("*");
              j++;
          }
              else if (j>a) {
                  System.out.print("*");
                  j--;
              }
          }
      }
            System.out.println();
      }

        }






