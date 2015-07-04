//GreenyRepublic's Official Insult Generator 2015!
//Written by Benjamin Clark
//Version 0.1
//03/07/2015

package standard;

public class InsultGenerator
{
	
	int getIntInput(String prompt)
	{
		Input in = new Input();
		System.out.println(prompt);
		String input = in.nextLine(); 
		int result = Integer.parseInt(input);
		while (result < 1 || result > 3) {
			System.out.println("Input must be an integer between 1 and 3!");
			System.out.println(prompt);
			input = in.nextLine();
			result = Integer.parseInt(input);
		}
		return result;
	}
	
	String getStringInput(String prompt)
	{
		Input in = new Input();
		System.out.println(prompt);
		return in.nextLine();
	}

	boolean playAgain()
	{
		String input = getStringInput("Would you like to generate another insult? (Y/N)");
		input = input.toLowerCase();
		while (true)
		{
			if (input.equals("y"))
			{
				return true;
			}
			if (input.equals("n"))
			{
				return false;
			}
			else
			{
				System.out.println("INVALID INPUT");
				input = getStringInput("Would you like to generate another insult? (Y/N)");
				input = input.toLowerCase();
			}
		}
	}
	
	void shortInsult()
	{
		Insult in = new Insult("");
		in.shortInsult();
		in.printInsult();
	}
	
	void longInsult()
	{
		Insult in = new Insult("");
		in.longInsult();
		in.printInsult();
	}
	
	void veryLongInsult()
	{
		Insult in = new Insult("");
		in.veryLongInsult();
		in.printInsult();
	}
	
	void generateInsult(int length)
	{
		if (length == 1)
		{
			shortInsult();
		}
		if (length == 2)
		{
			longInsult();
		}
		if (length == 3)
		{
			veryLongInsult();
		}
	}
	
	//LET'S DO THIS
	void main()
	{
		int lenSelect = getIntInput("How long would you like your insult to be? \n (1) Short \n (2) Long \n (3) Real Fuckin' Long");
		generateInsult(lenSelect);
		if (playAgain())
		{
			main();
		}
		else
		{
			System.out.println("GOODBYE, ASSHOLE.");
			System.exit(0);
		}
	}
	
	//Required dressing and red tape
	public static void main(String[] args) 
	{
		System.out.println("Welcome to The Ben Clark Insult Generator!");
		new InsultGenerator().main();
	}
}
