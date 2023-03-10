import static java.lang.System.*;

class Animal
{
   String name;

    public Animal(String name) { //this constructor is only created to access teh "super" keyword
        this.name = name;
        out.println("this is the parent Constructor");
    }
    public void fun()
    {
        out.println("this is a common name function for parent and child both class");
        out.println("this is a parent class call");
    }
    public void function_of_Animal_class()
    {
        out.println("the name of animal is " + name);
    }
}

class Dog extends Animal //single inheritance
{
    public Dog(String name) //this is must for a derived class
    {
        super(name);//if the function that called by object that is not present in the "derived" class
    // then by using "super()" keyword the function/method will be searched in parent class by the compiler//interpreter
    }
    public void fun()
    {
        out.println("this is a common name function for parent and child both class");
        out.println("this is a child class call");
    }
    public void function_of_child_class()
    {
        out.println("the name of Dog is " + name);
    }

}
public class class_and_object_2 {
    public static void main(String[] args) {
        Animal obj1 = new Animal("tom");
//        obj1.function_of_Animal_class(); //we can't access the method of child class using parent class object
        Dog obj2 = new Dog("tiger");
//        obj2.function_of_child_class();
//        obj2.fun();
        obj1.fun();
    }
}
