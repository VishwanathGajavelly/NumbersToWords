package numbers;

public class NumbersToWordsBelowTen {
	
	String units[] = { "Zero", "One", "Two", "Three", "Four", "Five","Six", "Seven", "Eight", "Nine", "Ten"};
	
	public String inWords(int number)
	{
		if(number > 10) return "Please Enter a number Less than or Equal to 10" ;
		return units[number];
	}
	
	public static void main(String[] args) {
		
		System.out.println(new NumbersToWordsBelowTen().inWords(Integer.parseInt(args[0])));
		
	}
}




