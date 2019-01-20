import java.util.*;

class Address
{
	String fline,sline;
	long pin;
	Address(String first, String second, long p)
	{
		this.fline=first;
		this.sline=second;
		this.pin=p;
	}

	String getfirst()
	{
		return fline;
	}
	String getsecond()
	{
		return sline;
	}
	long getpin()
	{
		return pin;
	}
}

class Employee
{
	String name;
	double year, salary;
	Address address;

	Employee()
	{
		name="Ram";
		address=new Address("64C","Vasant Kunj",110070);
		year=1994;
	}
	Employee(String n, String f, String sl, long p, long y, long s)
	{
		name=n;
		address=new Address(f,sl,p);
		year=y;
		salary=s;
	}
	void Display()
	{
		System.out.println(name+"\t"+year+"\t\t\t"+address.getfirst()+" "+address.getsecond()+" "+address.getpin());
	}
}
public class EmployeeTest
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		String n,f,sl;
		long y,s,p;
		int c,i;
		System.out.println("Enter the number of employees");
		c=S.nextInt();
		Employee e[] = new Employee[c];
		for (i=0;i<c;i++)
		{
			System.out.println("Enter name");
		    n=S.next();
		    System.out.println("enter year");
		    y=S.nextLong();
		    System.out.println("enter first line of address");
		    f=S.next();
		    System.out.println("enter second line of address");
		    sl=S.next();
		    System.out.println("enter pin code");
		    p=S.nextLong();
		    System.out.println("enter salary");
		    s=S.nextLong();
		    e[i]= new Employee(n,f,sl,p,y,s);
		}
		System.out.println("Name \t Year of joining \t \t Address");
		for (i=0;i<c;i++)
		{
			e[i].Display();
		}
		Employee E=new Employee();
	E.Display();
	}
}