package standard;
import java.util.*;

public class Word
{
	private ArrayList<String> prefixes = new ArrayList<String>();
	private ArrayList<String> firstsuffixes = new ArrayList<String>();
	private ArrayList<String> secondsuffixes = new ArrayList<String>();
	
	public Word()
	{
		//PREFIXES - BOTH WORDS
		prefixes.add("Queef");
		prefixes.add("Shit");
		prefixes.add("Turd");
		prefixes.add("Ass");
		prefixes.add("Arse");
		prefixes.add("Cock");
		prefixes.add("Dick");
		prefixes.add("Fuck");
		prefixes.add("Cunt");
		prefixes.add("Poop");
		
		//SUFFIXES - FIRST WORD
		firstsuffixes.add("mongling");
		firstsuffixes.add("eating");
		firstsuffixes.add("flinging");
		firstsuffixes.add("hurling");
		firstsuffixes.add("gobbling");
		firstsuffixes.add("scoffing");
		firstsuffixes.add("gargling");
		firstsuffixes.add("jerking");
		firstsuffixes.add("fondling");
		firstsuffixes.add("juggling");

		//SUFFIXES - SECOND WORD
		secondsuffixes.add("hat");
		secondsuffixes.add("eater");
		secondsuffixes.add("burger");
		secondsuffixes.add("fucker");
		secondsuffixes.add("heap");
		secondsuffixes.add("pile");
		secondsuffixes.add("mongler");
		secondsuffixes.add("load");
		secondsuffixes.add("gargler");
		secondsuffixes.add("eater");
		secondsuffixes.add("gobbler");
		secondsuffixes.add("downer");
		secondsuffixes.add("parade");
		secondsuffixes.add("spanner");
		secondsuffixes.add("badger");
		secondsuffixes.add("sock");
		secondsuffixes.add("jerker");
		secondsuffixes.add("biscuit");
		secondsuffixes.add("stain");
		secondsuffixes.add("cheese");
		secondsuffixes.add("berry");
		secondsuffixes.add("sausage");
	}
	
	public String generate(int number1, int number2, int wordno)
	{
		if (wordno == 1)
		{
			return prefixes.get(number1) + firstsuffixes.get(number2);
		}
		else
		{
			return prefixes.get(number1) + secondsuffixes.get(number2);
		}
	}
	
	public int maxPref()
	{
		return prefixes.size() - 1;
	}
	
	public int maxSuff1()
	{
		return firstsuffixes.size() - 1;
	}

	public int maxSuff2()
	{
		return secondsuffixes.size() - 1;
	}
}
