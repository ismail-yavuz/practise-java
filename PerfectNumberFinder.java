
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		ArrayList<Integer> perfectNumbers = new ArrayList<Integer>(); // Define for keeping perfect numbers in a arraylist
		Scanner scan = new Scanner(System.in);
		
		int tempSum = 0; // Define for keeping sum of divisors
		int lastNumber; // Define for keeping last number
		
		System.out.println("Enter the last number for perfect number finder: "); // Print screen
		lastNumber = scan.nextInt(); // User input for last number
		
		for(int i = 1; i<lastNumber+1; i++) { // for loop for numbers (1 to lastNumber, lastNumber included)
			
			for(int j = 1; j<i; j++) { // for loop for divisors
				
				if((i%j) == 0) { // Check if quotient is equals 0
					tempSum += j; // Add divisor to tempSum variable
				}
				
			}
			if(i == tempSum) { // Check if tempSum equals number
				perfectNumbers.add(i); // This number is a perfect number
			}
			tempSum = 0; // tempSum equals 0 for new loop(new number)
			
		}
		
		//End of the loop print all perfect numbers
		for(int i : perfectNumbers) {
		
			System.out.println(i);
			
		}
		
	}

}
