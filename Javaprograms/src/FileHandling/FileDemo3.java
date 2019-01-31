import java.io.*;
import java.util.*;
class FileDemo3
{
	public static void main(String[] args)
	{
	File f=null;
	try{
	f=new File("File.txt");
	FileReader fout=new FileReader(f);
	BufferedReader bout=new BufferedReader(fout);

	Scanner sc=new Scanner(System.in);
	String search= sc.next();
	String sr;
	boolean flag=false;
	System.out.print("the contents of file are:");
	 
            while((sr= bout.readLine())!=null){
            System.out.println(sr);
            String[] strs =sr. split(" ");
            for(int i=0;i<strs.length;i++)
            	 if(strs[i].equals(search))
				 
				flag=true;
			break;
			}
		

if((sr=bout.readLine())==null && flag==false){
  System.out.print("\n not present");
}
else
{
	System.out.print("\n present");
}bout.close();}
catch (Exception e){ e.printStackTrace();}}}
