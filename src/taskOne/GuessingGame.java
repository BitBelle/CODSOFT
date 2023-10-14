/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskOne;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mercy
 */
public class GuessingGame {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean keepPlaying = true;
        
        System.out.println("Hello! Welcome to Guessing Game!");
        while(keepPlaying){
            boolean validInput;
            int random;
            int guess=1;
            String answer;
            
            //pick a random number
            random = (int)(Math.random() * 100) + 1;
            
            //guessing
            System.out.print("\nI'm thinking of a number between 1 and 100");
            System.out.println("\nWhat do you think it is?");
            
            do {
            try {
                guess = sc.nextInt();
                validInput = true;
                
                if (guess < 1 || guess > 100) {
                    System.out.println("Your guess should be in the range (1-100). Please try again.");
                    validInput = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input. Please enter a valid number between 1 and 100.");
                validInput = false;
                sc.next(); // Consume invalid input
            }
        } while (!validInput);
            
            if (guess == random){
                System.out.println("Yaayy you won! Your guess is correct!");
                break;
            }
            else if(guess > random){
                System.out.println("Your Guess is too high!" + "The number was " + random + "\nPlay again? (Y or N)");
                
            }
            else if (guess < random){
                System.out.println("Your Guess is too low!" + "The number was " + random + "\nPlay again? (Y or N)");
            }   
            
            //play again
            do {
                answer = sc.next();
                validInput = true;
                
                if (answer.equalsIgnoreCase("Y"));
                else if (answer.equalsIgnoreCase("N"))
                    keepPlaying = false;
                else
                    validInput = false;
            } while (!validInput);
        }
        System.out.println("\nThanks for playing the game!");
    }
    
    }
