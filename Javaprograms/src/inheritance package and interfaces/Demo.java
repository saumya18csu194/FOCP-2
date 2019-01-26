// Using abstract methods and classes.
import java.util.*;
abstract class Figure {
double dim1;
double dim2;
Figure(double a, double b) {
dim1 = a;
dim2 = b;
}
//area is now an abstract method
abstract double area();
}
class Rectangle extends Figure {
Rectangle(double a, double b) {
super(a, b);
}
// override area for rectangle
double area() {
System.out.println("Inside Area for Rectangle.");
return dim1 * dim2;
}
}
class Demo
{
	public static void main(String args[])
	{
	double d1,d2,a;
	Scanner S=new Scanner(System.in);
	System.out.println("enter dimension1 and dimension 2");
    d1=S.nextDouble();
    d2=S.nextDouble();
    Rectangle R=new Rectangle(d1,d2);
    a=R.area();
   System.out.println("area is "+a); 
	}
}

