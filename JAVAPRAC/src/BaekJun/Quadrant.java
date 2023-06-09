package BaekJun;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("x 정수를 입력하세요. ");
		int x = scan.nextInt();
		System.out.println("y 정수를 입력하세요. ");
		int y = scan.nextInt();

		if(x > 0 && y > 0)
		{
			System.out.println(1);
		}
		else if(x< 0 && y > 0)
		{
			System.out.println(2);
		}
		else if(x< 0 && y < 0)
		{
			System.out.println(3);
		}
		else
		{
			System.out.println(4);
		}
		
		
	}

}
