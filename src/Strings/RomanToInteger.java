import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(findRoman(str));

    }

    private static int  findRoman(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
//        I 1
//        V 5
//        X 10
//        L 50
//        C 100
//        D 500
//        M 1000
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans=map.get(str.charAt(str.length()-1));

        for (int i = str.length()-2; i >=0; i--) {
            char curr= str.charAt(i);
            char next =str.charAt(i+1);
            if(map.containsKey(curr))
                if(map.get(curr)<map.get(next)) ans-=map.get(curr);
                else if(map.get(curr)>=map.get(next)) ans+=map.get(curr);
           else return -1;

        }
        return ans;


    }
}
