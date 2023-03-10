import static java.lang.System.*;
class test{
    int id;
    double salary;
    String name;
    static int counter; //static keyword //property of this particular class
    public test()
    {

        out.println("this constructor do nothing");
    }

    public test(double salary)
    {
        counter++; //every time the class call the counter will increase
        out.println("\n\nthis constructor is taking 1 input salary");
        out.println("and also increasing the counter value \t so total number of objects are " + counter + "\n\n");
    }
    public test(int id,String name,double salary) //constructor overloading
    {
        this(); //using "this" keyword to point the constructor with no parameters
//        this(salary); //this will not work/// -->> only one constructor can be call at a time using "this' keyword

        test obj = new test(salary); //rather we can use this way also

        this.id = id;//using the "this" keyword for pointing the variable of class
        this.name = name;//using the "this" keyword for pointing the variable of class
        out.println("name is " + name + " id is " + id);
    }

}

public class Main {
    public static void main(String[] args) {
        test obj1 = new test();
//        obj.id = 100;
//        obj.name = "souvik";
//        Scanner sn = new Scanner(in);
//        out.println("enter your id ");
//        obj.id = sn.nextInt();
//        out.println("enter your name ");
//        obj.name = sn.next()

        //creating 2 objects for test
        test obj2 = new test(100,"souvik kundu",8000000.93);
        out.println("the number of objects are created " + obj2.counter);
    }
}