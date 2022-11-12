package Strings;
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        char [] arr={'a','a','b','b','c'};
        System.out.println(compress(arr));
    }
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int n = chars.length;
        sb.insert(0, chars[0]);
        int count = 1;
        for (int i = 1; i < n; i++) {
            char curr = chars[i];
            char prev = chars[i - 1];
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
                sb.append(curr);
            }

        }
        if (count > 1) {
            sb.append(count);
        }
        n = sb.length();
        for (int i = 0; i < n; i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();

    }
}
