import static java.lang.System.*;


class NewThread extends Thread
{
    public NewThread(String name)
    {
        super(name);
    }
    public void run()
    {
        out.println("hello this is thread " + this.getName());
    }
}

public class Thread_Priorities_4
{
    public static void main(String[] args)
    {
        NewThread t1 = new NewThread("thread1");
        NewThread t2 = new NewThread("thread2");
        NewThread t3 = new NewThread("thread3");
        NewThread t4 = new NewThread("thread4");

        //setting the priorities
        out.println(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);

        //runing the code
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
