package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import numbers.NumbersToWords;

@RunWith(Parameterized.class)
public class NumbersToWordsTest {
	
	private Integer actual;
	private String expected;
			
	public NumbersToWordsTest(Integer actual, String expected) {
	
		this.actual = actual;
		this.expected = expected;
		
	}

	@Parameters
	public static Collection<Object[]> testParams_numberToWords(){
		return Arrays.asList(new Object[][] {
			{-45, "Please Enter a Positive Number"},
			{0, "zero"},
			{2, "Two"},
			{11,"Eleven"},
			{17, "Seventeen"},
		    {23,"Twenty Three"},
		    {100,"One Hundred"},
		    {114,"One Hundred and Fourteen"},
		    {756,"Seven Hundred and Fifty Six"},
		    {1010,"One Thousand and Ten"},
		    {5500,"Five Thousand Five Hundred"},
		    {10000,"Ten Thousand "},
		    {10001,"Ten Thousand and One"},
		    {14389,"Fourteen Thousand Three Hundred and Eighty Nine"},
		    {99999,"Ninety Nine Thousand Nine Hundred and Ninety Nine"},
		    {10000752,"Please Enter a number Less than 99999"}
		});
	}
	
	@Test 
	public void testForNumbersAbove10(){
		assertEquals(expected,new NumbersToWords().inWords(actual));
	}

}
