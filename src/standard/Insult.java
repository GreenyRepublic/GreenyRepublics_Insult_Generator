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
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public void printInsult()
	{
		System.out.println(theinsult);
	}
	
	public void shortInsult()
	{	
		SecondWord word = new SecondWord();
		String string = word.generate(randInt(word.maxPref()), randInt(word.maxSuff()));
		theinsult = string;
	}
	
	public void longInsult()
	{
		shortInsult();
		FirstWord word = new FirstWord();
		String string = word.generate(randInt(word.maxPref()), randInt(word.maxSuff()));
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
