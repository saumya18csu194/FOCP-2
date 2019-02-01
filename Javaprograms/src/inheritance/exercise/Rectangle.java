class Rectangle extends Shape 
{
	double width;
	double length;
	Rectangle()
	{
		width = 1.0;
		length = 1.0;
	}
	Rectangle(double w, double l) 
	{
		this.width = w;
		this.length = l;
	}
	Rectangle(double w,double l,String color,boolean filled) 
	{
		super(color,filled);
		this.width = w;
		this.length = l;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double w)
	{
		this.width = w;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double l)
	{
		this.length = l;
	}
	public double getArea() 
	{
		double area=length*width;
		return area;
	}
	public double getPerimeter()
	{
		double perimeter = 2*(length + width);
		return perimeter;
	}
	public String toString()
   {
    	return "Length = " + getLength() + "\nWidth = " +getWidth() + "\tArea: " +getArea() + "\nPerimeter: "  +getPerimeter() + "\t" + super.toString();
   }
}