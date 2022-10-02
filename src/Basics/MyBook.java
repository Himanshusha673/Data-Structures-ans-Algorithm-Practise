import java.util.Scanner;
abstract class Book {
    String title;
    abstract void setTitle(String a);
    String getTitle() {
        return title;
    }
}
class MyBook extends Book{
    void setTitle(String in){
        System.out.println(getTitle()+":"+in);
    }
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        MyBook b=new MyBook();
        b.title="The title is";
        b.setTitle(str);
    }
}
