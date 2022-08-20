import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu file;
    JMenu edit;
    JMenu help;
    JMenuItem save;
    JMenuItem newfile;
    JMenuItem close;

    
    
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
         menuBar = new JMenuBar();
         file = new JMenu("File");
         edit = new JMenu("Edit");
         help = new JMenu("Help");

        save = new JMenuItem("Save");
         newfile = new JMenuItem("New File");
         close = new JMenuItem("Close");
        save.addActionListener(this);
        close.addActionListener(this);


        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        file.add(save);
        file.add(newfile);
        file.add(close);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==save) {
            System.out.println("it is saved");
        }
        if(event.getSource()==close) {
            System.exit(0);
        }
    }
}
