package flag;
import java.awt.*;
import java.awt.event.*;

public class NepalFlag extends Frame {
	NepalFlag(){
		setTitle("Nepal Flag");
		setSize(850,850);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLACK); //rod banako
		g.fillRect(30,30,10,500);
		
		g.setColor(Color.BLUE);// falg ko border
		int x1[] = {40,340,120,540,40,40};
		int y1[] = {30,230,230,530,530,30};
	    g.fillPolygon(x1,y1,5);
	}
 public static void main(String[] args) {
	 new NepalFlag();
 }
}
