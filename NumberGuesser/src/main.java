import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * Guess the Number Game:
		 * Topics Covered: Random Numbers, User Input, if statements, while loops
		 * 
		 * Description: Develop a game where the computer randomly selects a 
		 * 				number within a certain range, and the user has to guess it. 
		 * 				Provide feedback if the guess is too high or too low. Allow 
		 * 				the user to play multiple times until they guess correctly.
		 * 
		 */
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		// Set bounds for guessing range
		int min = 0;
		int max = 100;
		
		int secretNumber = random.nextInt(100)+1; // Generating number
		int guess; // Variable to hold user's guess
		boolean numberGuessed = false; // Flag to control guessing loop
		
		
		while(numberGuessed == false) {
			
			// Asking user for a guess between bounds
			System.out.print("Enter a number between " + min + " and " + max + ": ");
			guess = keyboard.nextInt();

			// Bounds checking
			if(guess < min || guess > max) {
				do {
					System.out.print("Enter a number between " + min + " and " + max + ": ");
					guess = keyboard.nextInt();
				}while(guess < min || guess > max);
				
			}
			
			if(guess == secretNumber) {
				numberGuessed = true; // breaks out of loop if user guesses right
			}
			else if(guess < secretNumber) {
				min = guess; // changes bounds if guess is low
				System.out.println("Too low!");
			}
			else if(guess > secretNumber) {
				max = guess; // changes bounds if guess is high
				System.out.println("Too high!");
			}
			
		}
		
		// Congratulatory message
		System.out.println("Congratulations!\nThe number was " + secretNumber);
		
		keyboard.close();

	}

}
