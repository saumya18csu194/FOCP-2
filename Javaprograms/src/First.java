import java.util.*;
class First
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int i,j;
		int arr[][]= new int[5][5];
		System.out.println("Enter upto two digit nos.");
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				do
				{
					arr[i][j]= scan.nextInt();
				}
				while(arr[i][j]>999);
			}
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(arr[i][j]);
				if(arr[i][j]%2==0)
				{
					continue;
				}
				else
				{
					arr[i][j]=arr[i][j] * 2 ;
				}
			}
		}
        System.out.println("Double of odd");
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print( arr[i][j] + " " );
			}
			System.out.println();
		}
	}
}