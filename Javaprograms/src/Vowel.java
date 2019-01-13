import java.util.*;
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