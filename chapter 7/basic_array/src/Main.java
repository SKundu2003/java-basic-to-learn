import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args)
    {
        //process 1
        /*int[] arr = new int[5];
        Scanner sn = new Scanner(in);
        for (int i = 0; i<arr.length;i++)
        {
            out.println("enter the " + (i+1) + " indeex ");
            arr[i] = sn.nextInt();
        }
        for (int j = 0;j<arr.length;j++)
            out.println(arr[j] + " ");
*/

        //process 2
        int[] arr2 = new int[5];
        Scanner sn2 = new Scanner(in);
        for (int i = 0; i<arr2.length;i++)
        {
            out.println("enter the " + (i+1) + " indeex ");
            arr2[i] = sn2.nextInt();
        }
        for(int auto_element:arr2)  //this process only can use to print data
            out.println(auto_element);

    }
}