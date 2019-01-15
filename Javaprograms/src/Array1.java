import java.util.*;
class Array1{
	public static void main(String args[])
	{
	Scanner array= new Scanner(System.in);
	int arr[]=new int[5];
	int i,j,k=0;
	System.out.println("enter the values in array between 10 nd 100:");
	for(i=0;i<5;i++)
	{
		for (j=0;j<5;j++)
		{
		do
		{
			if(k>=1)
         	System.out.println("enter again::");
			 arr[i]=array.nextInt();
			 k++;
		}
         while (arr[i]<10 || arr[i]>100);
         k=0;
     }
	}
	System.out.println("the array is:");
	for(i=0;i<5;i++)
	System.out.println(arr[i]);

	}
}
