import java.util.Scanner;

public class Leftr {
    static int []leftrotate(int input[],int a){
        int myarray[]=new int[input.length];
        int temp[]=new int[a];
        for(int j=0;j<input.length;j++) {
            myarray[j] = input[j + a];
            for (int k = 0; k < a; k++)
                temp[k] = input[k];
        }
            for (int i=0;i<a;i++) {
                myarray[input.length-a+i]=temp[i];
            }
            return myarray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();

        int arr[];
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Eneter the values in Array");
            arr[i] = sc.nextInt();}
            System.out.println("press:2 to enter 'n' shifting value by which you want to rotate");
            int n=sc.nextInt();
            int[] ans=leftrotate(arr,n);
            for (int j=0;j<size;j++) {
                if (j == size - 1) {
                    System.out.print(ans[j]);

                } else
                    System.out.print(ans[j] + ",");
            }
            System.out.print("]");

    }
}