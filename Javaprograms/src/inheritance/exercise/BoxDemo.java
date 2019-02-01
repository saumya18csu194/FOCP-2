/* author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   PURPOSE-3.Write an application that tests the functionalities of both these classes.*/
import java.util.*;
class BoxDemo
{
	public static void main(String args[])
	{
	float w,h,d,we;
	Scanner S=new Scanner(System.in);
	System.out.println("enter width");
	w=S.nextFloat();
	System.out.println("enter height");
	h=S.nextFloat();
	System.out.println("enter depth");
	d=S.nextFloat();
	System.out.println("enter weight");
	we=S.nextFloat();
	BoxWeight b1=new BoxWeight(w,h,d,we);
	System.out.println("------------*BOX 1*-----------");
	System.out.println("width of box1 is"+b1.get_width());
	System.out.println("height of box1 is"+b1.get_height());
	System.out.println("depth of box1 is"+b1.get_depth());
	System.out.println("weight of box1 is"+b1.get_weight());
	System.out.println("volume of box1 is"+b1.get_volume());
    	BoxWeight b=new BoxWeight();//testing non parameterised contructor's capability 
	System.out.println("------------*BOX 2*-----------");
	System.out.println("width of box2 is"+b.get_width());   
	System.out.println("height of box2 is"+b.get_height());
	System.out.println("depth of box2 is"+b.get_depth());
	System.out.println("weight of box2 is"+b.get_weight());
	System.out.println("volume of box2 is"+b.get_volume());
	}
}