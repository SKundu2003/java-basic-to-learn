public class Main {
    public static void main(String[] args) {
        //constant values are called Literals in Java
        int num1 = 50;
        byte num2 = 127; //"byte" end point is +127

//        long num3 = 98765432109876543; //this will throw a error because compiler treat "long" as int default
        long num3 = 98765432109876543l; //but at the end "l" will represent the number as long

        //this will automatically choose the proper form of number
        Integer n1 = 120; //defined as byte
        Integer n2 = 9876543; //defined as int

        //
        float f1 = 5.50f; //"f" is important to declare
        double d1 = 5.87654d;//but "d" is not compalsary but good practice

        System.out.print("this function will not produce a new line     ");
        System.out.println("but this will produce a nuw line ");
        System.out.print("look it works");

    }
}
