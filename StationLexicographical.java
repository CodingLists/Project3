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
		
		
		
	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) 
	{
		ArrayList<String> list = new ArrayList<String>();
		Set<String> set = unsorted.keySet();
		
		for(String key : set)
		{
			list.add(key);
		}
		
		Collections.sort(list);
		int num = unsorted.get(list.get(0));
		
		HashMap<String, Integer> sortedMap = new HashMap<String, Integer>();
		
		for(String temp : list)
		{
			sortedMap.put(temp, num);
		}
		
		return sortedMap;
		
	}
	
	
}