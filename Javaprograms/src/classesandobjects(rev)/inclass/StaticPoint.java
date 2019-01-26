/* author :SAUMYA ACHANTANI 18CSU194
version:1.0.1
PURPOSE-Static method definition for calculating the distance between two points. */
import java.util.*;
import java.lang.*;
class Point
{
	static private double x1,x2,y1,y2; //static variables
	static void set() //static function
	{
		System.out.println("Enter value of x1, y1, x2, y2");
		Scanner input = new Scanner(System.in);
		x1=input.nextDouble();
		y1=input.nextDouble();
		x2=input.nextDouble();
		y2=input.nextDouble();
	}
	static public double Distance() //static function
	{
		double dist;
		dist=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		return dist;	
	}
}
class StaticPoint
{
	public static void main(String args[])
	{
	double d;
	Point.set();
	d=Point.Distance();
	System.out.println("distance is "+d);
	}
}