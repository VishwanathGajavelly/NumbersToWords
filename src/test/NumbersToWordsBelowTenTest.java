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
			{0, "zero"},
			{1, "one"},
		    {2,"two"},
		    {3, "three"},
		    {4,"four"},
		    {5,"five"},
		    {6,"six"},
		    {7,"seven"},
		    {8,"eight"},
		    {9,"nine"},
		    {10,"ten"},
		    {100,"Please Enter a number Less than or Equal to 10"},
		    {11,"Please Enter a number Less than or Equal to 10"},
		      
		});
	}
	
	@Test 
	public void testNumberUpto10(){
		assertEquals(expected,new NumbersToWordsBelowTen().inWords(actual));
	}

}
