public class StaticFile {
    int i=10;
    static int j=20;
    static String str="himanshu";
    static
    {
        System.out.println("this is static initialization block  "+str);

    }
    public static void display(int a){
        System.out.println("j=:"+j+"  "+str+"i=:"+a);

    }
    void nonstatic(){
        display(i);
        System.out.println("i=:"+i);

    }

    static class NestedStaticClass{

        public void display(){

            System.out.println(str);
        }
    }
    public static void main(String [] a){
        StaticFile obj1=new StaticFile();
        StaticFile.NestedStaticClass obj2=new    StaticFile.NestedStaticClass();
        obj2.display();
        obj1.nonstatic();




    }
}

