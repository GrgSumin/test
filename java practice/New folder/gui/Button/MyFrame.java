import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    MyFrame() {
        ImageIcon image = new ImageIcon("check.png");
        button = new JButton();
        button.setBounds(100,100,200,60);
        button.setText("Click me");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setBackground(Color.GRAY);;
        button.setBorder(BorderFactory.createEtchedBorder());

        button.addActionListener(this);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(500,500);
       this.setLayout(null);
       this.setVisible(true); 
       this.add(button);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("yak");

        }
    }
}












