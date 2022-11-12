package Arrays;

public class TappingRain {
    public static void main(String[] args) {
        int [] arr = {8,8,2,4,5,5,1};
        System.out.println(findSpaceToFillWater(arr,arr.length));

    }

    private static long findSpaceToFillWater(int[] arr,int n) {
        int s = 0;
        int e = n - 1;
        int leftMax = 0, rightMax = 0, ans = 0;
        while (s < e) {
            if (arr[s] <= arr[e]) {
                if (leftMax < arr[s]) {
                    leftMax = arr[s];
                }//means left max is greater than arr at s
                else {
                    ans += Math.max(0,leftMax - arr[s]);
                }
                s++;
            } else {

                if (rightMax < arr[e]) {

                    rightMax = arr[e];
                }//means left max is greater than arr at s
                else {
                    ans +=Math.max(0,rightMax - arr[e]) ;
                }
                e--;
            }
        }
        return ans;
    }
}


//approach 2
//// left[i] contains height of tallest bar to the
//        // left of i'th bar including itself
//        int left[] = new int[n];
//
//        // Right [i] contains height of tallest bar to
//        // the right of ith bar including itself
//        int right[] = new int[n];
//
//        // Initialize result
//        int water = 0;
//
//        // Fill left array
//        left[0] = arr[0];
//        for (int i = 1; i < n; i++)
//        left[i] = Math.max(left[i - 1], arr[i]);
//
//        // Fill right array
//        right[n - 1] = arr[n - 1];
//        for (int i = n - 2; i >= 0; i--)
//        right[i] = Math.max(right[i + 1], arr[i]);
//
//        // Calculate the accumulated water element by
//        // element consider the amount of water on i'th bar,
//        // the amount of water accumulated on this
//        // particular bar will be equal to min(left[i],
//        // right[i]) - arr[i] .
//        for (int i = 0; i < n; i++)
//        water += Math.min(left[i], right[i]) - arr[i];
//
//        return water;