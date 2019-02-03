package com.ncu.assignment.classes;
public class Project
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