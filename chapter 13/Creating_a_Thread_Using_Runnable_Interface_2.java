import static java.lang.System.*;
//using runnable interface to creat a thread is a little different
//we need to use Thread class
class MyThreadRunnable1 implements Runnable
{
    @Override
    public void run()
    {
        while (true)
        {
            out.println("this is thread Runnable 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable
{
    @Override
    public void run()
    {
        while (true)
        {
            out.println("this is thread Runnable 2");
        }
    }
}
public class Creating_a_Thread_Using_Runnable_Interface_2
{
//    we need to use Thread class to launch Runnable Interface
    public static void main(String[] args)
    {
        //the process to launch a Runnable Interface
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        //this is just similar like gun and bullet //we need to fill the bullet in the gun
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        //starting 2 threads
        gun1.start();
        gun2.start();
    }
}
