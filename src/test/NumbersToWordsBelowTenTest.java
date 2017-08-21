package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import numbers.NumbersToWordsBelowTen;

@RunWith(Parameterized.class)
public class NumbersToWordsBelowTenTest {
	
	private Integer actual;
	private String expected;
			
	public NumbersToWordsBelowTenTest(Integer actual, String expected) {
		
		this.actual = actual;
		this.expected = expected;
		
	}

	@Parameters
	public static Collection<Object[]> testParams_numberToWordsUsingCollection(){
		return Arrays.asList(new Object[][] {
			{0, "Zero"},
			{1, "One"},
		    {2,"Two"},
		    {3, "Three"},
		    {4,"Four"},
		    {5,"Five"},
		    {6,"Six"},
		    {7,"Seven"},
		    {8,"Eight"},
		    {9,"Nine"},
		    {10,"Ten"},
		    {100,"Please Enter a number Less than or Equal to 10"},
		    {11,"Please Enter a number Less than or Equal to 10"},
		      
		});
	}
	
	@Test 
	public void testForNumbersBelow10(){
		assertEquals(expected,new NumbersToWordsBelowTen().inWords(actual));
	}

}
