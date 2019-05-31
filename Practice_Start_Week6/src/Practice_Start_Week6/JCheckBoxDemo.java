package Practice_Start_Week6;

import java.awt.Rectangle;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckBoxDemo extends JFrame{
	private JCheckBox[] cbArray = new JCheckBox[3];
	private String[] cbTexts = {"single", "marraged","devoiced"};
	
	public JCheckBoxDemo() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Title");
		setSize(500, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		initComponents();
	}
	
	private void initComponents() {
		JPanel contentPanel = (JPanel)getContentPane();
		contentPanel.setLayout(null);
		Rectangle defaultRect = new Rectangle(50,50,120,30);
		for (int i = 0; i < cbArray.length; i++) {
			cbArray[i] = new JCheckBox(cbTexts[i]);
			if(i == 0 ) {
				cbArray[i].setBounds(defaultRect);
				}
				else {
					cbArray[i].setBounds(defaultRect.x, 
							(int)(cbArray[i-1].getY() +defaultRect.getHeight()),
							(int)defaultRect.getWidth(),
							(int)defaultRect.getHeight());
				}
			contentPanel.add(cbArray[i]);
			}
		}
	public static void main(String[] args) {
		new JCheckBoxDemo();
	}
	}
	

