package CodeUp;

import java.util.Scanner;

public class BallGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("공의 위치를 적으시오.");
		int ball = scan.nextInt();
		
		if((ball>= 30 && ball <=40) ||(ball>= 60 && ball <=70) )
			System.out.println("승리");
		else
			System.out.println("패배");
		
	}

}
