import javax.swing.JFrame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MyFrame extends JFrame implements ActionListener {
    JTextField textfield;
    JButton button;

    MyFrame() {
         textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(300,45));
        button = new JButton("submit");
        button.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(600,600);
        this.add(textfield);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("welcome " + textfield.getText());
            button.setEnabled(false);
;        }


    }
}
