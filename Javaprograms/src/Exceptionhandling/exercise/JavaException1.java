import java.util.*;
public class JavaException1
{
	public static void main(String args[])
	{
	try{
		int i,a,b;
System.out.println("enter a and b \n");
Scanner S=new Scanner(System.in);
 a=S.nextInt();
 b=S.nextInt();
 i=a/b;
 System.out.println(+i);
	}catch (ArithmeticException e){System.out.println(e);}
}
}