public class quickSort {
    public static void  quickSort(int arr[]){


        helperQuick(arr,0,arr.length-1);
    }
    static void  helperQuick(int [] arr, int si, int ei){
        if(si>=ei){
            return ;


        }





        int pIndex=findPivot(arr,si,ei);
        //this is for left
        helperQuick(arr,si,pIndex-1);
        //this is for right
        helperQuick(arr,pIndex+1,ei);




    }
    public static int  findPivot(int []arr, int si , int ei){
        int pivot = arr[si];
        int count =0;
        for (int i=si+1;i<=ei;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex=si+count;
        arr[si]=arr[pivotIndex];
        arr[pivotIndex]=pivot;
        int i=si;
        int j=ei;

        while(i<j){
            while(i<=ei&&arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }


            if(i<j){
                int temp=arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                i++;
                j--;

            }






        }
        return pivotIndex;
    }




    public static void main(String[] args) {
        int [ ] arr={4,1,3,9,7};
                quickSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(arr[2]);


    }
}
