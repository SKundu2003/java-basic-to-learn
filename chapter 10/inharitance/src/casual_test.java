import static  java.lang.System.*;
class TwistePrime
{
    private int flag;
    private int rem;
    private int num;
    int check(int num)
    {
        this.num = num;
        flag = 1;
        while((num!=0) && (flag!=0))
        {
            rem = num%10;
            num /=10;
            for (int i =2; i<=(rem/2);i++)
            {
                if(rem%i == 0)
                {
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }
}
public class casual_test {
    public static void main(String[] args) {
    TwistePrime t = new TwistePrime();
    out.println(t.check(71));
    }
}
