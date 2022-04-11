import javax.swing.JFrame;

public class Countdown {
	public static void main (String[] args) {
		JFrame frame = new JFrame ("Countdown");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new CountdownPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
