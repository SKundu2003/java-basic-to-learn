public class Thread_Methods_5
{
    public static void main(String[] args)
    {
        //taking classess from
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
//        try{
//            t1.join(); //untill the t1 Thread ends  "t2" will not starts
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
//        t1.sleep(100); -->this will sleep a Thread for 100 milisec
        t2.start();
    }
}
