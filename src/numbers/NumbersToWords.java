package numbers;

public class NumbersToWords {
	
	String units[] = { "Zero", "One", "Two", "Three", "Four", "Five","Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	String tens[] = { "Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	
	public String inWords(int number)
	{
		if (number == 0)
			return "Zero"; // directly parse "zero", just to make our if-block on line 37 working.
	
		if (number < 0)
			//  return "minus " + inWords(java.lang.Math.abs(number)); [-1 will be returned as minus one]
			return "Please Enter a Positive Number";
	 
		if (number > 99999)	
			// to restrict the input.
			return "Please Enter a number Less than 99999";
	
		String result = "";
	
		if ((number / 1000) > 0)
		{
			result += inWords(number / 1000) + " Thousand ";
			number %= 1000;
			if(number < 100 && number > 0) result += "and ";
		}
	
		if ((number / 100) > 0)
		{
			result += inWords(number / 100) + " Hundred";
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
					result += " " + units[number % 10];
			}
		}
	
		return result;
	}
	
	public static void main(String[] args) {
		
		try{

		System.out.println(new NumbersToWords().inWords(Integer.parseInt(args[0])));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception arised: "+e);
			System.out.println("Please send atleast one input argument.");
		}
		catch(NumberFormatException e) {
			System.out.println("Exception arised: "+e);
			System.out.println("Please send only Integer Values.");
		}
		
		
	}
}