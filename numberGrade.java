import java.util.Scanner;
public class numberGrade {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String letter;
		System.out.println("Enter a letter grade from A,B,C,D, or F");
		letter=scan.nextLine();
		if(letter.equalsIgnoreCase("A"))
		{
			System.out.println("The numeric value for Grade " + letter + " is 4");
		}
		else if(letter.equalsIgnoreCase("B"))
		{
			System.out.println("The numeric value for Grade " + letter + " is 3");
		}
		else if(letter.equalsIgnoreCase("C"))
		{
			System.out.println("The numeric value for Grade " + letter + " is 2");
		}
		else if(letter.equalsIgnoreCase("D"))
		{
			System.out.println("The numeric value for Grade " + letter + " is 1");
		}
		else if(letter.equalsIgnoreCase("F"))
		{
			System.out.println("The numeric value for Grade " + letter + " is 0");
		}
		else
		{
			System.out.println(letter + " is an invalid Grade");
		}

	}

}
