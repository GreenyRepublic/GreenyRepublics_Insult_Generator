//GreenyRepublic's Official Insult Generator 2015!
//Written by Benjamin Clark
//Version 1.0.1
//03/07/2015

package standard;

public class InsultGenerator
{

	static String version = "1.0.1";
	GreenyInput input = new GreenyInput();

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
		int lenSelect = input.limitIntInput("How long would you like your insult to be? \n (1) Short \n (2) Long \n (3) Real Fuckin' Long \n (4) Exit", 1, 4);
		while (lenSelect <= 3 && lenSelect >= 1)
		{
			generateInsult(lenSelect);
			lenSelect = input.limitIntInput("How long would you like your insult to be? \n (1) Short \n (2) Long \n (3) Real Fuckin' Long \n (4) Exit", 1, 4);
		}

		if (lenSelect == 4)
		{
			System.out.println("GOODBYE, ASSHOLE.");
			System.exit(0);
		}
	}

	//Required dressing and red tape
	public static void main(String[] args) 
	{
		System.out.printf("Welcome to The Ben Clark Insult Generator! v");
		System.out.println(version);
		new InsultGenerator().main();
	}
}
