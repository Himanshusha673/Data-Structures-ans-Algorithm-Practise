import java.util.Scanner;

public class tajamhal{
    public static void function(int num){
        Scanner s =new Scanner(System.in);
        int[] a = new int[num];
        System.out.println("HOW MANY PEOPLE ARE STANDING IN FRONT OF EACH WINDOW:");
        for(int i=0;i<num;i++){
            a[i]=s.nextInt();
        }
        System.out.println("output");
        check(a);
    }


    public static void check(int arr[]){

        do{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    System.out.println(i+1);
                    return;
                }
                for(int j=0;j<arr.length;j++){
                    arr[j]=arr[j]-1;}
            }

        }while(arr[arr.length-1]!=0);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("NO. OF WINDOW := ");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        function(n);

    }
}