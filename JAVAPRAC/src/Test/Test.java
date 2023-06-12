package Test;

class Seller
{
	private int MyMoney;
	private int AppleCnt;
	private int price;
	
	public Seller(int MyMoney, int AppleCnt, int price) 
	{
		this.MyMoney = MyMoney;
		this.AppleCnt = AppleCnt;
		this.price = price;
	}

	public int Receive(int money) {
		
		MyMoney += money;
		int revcnt = money/price;
		AppleCnt -= revcnt;
		return revcnt;
	}
	
	void ShowInfo()
	{
		System.out.println("보유 금액 : " + MyMoney + "\n" + "사과 개수 : " + AppleCnt + "\n" + "개당가격 : " + price);
	}

	
}

class Buyer
{
	private int MyMoney;
	private int AppleCnt;
	
	public Buyer(int MyMoney, int AppleCnt) 
	{
		this.MyMoney = MyMoney;
		this.AppleCnt = AppleCnt;
	}

	public void Payment(Seller seller, int money)
	{
		int count;
		MyMoney-= money;
		count = seller.Receive(money);
		AppleCnt += count;
	}
	
	void ShowInfo()
	{
		System.out.println("보유 금액 : " + MyMoney + "\n" + "사과 개수 : " + AppleCnt);
	}
}


public class Test {

	public static void main(String[] args) {
		
		Seller seller = new Seller(100000,100,1000);
		Buyer buyer01 = new Buyer(10000,0);
		Buyer buyer02 = new Buyer(20000,0);
		Buyer buyer03 = new Buyer(30000,0);
		
		buyer01.Payment(seller,2000);
		buyer02.Payment(seller,5000);
		buyer03.Payment(seller,3000);
		System.out.println("--- 판매자 정보 ---");
		seller.ShowInfo();
		System.out.println("--- 판매자 정보 ---");
		System.out.println("- buyer01-");
		buyer01.ShowInfo();
		System.out.println("- buyer02-");
		buyer02.ShowInfo();
		System.out.println("- buyer03-");
		buyer03.ShowInfo();
	}

}
