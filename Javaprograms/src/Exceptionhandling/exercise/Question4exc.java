public class Question4exc
{
	private static Int i = null;	
	public static void main(String[] args) 
	{
		try {
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.err.println("Caught NullPointerException");
			e.printStackTrace();
		} 
		try {
			i = 10;
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.err.println("Caught NullPointerException");
			e.printStackTrace();
		} finally {
			System.out.println("Got through it");
		}
	}	
}