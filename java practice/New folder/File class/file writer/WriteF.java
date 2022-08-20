import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.*;


public class WriteF {
    public static void main(String[] args) throws FileNotFoundException
    {
       FileOutputStream fos = new FileOutputStream("file.txt"); 
       PrintWriter pw = new PrintWriter(fos);
       pw.println("I love coding");
       pw.println(56);
       pw.close();
    


    }
    
}
