package PRAC6;

public class MyPoint {

	int x;
	int y;
	
	MyPoint(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	double getDistance(int x, int y)
	{
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
	
}
