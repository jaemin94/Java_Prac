package CodeUp;

import java.util.Scanner;

public class Triangle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("홍수를 입력하세요. ");
		double n = scan.nextDouble();
		
		if(n%2==1)
		{
			System.out.println("홀수입니다.");
		}
		else
			System.out.println("홀수를 입력해주세요.");
		
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<n/2)
		{
			j=0;
			k=0;
			while(j<(n/2)-i)
			{
				System.out.print(" ");
				j++;
			}
			while(k<=i*2)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
