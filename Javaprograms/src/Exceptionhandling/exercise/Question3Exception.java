/*Create a class with a main( ) that throws an object of class Exception inside a try block.
Give the constructor for Exception a String argument.
Catch the exception inside a catch clause and print the String argument.
Add a finally clause and print a message to prove you were there.*/
import java.io.FileNotFoundException;
public class Question3Exception
{
    Question3Exception(String msg) 
    {
        msg = "this will execute";
        System.out.println(msg);
    }
public static void main(String[] args) throws Exception {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            throw new Exception("File not found.....");
        
        } finally {
            System.out.println("i was there");
        }
 
    }
}