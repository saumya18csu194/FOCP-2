class Rectangle
{

	int l,b;
	void display()
	{
	System.out.println((l*b));
	}
	Rectangle(int x,int y)
	{
	this.l=x;
	this.b=y;
	}
}
class Box extends Rectangle
{
	int h;
	void Display()
	{
	int a=l*b*h;
	System.out.println(a);
	}
    Box(int x,int y,int z)
    {
    super(x,y);
    this.h=z;
    }
}
class Test
{
	public static void main(String args[])
	{
	Box ob=new Box(1,1,2);
	ob.Display();
	}
}