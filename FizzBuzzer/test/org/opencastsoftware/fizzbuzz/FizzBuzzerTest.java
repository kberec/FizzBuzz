package org.opencastsoftware.fizzbuzz;

import org.junit.Assert;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzerTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	public FizzBuzzer fizzBuzzer = new FizzBuzzer();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}	
	
	@Test
	public void test() {
		fizzBuzzer.print(1, 20);
		String expectedPrintout = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz " + System.getProperty("line.separator") + 
				"fizz: 4" + System.getProperty("line.separator") +
				"buzz: 3" + System.getProperty("line.separator") + 
				"fizzbuzz: 1" + System.getProperty("line.separator") + 
				"lucky: 2" + System.getProperty("line.separator") + 
				"number: 10" + System.getProperty("line.separator");
		;
		Assert.assertEquals(expectedPrintout, outContent.toString());		
	}

}
