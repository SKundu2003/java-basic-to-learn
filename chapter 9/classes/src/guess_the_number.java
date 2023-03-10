import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;
class game
{
    private int user_num;
    private int rand_num;
    boolean flag;

    public game()
    {
        Random rand = new Random();
        rand_num = rand.nextInt(3);
        flag = true;
        Scanner sn = new Scanner(in);
        while(flag==true)
        {
            out.println("enter a number");
            user_num = sn.nextInt();
            if (user_num == rand_num)
            {
                out.println("you wone");
                flag = false;
            }
            else {
                out.println("you lose \ntry agaian");
            }
        }
    }
}
public class guess_the_number {
    public static void main(String[] args) {
    game g = new game();
    }
}
