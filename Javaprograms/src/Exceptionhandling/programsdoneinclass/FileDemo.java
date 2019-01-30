import java.io.File;
public class FileDemo
{
public static void main(String[] args) {
File f = null;
String strs = "test.txt";
try
{
f = new File(strs);
String a = f.getAbsolutePath(); 
System.out.print("\n"+a);
int Length=5/0;
System.out.print("\t Length = " +f.length());            
} catch(Exception e) {e.printStackTrace();}
}
}
