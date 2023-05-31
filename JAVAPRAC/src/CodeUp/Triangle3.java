package CodeUp;

import java.util.Scanner;

public class Triangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력하세요 : ");
		int n = scan.nextInt();
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<n)
		{
			j=0;
			k=0;
			while(k<i)
			{
				System.out.print(" ");
				k++;
			}
			while(j<=n-i-1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
