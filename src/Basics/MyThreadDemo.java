class ChildThread implements Runnable
{
    Thread t;
    ChildThread(String name)
    {
        t = new Thread(this, name);
        t.start();
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                if(t.getName().equals("First Thread"))
                {
                    Thread.sleep(1000);
                    System.out.println(t.getName()+": Himanshu");
                }
                else if(t.getName().equals("Second Thread"))
                {
                    Thread.sleep(2000);
                    System.out.println(t.getName()+": 04476803119");
                }
                else
                {
                    Thread.sleep(3000);
                    System.out.println(t.getName()+": maths");
                }
            }
            catch(InterruptedException e)
            {
                System.out.println(t.getName()+" is interrupted");
            }
        }
    }
}
class MyThreadDemo
{
    public static void main(String args[])
    {
        ChildThread one = new ChildThread("First Thread");
        ChildThread two = new ChildThread("Second Thread");
        ChildThread three = new ChildThread("Third Thread");
    }
}