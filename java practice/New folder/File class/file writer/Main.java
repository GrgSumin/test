import java.io.FileWriter;
import java.io.IOException;


public class Main {
	

	    public static void main(String[] args) {
	        try{
	            FileWriter writer = new FileWriter("poem.txt");
	        writer.write("fanta is fanta \n not a coke \n love is love \n not a joke \n");
            writer.append("(poem by Sumin)");
            writer.close();
	    }
	    catch(IOException e){
	        e.printStackTrace();
	    }
	}
	    
	

}

