package PRAC7;

public class Buyer {

	int money = 1000;
	Product1[] cart = new Product1[3];
	int i = 0 ;
	
	void buy(Product1 p)
	{
		if( money < p.price)
		{
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money-= p.price;
		
		add(p);
		
	}
	
	void add(Product1 p)
	{
		if(i >= cart.length)
		{
			Product1[] tmp = new Product1[cart.length*2];
			System.arraycopy(cart,0,tmp,0,cart.length);
			cart = tmp;
		}
		cart[i++]=p;
	}
	
	void summary()
	{
		String itemList="";
		int sum =0;
		
		for(int i=0;i<cart.length;i++)
		{
			if(cart[i]==null)
				break;
			
			itemList += cart[i]+",";
			sum += cart[i].price;
		}
		
		System.out.println("구매한물건:"+ itemList);
		System.out.println("총합계:"+sum);
		System.out.println("남은금액:"+money);
		
	}

	
	
}
