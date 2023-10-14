/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskOne;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mercy
 */
public class NumberGame {
    
    public static void main(String[] args) {
        //generating a random number
        Random random = new Random();
        
        int lowerbound = 1;
        int upperbound = 100;
        int random_number = random.nextInt(upperbound - lowerbound + 1) + lowerbound;
        int attempts = 0;
        int answer;
        
        Scanner sc = new Scanner(System.in);
        int user_guess;
        
        while (true) {
        try{
            do {
                System.out.println("Hello! Guess a number from 1 to 100");
                user_guess = sc.nextInt();
                attempts++;
            
                if (user_guess < random_number)
                    System.out.println("Guess too low! Please Try Again");
                else if (user_guess > random_number)
                    System.out.println("Guess too high! Please Try Again");
                else 
                    System.out.println("Yaayy! You got it Right!");
               

            }while (random_number != user_guess);
                    System.out.println("Still not a match");
        } catch (InputMismatchException e);
                    
                    System.out.println("Do you wish to play again?(Y or N)");
                    sc.next();
        }
                    
                    // replay
//                    do{
//                    answer = sc.next();
//                    validInput = true;
//                    if (answer.equalsIgnoreCase("Y"));
//                    else if (answer.equalsIgnoreCase("N"))
//                    keepPlaying = false;
//                    else
//                    validInput = false;
//                    } while (!validInput);
//                    }
//                    System.out.println("\nThank you for playing!");

                        }
    
    }  

