import java.io.*;
import java.util.*;
class FileDemo2
{
public static void main(String[] args) 
{
File f = null;
    try{
            f = new File("File.txt");
            int sno,cg;
            String fname,gr;
              FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	          Scanner sc = new Scanner(System.in); 
             System.out.print("\nEnter Serial number:");
               sno=bout.write(sc.nextInt());
              System.out.print("\nEnter first name:");
              fname=bout.write(sc.next());
                System.out.print("\nEnter CGPA:");
               cg=bout.write(sc.nextInt());
                System.out.print("\nEnter Grade:");
                gr=bout.write(sc.next().charAt(0));
            bout.close();
}catch (Exception e) { e.printStackTrace();}
      }   
    }