  import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws UnsupportedAudioFileException,IOException,LineUnavailableException {
        Scanner s = new Scanner(System.in);
        File file = new File("Sailing - Telecasted.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);

      String response = "";
        
        while(response.equals("Q")){
            System.out.println("P= play, S= stop, R = restart, Q = quit");
            System.out.print("Enter your choice:");
             response = s.next();
            response = response.toUpperCase();
            switch(response){
                case ("P"):clip.start();
                break;
                default:System.out.println("not a valid response");
            }


        }
        clip.start();

    }
}