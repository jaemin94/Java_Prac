package BaekJun;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요. ");
		int score = scan.nextInt();
		
		if(score >= 90)
		{
			System.out.println("A");
		}
		else if(score < 90 && score >=80)
		{
			System.out.println("B");
		}
		else if(score < 80 && score >=70)
		{
			System.out.println("c");
		}
		else if(score < 70 && score >=60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}

	}

}
