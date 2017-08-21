package numbers;

public class NumbersToWordsBelowTen {
	
	String units[] = { "Zero", "One", "Two", "Three", "Four", "Five","Six", "Seven", "Eight", "Nine", "Ten"};
	
	public String inWords(int number)
	{
		if(number > 10) return "Please Enter a number Less than or Equal to 10" ;
		return units[number];
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