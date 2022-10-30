package Arrays;

public class macConsecutiveOnes {
    {
        /// any data just see the function for curr max xount of ones

        int [] arr= new int [4];
        int currCount=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                currCount++;

            }else{
                currCount=0;

            }
            if(currCount>maxCount){
                maxCount=currCount;
            }
        }
        System.out.println(maxCount);


    }
}
