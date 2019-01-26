/* author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   purpose:Create a class Employee that includes the following: name, year of joining, salary, address. 
   Write a test application named EmployeeTest that demonstrates class Employee’s capabilities by displaying the output as follows for: (50 minutes)
Name        Year of joining        Address
Ram           1994                64C Vasant Kunj 110070
Sam            2000                68D Dwarka 110037
Ana            1999                26B R.K Puram 110022 
c)	The application should have the following functionality: 
i.	Ask the user for the number of employees for which information is required. 
ii.	An Employee array of appropriate size should be defined based on the user input.
iii.	Display the information of all the employees in a tabular format. */
import java.util.*;
class Employee
{
	String name,address;
	int yoj;
	long salary;
	Employee()
	{
    name="Ram";
    yoj=1994;
    address="64C Vasant Kunj 110070";
	}
	Employee(String n,int y,String addr,long s)
	{
	this.name=n;
	this.yoj=y;
	this.address=addr;
	this.salary=s;
	}
	void Display()
	{
	System.out.println(name+"\t"+yoj+"\t"+address);
	}
}
class Question4 /*EmployeeTest*/
{
	public static void main(String args[])
	{
	String na,add;
    int yr,i,j=0;
    long sal;
	   System.out.println("please enter number of employees");
	   Scanner Sl=new Scanner(System.in);
	int c=Sl.nextInt();
	Employee e[] = new Employee[c];
	for (i=0;i<c;i++)
		{
	System.out.println("Enter name");
    na=Sl.next();
    System.out.println("enter year of joining");
	yr=Sl.nextInt();
	System.out.print("Insert a number: ");
	int ad= Sl.nextInt();
		System.out.println("enter address");
    Sl.nextLine();
	add=Sl.nextLine();
    System.out.println("enter salary");
    sal=Sl.nextLong();
	e[i]= new Employee(na,yr,add,sal);
	}
	System.out.println("Name\tYear\tAddress");
	for (i=0;i<c;i++)
	{
	e[i].Display();
	}
		Employee E=new Employee();
	E.Display();
    }
}