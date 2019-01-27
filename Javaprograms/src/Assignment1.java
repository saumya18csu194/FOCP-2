import java.util.*;
class Qualification
{
String qualName;
String university;
String institute;
float cgpa;
Qualification(String qual, String uni, String inst, float cg)
{ 
this.qualName = qual;
this.university = uni;
this.institute = inst;
this.cgpa= cg;
}
public String display_qualification()
{
System.out.println("Qualification Name: " + qualName + "\nUniversity Name: " + university + "\nInstitute Name: " + institute + "\nCGPA: " + cgpa);
return "";}
}
class Project
{

	String name;
	Date startDate;
	Date endDate;
	int startday, startmonth, startyear, endday, endmonth, endyear, r;
	String role;
	String[] responsibilities;

	Project(String name, int startday,int startmonth, int startyear, int endday, int endmonth, int endyear, String role ,int ra)
	{
		this.name = name;
		this.startDate = new Date(startday, startmonth, startyear);
		this.endDate = new Date(endday, endmonth, endyear);
		this.role = role;
		this.responsibilities = new String[ra];
		this.r = ra;
	}
	Project()
	{
		this.name = "";
		this.startDate = new Date(01,01,2000);
		this.endDate = new Date(01,01,2000);
		this.role = "";
		this.responsibilities = new String[100];
	}

	public void setStart(int startday, int startmonth, int startyear)
	{
		this.startday = startday;
		this.startmonth = startmonth;
		this.startyear = startyear;
	}
	
	public void setEnd(int endday, int endmonth, int endyear)
	{
		this.endday = endday;
		this.endmonth = endmonth;
		this.endyear = endyear;	
	}

	public void setResp(String[] resp)
	{
		for (int i= 0; i< r; i++) 
		{
			this.responsibilities[i] = resp[i];
		}
	}

	public String[] getResp()
	{

			return responsibilities;

	}


	public String displayProjects()
	{
		int i; 
		System.out.println("Name of project: "+ name);
		System.out.println("Start date: ");
		System.out.println(startDate.displayDate());
		System.out.println("End date: ");
		System.out.println(endDate.displayDate());
		System.out.println("Role: "+ role);		
		System.out.println("Responsibilities: ");


		for (i= 0; i< r; i++)
		{
			System.out.println(responsibilities[i]);
		}
			return "";
	}	

}
class Student
{
	String firstName;
	String lastName;
	String line1, line2, city, state;
	Address addr;
	int pinCode;
	int daydob, monthdob, yeardob;
	Date dob;
	String[] skills;
	Qualification[] qual;
	Project[] projects;
	String eMail;
	String contactNo;
	int k;
	Student(String fn, String ln, String l1, String l2, String c, String st, int pinC, int month, int day, int year,String em, String cn, int s, int p, int q)
	{
	this.firstName = fn;
	this.lastName = ln;
	this.addr = new Address(l1, l2, c, st, pinC);
	this.dob = new Date(day, month, year);
	this.skills = new String[s];
	this.qual = new Qualification[q];
	this.projects = new Project[p];
	this.eMail = em;
	this.contactNo = cn;
	}
	public void setDate1(int day, int month, int year)
	{
		this.daydob = day;
		this.monthdob = month;
		this.yeardob = year;
	}

	public String getDate1()
	{
		dob.setDate(daydob, monthdob, yeardob);
		return dob.displayDate();
	}


	public void setAddress(String l1, String l2, String c, String st, int pinC )
	{
		this.line1 = l1;
		this.line2 = l2;
		this.city = c;
		this.state = st;
		this.pinCode = pinC;
	}

	public Address getAddr()
	{
		System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pinCode);
		return addr;
	}

	public void setSkills(String[] sk)
	{
		this.skills = sk;
	}

	public void getSkills(int s)
	{
		
		System.out.println(skills);
		
	}

	public void setQual(Qualification[] ql)
	{
		qual = ql;
	}
	
	public Qualification[] getQual()
	{

			return qual;			

	}

	public void setProject(Project[] pr)
	{
		projects = pr;
	}


	public Project[] getProject()
	{

			return projects;

	}



	public void displayDetails(int p, int q, int s)
	{
		int i;

		System.out.println("\nStudent Name: " + firstName + " " + lastName);
		System.out.println("Date of birth: " + dob.displayDate());
		System.out.println("Email: " + eMail);
		System.out.println("Contact Number: " + contactNo);		
		System.out.println("Address ");
		System.out.println(addr.displayAddress());
		System.out.println("Skills: ");
		for(i= 0; i< s; i++)
		{
		System.out.println(skills[i]);
		}
		System.out.println("\nQualifications ");
		for(i= 0; i< q; i++)
		{
		System.out.println(qual[i].display_qualification());
		}
		System.out.println("Project Details: ");
		for(i= 0; i< p; i++)
		{
		System.out.println(projects[i].displayProjects());
		}
	}
}
class Date 
{
 
    int month;
    int day;
    int year;
     
    Date(int month, int day, int year) 
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setDate (int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
     


    public String displayDate () 
    {
        return (day + "/" + month + "/" + year);
    }
 
}
class Address
{

  String line1;
  String line2;
  String city;
  String state;
  int pinCode;

  	Address(String line1, String line2, String city, String state, int pinCode)
    { 
        this.line1= line1;
        this.line2= line2;
        this.city= city;
  		  this.state= state;
        this.pinCode= pinCode;
    }

    public void setAddr(String line1, String line2, String city, String state, int pinCode)
    {
      this.line1 = line1; 
      this.line2 = line2;
      this.city= city;
      this.state= state; 
      this.pinCode = pinCode;
    }


    public String displayAddress()
    {
      System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pinCode);
      return "";

    }

}

public class Assignment1
{
	public static void main(String args[])
	{
		String firstName, lastName, eMail, contactNo, line1, line2, city, state;
		String qualName, institute, university, name, role;
		float cgpa;
		int i, j, k, l, m, n, p, q, s, pinCode, daydob, monthdob, yeardob, startday, startmonth, startyear, endday, endmonth, endyear;		
		
		Scanner sa= new Scanner(System.in);

		System.out.println("Enter the number of students");
		n = sa.nextInt();
		Student[] student = new Student[n];
		for (i= 0; i< n; i++)
		{

		System.out.println("Enter First Name");
		firstName = sa.next();
		
		System.out.println("Enter Last Name");
		lastName = sa.next();

		System.out.println("Enter Address");
		
		System.out.println("Enter line1");
		line1 = sa.next();

		System.out.println("Enter line2");
		line2 = sa.next();

		System.out.println("Enter city");
		city = sa.next();

		System.out.println("Enter state");
		state = sa.next();

		System.out.println("Enter pincode");
		pinCode = sa.nextInt();		

		System.out.println("Enter Date of Birth");
		daydob = sa.nextInt();
		monthdob = sa.nextInt();
		yeardob = sa.nextInt();		

		System.out.println("Enter number of Skills");
		s= sa.nextInt();
		String[] sk = new String[s];
		for (m= 0; m< s; m++) 
		{
			System.out.println("Enter Skills");
			sk[m] = sa.next();
		}

		System.out.println("Enter number of Qualifications");
		q= sa.nextInt();
		Qualification[] ql = new Qualification[q];
		
		for (m= 0; m< q; m++) 
		{
			
			System.out.println("Enter details of Qualification" + (m+1));

			System.out.println("Enter qualification name");
			qualName = sa.next();

			System.out.println("Enter university");
			university = sa.next();

			System.out.println("Enter institute");
			institute = sa.next();

			System.out.println("Enter cgpa");
			cgpa = sa.nextFloat();
			
			ql[m]= new Qualification(qualName, university, institute, cgpa);

		}

		
			System.out.println("Enter number of projects");
			p = sa.nextInt();

			Project[] pr = new Project[p];
			for(m= 0; m< p; m++)
			{
			
				System.out.println("Enter project name");
				name = sa.next();

				System.out.println("Enter start date");
				startday = sa.nextInt();
				startmonth = sa.nextInt();
				startyear = sa.nextInt();
				System.out.println("Enter end date");
				endday = sa.nextInt();
				endmonth = sa.nextInt();
				endyear = sa.nextInt();
				System.out.println("Enter role");
				role = sa.next();
				System.out.println("Enter number of responsibilities");
				l = sa.nextInt();
				String[] resp = new String[l];
				System.out.println("Enter responsibilities");
for (j= 0; j< l; j++) 
				{
					resp[j] = sa.next();
				}
				pr[m] = new Project(name, startday, startmonth, startyear, endday, endmonth, endyear, role, l);
				pr[m].setStart(startday, startmonth, startyear);
				pr[m].setEnd(endday, endmonth, endyear);
			}
System.out.println("Enter Email");
		eMail = sa.next();

		System.out.println("Enter Contact Number");
		contactNo = sa.next();

		student[i] = new Student(firstName, lastName, line1, line2, city, state, pinCode, daydob, monthdob, yeardob, eMail, contactNo, s, q, p);
		student[i].setProject(pr);
		student[i].setSkills(sk);
		student[i].setQual(ql);
		student[i].setDate1(daydob, monthdob, yeardob);
		student[i].setAddress(line1, line2, city, state, pinCode);
		student[i].displayDetails(p, q, s);

		}
	}
}	