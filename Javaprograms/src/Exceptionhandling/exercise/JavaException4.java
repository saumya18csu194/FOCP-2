import java.util.*;
public class JavaException4
{
	public static void main(String args[])
	{
	try{
		int i;
      String str="abc"; 
      i=Integer.parseInt(str); 
    }  
	catch(NumberFormatException obj){System.out.println(obj);}  
System.out.println("rest of the code.....");}
}
