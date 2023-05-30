package CodeUp;

import java.util.Scanner;

public class BallGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("공의 위치를 적으시오.");
		double ball = scan.nextDouble();
		
		if(ball>= 50 && ball <=60)
			System.out.println("승리");
		else
			System.out.println("패배");
	}

}
