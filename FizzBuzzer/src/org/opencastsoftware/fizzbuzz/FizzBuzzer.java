package org.opencastsoftware.fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class to print out various keywords for contiguous range of numbers
 * @author Kornel
 *
 */
public class FizzBuzzer {
	private Map<String,Integer> statistics = new LinkedHashMap<>();
	
	/**
	 * Print out keywords based on range of numbers 
	 * @param fromRange the starting number of the range
	 * @param toRange the ending number of the range
	 */
	public void print(int fromRange, int toRange) {
		initializeStatistics();
		
		for (int i = fromRange; i <= toRange; i++) {
			if (String.valueOf(i).contains("3"))
				handleKeyword("lucky", 0);
			else if (i % 3 == 0 && i % 5 == 0)
				handleKeyword("fizzbuzz", 0);
			else if (i % 3 == 0)
				handleKeyword("fizz", 0);
			else if (i % 5 == 0)
				handleKeyword("buzz", 0);
			else
				handleKeyword("number", i);
			
			System.out.print(" ");				
		}
		
		printStatistics();
	}

	/**
	 * Initialize statistics
	 */
	private void initializeStatistics() {
		String[] keywords = "fizz,buzz,fizzbuzz,lucky,number".split(",");
		for(String keyword: keywords)
		{
			statistics.put(keyword, 0);			
		}
	}

	/**
	 * Increase counters in statistics and print out the keyword 
	 * @param keyword
	 */
	private void handleKeyword(String keyword, int value) {
		statistics.put(keyword, statistics.get(keyword) + 1);
		
		if (value != 0)
			System.out.print(value);
		else
			System.out.print(keyword);
	}
	
	/**
	 * Print out statistics
	 */
	private void printStatistics() {
		System.out.print(System.getProperty("line.separator"));
		for (Map.Entry<String, Integer> item : statistics.entrySet()) {
			System.out.println(item.getKey() + ": " + item.getValue());
		}
	}

}
