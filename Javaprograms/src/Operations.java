import java.util.*;
class Operations
{
	public static void main(String args[])
	{
	int a,b;
	System.out.print("enter two numbers");
	Scanner S=new Scanner(System.in);
	a=S.nextInt();
	b=S.nextInt();
	int sum,mult,mod,div;
	sum=a+b;
	mult=a*b;
	div=a/b;
	mod=a%b;
	    System.out.println("ADDITION");
	System.out.println(sum);
		System.out.println("MULTIPLICATION");
	System.out.println(mult);	
	    System.out.println("DIVISION");
	System.out.println(div);
		System.out.println("MODULUS");
	System.out.println(mod);
	}
}