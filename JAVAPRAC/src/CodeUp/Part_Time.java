package CodeUp;

import java.util.Scanner;

public class Part_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int day = scan.nextInt();
		
		if(day == 1 || day == 3 || day == 5 || day == 7)
			System.out.println("Oh My God");
		else
			System.out.println("Enjoy");
	}

}
