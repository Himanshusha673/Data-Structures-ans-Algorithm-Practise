import java.util.Arrays;


public class LongestCommonPrefix {
    public static void main(String[] args) {

       String [] arr = {"geeks", "geek", "geezer"};

        System.out.println( findLCP(arr));


    }

    private static String findLCP(String [] arr) {
        if(arr.length==0) return "";

        String ans= arr[0];

        for (int i=0;i<arr.length;i++){
            String first=arr[i];
            String second="";

            if(i<arr.length-1) {
                second=arr[i+1];
            }
            int limit= Math.min(first.length(), second.length());
            for(int j=0;j<limit&&i!=arr.length-1;j++){
                if(first.charAt(j)==second.charAt(j))  ans=ans.concat(first.substring(j,limit-j)) ;
                else{
                    System.out.println("loop break");
                    break;
                }

            }


        }
        return ans;

        //method 2
//        StringBuilder result =new StringBuilder();
//
//        Arrays.sort(arr);
//        //System.out.println(Arrays.toString(arr));
//        //now array is sorted
//       char[] first=arr[0].toCharArray();
//        char[] last=arr[arr.length-1].toCharArray();
//
//
//        for(int i=0;i<first.length;i++){
//            if(first[i]!=last[i]) break;
//                result.append(first[i]);
//        }
//       if(first[0]!=last[0]) return "-1";
//
//        return result.toString();
    }
}
