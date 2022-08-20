
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
      //file reader = reads the content of a file as stream of characters one by one
      //  read() returns int value which contains the vyte value
      // when read() returns -1 ,there is no more data to be read
        try{
            FileInputStream reader = new FileInputStream("art.txt"); 
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    catch(IOException e){
        e.printStackTrace();
    }

}
}
