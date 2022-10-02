import java.util.Scanner;
public class InputArrayUsingRecursion {
    public static void print(int [] input,int si){
        if(si>=input.length-1){
            System.out.println( input[si]);
            return;}
        System.out.println(input[si]);
        print(input,si+1);
    }
    public static void  print1(int [] input){
        print(input,0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int len=sc.nextInt();
        int [] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        print1(arr);
    }


}
