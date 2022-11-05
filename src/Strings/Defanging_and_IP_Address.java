package Strings;

//Example 1:
//
//        Input: address = "1.1.1.1"
//        Output: "1[.]1[.]1[.]1"
//        Example 2:
//
//        Input: address = "255.100.50.0"
//        Output: "255[.]100[.]50[.]0"
//
//




public class Defanging_and_IP_Address {
    public static void main(String[] args) {
        String str="255.100.50.0";
        System.out.println(printDefang(str));
    }

    private static String printDefang(String address) {
        /////////////// first method
               // str= str.replace(".","[.]");
           // return str;
            //////////////////////////////
        //second method
        StringBuilder result= new StringBuilder();
        for(int i = 0 ; i < address.length();i++){
            if(address.charAt(i)=='.'){
                result.append("[.]");
            }
            else result.append(address.charAt(i));
        }

        return result.toString();
    }

}
