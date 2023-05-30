package PRAC7;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
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
 
 	
 	public static void 실습7_10(String[] args) {
		// TODO Auto-generated method stub

		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		
		t.setVolume(20);
		System.out.println("Vol:"+t.getVolume());
		
	}
 
 
 	
 	public static void 실습7_11(String[] args) {
		// TODO Auto-generated method stub

		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		
	}
	
	
	public class 실습7_18 {

	static void action(Robot r)
	{
		if(r instanceof DanceRobot)
		{
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}
		else if(r instanceof SingRobot)
		{
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}
		else if(r instanceof DrawRobot)
		{
			DrawRobot Dr = (DrawRobot)r;
			Dr.draw();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i =0; i < arr.length;i++)
		{
			action(arr[i]);
		}
		
		
	}
	
 	
 	public static void 실습7_19(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
 	
 	
 */
