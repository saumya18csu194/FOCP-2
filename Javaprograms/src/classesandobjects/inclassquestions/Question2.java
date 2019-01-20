/* author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   purpose:Create a class called Date that includes three instance variables—a month (type int),
   a day (type int) and a year (type int). Provide a method displayDate that displays the month, day 
   and year separated by forward slashes (/).Write a test application named DateTest that demonstrates
   class Date’s capabilities */
   import java.util.*;
class Date
{
int month,day,year;
Date()
{
	month=1;
	day=1;
	year=1;
}
Date(int m,int d,int y)
{
	this.month=m;
	this.day=d;
	this.year=y;
}
void display_date()
{
	System.out.println(month + "/" + day + "/" + year );
}
}
class Question2
{
	public static void main(String args[])
	{
	int m,d,y;
	Date D=new Date();
	Date D1=new Date(1,1,2000);
	Scanner S=new Scanner(System.in);
    System.out.println("enter month of your birthday");
    m=S.nextInt();
    System.out.println("enter date of your birthday");
    d=S.nextInt();
    System.out.println("enter year of your birthday");
    y=S.nextInt();
    D.display_date();
    D1.display_date();
	}
}