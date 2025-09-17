/**
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: This program tests a user's ESP by guessing a randomly selected color.
 * Due: 09/16/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Fatmata Zahara SAKO
 */
package assignment1;

import java.util.Scanner;

 public class ESPGame {
	
	 public static void main(String[] args) {
	        // Create Scanner object for input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Constants for colors
	        final String COLOR_RED = "Red";
	        final String COLOR_GREEN = "Green";
	        final String COLOR_BLUE = "Blue";
	        final String COLOR_ORANGE = "Orange";
	        final String COLOR_YELLOW = "Yellow";
	        
	        // Constants for game settings
	        final int TOTAL_ROUNDS = 11;
	        int correctGuesses = 0;
	     // Get user information
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        System.out.print("Enter your MC M#: ");
	        String mcNumber = scanner.nextLine();
	        
	        System.out.print("Describe yourself: ");
	        String description = scanner.nextLine();
	        
	        System.out.print("Due Date (MM/DD/YY): ");
	        String dueDate = scanner.nextLine();
	        
	        System.out.println("\nCMSC203 Assignment1: Test your ESP skills!");
	        
	        // Main game loop
	        for (int round = 1; round <= TOTAL_ROUNDS; round++) {
	            System.out.println("\nRound " + round);
	            
	            // Generate computer's color choice (0-4)
	            int randomNumber = (int)(Math.random() * 5);
	            String computerColor = "";
	         // Determine computer's color based on random number
	            switch (randomNumber) {
	                case 0: computerColor = COLOR_RED; break;
	                case 1: computerColor = COLOR_GREEN; break;
	                case 2: computerColor = COLOR_BLUE; break;
	                case 3: computerColor = COLOR_ORANGE; break;
	                case 4: computerColor = COLOR_YELLOW; break;
	            }
	            
	            // Get and validate user's guess
	            String userGuess;
	            boolean validGuess = false;
	            
	            do {
	                System.out.println("I am thinking of a color.");
	                System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
	                System.out.print("Enter your guess: ");
	                userGuess = scanner.nextLine();
	                
	                // Check if guess is valid (case-insensitive)
	                if (userGuess.equalsIgnoreCase(COLOR_RED) ||
	                		userGuess.equalsIgnoreCase(COLOR_GREEN) ||
	                        userGuess.equalsIgnoreCase(COLOR_BLUE) ||
	                        userGuess.equalsIgnoreCase(COLOR_ORANGE) ||
	                        userGuess.equalsIgnoreCase(COLOR_YELLOW)) {
	                        validGuess = true;
	                    } else {
	                        System.out.println("You entered an incorrect color. Please try again.");
	                    }
	                } while (!validGuess);
	                
	                // Show results for this round
	                System.out.println("I was thinking of " + computerColor);
	                
	                // Check if guess was correct
	                if (userGuess.equalsIgnoreCase(computerColor)) {
	                    correctGuesses++;
	                }
	            }
	            
	            // Display final results
	            System.out.println("\nGame Over");
	            System.out.println("You guessed " + correctGuesses + " out of " + TOTAL_ROUNDS + " colors correctly.");
	            System.out.println("Student Name: " + name);
	            System.out.println("MC M#: " + mcNumber);
	            System.out.println("User Description: " + description);
	            System.out.println("Due Date: " + dueDate);
	            
	            // Close scanner
	            scanner.close();
	        }
	    
}
