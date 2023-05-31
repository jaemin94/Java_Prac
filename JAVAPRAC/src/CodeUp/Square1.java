package CodeUp;

import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("길이를 입력하세요 : ");
		int n = scan.nextInt();
		
		int i = 0;
		int j = 0;
		
		while(i<n)
		{
			j=0;
			while(j<(n))
			{
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
		
	}

}
