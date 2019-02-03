package com.ncu.assignment.classes;
public class Student
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