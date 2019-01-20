/* author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   PURPOSE- Create a class called Employee that includes three instance variables—a first name (type String), 
   a last name (type String) and a monthly salary (double). 
   Provide a constructor that initializes the three instance variables. 
   If the monthly salary is not positive, ask the user to re-enter a positive value. 
   Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
   Create two Employee objects and display each object’s yearly salary. 
   Then give each Employee a 10% raise and display each Employee’s yearly salary again. */
import java.util.*;
class Employee
{
	private String fname;
	private String lname;
	private double msalary,ysalary,nysalary;
	Scanner S =new Scanner (System.in);
	public Employee()
	{
	System.out.print("enter first name");
	fname=S.next();
	System.out.print("enter last name");
	lname=S.next();
	System.out.print("enter monthly salary");
	msalary=S.nextDouble();
	while(true)
	{if(msalary>0)
	break;}
	}
	public Employee(String fname, String lname, double msalary)
	{
	this.fname=fname;
	this.lname=lname;
	this.msalary=msalary;
	}
	public void cal_ysalary()
    {
    ysalary=msalary*12;
    }
    public void cal_nysalary()
    {
    nysalary=ysalary*0.1;
    }
    public void display()
    {
    System.out.print(fname+" "+lname+" "+ysalary+" "+ nysalary);
    }
}
    class EmployeeTests
    {
    public static void main(String args[])
    {
    Employee E1=new Employee();
    Employee E2=new Employee("Saumya", "Achantani", 8565600.00);
    E1.cal_ysalary();
    E1.cal_nysalary();
    E1.display();
    E2.cal_ysalary();
    E2.cal_nysalary();
    E2.display();
        }
    }
