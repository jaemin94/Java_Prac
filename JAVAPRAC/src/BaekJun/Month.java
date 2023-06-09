package BaekJun;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요. ");
		int year = scan.nextInt();
		
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
		
	}

}
