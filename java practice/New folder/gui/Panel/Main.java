import javax.swing.*;
import java.awt.*;
public class Main{
    // jponel is a gui componet that functions as a container to g=hold another container
public static void main(String[] args){
    ImageIcon image = new ImageIcon("index.png");
    JLabel label = new JLabel();
    label.setIcon(image);


    label.setText("Hola");
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.RIGHT);
    label.setBounds(100,100,75,75);
    
    JPanel redpanel = new JPanel();
    redpanel.setBackground(Color.red);
    redpanel.setBounds(50, 0,200,250);
    redpanel.setLayout(new BorderLayout());
    JPanel bluepanel = new JPanel();
    bluepanel.setBackground(Color.blue);
    bluepanel.setBounds(200,0,200,250);
    JPanel greenpanel = new JPanel();
    greenpanel.setBackground(Color.green);
    greenpanel.setBounds(0,250,500,250);
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(450,450);
    frame.setVisible(true);
    frame.add(redpanel);
    redpanel.add(label);
    frame.add(bluepanel);
    frame.add(greenpanel);
    
}
}