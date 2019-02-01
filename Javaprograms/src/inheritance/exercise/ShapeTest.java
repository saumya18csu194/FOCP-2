import java.util.*;
 class ShapeTest
 {
 	public static void main (String args [])
 	{
 		Scanner S = new Scanner(System.in);
 		int r, l, w, s;
 		Circle c1 = new Circle();
 		Circle c2 = new Circle();
 		Rectangle r1 = new Rectangle();
 		Rectangle r2 = new Rectangle(); 	
 		Square s1 = new Square();
 		Square s2 = new Square(); 			
 		System.out.println("Enter color");
 		String c = S.next();
 		c2.setColor();
 		r2.setColor();
 		s2.setColor();
 		System.out.println("true if filled ");
 		Boolean b = S.nextBoolean();
 		c2.setFilled();
 		r2.setFilled();
 		s2.setFilled();
 		System.out.println("Enter radius of Circle");
 		r = S.nextInt();
 		c2.setRadius(r);
 		System.out.println("Details of Circle1");
 		System.out.println(c1.toString());
 		System.out.println("\n" + "Details of Circle2");
 		System.out.println(c2.toString());
 		System.out.println("Enter length of Rectangle");
 		l= S.nextInt();
 		r2.setLength(r);
 		System.out.println("Enter width of Rectangle");
 		w = S.nextInt(r);
 		r2.setWidth(r);
		System.out.println("Details of Rectangle1");
 		System.out.println(r1.toString());
 		System.out.println("\n" + "Details of Rectangle2");
 		System.out.println(r2.toString());
 		System.out.println("Enter side of Square");
 		s = S.nextInt();
 		s2.setSide(r);
		System.out.println("\n" + "Details of Square1");
 		System.out.println(s1.toString());
 		s2.setSide(s);
 		System.out.println("Details of Square2");
 		System.out.println(s2.toString());
 	}
 }