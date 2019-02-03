package com.ncu.assignment.main;
import java.util.*;
import com.ncu.assignment.validation.*;
import com.ncu.assignment.classes.*;
import com.ncu.assignment.exception.*;
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