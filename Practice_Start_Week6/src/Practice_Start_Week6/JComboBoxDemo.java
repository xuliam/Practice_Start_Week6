package Practice_Start_Week6;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComboBoxDemo extends JFrame{
	/**
	 * TODO
	 * @author xulian
	 * @VERSION 1.0
	 * @DATE 1/06/2019 2:22:05 pm
	 * @remarks TODO
	 *
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> cmbCity = new JComboBox<>(new String[] {"Beijing","Shanghai","Guangzhou","Shenzhen","Hangzhou","Wuhan"});

	public JComboBoxDemo() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 700);
		setTitle("This is a JComboBoxDemo");
		setVisible(true);
		setLocationRelativeTo(null);
		initComponents();
		
	}
	
	private void initComponents() {
		JPanel contentPane = (JPanel)getContentPane();
		
		contentPane.add(cmbCity, BorderLayout.NORTH);
		
		cmbCity.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(cmbCity.getSelectedItem());
			}
		});
		
	}
	public static void main(String[] args) {

		new JComboBoxDemo();
	}

}
