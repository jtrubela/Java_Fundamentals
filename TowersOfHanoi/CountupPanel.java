import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CountupPanel extends JPanel {
	private final int DELAY = 1000;
	private int seconds;
	private Timer timer;
	private JLabel label;
	
	//-----------------------------------------
	//    Set up the panel.
	//-----------------------------------------

	public CountupPanel() {
		timer = new Timer(DELAY, new CountupListener());
		label = new JLabel("Prepare for Count");
		label.setFont(new Font("Helvetica",Font.PLAIN, 36));
		add(label);
		
		seconds = 0;
		
		setPreferredSize (new Dimension(400,100));
		setBackground (Color.cyan);
		timer.start();

	}
	
	private class CountupListener implements ActionListener{
		public void actionPerformed (ActionEvent event) {
			seconds += 1;
			label.setText(seconds+"");
			repaint();
			
		}
	}
}
