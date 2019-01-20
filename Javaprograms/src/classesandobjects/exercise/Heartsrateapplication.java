/* author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   purpose:Create a class called HeartRates. The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). The class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include the following methods:
a)	a method that calculates and returns the person’s age (in years)
b)	a method that calculates and returns the person’s maximum heart rate (the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in Years) 
c)	a method that calculates and returns the person’s target heart rate (target heart rate is a range that’s 50–85% of your maximum heart rate. 
 */
    import java.util.*;
class Heart
{
	private String first_name;
	private String last_name;
	private int date,month,year=0;
	Heart(String fname,String lname,int d,int m,int y)
	{
	this.first_name=fname;
	this.last_name=lname;
	this.date=d;
	this.month=m;
	this.year=y;
	}
	void setfirstname(String fname)
	{
    first_name=fname;
	}
	String getfirstname()
	{
	return first_name;
	}
	void setlastname(String lname)
	{
    last_name=lname;
	}
	String getlastname()
	{
	return last_name;
	}
	public int getBirthDate() 
	{
        return date/month/year;
    }
	int calc_age()
	{
     int age=2019-year;
     return age;
	}
    int calc_heartrate()
    {
    int heartrate=220-calc_age();
    return heartrate;
    }
    public void targetHeartRate()
    {
    System.out.print("Target Heart Rate Range is: "+ calc_heartrate() * 0.50 + " to "+ calc_heartrate() * 0.85);
    }
}
class Heartsrateapplication
{
	public static void main(String args[])
	{
	String fname,lname; 
	Scanner Sa = new Scanner(System.in);
	System.out.println("enter first name");
	fname=Sa.next();
	System.out.println("enter last name");
	lname=Sa.next();
    System.out.println("Enter BirthDate: ");
        int month = Sa.nextInt();
        int date = Sa.nextInt();
        int year = Sa.nextInt();
        Heart myHeartRate = new Heart(fname,lname,month,date,year);
        System.out.println("Name: "+ fname +" " + lname);
        System.out.println("Age in years" +myHeartRate.calc_age());
        System.out.println("Maximum Heartrate: "+ myHeartRate.calc_heartrate());
        myHeartRate.targetHeartRate();
	}
}

