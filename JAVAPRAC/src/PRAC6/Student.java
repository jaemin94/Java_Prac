package PRAC6;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math)
	{
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	
	int getTotal()
	{
		int result = kor + eng + math;
		return result;
	}
	
	float getAverage()
	{
		float result = getTotal()/3; 
		return result;
	}
	
	String info()
	{
		return name +','+ ban + ','+ no + ','+ kor + ','+ eng + ','+ math + ','+ getTotal() + ','+ getAverage();
	}
	
}
