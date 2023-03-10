
import java.util.Scanner; // Importing  the Scanner class
public class Main {
    public static void main(String[] args)
    {
        System.out.println("enter a element");
        Scanner sc = new Scanner(System.in);//Creating an object named "sc" of the Scanner class.//(Read from the keyboard)
        int num = sc.nextInt();  //(Method to read from the keyboard)
        float fl = sc.nextFloat();//take float from user
        boolean val = sc.hasNextInt(); //check is the input is integer or not
        String str = sc.nextLine(); //take user input as a strin
        //thare are many default functions for user input explore
//        System.out.println(val);
    }
}