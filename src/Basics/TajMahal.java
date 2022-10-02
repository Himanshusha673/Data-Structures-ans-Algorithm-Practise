import java.util.Scanner;
public class TajMahal {
static int getticket(int [] input){
    int i=1;
    while(true){
        if (input[i]==0){
            return i;
        }else if (i==input.length-1){
            i=0;
        }
        else {
            for (int j = 0; j<input.length;j++){
               if(input[j]!=0){
                   input [j]=input[j]-1;
               }
                else{
                    input[j]=0;
                }
            }
        }
        i++;
    }

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of windows");
        int w=sc.nextInt();
        System.out.println("enter how many person at each window");
        int [] arr=new int[w];
        for(int i=0;i<w;i++){
            arr[i]=sc.nextInt();
        }
       int ans= getticket(arr);
    System.out.println(ans);

    }
}

