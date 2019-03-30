public class MesoAscii extends MesoAsciiAbstract
{
	
	private String id;

	public MesoAscii(String id)
	{
		this.id = id;
	}
	
	int calAverage() 
	{
		
		
		int char1 = (int)this.id.charAt(0);
		int char2 = (int)this.id.charAt(1);
		int char3 = (int)this.id.charAt(2);
		int char4 = (int)this.id.charAt(3);
		
		int average = (char1 + char2 + char3 + char4)/4;
		return average;
	}
	
	
}