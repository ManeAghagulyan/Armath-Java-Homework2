import java.util.Scanner;

public class Homework2_6 {
    public static void main(String[] args){
        // Write a Java program that reads a number in centimeters and converts it to meters.
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num = in.nextInt();
        System.out.println(num + " cm is: " + num / 100.0 + " m");
    }
}
