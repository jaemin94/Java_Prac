package PRAC7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i<deck.cards.length;i++)
		{
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
		
		
	}

}


/*
 	
 	public static void 실습7_1(String[] args) {
		// TODO Auto-generated method stub

		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i < deck.cards.length;i++)
		{
			System.out.print(deck.cards[i]+",");
		}
		
		
		
	}
	
	public static void 실습7_2(String[] args) {
		// TODO Auto-generated method stub

		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i<deck.cards.length;i++)
		{
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
		
		
	}
 
 
 
 
 */
