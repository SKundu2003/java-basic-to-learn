import static java.lang.System.*;

//process of creating a Thread
class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while (i<500)
        {
            out.println("I am thread 1");
            out.println("number 1");
            i++;
        }
    }
}

//context switching and time-sharing will happen bitween 2 threads

class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while (i<500)
        {
            out.println("this is thread 2");
            out.println("number 2");
            i++;
        }
    }
}
public class Creating_a_Threat_by_Extending_Thread_class_1 {
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        //this will not use for thread
//        t1.run();
//        t2.run();

        //if we want to do context switching then we need to use "start()" function
        t1.start();
        t2.start();
    }
}
