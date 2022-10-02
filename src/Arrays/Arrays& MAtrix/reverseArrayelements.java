import java.util.Arrays;
import java.util.Scanner;

public class reverseArrayelements {
    static int size;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print( "Enter the size of array");
        size =sc.nextInt();
        int [] arr= new int[size];
        for( int i=0 ;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array is Looking Like This");
        printArray(arr);
        reversearray(arr);
        System.out.println("Your Reversed Array is");
        printArray(arr);






    }
    private static void reversearray(int arr[]){
        int temp;
        int st=0;
        int end=size-1;
        while(st<end){
            temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }

    }
    private static void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
}
