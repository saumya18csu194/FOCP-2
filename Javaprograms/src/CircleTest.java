class Circle
{
	int radius;
	double area()
	{
	return (3.14*radius*radius);
	}
	double circumference()
	{
	return(2*3.14*radius);
	}
	void setDim( int r)
	{
		radius=r;
	}
}
class CircleTest
{
	public static void main(String args[])
	{
	Circle C1=new Circle();
	double area;
	double circumference;
	C1.setDim(5);
	area= C1.area();
	circumference= C1.circumference();
	System.out.println("area is" + area);
	System.out.println("circumference is" + circumference);
	}
}