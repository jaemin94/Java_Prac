package PRAC6;

public class SutdaCard {

	int num;
	boolean isKwang = true;
	
	
	
	SutdaCard()
	{
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang)
	{
		this.num=num;
		this.isKwang = isKwang;
	}
	
	
	
	String info()
	{
		return num +(isKwang? "k" : " " );
	}
	
	
	
}
