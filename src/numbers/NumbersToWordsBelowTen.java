package numbers;

public class NumbersToWordsBelowTen {
	
	String units[] = { "zero", "one", "two", "three", "four", "five","six", "seven", "eight", "nine", "ten"};
	
	public String inWords(int number)
	{
		if(number > 10) return "Please Enter a number Less than or Equal to 10" ;
		return units[number];
	}

}




