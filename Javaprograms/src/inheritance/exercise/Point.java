import java.util.*;
class Point
{
public static void main(String args[])
{
	Scanner S=new Scanner(System.in);
	System.out.println("enter x,y,z");
	float x=S.nextFloat();
    float y=S.nextFloat();
	float z=S.nextFloat();
	Point3D p=new Point3D(x,y,z);
	String b;
	b=p.to_String();
//	for (int i=0;i<3;i++)
	//{
	System.out.println(b);
	//}
}	
}