import java.util.Scanner;

public class LastIndex {
    static int lastindex(int input[],int b,int s,int size) {
        int arr[] = new int[size - 1];
        if (s < input.length)
            return -1;
        if (input[s] == b) {
            for (int i = 1; i < size - 1; i++) {
                arr[i - 1] = input[i];
            }

        }
        if (arr[s]==b) {

            int ans = lastindex(arr, b, s + 1, size);
        }
        return s + 1;

    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.out.println("Enter an array");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enetr number which you want to search");
        int a = sc.nextInt();
int ans=lastindex(arr,a,0,len);


System.out.println(ans);
    }

}
