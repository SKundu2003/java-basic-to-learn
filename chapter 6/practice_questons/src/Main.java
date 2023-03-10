

import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
//question 1
/*        out.println("enter number or rows needed");
        Scanner sc = new Scanner(in);
        int num = sc.nextInt();
        for (int i = 1; i<=num;i++) {
            for (int j = 1; j <= i; j++)
                out.print("*");
            out.println();
        }*/

//question 2
/*        Scanner sc2 = new Scanner(in);
        out.println("enter n natural number");
        int num = sc2.nextInt();
        for (int i = 1;i<=num;i++)
        {
            for (int j = 2;j <= (i/2);j++)
            {
                if (i%j ==0 ) {
                    out.print(i + " ");
                    break;
                }
            }
        }*/


//question 3
        Scanner sc = new Scanner(in);
        out.println("enter the number");
        int num = sc.nextInt();
        for (int i = 1;i<=10;i++)
            out.println("num x " + i + " = " + i*num);
    }
}