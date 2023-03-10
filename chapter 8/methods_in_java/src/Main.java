import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }
    static void change_arr(int[] arr) {
        arr[0] = 50;
    }
    public static void main(String[] args) {
//        int a = 5;
//        int b = 7;
//        int c;
//
////         Method invocation using Object creation
////        Main obj = new Main();
////        int val = obj.logic(5,2);
//
//        c = logic(a, b);
//        System.out.println(a + " "+ b);
//        int a1 = 2;
//        int b1 = 1;
//        int c1;
//        c1 = logic(a1, b1);
//        System.out.println(c);
//        System.out.println(c1);


        //changing the value of array
        //array is a reference of data
        int[] arr = {10,20,30,40};
        change_arr(arr);
        out.println("changing the value "+ arr[0]);
    }
}
