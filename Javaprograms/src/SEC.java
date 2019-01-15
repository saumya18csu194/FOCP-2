import java.util.*;

class SEC
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int i,n,sum=0,ln,sn,sln,counte=0,sumalt=0,j,k;
		int arr[]= new int[5];
		int fre[]= {0,0,0,0,0};
		System.out.println("Enter 5 integer nos.");
		for(i=0;i<5;i++)
		{
			arr[i]= scan.nextInt();
		}
		ln=arr[0];
		for(i=1;i<5;i++)
			{
				if(arr[i]>ln)
				{
					ln=arr[i];
				}
			}
		sn=arr[0];
		for(i=1;i<5;i++)
			{
				if(arr[i]<sn)
				{
					sn=arr[i];
				}
			}
		sln=arr[0];
		for(i=1;i<5;i++)
			{
				if(arr[i]>sln && arr[i]!=ln)
				{
					sln=arr[i];
				}
			}
		do
		{	
			System.out.println(" Press 1 for viewing elements \n Press 2 for viewing the sum of all elements \n Press 3 for viewing the largest no. in the array \n Press 4 for viewing the smallest no. in the array \n Press 5 for viewing the second largest no. in the array \n Press 6 for viewing the sum of alternate no. \n Press 7 for viewing the count of even numbers in the array\n Press 8 for viewing the occurrence of a given number in the array and its frequency");
		    n = scan.nextInt();
			switch(n)
			{
				case 1:{
							for(i=0;i<5;i++)
							{
								System.out.println(arr[i]);
							}
							break;
						}
				case 2:{
							for(i=0;i<5;i++)
							{
								sum = sum+arr[i];
							}
							System.out.println("Sum of all nos. is " +sum);
							break;
						}
				case 3:{
							System.out.println("Largest no is " +ln );
							break;
						}
				case 4:{
							System.out.println("Smallest no is " +sn );
							break;
						}
				case 5:{
							System.out.println("Second largest no is " +sln );
							break;
						}
				case 6:{
							for(i=0;i<5;i=i+2)
							{
								sumalt = sumalt+arr[i];
							}
							System.out.println("Sum of alternate nos. is " +sumalt);
							break;
						}		
				case 7:{
							for(i=0;i<5;i++)
							{
								if(arr[i]%2==00)
								{
									counte++;
								}
							}
							System.out.println("Count of even nos. is " +counte);
							break;
						}
				case 8:{
							for(i=0;i<5;i++)
							{
								for(j=0;j<5;j++)
								{
									if(arr[i]==arr[j])
									{
										fre[i]++;
									}
								}
							}
							for(i=0;i<5;i++)
							{
								if(i!=0)
								{
									for(j=0;j<i;j++)
									{	
										if(arr[j]==arr[i])
											break;
										else
										{	
											System.out.println("Frequency of " + arr[i] +" is " +fre[i]);
											break;
										}
									}
								}
								else
									System.out.println("Frequency of " + arr[i] +" is " +fre[i]);
							}
							break;
						}
			}
			System.out.println("Press 1 to try again");
			k= scan.nextInt();
		}
		while(k==1);
	}
}