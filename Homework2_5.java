public class Homework2_5 {
    public static void main(String[] args){
        // Write a Java program that given the number of kgs of apple and pear,
        // computes and displays the total amount of money
        int applePrice = 450;
        int pearPrice = 600;
        int appleWeight = 5;
        int pearWeight = 4;
        int totalAmount = applePrice * appleWeight + pearPrice * pearWeight;
        System.out.println(appleWeight + "kg of apple and " + pearWeight + "kg of pear cost " + totalAmount + " AMD");
    }
}
