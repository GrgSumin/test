import java.net.*;
import java.io.*;
public class Net {
    public static void main(String[] args) {
        try{
            System.out.println("Client Started");
            Socket soc = new Socket("localhost",5000);
        
            String msg = "Message from pokhara university";

            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(msg);



        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
