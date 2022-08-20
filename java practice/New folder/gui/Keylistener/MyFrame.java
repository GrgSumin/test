import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon image;
    MyFrame(){
        label = new JLabel();
        image = new ImageIcon("rocket.png");
        label.setBounds(0, 0,100,100);
        //label.setBackground(Color.blue);
        //label.setOpaque(true);
        label.setIcon(image);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(null);
        this.addKeyListener(this);
        this.add(label);
       
        this.setVisible(true);
    
    }
    public void keyTyped(KeyEvent e) {
        //it is invoked when a physical key is typed.uses keyChar , char output
       /* switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10,label.getY());
            break;
            case 'd':label.setLocation(label.getX()+10,label.getY());
            break;
            case 'w':label.setLocation(label.getX(),label.getY()-10);
            break;
            case 's':label.setLocation(label.getX(),label.getY()+10);
            break;*/
        }
    
    public void keyPressed(KeyEvent e) {
        // it is invoked when a physical key is pressed down.uses keyCode
        switch(e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-10,label.getY());
            break;
            case 39:label.setLocation(label.getX()+10,label.getY());
            break;
            case 38:label.setLocation(label.getX(),label.getY()-10);
            break;
            case 40:label.setLocation(label.getX(),label.getY()+10);
            break;
        }
    }

    public void keyReleased(KeyEvent e) {
       //it is invoked when a physical key is released.uses key 
       // System.out.println("You  released key code " + e.getKeyCode());
    
    }



}
