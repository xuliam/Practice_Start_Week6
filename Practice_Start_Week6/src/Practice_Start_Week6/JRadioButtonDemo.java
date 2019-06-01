package Practice_Start_Week6;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonDemo extends JFrame {
	private JRadioButton rbSex1 = new JRadioButton("Men");
	private JRadioButton rbSex2 = new JRadioButton("Women");
	private ButtonGroup groupSex = new ButtonGroup();
	
	public JRadioButtonDemo() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JRadioButton Demo at Night");
		setVisible(true);
		setSize(500,400);
		setLocationRelativeTo(null);
		initComponents();
	}

	private void initComponents() {
		JPanel contentPanel = (JPanel)getContentPane();
		contentPanel.add(rbSex1,BorderLayout.NORTH);
		contentPanel.add(rbSex2, BorderLayout.SOUTH);
		groupSex.add(rbSex1);
		groupSex.add(rbSex2);
	}
	public static void main(String[] args) {

		new JRadioButtonDemo();
	}

}
