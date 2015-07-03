package standard;
import java.util.*;

public class FirstWord 
{
	private ArrayList<String> prefixes = new ArrayList<String>();
	private ArrayList<String> suffixes = new ArrayList<String>();
	
	public FirstWord()
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
		
		//SUFFIXES
		suffixes.add("mongling");
		suffixes.add("eating");
		suffixes.add("flinging");
		suffixes.add("hurling");
		suffixes.add("gobbling");
		suffixes.add("eating");
		suffixes.add("scoffing");
		suffixes.add("gargling");
		suffixes.add("eating");
		suffixes.add("jerking");
		suffixes.add("fondling");
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
