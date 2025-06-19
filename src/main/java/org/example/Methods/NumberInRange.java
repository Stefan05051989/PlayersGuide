package org.example.Methods;
import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        int result = askForNumberInRange("Please enter a number between : ", -2147483648 , 2147483647);
        System.out.println("Number given as input : " + result);
    }

    public static int askForNumberInRange(String text, int minRange, int maxRange) {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println(text);

        do {
            System.out.println("Enter a number between " + minRange + " and " + maxRange + ":");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input, please enter a valid number.");
            }
            input = scanner.nextInt();

            if (input < minRange ||  input > maxRange){
                System.out.println("Number must be between " + minRange + " and " + maxRange);
                System.out.println("Enter valid input.");
            }
        }while (input < minRange || input > maxRange);
        scanner.close();
        return input;
    }
}

