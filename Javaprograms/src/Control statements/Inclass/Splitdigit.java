 /*author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   purpose:Write an application that inputs one number consisting of five digits from  
  the user, separates the number into its individual digits in the same order 
  and prints the digits separated from one another by three spaces each. 
  c)    After a successful run, the program should ask the user 
  if he wants to try the program for some other value, and should exit only when the user wants to exit (by pressing the character ‘N’). */ 

import java.util.Scanner;

public class Splitdigit
 {
    public static void main (String[] args)
    {
        char ch='Y';
    Scanner scan = new Scanner (System.in);
    while(ch!='N')
    {
    System.out.print ("Enter a number that consist of 5 digits: ");
    int num =scan.nextInt();
    int digit1 =num / 10000;
    int digit2 =(( num % 10000) / 1000 );
    int digit3 =( ( num % 1000) / 100 );
    int digit4 = ( ( num% 100 ) / 10 );
    int digit5 = ( num % 10);
    System.out.print (digit1 +"\t");
    System.out.print(digit2 +"\t");
    System.out.print(digit3 +"\t");
    System.out.print(digit4 +"\t");
    System.out.println(digit5 +"\t");
    System.out.println("do you wish to continue?(enter N for NO)");
ch=scan.next().charAt(0);
}
}
 }