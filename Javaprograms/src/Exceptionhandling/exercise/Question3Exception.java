import java.io.FileNotFoundException;
 
public class Question3Exception {
    Question3Exception(String msg) {
        msg = "this will execute";
        System.out.println(msg);
    }
    public static void main(String[] args) throws Exception {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            throw new Exception("File not found.....");
        
        } finally {
            System.out.println("i was here");
        }
 
    }
}