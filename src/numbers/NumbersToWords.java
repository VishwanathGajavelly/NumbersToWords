package numbers;

public class NumbersToWords {
	
	String units[] = { "zero", "one", "two", "three", "four", "five","six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	String tens[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	
	public String inWords(int number)
	{
		if (number == 0)
			return "zero"; // directly parse "zero", just to make our if-block on line 39 working.
	
		if (number < 0)
			//  return "minus " + inWords(java.lang.Math.abs(number)); [-1 will be returned as minus one]
			return "Please Enter a Positive Number";
	 
		if (number > 99999)	
			// to restrict the input.
			return "Please Enter a number Less than 99999";
	
		String result = "";
	
		if ((number / 1000) > 0)
		{
			result += inWords(number / 1000) + " thousand ";
			number %= 1000;
			if(number < 100 && number > 0) result += "and ";
		}
	
		if ((number / 100) > 0)
		{
			result += inWords(number / 100) + " hundred";
			number %= 100;
			if(number > 0) result += " and ";
		}
	
		if (number > 0)
			// if here we take number >= 0, for 100 we get "hundred zero" -> as we are working on Remainders.
		{
			if (number < 20)
				result += units[number];
			else
			{
				result += tens[number / 10];
				if ((number % 10) > 0)
					result += "-" + units[number % 10];
			}
		}
	
		return result;
	}
}




