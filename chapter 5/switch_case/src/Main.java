import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("enter a character");
        String ch = sc.nextLine();
        switch (ch)
        {
            case "a":
            {
                out.println("it's A");
                break;
            }
            default:
                out.println("break");
        }
    }
}