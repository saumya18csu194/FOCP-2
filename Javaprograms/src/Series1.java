import java.util.*;
import java.lang.Math;
class Series1{

		public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
        int i; 			
        int n;			
        double x;		
        double sum=1;	 
        System.out.println("equation : 1+x+x^2/2+x^3/3+...+x^n/n");
        System.out.println("Enter value of x ");
        x = input.nextDouble();
        System.out.println("Enter number of terms,n :");
        n = input.nextInt();
        for (i=1; i<=n; ++i){
			sum += Math.pow(x,i) / i;
        }
        System.out.println( sum);
	}
}
