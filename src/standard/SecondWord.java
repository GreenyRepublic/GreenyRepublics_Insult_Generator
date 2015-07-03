package standard;

import java.util.*;

public class SecondWord 
{
	private ArrayList<String> prefixes = new ArrayList<String>();
	private ArrayList<String> suffixes = new ArrayList<String>();
	
	public SecondWord()
	{
		//PREFIXES
		prefixes.add("Queef");
		prefixes.add("Shit");
		prefixes.add("Turd");
		prefixes.add("Ass");
		prefixes.add("Arse");
		prefixes.add("Cock");
		prefixes.add("Dick");
		prefixes.add("Fuck");
		prefixes.add("Cunt");
		prefixes.add("Cum");
		prefixes.add("Cunk");
		prefixes.add("Jizz");
		
		//SUFFIXES
		suffixes.add("hat");
		suffixes.add("eater");
		suffixes.add("burger");
		suffixes.add("fucker");
		suffixes.add("heap");
		suffixes.add("pile");
		suffixes.add("mongler");
		suffixes.add("load");
		suffixes.add("gargler");
		suffixes.add("eater");
		suffixes.add("gobbler");
		suffixes.add("downer");
		suffixes.add("parade");
		suffixes.add("spanner");
		suffixes.add("badger");
		suffixes.add("sock");
		suffixes.add("jerker");
		suffixes.add("biscuit");
	}
	
	public String generate(int number1, int number2)
	{
		return prefixes.get(number1) + suffixes.get(number2);
	}
	
	public int maxPref()
	{
		return prefixes.size() - 1;
	}
	
	public int maxSuff()
	{
		return suffixes.size() - 1;
	}
}
