import java.util.*;
public class ABC 
{
public static void main(String args[]) 
{
double minutesInYear = 60 * 24 * 365;
Scanner S = new Scanner(System.in);
System.out.print("Input the number of minutes: ");
double min = S.nextDouble();
long years = (long) (min / minutesInYear);
int days = (int) (min / 60 / 24) % 365;
System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}