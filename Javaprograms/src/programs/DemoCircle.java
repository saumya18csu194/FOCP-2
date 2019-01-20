import java.lang.*;
class Circle
  {
  	int radius;
    double findArea(){
    return(3.14*radius*radius);
    }
    void displayArea(){
    System.out.println("Area of circle is " + findArea());
    }
}
class DemoCircle
{
	public static void main(String args[])
	{
	Circle A= new Circle();
	A.radius=2;
	A.displayArea();
}
}

