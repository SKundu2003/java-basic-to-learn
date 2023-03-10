import java.util.Scanner;
class Main
{

    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        int [][] arr = new int[2][2];

        // my
        for(int i= 0;i<2;i++)
        {
            for(int j= 0;j<2;j++)
            {
                arr[i][j] = a.nextInt();
            }
        }
        for(int i= 0;i<2;i++)
        {
            for(int j= 0;j<2;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}