package BaekJun;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a 정수를 입력하세요: ");
		int a = scan.nextInt();
		System.out.println("b 정수를 입력하세요: ");
		int b = scan.nextInt();
		
		if(a>b)
		{
			System.out.println(">");
		}
		else if(a<b)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("==");
		}

	}

}
