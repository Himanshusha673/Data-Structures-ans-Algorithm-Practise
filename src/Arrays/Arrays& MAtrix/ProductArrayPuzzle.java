
//Input:
//        n = 5
//        nums[] = {10, 3, 5, 6, 2}
//        Output:
//        180 600 360 300 900

import java.util.ArrayList;
import java.util.Arrays;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int [] arr= {12,0};

        int n= arr.length;
        long prod = 1;
        long flag = 0;

        // product of all elements
        for (int i = 0; i < n; i++) {

            // counting number of elements
            // which have value
            // 0
            if (arr[i] == 0)
                flag++;
            else
                prod *= arr[i];
        }

        // creating a new array of size n
        long [] productArray = new long[n];
        for (int i = 0; i < n; i++) {

            // if number of elements in
            // array with value 0
            // is more than 1 than each
            // value in new array
            // will be equal to 0
            if (flag > 1) {
                productArray[i] = 0;
            }

            // if no element having value
            // 0 than we will
            // insert product/a[i] in new array
            else if (flag == 0)
                productArray[i] = (prod / arr[i]);

                // if 1 element of array having
                // value 0 than all
                // the elements except that index
                // value , will be
                // equal to 0
            else if (flag == 1 && arr[i] != 0) {
                productArray[i] = 0;
            }

            // if(flag == 1 && a[i] == 0)
            else
                productArray[i] = prod;
        }
        System.out.println(Arrays.toString(productArray));
        System.out.println("Method 2 "+Arrays.toString(method2(arr)));
    }
    public static long[] method2(int [] arr) {
        int n= arr.length;

        long [] left =new long[n];
        long[] right =new long [n];
        long [] product =new long[n];
        left[0]=1;
        right[n-1]=1;


        //making left array
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        //making right array
        for(int j=n-2;j>=0;j--){
           right[j]=right[j+1]*arr[j+1];
        }
        //final product array is prod of left and right
        for(int k=0;k<n;k++){
            product[k]=left[k]* right[k];
        }
        return product;

    }





}

