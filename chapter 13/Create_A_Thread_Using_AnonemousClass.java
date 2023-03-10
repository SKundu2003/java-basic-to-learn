import static java.lang.System.*;

public class Create_A_Thread_Using_AnonemousClass {
    public static void main(String[] args) {
        Runnable t1 = new Runnable(){
            @Override
            public void run(){
                out.println("this thread is " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(t1);
        thread.start();



        //implementing Lamda in Thread

        Runnable t2 = () ->
        {
            out.println("this is " + Thread.currentThread().getName());
        };
        Thread thread1 = new Thread(t2);
        thread1.start();
    }
}