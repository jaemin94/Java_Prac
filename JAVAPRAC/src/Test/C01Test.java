package Test;

import java.util.Scanner;

public class C01Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("높이를 입력 :");
		int n = scan.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i <n)
		{
			j=0;
			while(j<=(n-2)-i)
			{
				System.out.print(" ");	
				j++;
			}
			k=0;
			while(k<=2*i)
			{
				System.out.print("*");
				k++;
			}			
			i++;
			System.out.println();
		}
	}

}
