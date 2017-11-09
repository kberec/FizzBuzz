package org.opencastsoftware.fizzbuzz;
/**
 * Class to print out various keywords for contiguous range of numbers
 * @author Kornel
 *
 */
public class FizzBuzzer {
	
	/**
	 * Print out keywords based on range of numbers 
	 * @param fromRange the starting number of the range
	 * @param toRange the ending number of the range
	 */
	public void print(int fromRange, int toRange) {
		for (int i = fromRange; i <= toRange; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print("fizzbuzz");
			else if (i % 3 == 0)
				System.out.print("fizz");
			else if (i % 5 == 0)
				System.out.print("buzz");
			else
				System.out.print(i);
			
			System.out.print(" ");				
		}
	}
}
