//
//'A' -> "1"
//        'B' -> "2"
//        ...
//        'Z' -> "26"
//        To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
//
//        "AAJF" with the grouping (1 1 10 6)
//        "KJF" with the grouping (11 10 6)
//        Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
//
//        Given a string s containing only digits, return the number of ways to decode it.
//
//        The test cases are generated so that the answer fits in a 32-bit integer.
//
//
//
//        Example 1:
//
//        Input: s = "12"
//        Output: 2
//        Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
//        Example 2:
//
//        Input: s = "226"
//        Output: 3
//        Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
//        Example 3:
//
//        Input: s = "06"
//        Output: 0
//        Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").
//

import java.util.Arrays;
import java.util.Scanner;

public class DecodeWays {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        String str= sc.nextLine();
        System.out.println(findDecodedWays(str)) ;

    }

    private static int  findDecodedWays(String str) {
        int[] dp =new int[str.length()+1];
        Arrays.fill(dp,-1);
        // starting fro idx =0
           return memo(0,str,dp);
    }
    private static int memo(int idx, String str, int[] dp) {
        // base case means one ans possible
        if(idx==str.length()) return 1;
        if(dp[idx]!=-1) return dp[idx];
        int oneDigitAns=0;
        int twoDigitans=0;
        // call for one digit
        if(str.charAt(idx)!=0){
            oneDigitAns=memo(idx+1,str,dp);
        }
        // call for two digits
        if(idx+1<str.length()&&str.charAt(idx)!=0){
            // means we need to make it two digits
            int code=(str.charAt(idx)-'0')*10+str.charAt(idx+1)-'0';
            if(code>=10&&code<=26){
                twoDigitans=memo(idx+2,str,dp);
            }

        }
        return dp[idx]=oneDigitAns+twoDigitans;

    }
}
