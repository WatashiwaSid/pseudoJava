class FirstThread implements Runnable
{
    public void run()
    {
        for(int i=0; i<100; i++)
            System.out.println("Thread 1");
    }
}

class SecondThread implements Runnable
{
    public void run()
    {
        for(int i=0; i<100; i++)
            System.out.println("Thread 2");
    }
}

public class RunnableInterface 
{
    public static void main(String args[])
    {
        FirstThread objectOne = new FirstThread();
        SecondThread objectTwo = new SecondThread();

        Thread t1 = new Thread(objectOne);
        Thread t2 = new Thread(objectTwo);
        t1.start();
        t2.start();
    }
}
