package CodeUp;

import java.util.Scanner;

public class Soccer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("경기시간을 입력하세요 : ");
		int time = scan.nextInt();
		
		System.out.println("점수를 입력하세요 : ");
		int goal = scan.nextInt();
		
		if(time==90)
			goal++;
		else if(time%5 == 0)					
					goal++;
		else if(time%5 == 1)					
					goal++;					
		else if(time%5 == 2)					
					goal++;					
		else if(time%5 == 3)					
					goal++;					
		else if(time%5 == 4)					
					goal++;
					
				
				
			
		
		System.out.println("촤종점수 : " + goal);
	}

}
