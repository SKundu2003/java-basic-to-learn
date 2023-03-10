import static java.lang.System.*;
interface base_interface
{
    public default void show() {
        out.println("this function now can run using derived class object");
    }
    void showName();
}
//all methods of interface is must to  implement in derived class
class derived_interface_class implements base_interface
{
    @Override
    public void showName() {
        out.println("hello world this is derived by \"base_interface\" ");
    }
    public void show()
    {
        out.println("this is derived class show function"); //it will get the preferance
    }
}
public class interfaces_1 {
    public static void main(String[] args)
    {
//        derived_interface_class obj = new derived_interface_class();
//        obj.showName();
//        obj.show();

        //Dynamic method dispatch
        base_class d = new derived_class();
        out.println(d.num);
    }
}
