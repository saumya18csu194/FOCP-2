class Box
{
double width;
double height;
double depth;
double volume()
{
return width*height*depth;
}
void setDim(double w,double h, double d)
{
width=w;
height=h;
depth=d;
}
}
class BoxDemo3
{
public static void main(String arg[])
{
	Box box1=new Box();
	Box box2=new Box();
	double vol;
	box1.setDim(10,20,15);
	box2.setDim(3,6,9);
	vol=box1.volume();
	System.out.println("volume is"+ vol);
	vol=box2.volume();
	System.out.println("volume is"+ vol);
}
}
