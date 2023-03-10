import static java.lang.System.*;
class base_class{
    public int num = 10;
    public void print()
    {
        out.println("this is base class");
    }
}
class derived_class extends base_class
{
    public String str = "hello world";
    @Override
    public void print()
    {
        out.println("this is base class");
    }
}
public class DynamicMethodDispatch_in_java {
    public static void main(String[] args) {
        base_class b = new derived_class();
        b.print();
    }
}
