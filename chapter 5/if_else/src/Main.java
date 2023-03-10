import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age");
        int num =  sc.nextInt();
        if  (num>=18)
        {
            System.out.println("\n good to go");
            return;
        }
        else
            System.out.println("not eligable");
    }
}