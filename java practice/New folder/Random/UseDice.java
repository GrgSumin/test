import javax.swing.*;
     
    public class UseDice extends JFrame{
	int result;
	Diceroller mydice = new DiceRoller(6);
	
	public static void main(String[] args){
	
	UseDice frame = new UseDice();
	frame.setSize(200,100);
	frame.createGUI();
	frame.setVisible(true);
		}

	private void createGUI(){
	result = mydice.roll();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	container window = getContentPanel();
	window.setLayout(new FlowLayout());
	JTextField = new JTextField("result is " + reuslt);
	window.add(textField);
}
	 
}
    
  