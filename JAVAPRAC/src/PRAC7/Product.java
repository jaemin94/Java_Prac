package PRAC7;

public class Product {

	int price;
	int bonusPoint;
	
	Product(int price)
	{
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	class Tv extends Product{
		
		
	
		Tv(int price)
		{
			this.price = price;
			bonusPoint = (int)(price/10.0);
		}
		
		public String toString() {
			return "TV";
		}
		
		
		
	}
	
}
