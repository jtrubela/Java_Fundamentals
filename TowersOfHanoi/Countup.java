import javax.swing.JFrame;

public class Countup{
	public static void main (String[] args) {
   	JFrame frame = new JFrame ("Counting");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new CountupPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
