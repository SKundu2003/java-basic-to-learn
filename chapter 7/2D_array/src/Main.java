import static java.lang.System.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int[][] arr = new int[2][3];
    Scanner sn  = new Scanner(in);
    for (int i=0;i<arr.length;i++)
    {
        for (int j = 0; j<arr[i].length ; j++)
        {
            out.printf("\nenter the number of %d row and %d colum ",i,j);
            arr[i][j] = sn.nextInt();
        }
    }
    out.println("\nnow printing the number of array");
    for (int i = 0;i<arr.length;i++)
    {
        for (int j=0;j<arr[i].length;j++)
            out.print(arr[i][j] + " ");
        out.println();
    }
    }
}