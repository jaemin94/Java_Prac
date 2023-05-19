package PRAC4;

import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 12322;
		int tmp = number;
		
		int result = 0;
		
		while(tmp!=0)
		{
			result = result *10 + tmp%10;
			
			tmp /=10;
		}
		
		if(number == result)
			System.out.println(number + "는 회문수입니다.");
		else
			System.out.println(number+"는 회문수가 아닙니다.");
		
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

		public static void 실습4_3(String[] args) {
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
	
	public static void 실습4_4(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		int s =1;
		int num =0;
		
		for(int i =1; sum<100; i++, s=-s)
		{
			num = i*s;
			sum+=num;
			
			if(sum >=100)
				break;

		}
		
		System.out.println("num : "+num);
		System.out.println("sum : "+sum);
	}
	
	public static void 실습4_5(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<=10;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			int i=0;
			while(i<=10)
			{
				int j=0;
				while(J<=i)
				{
					System.out.print("*");
					j++
				}
			System.out.println();
			i++
			}
				
	}

	public static void 실습4_6(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=6;j++)
			{
				if(i+j==6)
				
					System.out.println(i+"+"+j+"="+(i+j));
			}
		}
		
		
	}
	
	public static void 실습4_7(String[] args) {
		// TODO Auto-generated method stub
		
		int value = (int)(Math.random()+6)+1;
		
		System.out.println("values: "+ value);
		
	}


	public static void 실습4_8(String[] args) {
		// TODO Auto-generated method stub
		
	
		for(int i=0; i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(2*i+4*j==10)
		
				System.out.println("x="+i+","+"y="+j);
			}
			
		}
		
		public static void 실습4_9(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "12345";
		int sum = 0;
		
		
		
		for(int i =0; i<str.length();i++)
		{
			sum+=str.charAt(i)-'0';
		}
		
		
		System.out.println("sum=" + sum);
		
	}
	
	public static void 실습4_10(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;
		int sum = 0;
		
		while(num>0)
		{
			sum+=num%10;
			num/=10;
			
		}
		System.out.println("sum="+sum);
		
	}
	
	public static void 실습4_11(String[] args) {
		// TODO Auto-generated method stub
		
		//Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; //세번째 값
		
		System.out.print(num1+","+num2);
		
		for(int i=0; i<8; i++)
		{
			num3 = num1 + num2;
			System.out.print(","+num3);
			
			num1 = num2;
			num2 = num3;
		}
		
		public static void 실습4_12(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =2; i <=9; i++)
		{
			for(int j = 1; j<=3;j++)
			{
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void 실습4_13(String[] args) {
		// TODO Auto-generated method stub
		
		String value="12o34";
		char ch = ' ';
		boolean isNumber=true;
		
		for(int i=0;i<value.length();i++)
		{
			ch= value.charAt(i);
			
			if(!('0' <=ch && ch<='9'))
			{
				isNumber = false;
				break;
			}
		}
		
		if(isNumber)
		{
			System.out.println(value+"는 숫자입니다.");
		} else
		{
			System.out.println(value+"는 숫자가 아닙니다.");
		}
	}
	
	public static void 실습4_14(String[] args) {
		// TODO Auto-generated method stub
		
		int answer=(int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		
		Scanner s = new Scanner(System.in);
		
		do
		{
			count++;
			System.out.print("1과 100사이의 값을 입력하세요: ");
			input = s.nextInt();
			
			if(input > answer)
			{
				System.out.println("더 작은 수를 입력하세요. ");
			}else if(input < answer)
			{
				System.out.println("더 큰수를 입력하세요.");
			}
			else if(input == answer)
			{
				System.out.println("맞췃습니다.");
				System.out.println("시도횟수는" + count +"번입니다.");
				break;
				
			}
			
			
			
		}
		while(true);
	}
	
	
	public static void 실습4_15(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 12322;
		int tmp = number;
		
		int result = 0;
		
		while(tmp!=0)
		{
			result = result *10 + tmp%10;
			
			tmp /=10;
		}
		
		if(number == result)
			System.out.println(number + "는 회문수입니다.");
		else
			System.out.println(number+"는 회문수가 아닙니다.");
		
	}
	
*/