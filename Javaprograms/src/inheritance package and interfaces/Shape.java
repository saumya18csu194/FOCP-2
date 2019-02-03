class Shape
{
	String color;
	Boolean filled;
	Shape()
	{
	color="red";
	filled=true;
	}
	Shape(String c,Boolean b)
	{
	this.color=c;
	this.filled=b;
	} 
	public void getColor(String c)
	{
	this.color=c;
	}
	public String setColor()
	{
	return color;
	} 
	public void isFilled(Boolean f)
	{
	this.filled=f;
	}
	public Boolean setFilled()
	{
	return filled;
	} 
	public String toString()
    {
    return "Color: " + color + "\nFilled: " +filled;
    }
}