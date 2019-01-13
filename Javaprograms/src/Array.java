import java.util.*;
class Array
{
	public static void main(String args[])
{
	int array[],flag=0,i,x;
	array=new int[10];
	System.out.println("enter elements");
	Scanner s=new Scanner(System.in);
	for (i=0;i<10;i++)
	array[i]=s.nextInt();
    System.out.print("enter element");
    x=s.nextInt();
    for(i=0;i<10;i++)
    {
    	if(array[i]==x)
    	{
    		flag=1;
    		break;
    	}
    	else
    	{
    		flag=0;
    	}
    }
    	if(flag==1)
    		System.out.println("element at"+(i+1));
    	else
    		System.out.println("not found");
}
   
}

