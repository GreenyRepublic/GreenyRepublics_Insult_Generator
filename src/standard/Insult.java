package standard;
import java.util.*;

public class Insult 
{
	private String theinsult;
	public Insult(String theinsult)
	{
		this.theinsult = theinsult;
	}
	
	public static int randInt(int max) 
	{
		int min = 0;
	    Random rand = new Random();
	    return rand.nextInt((max - min) + 1) + min;
	}
	
	public void printInsult()
	{
		System.out.print("\n");
		System.out.println(theinsult);
		System.out.print("\n");
	}

	public void shortInsult()
	{	
		Word word = new Word();
		theinsult = word.generate(randInt(word.maxPref()), randInt(word.maxSuff2()), 2);
	}
	
	public void longInsult()
	{
		shortInsult();
		Word word = new Word();
		String string = word.generate(randInt(word.maxPref()), randInt(word.maxSuff1()), 1);
		theinsult = string + " " + theinsult;
	}
	
	public void veryLongInsult()
	{
		longInsult();
		ExtraWord word = new ExtraWord();
		String string = word.generate(randInt(word.max()));
		theinsult = theinsult + " " + string;
	}
}
