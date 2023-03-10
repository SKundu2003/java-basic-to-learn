import static java.lang.System.*;


//Using constructor in Thread class
class ThreadConstructor extends Thread
{
    public ThreadConstructor(String name)
    {
        super(name); //this will send name paremiter to the "Thread" constructor
    }
    @Override
    public void run()
    {
        out.println("this is a Thread");
    }
}
public class Constructors_from_Thread_class_3
{
    public static void main(String[] args) {
        ThreadConstructor th = new ThreadConstructor("souvik");
        th.start();
        out.println("name of the thread is " + th.getName());
        out.println("Id of the tread is " + th.getId());
    }
}
