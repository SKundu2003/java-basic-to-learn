import static java.lang.System.*;
public class Main {
    int sum(int... arr)
    {
        int sum = 0;
        for (int element:arr)
            sum += element;
        return sum;
    }
    public static void main(String[] args)
    {
        Main obj = new Main();
        out.println(obj.sum());
        out.println(obj.sum(1,2,3,4,5));
    }
}