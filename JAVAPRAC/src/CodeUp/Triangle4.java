package CodeUp;

import java.util.Scanner;

public class Triangle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력하세요 : ");
		int n = scan.nextInt();
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<=n*2)
		{
			if(i<n)
			{		
				j=0;
				while(j<=i)
				{
					System.out.print("*");
					j++;
				}
				
			}
			else
			{
				j=0;
				while(j<=(n*2)-i)
				{
					System.out.print("*");
					j++;
				}
			}
			System.out.println();
			i++;
		}
		
	}

}
