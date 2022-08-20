import javax.swing.*;
import java.awt.*;

public class NewWind {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("HOla");
    NewWind() {
        label.setBounds(0, 0,100,60);
        label.setFont(new Font(null,Font.BOLD,25));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

    }
}
