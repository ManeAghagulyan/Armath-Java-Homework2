public class Homework2_7 {
    public static void main(String[] args) {
        // Write a Java program that adds all the digits in the 4 digit-integer․
        int number = 7871;
        int thousands = number / 1000;
        System.out.println(thousands);
        int hundreds = (number / 100) % 10;
        System.out.println(hundreds);
        int tens = (number / 10) % 10;
        System.out.println(tens);
        int ones = number % 10;
        System.out.println(ones);
        int sumOfDigits = thousands + hundreds + tens + ones;
        System.out.println("Sum of digits = " + sumOfDigits);
    }
}
