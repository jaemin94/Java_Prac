package ForWhileDoWhile;

import java.util.Scanner;

public class GooGooDan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int n = scan.nextInt();
		
		for(int i= 1; i < 10; i ++)
		{
			System.out.println(n + " x " + i + " = " + (n*i));
		}
		

	}

}
