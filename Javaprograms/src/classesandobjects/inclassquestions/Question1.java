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
	public double area(float r)
	{
	double area=3.14*r*r;
	return area;
    }
	public double circumference(float r)
	{
	double circum=2*3.14*r;
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
	Circle C=new Circle();
	area=C.area(r);
	cir=C.circumference(r);
	System.out.println("area is " +area);
	System.out.println("circumference is " +cir);
	}
}