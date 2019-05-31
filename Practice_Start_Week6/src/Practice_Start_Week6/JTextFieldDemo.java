package Practice_Start_Week6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame{
	private JTextField txtContent = new JTextField();
	private JButton btnPrint = new JButton("PRINT");
	
	public JTextFieldDemo() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JText First Demo");
		setSize(500, 400);
		setVisible(true);
		initComponents();
		setLocationRelativeTo(null);
	}
	
	private void initComponents() {
		//All components add in here
		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setLayout(null);
		
		txtContent.setBounds(40, 40, 120, 20);
		contentPane.add(txtContent);
		
		btnPrint.setBounds(40, 70, 80, 30);
		contentPane.add(btnPrint);
		
		btnPrint.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtContent.getText());
			}
		} );
	}

	public static void main(String[] args) {
		new JTextFieldDemo();
	}
}
