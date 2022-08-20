import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    MyFrame(){
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(600,600);

      
      this.setLayout(null);
      label = new JLabel();
      label.setBounds(0, 0,100,100);
      label.setBackground(Color.green);
      label.addMouseListener(this);
      label.setOpaque(true);

    this.add(label);
      this.setVisible(true);


  }  
  public void mouseClicked(MouseEvent e){
      //System.out.println("you have clicked the mouse");

  }
  public void mousePressed(MouseEvent e){
    System.out.println("you havepressed it");
    label.setBackground(Color.yellow);
  }
  public void mouseReleased(MouseEvent e){
    System.out.println("you have released the mouse");
    label.setBackground(Color.green);
  }
  public void mouseEntered(MouseEvent e){
    System.out.println("you have entered");
  }
  public void mouseExited(MouseEvent e){
    System.out.println("you have entered");
  }

}