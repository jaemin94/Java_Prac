package PRAC8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int answer = (int) (Math.random() * 100) + 1;
	        int input = 0;
	        int count = 0;
	        
	        do 
	        {
	        	count++;
	        	System.out.print("1~100 사이의 값을 입력하세요 :");
	        	
	        	try
	        	{
	        		input = new Scanner(System.in).nextInt();
	        	}
	        	catch(java.util.InputMismatchException e)
	        	{
	        		System.out.println("비정상적인 값입니디ㅏ. 다시 입력하세요");
	        		continue;
	        	}
	        	
	        	if(answer > input)
	        		System.out.println("더 큰 수를 입력하세요");
	        	else if(answer < input)
	        		System.out.println("더 작은 수를 입력하세요");
	        		
	        }
	        while(answer!=input);
	        System.out.println("정답입니다.");
	        System.out.println(count +"번 만에 맞췄습니다.");
	        
		
		
	}

}


/*
  public static void 실습8_8(String[] args) {
		// TODO Auto-generated method stub

		 int answer = (int) (Math.random() * 100) + 1;
	        int input = 0;
	        int count = 0;
	        
	        do 
	        {
	        	count++;
	        	System.out.print("1~100 사이의 값을 입력하세요 :");
	        	
	        	try
	        	{
	        		input = new Scanner(System.in).nextInt();
	        	}
	        	catch(java.util.InputMismatchException e)
	        	{
	        		System.out.println("비정상적인 값입니디ㅏ. 다시 입력하세요");
	        		continue;
	        	}
	        	
	        	if(answer > input)
	        		System.out.println("더 큰 수를 입력하세요");
	        	else if(answer < input)
	        		System.out.println("더 작은 수를 입력하세요");
	        		
	        }
	        while(answer!=input);
	        System.out.println("정답입니다.");
	        System.out.println(count +"번 만에 맞췄습니다.");
	        
		
		
	}
  
  

 */
 

