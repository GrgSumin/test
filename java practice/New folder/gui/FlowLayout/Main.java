import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;
public class Main {
    public static void main(String[] args) {
        //layout manager defines the natural layout for component within a class 
        // FLowLayout places component in a row , sized at their prefered sze;
        // if horizontal spance in the container is too small, layout
        //class will use other available row
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    frame.setSize(800, 600);
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(250,250));
    panel.setBackground(Color.GRAY);
    panel.setLayout(new FlowLayout());

    

    panel.add(new JButton("1"));
    panel.add(new JButton("2"));
    panel.add(new JButton("3"));
    panel.add(new JButton("4"));    
    panel.add(new JButton("5"));
    panel.add(new JButton("6"));
    panel.add(new JButton("7"));
    



    

    frame.add(panel);
    frame.setVisible(true);

    
    }
    
}
