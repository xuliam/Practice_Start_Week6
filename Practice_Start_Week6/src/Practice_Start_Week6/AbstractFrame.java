package Practice_Start_Week6;

import javax.swing.JFrame;

public class AbstractFrame extends JFrame {
	public AbstractFrame(int width, int height) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("swing's JFrame");
		setSize(width,height);
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
	}
}
