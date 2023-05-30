package day1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
		
		for(int i = 10; i<=15;i++)
		{	
			int result = 1;
			int n = i;
			while(n>0)
			{
				result *= n%10;
				n/=10;
				
				sum += result;
			}
		}
		System.out.println("답 : " + sum);
	}

}

/*
 
  	public static void 1000까지의 숫자주 3과 5의 배수들의 합(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			if(i%3==0 || i%5 ==0)
			{
				sum +=i;
			}
			
		}
		System.out.println(sum);
		
	}
  	
  
  	public static void 10~15까지의 각 숫자 분해하여 곱하기의 전체 합은 다음과 같다(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
		
		for(int i = 10; i<=15;i++)
		{	
			int result = 1;
			int n = i;
			while(n>0)
			{
				result *= n%10;
				n/=10;
				
				sum += result;
			}
		}
		System.out.println("답 : " + sum);
	}
  	
  	
 
 */
