public class PrintFirstChar {
    public static void main(String [] args) {
        reverse("Binod");
    }
    static void reverse(String str){

        if(str.length()==0){
            return;
        }
        String s=str.substring(1);
        reverse(s);
        System.out.print(str.charAt(0));
    }

}
/*public class PrintFirstChar {
    public static void main(String [] args) {
        reverse("Binod");
    }
    static void reverse(String str){

      for(int i=str.length()-1;i>=0;i--){
          System.out.println(str.charAt(i));

      }
    }

}*/

