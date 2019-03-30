import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StationLexicographical extends MesoSortedAbstract
{

	private HashMap<String, Integer> asciiVal;
	
	
	public StationLexicographical(HashMap<String, Integer> asciiVal) 
	{
		this.asciiVal = asciiVal;
		
		ArrayList<String> list = new ArrayList<String>();
		Set<String> set = asciiVal.keySet();
		
		for(String key : set)
		{
			list.add(key);
		}
		
		
		Collections.sort(list);
		
		
	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) 
	{
		return null;
	}
	
	
}