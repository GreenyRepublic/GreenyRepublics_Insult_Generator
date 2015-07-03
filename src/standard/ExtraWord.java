package standard;
import java.util.*;

public class ExtraWord {

	private ArrayList<String> words = new ArrayList<String>();
	
	public ExtraWord()
	{
		words.add("Sort of Fuckin' Thing");
		words.add("Son of a Gun");
	}
	
	public String generate(int number)
	{
		return words.get(number);
	}

	public int max()
	{
		return words.size() - 1;
	}
}
