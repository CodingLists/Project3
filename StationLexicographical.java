import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StationLexicographical extends MesoSortedAbstract
{

	private HashMap<String, Integer> asciiVal;
	
	
	public StationLexicographical(HashMap<String, Integer> asciiVal) 
	{
		this.asciiVal = asciiVal;
		
		Set<String> set = asciiVal.keySet();
		ArrayList<String> list = new ArrayList<String>();
		
		Map<String, Integer> sortedMap = sortedMap(asciiVal);
		
		for(String key : set)
		{
			list.add(key);
		}
		
		int num = asciiVal.get(list.get(0));
		String strg = "";
		
		Set<String> sorted = sortedMap.keySet();
		
		for(String temp : sorted)
		{
			strg+= temp + " " + num + "\n";
		}
		
		System.out.println(strg);
		
			
	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) 
	{
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.putAll(unsorted);
		return tm;
		
		
	}
	
	
	
	
}