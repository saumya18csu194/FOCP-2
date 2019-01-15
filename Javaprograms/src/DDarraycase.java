import java.io.*;
class DDarraycase
{

	public static void main(String args[])throws IOException
	{
		int a[][]=new int[5][5];
		int d[]=new int[25];
		int i,j,count=0,sum=0,n,x=0,sum1=0,y=0,z=5,m=0;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		
		System.out.println("enter elements of   array");
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
		        a[i][j]=Integer.parseInt(in.readLine());
		 }
		}
		System.out.println("enter 1 to display elements of array 2 for sum 3 for largest no. 4 smallest no. 5 for 2nd largest no. 6 for sum of alternate no.s 7 for count even no.s 8 for occurance of given no.");
		n=Integer.parseInt(in.readLine());
		switch(n)
		{
			case 1:
		     for(i=0;i<5;i++)
		     {
			   for(j=0;j<5;j++)
			    {
				  System.out.print(a[i][j]);
			    }
			    System.out.println();
	      	}
	      	break;
	      	case 2:
		      for(i=0;i<5;i++)
		        {
                  for(j=0;j<5;j++)
                  {
              	     sum=sum+a[i][j];
                  }
              }
              break;
              case 3:
              int b[]=new int[25];
              for(i=0;i<=5;i++)
              {
              	for(j=0;j<5;j++)
              	{
                  b[x]=a[i][j];
                  x++;
              	}
              }
              for(i=0;i<25;i++)
              {
              	for(j=i+1;j<25;j++)
              	{
                  if(b[i]<b[j])
                  {
                  	int temp=b[i];
                  	b[i]=b[j];
                  	b[j]=temp;
                  }
              	}
              } 
              System.out.println("largest no. is "+b[0]);
              break;
              case 4:
              int c[]=new int[25];
              for(i=0;i<=5;i++)
              {
              	for(j=0;j<5;j++)
              	{
                  c[x]=a[i][j];
                  x++;
              	}
              }
              for(i=0;i<25;i++)
              {
              	for(j=i+1;j<25;j++)
              	{
                  if(c[i]<c[j])
                  {
                  	int temp=c[i];
                  	c[i]=c[j];
                  	c[j]=temp;
                  }
              	}
              } 
              System.out.println(" smallest no. is "+c[24]);
              break;
              case 5:
              
              for(i=0;i<=5;i++)
              {
              	for(j=0;j<5;j++)
              	{
                  d[x]=a[i][j];
                  x++;
              	}
              }
              for(i=0;i<25;i++)
              {
              	for(j=i+1;j<25;j++)
              	{
                  if(d[i]<d[j])
                  {
                  	int temp=d[i];
                  	d[i]=d[j];
                  	d[j]=temp;
                  }
              	}
              } 
              System.out.println("second largest no. is "+d[1]);
              break; 
              case 6:
              for(i=0;i<=5;i++)
              {
              	for(j=0;j<5;j++)
              	{
                  if(i==j)
                   {
                   	sum1=sum1+a[i][j];
                   }

              	}
              }
              for(i=0;i<5;i++)
              {
                 sum1=sum1+a[y][z];
                   y++;
                   z--;
               }
               System.out.println("sum of alternate elements is "+sum1);
               break;
              case 7:
               for(i=0;i<5;i++)
		     {
			   for(j=0;j<5;j++)
			    {
				  if(a[i][j]%2==0)
					count++;
			    }
	      	}
	      	System.out.println("count of even no.s is "+count);
	      	break;  
	      	case 8:
	      	System.out.println("enter no. u want to find");
	      	int k=Integer.parseInt(in.readLine());
	      	 for(i=0;i<5;i++)
		     {
			   for(j=0;j<5;j++)
			    {
				  if(a[i][j]==k)
					{
						m++;
					}
			    }
	      	} 
	      	System.out.println("occurence of given no. is "+m);
	      	break;
	      	default:
	      	System.out.println("error");
         }
      }
              
}