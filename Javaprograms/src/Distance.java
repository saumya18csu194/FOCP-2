import java.util.*;
import java.lang.Math.*;
class Point
{
private double x1;
private double x2;
Point()
{
	this.x1=0;
	this.x2=0;
}
Point(double x1,double x2)
{
	this.x1=x1;
	this.x2=x2;
}
void setvalue1(double x1)
{
  this.x1=x1;
}
 void setvalue2(double x2)
{
  this.x2=x2;
}  
double getvalue1()
{
	return x1;
}
double getvalue2()
{
	return x2;
}
double calcdistance(Point p2) 
{
double dist=Math.sqrt(Math.pow((getvalue1()-p2.getvalue1()),2)+Math.pow((getvalue2()-p2.getvalue2()),2));
return dist;
}
}
class Distance
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