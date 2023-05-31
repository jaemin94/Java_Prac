package CodeUp;

import java.util.Scanner;

public class Square2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = scan.nextInt();
		
		int i = 1;
		int j = 0;
		
		while(i<=n)
		{
			j = 1;
			
			while(j<=n)
			{
				if(i==1 || i == n || j == 1 || j == n) // 조건을 주어 i 랑 j 가 1 또는 n 과 같을시 별출력 이외에는 공백
					System.out.print("*");
				else
					System.out.print(" ");
				
				j++;
			}
			
			System.out.println();
			i++;
		}
		
	}

}
