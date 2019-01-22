import java.util.*;
class Vehicle
{
	void display()
	{
	System.out.println("this is a vehicle");
	}
}
class Bike extends Vehicle
{
	void display()
	{
	System.out.println("this is a bike");
	}
}
class Car extends Vehicle
{
	void display()
	{
	System.out.println("this is a car");
	}
}
class Test
{
	public static void main(String args[])
	{
	int a='N';
	Scanner S=new Scanner(System.in);
	System.out.println("enter an integer");
	a=S.nextInt();
	switch(a)
	{
	case 2:
	Bike B=new Bike();
	B.display();
	break;
	case 4:
	Car C=new Car();
	C.display();
	break;
	default:
	Vehicle V=new Vehicle();
	V.display();
}
}
}