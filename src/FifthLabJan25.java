import java.util.Random;
import java.util.Scanner;

public class FifthLabJan25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char userChar = 'y';
		
		int i = 1;
		
		
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println();
		System.out.println("Let's roll some dice!");
		System.out.println();
		
		System.out.println("How many sides should each die have? ");
		
		int diceSides = scan.nextInt(); // Get user input
		
		while (userChar == 'y' || userChar == 'Y') {  // Created a while loop so that the program will only run again if the user chooses to continue.
		
			if (diceSides < 1) { // if statement used to ensure that die will have at least one side
				System.out.println("Invalid entry. Enter a number greater than zero.");
				System.out.println();
				continue; // This will restart the while loop
			}
			
			
			
		System.out.println();
		System.out.println("Roll " + (i)); // Each roll will be counted
		i = i + 1;
		int diceNumber1 = dice1(diceSides); // value of integer is determined by diceSides and random number generator created in method dice1
		System.out.println(diceNumber1);
		int diceNumber2 = dice2(diceSides); // value of integer is determined by diceSides and random number generator created in method dice2
		System.out.println(diceNumber2);
			if (diceNumber1 + diceNumber2 == 11 || diceNumber1 + diceNumber2 == 7) {
				System.out.println();
				System.out.println("Craps!");
			}
			
			if (diceNumber1 + diceNumber2 == 12) {
				System.out.println();
				System.out.println("Boxcars!");
			}
			
			if (diceNumber1 + diceNumber2 == 2) {
				System.out.println();
				System.out.println("Snake eyes!");
			}
		
		
		System.out.println();
		System.out.print("Would you like to roll again?  If so, press the y key and hit enter." + "\n" + "Otherwise, press any other key and hit enter.");
		  userChar = scan.next().charAt(0);
          System.out.println();
		
		
		}
		System.out.println("Thanks for playing!");
		
		scan.close(); // close scanner
		
		} 
		
		

	
	
	public static int dice1(int num) {
		int randomNum1 = (int) ((Math.random() * num) + 1); // generates random number; + 1 is added so that 0 is not included
		return randomNum1;
		}
	
	public static int dice2(int num) {
		Random r = new Random();
		int randomNum2 = (int) ((r.nextInt(num)) + 1); // generates random number; + 1 is added so that 0 is not included
		return randomNum2;
	}
	
	
}

