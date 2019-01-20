/* author :SAUMYA ACHANTANI 18CSU194
   version:1.0.0
   PURPOSE-  Write a Java program to display Pascal's triangle.   */
import java.util.*;
class Pascal{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nsp=n-1;
		int nst=row;
		int number;
		char ch;
		do{
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp=csp+1;
			}
			int cst=0;
			number=1;
			while(cst<=nst) {
				if(number!=0)
				System.out.print(number+" ");
				number=number*(row-cst-1)/(cst+1);
				cst=cst+1;
			}
			row=row+1;
			nsp=nsp-1;
			nst=nst+1;
			System.out.println();
		}
			System.out.print("Press N to EXIT else any key to continue :");
	        ch = scn.next().charAt(0);
	        if ((ch == 'N') || (ch == 'n'))
	        {
	        	break;
	        }
        } while (true);
	}
}