import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
public class LaunchPage  implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("Click magic");
    LaunchPage() {
        button.setBounds(100, 160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        
}
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            frame.dispose();
            NewWind myWindow = new NewWind();
        }

    }
}
