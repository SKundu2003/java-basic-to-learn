//00 exercise
//Write a program to calculate the percentage of a given student in the CBSE board exam.
// His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        float marks_in_every_sub = sc.nextFloat();
        float out_of = marks_in_every_sub*5;
        System.out.println("enter the marks of 5 subject");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        float num5 = sc.nextFloat();

        float total = num1+num2+num3+num4+num5;
        float percent = (total*100)/out_of;
        System.out.print("the persentage is ");
        System.out.println(percent);
    }
}