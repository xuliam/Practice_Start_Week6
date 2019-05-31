package Practice_Start_Week6;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.tools.javac.launcher.Main;

public class loginFrame extends AbstractFrame{

	/**
	 * TODO
	 * @author xulian
	 * @VERSION 1.0
	 * @DATE 30/05/2019 9:58:35 pm
	 * @remarks TODO
	 *
	 *
	 */
	private static final long serialVersionUID = 1L;
	public loginFrame(int width, int height) {
		super(width, height);
		initComponents();
	}

	private void initComponents() {
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		
		JLabel lblLoginName = new JLabel("User Name:");
		lblLoginName.setBounds(65, 278, 80, 25);
		JLabel lblLoginPwd = new JLabel("Code No. :");
		lblLoginPwd.setBounds(lblLoginName.getX(), lblLoginName.getY()+30, lblLoginName.getWidth(), lblLoginName.getHeight());
		
		contentPane.add(lblLoginName);
		contentPane.add(lblLoginPwd);
		
		setContentPane(contentPane);
	
	}
	public static void main(String[] args) {
		 new loginFrame(642,491).setVisible(true);
	}
}
