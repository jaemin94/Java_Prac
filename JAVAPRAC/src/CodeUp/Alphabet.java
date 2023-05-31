package CodeUp;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
//		int num = scan.nextInt();
		char ch;
		String str = scan.nextLine();
		ch = str.charAt(0);
		switch(ch)
		{
		case 'A' : System.out.println("Best!!!");
		break;
		case 'B' : System.out.println("Good!!");
		break;
		case 'C' : System.out.println("Run!");
		break;
		case 'D' : System.out.println("Slowly~");
		break;
		default : System.out.println("What?");
		}

	}

}
