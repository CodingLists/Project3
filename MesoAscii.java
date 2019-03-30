public class MesoAscii extends MesoAsciiAbstract
{
	
	private MesoStation meso;

	public MesoAscii(MesoStation meso)
	{
		this.meso = meso;
	}
	
	int calAverage() 
	{
		
		
		int char1 = (int)this.meso.getStID().charAt(0);
		int char2 = (int)this.meso.getStID().charAt(1);
		int char3 = (int)this.meso.getStID().charAt(2);
		int char4 = (int)this.meso.getStID().charAt(3);
		
		int average = (int)(Math.round((char1 + char2 + char3 + char4)/4.0));
		return average;
	}
	
	
}