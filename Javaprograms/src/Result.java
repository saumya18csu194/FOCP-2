class Result
{
 public static void main(String args[])
 {
 	int num1,num2;
 	boolean bool1,bool2;
 	num1=10;
 	num2=15;
 	if(10>15)
 		System.out.println("10 is greater than 15");
 	else if(10<15)
 		System.out.println("15 is greater than 10");
    System.out.println(15>10); //result will come in terms of boolean value 
 	bool1=true;
 	bool2=false;
 	System.out.println(bool1&&bool2);
 	System.out.println(bool1||bool2);
 	System.out.println(!bool1);
 	System.out.println(!bool2);
 	System.out.println(!(bool1&&bool2));
 	System.out.println(!(bool1||bool2));
 }
}





