import java.awt.*;
import javax.swing.*;
public class Main{
    public static void main(String[] args){
    //frame = a gui window to add components 
      JFrame frame = new JFrame("Frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      frame.setSize(400,400);  
      frame.setLayout(null);
      ImageIcon image = new ImageIcon("index.png");
      frame.setIconImage(image.getImage());
      frame.getContentPane().setBackground(Color.green);

    }

}