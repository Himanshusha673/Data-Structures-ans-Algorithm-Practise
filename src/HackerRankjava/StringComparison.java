package HackerRankjava;
// I/P    welcometojava
//        3
//        Sample Output 0
//        ava
//        wel


//        Explanation 0
//
//        String  has the following lexicographically-ordered substrings of length :
//
//        We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
//
//        The stub code in the editor then prints ava as our first line of output and wel as our second line of output.

import java.util.Scanner;

public class StringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for(int i = 0; i <= s.length() - k; i++){
            String sTemp = s.substring(i, i + k);
            if(sTemp.compareTo(smallest) < 0) {
                smallest = sTemp;
            }

            if(sTemp.compareTo(largest) > 0) {
                largest = sTemp;
            }
        }
      //  We can also do it by treeset






        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
