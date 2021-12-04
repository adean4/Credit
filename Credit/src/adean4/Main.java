package adean4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter your Credit Card Number "); //prompt user to enter information
        Scanner credit_card_number = new Scanner(System.in); //user input
        long number;
        number = credit_card_number.nextLong();
        System.out.print("Credit Card Number: " + number);
        int sum = 0;
        String cardType = String.valueOf(number);
        while (number > 0)

            number = number / 10;

        if (number % 2 != 0) {
            number *= 2;
        }
        if (number > 9) {
            number = (number % 10) + 1;
        } else
            number *= 1;

        sum += number;

        if (sum % 10 == 0) {
            {
                if (cardType.startsWith("4")) {
                    System.out.print(" a Visa card");

                } else if (cardType.startsWith("51")) {
                    System.out.print(" a MasterCard");
                } else if (cardType.startsWith("52")) {
                    System.out.print(" a MasterCard");
                } else if (cardType.startsWith("53")) {
                    System.out.print(" a MasterCard");
                } else if (cardType.startsWith("54")) {
                    System.out.print(" a MasterCard");
                } else if (cardType.startsWith("55")) {
                    System.out.print(" a MasterCard");

                } else if (cardType.startsWith("37")) {
                    System.out.print(" an American Express card ");
                } else if (cardType.startsWith("34")) {
                    System.out.print(" an American Express card ");
                System.out.println(" is valid.");
            } else System.out.println(" is invalid. Please try again.");
            }
        }
    }
}