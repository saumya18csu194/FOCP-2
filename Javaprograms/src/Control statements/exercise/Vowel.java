/* author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   purpose:	Write a Java program that asks the user to provide a single character from 	the alphabet. 
Print Vowel or Consonant, depending on the user input.
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.import java.util.*; */
class Vowel
{
	public static void main(String args[])
	{
	char ch;
	Scanner S=new Scanner(System.in);
	System.out.print("enter character");
	ch=S.next().charAt(0);
	if(ch>='A'&&ch<='Z')
	{if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		System.out.print("vowel");
	else 
		System.out.print("consonant");
	}
	else 
		System.out.print("error");
}
}