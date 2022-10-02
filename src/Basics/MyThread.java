class MyThread1 extends Thread {

    public void run() {
        Thread th = Thread.currentThread();
        String name = th.getName();
        int i;

        try {
            for (i = 0; i < 2; i++)
                System.out.println("himanshu" + name);
            sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
class MyThread2 extends Thread {

    public void run() {
        Thread th=Thread.currentThread();
        String name=th.getName();
int i;
        try {
            for (i=0;i<2;i++)
            System.out.println("04476803119"+name);
sleep(2000);
        }
        catch(Exception e ){
            System.out.println(e);


        }

    }

}
class MyThread3 extends Thread {

    public void run() {
        Thread th=Thread.currentThread();
        String name=th.getName();
int i;
        try {
            for (i=0;i<2;i++)
            System.out.println("Mathematics"+name);
sleep(3000);
        }
        catch(Exception e ){
            System.out.println(e);


        }

    }

}

class MyThread{
    public static void main(String[] args) {

         MyThread1 th1=new MyThread1();
        MyThread2 th2=new MyThread2();
        MyThread3 th3=new MyThread3();
        th1.start();
        th2.start();
        th3.start();
    }

}