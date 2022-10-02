import java.util.HashMap;
import java.util.Scanner;

public class findLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        int [] arr2=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();

        }
        System.out.println( findLeng(n,arr,arr2));
    }

    private static int findLeng(int N, int[] color, int[] radius) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(color[i])){
                if(map.get(color[i])==radius[i])
                    map.remove(color[i]);
            }else
                map.put(color[i],radius[i]);
        }
        int [] finalarr=new int[N];
        int j=0;
        for(int i=0;i<N;i++){
            if(map.containsKey(color[i])){
                finalarr[j++]=radius[i];
            }
        }
        return map.size();
    }


}
