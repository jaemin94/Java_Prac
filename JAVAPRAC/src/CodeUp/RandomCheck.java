package CodeUp;

import java.util.Scanner;

public class RandomCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int n = scan.nextInt();
		int[] check = new int[23];
	
		for(int i = 0; i <= n ; i++)
		{
			check[i] = (int)(Math.random()*n)+1;
			System.out.print(check[i] + " ");
		}
		
		
	}

}
