package PRAC6;

public class Main {
	
	int value;
	
	static int abs(int value)
	{
		return value>=0 ? value : -value;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 5;
		System.out.println(value+"의 절대값:" + abs(value));
		
		value = -10;
		System.out.println(value+"의 절대값:" + abs(value));
	
	}

}


/*
  
   
   	public static void 실습6_2(String[] args) {
		// TODO Auto-generated method stub

		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
  
  
  	public static void 실습6_4(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.name ="홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
		
	}
 
 
 	public static void 실습6_5(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
		
		
	}
	
	
	public class 실습6_6 {
	
	static double getDistance(int x,int y, int x1,int y1)
	{
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getDistance(1,1,2,2));
		
		
	}
	
	public static void 실습6_7(String[] args) {
		// TODO Auto-generated method stub

		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));
		
		
	}
	
	public class 실습6_20 {
	
	public static int [] shuffle(int[] arr)
	{
		if(arr==null || arr.length==0)
			return arr;
		
		for(int i =0; i < arr.length; i++) {
			int j = (int)(Math.random()*arr.length);
		
		
		int tmp = arr[i];
		arr[i] = arr [j];
		arr[j] = tmp;
	}
	return arr;
	}
	
	

	public static void 실습6_22(String[] args) {
		// TODO Auto-generated method stub

		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
	
	
	public static boolean isNumber(String str)
	{
		if(str==null || str.equals(""))
			return false;
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch<'0' || ch>'9')
			{
				return false;
			}
		}
		
		return true;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="123";
		System.out.println(str+"는 숫자입니까? "+ isNumber(str));
		
		 str ="1234o";
		System.out.println(str+"는 숫자입니까? "+ isNumber(str));
	
	}
	
	
	public class 실습6_23 {
	
	
	public static int max(int[] arr)
	{
		if(arr==null || arr.length==0)
			return -999999;
		
		int max = arr[0];
		
		for(int i =1; i < arr.length;i++)
		{
			if(arr[i] > max)
				max =arr[i];
		}
		return max;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[] {}));
	
	}

	
	public class 실습6_24 {
	
	int value;
	
	static int abs(int value)
	{
		return value>=0 ? value : -value;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 5;
		System.out.println(value+"의 절대값:" + abs(value));
		
		value = -10;
		System.out.println(value+"의 절대값:" + abs(value));
	
	}
	
 */
