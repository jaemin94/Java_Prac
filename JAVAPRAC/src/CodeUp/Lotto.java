package CodeUp;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num1 = (int)(Math.random()*10)+1;
//		int num2 = (int)(Math.random()*10)+1;
//		int num3 = (int)(Math.random()*10)+1;
//		int num4 = (int)(Math.random()*10)+1;
//		int num5 = (int)(Math.random()*10)+1;
//		int num6 = (int)(Math.random()*10)+1;
//		int bonusnum = (int)(Math.random()*10)+1;
		int num1, num2, num3, num4, num5, num6, bonusnum;

		do {
		    num1 = (int) (Math.random() * 45) + 1;
		    num2 = (int) (Math.random() * 45) + 1;
		    num3 = (int) (Math.random() * 45) + 1;
		    num4 = (int) (Math.random() * 45) + 1;
		    num5 = (int) (Math.random() * 45) + 1;
		    num6 = (int) (Math.random() * 45) + 1;
		    bonusnum = (int) (Math.random() * 45) + 1;
		} while (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num1 == bonusnum ||
		         num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6 || num2 == bonusnum ||
		         num3 == num4 || num3 == num5 || num3 == num6 || num3 == bonusnum ||
		         num4 == num5 || num4 == num6 || num4 == bonusnum ||
		         num5 == num6 || num5 == bonusnum ||
		         num6 == bonusnum);

		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int n1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int n2 = scan.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int n3 = scan.nextInt();
		System.out.print("네번째 숫자를 입력하세요 : ");
		int n4 = scan.nextInt();	
		System.out.print("다섯번째 숫자를 입력하세요 : ");
		int n5 = scan.nextInt();
		System.out.print("여섯번째 숫자를 입력하세요 : ");
		int n6 = scan.nextInt();
		
		int count = 0;
		
		if(n1 == num1 || n1 == num2 || n1 == num3 ||  n1 == num4 || n1 == num5 || n1 == num6 || n1 == bonusnum)
			count ++;
		if(n2 == num1 || n2 == num2 || n2 == num3 ||  n2 == num4 || n2 == num5 || n2 == num6 || n2 == bonusnum)
			count ++;
		if(n3 == num1 || n3 == num2 || n3 == num3 ||  n3 == num4 || n3 == num5 || n3 == num6 || n3 == bonusnum)
			count ++;
		if(n4 == num1 || n4 == num2 || n4 == num3 ||  n4 == num4 || n4 == num5 || n4 == num6 || n4 == bonusnum)
			count ++;
		if(n5 == num1 || n5 == num2 || n5 == num3 ||  n5 == num4 || n5 == num5 || n5 == num6 || n5 == bonusnum)
			count ++;
		if(n6 == num1 || n6 == num2 || n6 == num3 ||  n6 == num4 || n6 == num5 || n6 == num6 || n6 == bonusnum)
			count ++;
		 System.out.println("당첨 번호는 : "  + num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6  + "\t" + bonusnum);
		System.out.println(count + "만큼 맞췃습니다.");
		if(count == 6)
			System.out.println("1등 당첨");
		else if(count == 6 && n1 == bonusnum && n2 == bonusnum && n3 == bonusnum && n4 == bonusnum && n5 == bonusnum && n6 == bonusnum)	
			System.out.println("2등 당첨");
		else if(count == 5)
			System.out.println("3등 당첨");
		else if(count == 4)
			System.out.println("4등 당첨");
		else if(count == 3)
			System.out.println("5등 당첨");
		else
			System.out.println("꽝");
	}

}
