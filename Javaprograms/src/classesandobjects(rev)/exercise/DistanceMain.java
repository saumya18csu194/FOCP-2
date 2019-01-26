/* author :SAUMYA ACHANTANI 18CSU194
  version:1.0.0
  purpose:Write a program to read two distances in feet and inches and find their sum.*/
import java.util.*;
class Distance
{
	float feet,inch;
	Scanner dist=new Scanner(System.in);
	Distance()
	{
	feet=0;
	inch=0;
	}
    Distance(float f,float i)
    {
    this.feet=f;
    this.inch=i;
    }
    public void set_f(float f)
    {
    this.feet=f;
    }
    public float get_f()
    {
    return feet;
    }
    public void set_i(float i)
    {
    this.inch=i;
    }
    public float get_i()
    {
    return inch;
    }
    public void setDist()
	{
    System.out.println("Enter feet: ");
    feet= dist.nextFloat();
    System.out.println("Enter inches: ");
    inch=dist.nextFloat();
	}
    public void sum(Distance d1,Distance d2)
    {
    int i=(int)d1.get_i()+(int)d2.get_i();
    feet=d1.get_f()+d2.get_f()+i/12;
    inch=i%12;
    System.out.println("sum of distance in feet :" +feet);
    System.out.println("sum of distance in inch :" +inch);
    }
}
class DistanceMain
{
	public static void main(String args[])
	{
	float f,i;
	Distance D1=new Distance();
	Distance D2=new Distance();
    Distance D3=new Distance();
	Scanner S=new Scanner(System.in);
	System.out.println("enter feet :");
	f=S.nextFloat();
	System.out.println("enter inch :");
	i=S.nextFloat();
    D1.set_f(f);
    D1.set_i(i);
    D2.setDist();
    D3.sum(D1,D2);
	}
}