/* author :SAUMYA ACHANTANI 18CSU194
version:1.0.0
PURPOSE-Write a program to calculate the distance between two points (x1, y1) and (x2, y2). 
All numbers and return values should be of type double. */
import java.util.*;  //class definition
import java.lang.Math.*;  //for using square root and power function
class Point
{
private double x1;
private double x2;
Point() //non parameterised constructor
{
	this.x1=0;
	this.x2=0;
}
Point(double x1,double x2) //parameterised constructor
{
	this.x1=x1;
	this.x2=x2;
}
public void setvalue1(double x1)
{
  this.x1=x1;
}
public void setvalue2(double x2)
{
  this.x2=x2;
}  
public double getvalue1()
{
	return x1;
}
public double getvalue2()
{
	return x2;
}
double calcdistance(Point p2) 
{
double dist=Math.sqrt(Math.pow((getvalue1()-p2.getvalue1()),2)+Math.pow((getvalue2()-p2.getvalue2()),2)); //root((x1-x2)^2+(y1-y2)^2)
return dist;
}
}
class Distance //class application
{
public static void main(String args[])
{
	double distance,y1,y2,x1,x2;
	Scanner S = new Scanner(System.in);
	System.out.println("enter x1");
	x1=S.nextDouble();
	System.out.println("enter x2");
	x2=S.nextDouble();
	System.out.println("enter y1");
	y1=S.nextDouble();
	System.out.println("enter y2");
	y2=S.nextDouble();
    Point p1=new Point();
    p1.setvalue1(x1);
    p1.setvalue2(x2);
    Point p2=new Point();
    p2.setvalue1(y1);
    p2.setvalue2(y2);
    distance=p1.calcdistance(p2);
System.out.println("distance between points is" +distance);
}
}