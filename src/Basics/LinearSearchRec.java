import java.util.Scanner;
public class LinearSearchRec {
    private static int search(int input[],int b,int startindex){
        if(startindex>=input.length)
            return-1;


        if (input[startindex]==b)
            return startindex;
        int smallans=search(input,b,startindex+1);
                return smallans;
    }
    //function overloading for just use because we want to pass only that values which user enter in main
    public static int search(int array[],int c){
       int value=search(array,c,0);
       return value;
    }
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size =sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter an array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enetr number which you want to search");
        int a=sc.nextInt();
       int ans= search(arr,a);
       if(ans!=-1)
        System.out.println("your index is "+ans);
       else System.out.println("there is no match");
    }
}


