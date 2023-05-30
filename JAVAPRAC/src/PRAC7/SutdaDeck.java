package PRAC7;

public class SutdaDeck {

	final int card_num = 20;
	SutdaCard[] cards = new SutdaCard[card_num];
	
	SutdaDeck()
	{
		
		for(int i =0; i<cards.length;i++)
		{
			int num = i%10+1;
			boolean isKwang = ( i<10) &&(num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num,isKwang);
		}
			
	}
	
	void shuffle()
	{
		for(int i=0; i< cards.length;i++)
		{
			int j = (int)(Math.random()*card_num);
			SutdaCard temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}
	}
	
	SutdaCard pick(int index)
	{
		return cards[index%card_num];
	}
	
	SutdaCard pick()
	{
		int index = (int)(Math.random()*card_num);
		return pick(index);
	}
	
	
	
	
	class SutdaCard
	{
		int num;
		boolean isKwang;
		
		SutdaCard() 
		{
			this(1,true);
		}
		
		private SutdaCard(int num, boolean isKwang)
		{
			this.num = num;
			this.isKwang = isKwang;
		}
		
		public String toString()
		{
			return num + (isKwang ? "K" : " ");
		}
		
		
		
	}
	
}
