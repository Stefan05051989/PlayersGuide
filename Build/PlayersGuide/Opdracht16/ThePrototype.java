//package PlayersGuide.Opdracht16;
//import PlayersGuide.Methods.ClearConsole.ClearConsole;
//import PlayersGuide.Methods.NumberInRange.NumberInRange;
//
//import java.util.Scanner;
//
///*
//Stefan Kiers
//12-05-'25
//
//Build a program that will allow a user, the pilot, to enter a number.
//If the number is above 100 or less than 0, keep asking.
//Clear the screen once the program has collected a good number (you can just write 50 blank lines to clear the screen :) ).
//Ask a second user, the hunter,to guess numbers.
//Indicate whether the user guessed too high, too low, or guessed right.
//Loop until they get it right, then end the program.
//
//I've made this program before, now i want to add a method for adding a number instead of using
//a scanner every time.
// */
//
//
//public class ThePrototype {
//    public static void giveWord(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello pilot, fill in the number you want the hunter to find!");
//
//        int numberToGuess = NumberInRange.askForNumberInRange("Add a number to guess for the Hunter",
//                0, 100);
////        Call ClearConsole method :
//        ClearConsole.clear();
////        // vraag gebruiker nmr in te voeren dmv input tussen 0 en 100
////        if (numberToGuess < 0 || numberToGuess > 100) { // als: NTG groter is dan 0 en kleiner dan 100, || geeft waar terug als 1 vd voorwarden klopt
////            // of nummer kleiner dan 100..
////            System.out.println("Enter a number between 0 and 100");
////            if (numberToGuess > 0 || numberToGuess < 100) {
////                return;
////            }
////        }
//        // continue application
//        System.out.println("Hunter, guess the correct number starting from 0 to 100!"); // console opdracht
//        int userGuess;
//        do {
//            userGuess = NumberInRange.askForNumberInRange("Guess : ", 0, 100);
//
//            if (scanner.hasNextInt()) { // als : input geldig geheel getal is
//                userGuess = scanner.nextInt(); // input gebruiker : volgende int
//                if (userGuess < numberToGuess) { // kleiner dan te raden nummer
//                    System.out.println("Too Low! Guess again!"); // output if statement
//                } else if (userGuess > numberToGuess) { // groter dan te raden nummer
//                    System.out.println("Too high! Guess again!"); // output if statement
//                } else {
//                    System.out.println("HIT! Pilot down! "); // nummer geraden
//                }
//            }
////            while (userGuess != numberToGuess) ;
//        } while (userGuess != numberToGuess);
//    }
//}
