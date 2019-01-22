import java.util.*;
class Circle
{
	double radius;
	String color;
	Circle()
	{
	radius=1.0;
	color="red";
	}
	Circle(double r)
	{
	this.radius=r;
	}
	Circle(double r,String col)
	{
	this.radius=r;
	this.color=col;
	}
	double set_radius(double r)
	{
    this.radius=r;
    return r;
	}
	double get_radius()
	{
    return radius;
	}
	String set_color(String col)
	{
    this.color=col;
    return col;
	}
	String get_color()
	{
    return color;
	}
	double get_area()
	{
	double area=3.14*radius*radius;
	return area;
	}
}
class Cylinder extends Circle
{
	double height;
	Cylinder()
	{
	height=1.0;
	}
	Cylinder(double r)
	{
	super(r);
	}
	Cylinder(double r,double h)
	{
	super(r);
	this.height=h;
	}
	Cylinder(double r,double h,String c)
	{
	this.height=h;
	super.color=c;
	}
	double set_height(double h)
	{
    this.height=h;
    return h;
	}
	double get_height()
	{
	return height;
	}
	double get_volume()
	{
	return (get_area()*height);
	}
}
class TestCylinder
{
	public static void main(String args[])
	{
	double ra,he,ar,vo;
	 Scanner S=new Scanner(System.in);
    Circle C=new Circle();
    Cylinder C1=new Cylinder();
    ra=C.get_radius();
    System.out.println("enter height");
    he=S.nextDouble();
    System.out.println("enter radius");
    ra=S.nextDouble();
   System.out.println("radius is" +C.get_radius());
   System.out.println("height is" +C1.get_height());
System.out.println("area is" +C.get_area());
System.out.println("volume is" +C1.get_volume());
	}
}