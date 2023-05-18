package PRAC4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		int totalsum=0;
		for(int i=0; i <=10; i++)
		{
			sum +=i;
			totalsum += sum;
		}
		
		System.out.println("totalsum :" + totalsum);
	}

}


/*

	public static void 실습4_2(String[] args) {
		// TODO Auto-generated method stub
		
		int num =0;
		
		for(int i=0; i <=20; i++)
		{
			if(i%2!=0 && i%3!=0)
				num +=1;
			
		}
	
		System.out.println("num:" + num);
		
	}



*/