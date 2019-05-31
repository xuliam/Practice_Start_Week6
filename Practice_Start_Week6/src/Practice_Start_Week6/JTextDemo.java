package Practice_Start_Week6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextDemo extends JFrame{

	private JTextArea txtContent = new JTextArea();
	
	public JTextDemo() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("TEXT Demo for YOU!!");
		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
		initComponents();
	}
	
	private void initComponents() {
		JPanel contentPanel = (JPanel)getContentPane();
		contentPanel.setLayout(null);
		//txtContent.setBounds(20, 20, 100, 100);
		txtContent.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(txtContent);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(20, 20, 100, 25);
		
		contentPanel.add(scrollPane); 
	}
	public static void main(String[] args) {
		new JTextDemo();
	}
	
}
