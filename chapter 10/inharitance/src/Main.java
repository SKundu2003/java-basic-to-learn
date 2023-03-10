import static java.lang.System.*;
class base
{
    int num1;
    base()
    {
        out.println("I am base class constructor");
    }
    base(int n)
    {
        out.println("I am base class overload constructor with a parameter with value of " + n);
    }
    public int getNum1() {
        out.println("the value of num1 is  " + num1);
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
}
class derived1 extends base
{
    int num2;
    derived1()
    {
        //if we want that the "base(int n)" constructor run then-----> we need to use "super" for reference
        super(0); //this will say the compiler to run the bas class constructor which has 1 argument

        out.println("I am derived2 class constructor");
    }
    public int getNum2() {
        out.println("the value of num2 is  " + num2);
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
public class Main {
    public static void main(String[] args) {
        derived1 der = new derived1();
//        der.setNum1(10);
//        der.getNum1();
    }
}