 class Vehicle{
     Vehicle(){

         System.out.println("himanshu");
     }
     Vehicle(int b){
         System.out.println(b+"in superclass");
     }
     void print(){
        System.out.println("i am overidden method in Superclass");
    }
    public static void main(String[] args) {
        Cycle c=new Cycle(1);
        c.print();

    }
}
class Cycle extends Vehicle{
    Cycle(int a){

        System.out.println(a+"  in subclass");
    }
    void print(){
        super.print();
        System.out.println("i am overriden method in subclass");
    }
}