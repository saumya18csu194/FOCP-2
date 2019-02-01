class Square extends Rectangle
{
	Square()
	{
		super();
	}
	Square(double side)
	{
		super(side,side);
	}
	Square(double side,String color,boolean filled)
	{
		super(side,side,color,filled);
	}
	public void setSide(double side)
	{
		super.setLength(side);
		super.setWidth(side);
	}
	public double getSide()
	{
		return super.getLength();
	}
	public void setLength(double side)
	{
		super.setLength(side);
	}
	public void setWidth(double side)
	{
		super.setWidth(side);
	}
	public String toString()
   {
    	return "Side = " +getSide() + "\t Area: " +getArea() +"\tPerimeter: " +getPerimeter() + "\t" + "Color: " + super.setColor() + "\tFilled: " +super.setFilled();
   }
}