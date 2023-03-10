import java.util.Scanner;
public class printing_user_name {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //take user input as a string
        System.out.print("'hello " +str+" have a good day");
    }
}
