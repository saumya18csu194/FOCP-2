import java.util.*;
public class JavaException3
{
	public static void main(String args[])
	{
	try{
      String str=null; 
      System.out.println(str.length());
    }  
	catch(NullPointerException obj){System.out.println(obj);}  
System.out.println("rest of the code.....");}
}
