package PRAC5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] abcCode= {
						 '`','~','!','@','#','$','%','^','&','*','(',')',
						 '-','_','+','=','|','[',']','{','}',';',':',',',
						 '.','/'	
						};
		
		char[] numCode= {'q','w','e','r','t','y','u','i','o','p'};
		
		String src ="abc123";
		String result= "";
		
		for(int i =0; i<src.length();i++)
		{
			char ch = src.charAt(i);
			
			if('a'<=ch && ch<='z')
			{
				result+= abcCode[ch-'a'];
			}else if('0'<=ch && ch<='9')
			{
				result+=numCode[ch-'0'];
			}
		}
		System.out.println("src :" + src);
		System.out.println("result :" + result);
	}

}

/*
 
 	public static void 실습5_3(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		sum = arr[0]
			 +arr[1]
			 +arr[2]
			 +arr[3]
		     +arr[4];
		
		System.out.println("sum :"+sum);
		
	}
	
	public static void 실습5_4(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr =
			{
			{5,5,5,5,5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
			};
		
		int total = 0;
		float average =0;
		
		total =( arr[0][0]
				+arr[0][1]
				+arr[0][2]
				+arr[0][3]
				+arr[0][4] )
				+
				( arr[1][0]
				+arr[1][1]
				+arr[1][2]
				+arr[1][3]
				+arr[1][4] )
				+
				( arr[2][0]
				+arr[2][1]
				+arr[2][2]
				+arr[2][3]
				+arr[2][4] )
				+
				( arr[3][0]
				+arr[3][1]
				+arr[3][2]
				+arr[3][3]
				+arr[3][4] );
		
//		for(int i=0;i<arr.length;i++) {
//			
//		
//			for(int j=0;j<arr[i].length;j++) {
//				total+=arr[i][j];}
//		}
		average = total/(float)(arr.length*arr[0].length);
		
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}

public static void 실습5_5(String[] args) {
		// TODO Auto-generated method stub

		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i =0; i <ballArr.length;i++)
		{
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			
		}
		
		System.arraycopy(ballArr,0,ball3,0,3);
		
		for(int i=0;i<ball3.length;i++)
		{
			System.out.print(ball3[i]);
		}
		System.out.println();
	}
 	
 	public static void 실습5_6(String[] args) {
		// TODO Auto-generated method stub

		int[] coinUnit= {500,100,50,10};
		
		int money = 2680;
		
		System.out.println("money="+money);
		
		for(int i =0; i<coinUnit.length;i++)
		{
			System.out.println(coinUnit[i]+"원:"+money/coinUnit[i]);
			money=money%coinUnit[i];
			
			
			
		}
	}
	
	public static void 실습5_7(String[] args) {
		// TODO Auto-generated method stub

		if(args.length!=1)
		{
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);;
		}
		
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500,100,50,10};
		int[] coin = {5,5,5,5};
		
		for(int i=0;i<coinUnit.length;i++)
		{
			int coinNum =0;
			
			coinNum = money/coinUnit[i];
			
			if(coin[i]>=coinNum)
			{
				coin[i]=coinNum;
			}else
			{
				coinNum=coin[i];
				coin[i]=0;
			}
			
			money-=coinNum+coinUnit[i];
			
			
			System.out.println(coinUnit[i]+"원:"+coinNum);
		}
		if(money>0)
		{
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		System.out.println("=남은 동전의 개수 =");
		
		for(int i=0;i<coinUnit.length;i++)
		{
			System.out.println(coinUnit[i]+"원:"+coin[i]);
		}
 
 		public static void 실습5_8(String[] args) {
		// TODO Auto-generated method stub

		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i=0;i<answer.length;i++)
		{
			counter[answer[i]-1]++;
		}
		
		for(int i=0;i<counter.length;i++)
		{
			
			System.out.print(counter[i]);
			
			for(int j=0; j<counter[i];j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void 실습5_9(String[] args) {
		// TODO Auto-generated method stub

		char[][] star = 
			{
					{'*','*',' ',' ',' '},
					{'*','*',' ',' ',' '},
					{'*','*','*','*','*'},
					{'*','*','*','*','*'},
				
			};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i =0; i<star.length;i++)
		{
			for(int j=0;j<star[i].length;j++)
			{
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<star.length;i++)
		{
			for(int j=0;j<star[i].length;j++)
			{
				int x=j;
				int y = star.length -1-i;
				
				result[x][y]=star[i][j];
			}
			
		}
		
		
		for(int i =0; i <result.length;i++)
		{
			for(int j=0;j<result[i].length;j++)
			{
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
 
 */
