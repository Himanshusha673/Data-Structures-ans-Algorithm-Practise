package Climb_Stairs;
//Greedy solution

public class IsReachAtTop {





    public static void main(String[] args) {
        int [] arr ={ 3,2,1,0,4};
        System.out.println(
                checkReachAtTop(arr)
        );
        

    }

    private static boolean checkReachAtTop(int[] arr) {
        int maxReach =0;
        for (int i=0;i<arr.length;i++){
            if(i>maxReach) return false ;



            if(maxReach<i+arr[i]){
                maxReach=i+arr[i];
            }

        }
        return true;


    }


}