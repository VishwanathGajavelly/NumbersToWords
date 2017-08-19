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
			{2, "two"},
			{11,"eleven"},
			{17, "seventeen"},
		    {23,"twenty-three"},
		    {100,"one hundred"},
		    {114,"one hundred and fourteen"},
		    {756,"seven hundred and fifty-six"},
		    {1010,"one thousand and ten"},
		    {5500,"five thousand five hundred"},
		    {10000,"ten thousand "},
		    {10001,"ten thousand and one"},
		    {14389,"fourteen thousand three hundred and eighty-nine"},
		    {99999,"ninety-nine thousand nine hundred and ninety-nine"},
		    {10000752,"Please Enter a number Less than 99999"}
		});
	}
	
	@Test 
	public void testForNumbersAbove10(){
		assertEquals(expected,new NumbersToWords().inWords(actual));
	}

}
