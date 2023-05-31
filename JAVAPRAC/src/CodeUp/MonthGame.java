package CodeUp;

import java.util.Scanner;

public class MonthGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도을 입력하세요 : ");
		int year = scan.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		
		switch(month)
		{
		case 1, 3, 5, 7, 8, 10, 12 : System.out.println(year + "년도 " + month + " 월은 31일까지 있습니다.");
		break;
		case 4, 6, 9, 11 : System.out.println(year + "년도 " + month + " 월은 30일 까지 있습니다.");
		break;
		case 2 : if((year%400 == 0) || (year%4==0 && year%100 != 0))
					System.out.println(year + "년도 "+ month + " 월은 29일까지 있습니다.");
				else
					System.out.println(year + "년도 "+ month + " 월은 28일가지 있습니다.");
		break;
		default : System.out.println("잘못된 월을 입력하였습니다.");
		}
		
	}

}
