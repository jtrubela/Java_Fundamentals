import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CountdownPanel extends JPanel {
	private final int DELAY = 1000;
	private int seconds;
	private Timer timer;
	private JLabel label;
	
	//-----------------------------------------
	//    Set up the panel.
	//-----------------------------------------

	public CountdownPanel() {
		timer = new Timer(DELAY, new CountdownListener());
		label = new JLabel("Prepare for Countdown");
		label.setFont(new Font("Helvetica",Font.PLAIN, 36));
		add(label);
		
		seconds = 10;
		
		setPreferredSize (new Dimension(400,100));
		setBackground (Color.cyan);
		timer.start();

	}
	
	private class CountdownListener implements ActionListener{
		public void actionPerformed (ActionEvent event) {
			seconds -= 1;
			label.setText(seconds+"");
			if (seconds == 0) {
				timer.stop();
			}
			repaint();
			
		}
	}
}
