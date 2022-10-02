import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePOsitiveNegative {



    public static void main(String[] args) {
        int [] arr={-5,-2, 5, 2, 4, 7, 1, 8, 0, -8};

        // code for spacing negative to left and postive to left
        //int [] alt=new int[arr.length];
//        int i=0;
//        int j=arr.length-1;
//
//        while(i<j){
//            while(i<j&&arr[i]>=0){
//                i++;
//            }
//            while(i<j&&arr[j]<0){
//                j--;
//            }
//            if(arr[i]<0&&arr[j]>=0){
//                int temp=arr[i];
//                 arr[i]=arr[j];
//                arr[j]=temp;
//            }
//
//
//        }
//        System.out.println("alt"+Arrays.toString(arr));
//       // System.out.println("neg"+Arrays.toString(neg));
//Alternate positive negative numbers
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                //if we get positive value
                pos.add(arr[i]);
            }else{
                //if negative value getting
                neg.add(arr[i]);
            }

        }
//        System.out.println(neg);
//        System.out.println(pos);
        int i=0;
        int indexOfBothList=0;
        while(i<arr.length&&indexOfBothList<pos.size()&&indexOfBothList<neg.size()){
            arr[i]=pos.get(indexOfBothList);
            i++;
            arr[i]=neg.get(indexOfBothList);
            i++;
            //we need to add indexOfBoth(pos & neg Lists) lists into array at 0 and 1th position and so on..
            indexOfBothList++;
        }
        //case when pos list fill into array & neg list has remaining elements
        while(i<arr.length&&indexOfBothList<neg.size()){
            arr[i]=neg.get(indexOfBothList);
            i++;
            indexOfBothList++;
        }
        while(i<arr.length&&indexOfBothList<pos.size()){
            arr[i]=pos.get(indexOfBothList);
            i++;
            indexOfBothList++;
        }

        System.out.println(Arrays.toString(arr));

//we can also solve it using two pointer approach






    }

}
