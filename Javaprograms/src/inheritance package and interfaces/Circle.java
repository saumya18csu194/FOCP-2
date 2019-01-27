class Circle extends Shape
{
	double radius;
	Circle()
	{
		radius=1.0;
	}
	Circle(double r)
	{
    this.radius=r;
	}
	Circle(double r,String color,boolean filled)
	{
		super(color,filled);
		this.radius = r;
	}
	
	public double getRadius ()
	{
		return radius;
	}
	
	public void setRadius (double r)
	{
		this.radius = r;
	}
	public double getArea()
	{
		double area = 3.14* radius*radius;
		return area;
	}
	public double getPerimeter()
	{
		double perimeter = 2*3.14*radius;
		return perimeter;
	}
	public String toString()
   {
      return "Radius" + radius + "\t Area: " + getArea() + "\t Perimeter: " + getPerimeter() + "\t" + super.toString();
   }

}