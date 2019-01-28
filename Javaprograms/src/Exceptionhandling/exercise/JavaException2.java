import java.util.*;
public class JavaException2
{
	public static void main(String args[])
	{
	try{
      int a[]=new int[5];  
      a[6]=30;  
    }  
	catch(ArrayIndexOutOfBoundsException obj){System.out.println(obj);}  
System.out.println("rest of the code.....");}
}
