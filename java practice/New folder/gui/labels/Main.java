import javax.swing.*;
import java.awt.*;
public class Main {
    // label is a gui display area ffor a string of text image or both
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Welcome to my breathtaking project");
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        frame.setSize(450,450);
        frame.add(label);
        
        
        //frame.getContentPane().setBackground(Color.blue);
        ImageIcon image = new ImageIcon("index.png");
        Border border = BorderFactory.createLineBorder(Color.blue,4);  
        frame.setIconImage(image.getImage());
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.blue);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(-25);
        label.setBorder(border);
    }
}
