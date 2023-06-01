package CodeUp;

import java.util.Scanner;

public class Multiple_of_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		double n =scan.nextDouble();
		
		if(n%3==0)
			System.out.println(1);
		else
			System.out.println(0);
		
	}

}
