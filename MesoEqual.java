import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MesoEqual
{
	
	private String stID;

	public MesoEqual(String stID) 
	{
		this.stID = stID;
	}

	public HashMap<String, Integer> calAsciiEqual() throws IOException 
	{
		MesoAscii here = new MesoAscii(new MesoStation(this.stID));
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		hash.put(this.stID, here.calAverage());
		
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
    	br.readLine(); 
    	br.readLine();
    	br.readLine();
    	br.readLine();
    	
    	while(br.ready())
    	{
	    	String[] tokens = br.readLine().split("  ");
	    	String strg = tokens[1];
	    	MesoAscii there = new MesoAscii(new MesoStation(strg));
	    	if(here.calAverage() == there.calAverage())
	    	{
	    		hash.put(strg, there.calAverage());
	    	}
    	}
    	
    	br.close();
    	return hash;
    	
	}
	
}