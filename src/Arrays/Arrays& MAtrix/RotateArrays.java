import java.util.Arrays;
import java.util.Scanner;

public class RotateArrays {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print( "Enter the size of array");
        int size =sc.nextInt();
        int [] arr= new int[size];
        for( int i=0 ;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value by which you want to rotate it ");
        int k=sc.nextInt();
        System.out.println("For right rotate Type R/r and for left type L/l");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("l") ||s.equals("L")){
            rotateArray(arr,k);

        }else{
            rotateArray(arr,-k);
        }
        System.out.println(" Noe final Array would be "+ Arrays.toString(arr));


    }

    private static void rotateArray(int[] arr, int k) {
        k=k%arr.length;
        if (k<0){
            k=k+arr.length;
    }
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,arr.length-k-1);
        reverseArray(arr,arr.length-k,arr.length-1);


}

    private static void reverseArray(int[] arr, int s, int e) {
        while(s<e){
            int temp =arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;

        }



    }
    }
