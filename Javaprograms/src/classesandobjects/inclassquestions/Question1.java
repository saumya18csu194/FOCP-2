/* author :SAUMYA ACHANTANI 18CSU194
version:1.0.1 **modified**
PURPOSE-Create a class Circle with instance variable radius and member functions:
a)	area( ) b) circumference( ) c) display( ). Write a test application named CircleTest that demonstrates class Circle’s capabilities.  */
import java.util.*;
class Circle
{
	float radius;
	Circle()
	{
	radius=1;
	}
	Circle(float r)
	{
	this.radius=r;
	}
	public double area()
	{
	double area=3.14*radius*radius;
	return area;
    }
	public double circumference()
	{
	double circum=2*3.14*radius;
	return circum;
    }
}
class Question1
{
	public static void main(String args[])
	{
	float r;
	double area,cir;
	Scanner S=new Scanner(System.in);
	System.out.println("enter radius");
    r=S.nextFloat();
	Circle C=new Circle(r);
	area=C.area();
	cir=C.circumference();
	System.out.println("*************CIRCLE 1***************");
	System.out.println("area is " +area);
	System.out.println("circumference is " +cir);
	Circle C1=new Circle();
	area=C1.area();
	cir=C1.circumference();
	System.out.println("*************CIRCLE 2***************"); //default value of radius 
	System.out.println("area is " +area);
	System.out.println("circumference is " +cir);
	}
}