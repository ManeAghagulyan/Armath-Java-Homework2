public class Homework2_4 {
    public static void main(String[] args) {
        // Write a Java program to find and print the middle digit of a 3-digit number.
        int number = 123;
        int middleDigit = (number % 100) / 10;
        System.out.println("Middle digit of a 3-digit number = " + middleDigit);
    }
}
