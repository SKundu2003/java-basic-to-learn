import static java.lang.System.*;
public class abstract_class_and_function {
    public static void main(String [] args)
    {
    derived1 obj1 = new derived1(10);
    derived2 obj2 = new derived2(20);

    obj1.function();
    obj2.function();
    obj1.function_of_baseClass();//can access base class functions

    }
}
class derived1 extends base
{
    public derived1(int num) {
        super(num);
    }

    @Override
    void function()
    {
        out.println("this is derived 1 base class ");
    }
}

class derived2 extends base
{
    public derived2(int num) {
        super(num);
    }

    @Override
    void function()
    {
        out.println("this is derived 2 base class ");
    }
}


abstract class base
{
    int num;
    public base(int num) //each time a derived class object created this constructor will call
    {
        this.num = num;
        out.println("num of base class is " + num);
    }

    public void function_of_baseClass() //this type of function is called "concrete function"
    {
        out.println("this is a function of the base class");
    }
    abstract void function(); //abstract functions don't have a body //all derived class must declare this function or need to use it
}