public class MajorityElemetInArray {
    //n element that appears more than N/2 times in the array.

    public static void main(String[] args) {
        int [] arr={3,1,3,3,2};
        System.out.println(majorityElement(arr,arr.length));

    }

    private static int majorityElement(int[] a,int size) {
        //Step 1 to find maximum occuring elemnt in array
        //and store its index in ansIndex
        if(size==1){
            return a[0];
        }
        int count=1;
        int ansIndex=0;
        for(int i=1;i<size;i++){
            if(a[i]==a[ansIndex]) count++;
            else count--;
            if(count==0){
                ansIndex=i;
                count++;

            }



        }




        count=0;

        //step 2 finding how many times element at ansIndex present in this array

        for(int i=0;i<size;i++){
            if(a[ansIndex]==a[i]) count++;
        }
        if(count>size/2){
            // System.out.println(number);
            return a[ansIndex];

        }else{
            //System.out.println("-1");
            return -1;

        }
    }


}
