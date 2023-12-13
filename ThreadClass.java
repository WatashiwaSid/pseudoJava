class FirstThread extends Thread
{
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Thread 1");
            i++;
        }
    }
}
class SecondThread extends Thread
{
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Thread 2");
            i++;
        }
    }
}

public class ThreadClass {
    public static void main(String args[])
    {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.setPriority(9);

        t1.start();
        t2.start();
    }
}
