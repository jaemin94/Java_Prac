package SingleArray;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("출력할 정수 개수를 입력하세요 : ");
		int n = scan.nextInt();
		
		int count =0;
		int[] num = new int[n];
		
		for(int i = 0 ; i < num.length; i++)
		{
			num[i] = (int)(Math.random()*4)+1;
			System.out.print(num[i] + " ");
		}
		
		System.out.println();
		System.out.println("확인할 정수를 입력하세요 : ");
		int v = scan.nextInt();
		if(num[0] == v)
		{
			count++;
		}
		
		System.out.println(count);
	}

}
