public class Saumya1
{
  static void demo() throws IllegalAccessException {
    System.out.println("Inside demo.");
    throw new IllegalAccessException("demo.....");
}
public static void main(String args[]) 
{
    try {
      demo();
    } catch(IllegalAccessException e) {System.out.println(e);}
    System.out.println("rest of the code");
    }
  }
