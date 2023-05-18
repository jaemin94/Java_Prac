package PRAC3;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A';
		
		char lowerCase = ('A' <= ch && ch<='z') ? (char)(ch=32):ch;
		
		System.out.println("ch:" + ch);
		System.out.println("ch to lowerCase :"+lowerCase);
		
	}

}


/*

public static void 실습3_2(String[] args) {
		// TODO Auto-generated method stub

		
		int numofApples = 123;
		int sizeofBucket = 10;
		int numofBucket = numofApples/sizeofBucket + (numofApples%sizeofBucket > 0 ? 1:0);
		
		System.out.println("필요한 바구니의 수 : "+numofBucket);
		
		
		public static void 실습3_3(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		String result = num > 0 ? "양수" : (num==0 ? "0" : "음수");
		System.out.println(result);
		
		public static void 실습3_4(String[] args) {
		// TODO Auto-generated method stub

		int num = 456;
		int result = num/100*100;
		System.out.println(result);
		
		public static void 실습3_5(String[] args) {
		// TODO Auto-generated method stub

		int num = 764;
		int result = num - (num%10) +1;
		System.out.println(result);

		public static void 실습3_6(String[] args) {
		// TODO Auto-generated method stub

		int num = 81;
		int result = 10-(num%10);
		System.out.println(result);
				
				
			public static void 실습3_7(String[] args) {
		// TODO Auto-generated method stub

		int fahrenheit= 100;
		float celcius = (float) ((5.0 / 9.0) * (fahrenheit -32));
				
		System.out.println("Fahrenheit : "+fahrenheit);
		System.out.println("Celcius : "+celcius);
						
		
			public static void 실습3_8(String[] args) {
		// TODO Auto-generated method stub

		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		
		char ch = 'A';
		ch = (char) (ch + 2);
		
		float f = 3/2f;
		long l = (long)3000*3000*3000;
		
		float f2=0.1f;
		double d = 0.1;
		
		boolean result = (float) d==f2;
		
		System.out.println("c =" + c);
		System.out.println("ch =" + ch);
		System.out.println("f =" + f);
		System.out.println("l =" + l);
		System.out.println("result =" + result);
		
		
		
		public static void 실습3_9(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'z';
		boolean b = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');

		
		System.out.println(b);
		
	}

*/