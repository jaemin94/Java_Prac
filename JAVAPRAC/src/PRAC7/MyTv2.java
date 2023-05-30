package PRAC7;

public class MyTv2 {

	private boolean isPowerOn;
	private int Channel;
	private int Volume;
	private int PrevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int Channel)
	{
		if(Channel > MAX_CHANNEL || Channel < MIN_CHANNEL)
			return;
		
		PrevChannel = this.Channel;
		this.Channel = Channel;
	}
	
	public int getChannel()
	{
		return Channel;
	}
	
	public void setVolume(int Volume)
	{
		if(Volume > MAX_VOLUME || Volume < MIN_VOLUME)
			return;
		
		this.Volume = Volume;
	}
	
	public int getVolume()
	{
		return Volume;
	}
	
	public void gotoPrevChannel()
	{
		setChannel(PrevChannel);
	}
}
