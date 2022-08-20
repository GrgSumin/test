import javax.swing.*;
 class Menu_B 
 {
    JMenu file, edit,submenu;
    JMenuItem item1,item2,item3,item4;
    Menu_B(){
        JFrame frame = new JFrame("menubar");
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        submenu = new JMenu("New");

        item1 = new JMenuItem("project");
        item2 = new JMenuItem("folder");
        item3 = new JMenuItem("close");
        item4 = new JMenuItem("Save");

        menubar.add(file);
        menubar.add(edit);
        file.add(submenu);
        submenu.add(item1);
        submenu.add(item2);
        file.add(item3);
        file.add(item4);

        frame.setVisible(false);
        frame.setLayout(null);
        frame.setSize(400,500);


    }
    public static void main(String[] args){
       new Menu_B();
    }
}
