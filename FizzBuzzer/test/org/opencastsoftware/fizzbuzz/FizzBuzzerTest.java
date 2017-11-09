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
		String expectedPrintout = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ";
		Assert.assertEquals(expectedPrintout, outContent.toString());		
	}

}
