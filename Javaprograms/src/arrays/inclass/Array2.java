import java.util.*;
class Array2
{
	public static void main(String args[])
	{
	Scanner arr = new Scanner(System.in);
	int i,j,k=0;
	int array[][]=new int[5][5];
	System.out.println("enter two digits values :");
	for(i=0;i<5;i++)
	{
	for(j=0;j<5;j++)
	{
	do
      {   
      	if(k>=1)
      		System.out.println("enter the value again:");
	   array[i][j]= arr.nextInt();
	   k++;
  	  }while(array[i][j]>99);
  	    k=0;
  	}
   	}
       System.out.println("the array is:");
       for(i=0;i<5;i++)
       {
       	for(j=0;j<5;j++)
       	{
       		System.out.print(array[i][j]+" ");
       	}
       	System.out.println();
       }
       for(i=0;i<5;i++)
       {
       	for(j=0;j<5;j++)
       {
         if(array[i][j]%2==0)
         	continue;
         else
        {
          array[i][j]=array[i][j]*5;
         }     
       }
	   }
	 for(i=0;i<5;i++)
	 {
	 	for(j=0;j<5;j++)
	 	{
	 		System.out.print(arry[i][j]+" ");
	 	}   System.out.println();
	 }
}
}