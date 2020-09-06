package loginPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import logic.SignIn;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JProgressBar;

public class Login extends JFrame {

	private JPanel contentPane;
	public static JTextField textUser;
	public JPasswordField passwordbox;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 388);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, -26, 651, 385);
		contentPane.add(tabbedPane);
		
		JPanel panel_login = new JPanel();
		panel_login.setForeground(new Color(0, 0, 0));
		tabbedPane.addTab("New tab", null, panel_login, null);
		panel_login.setLayout(null);
		
		JLabel lblUser = new JLabel("User Name:");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUser.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUser.setBounds(159, 85, 116, 29);
		panel_login.add(lblUser);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPass.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPass.setBounds(175, 133, 100, 28);
		panel_login.add(lblPass);
		
		JCheckBox chckbx = new JCheckBox("Remember Username");
		
		JButton btnSignin = new JButton("Sign in");
		btnSignin.setForeground(new Color(255, 255, 255));
		btnSignin.setBackground(new Color(0, 128, 0));
		btnSignin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Boolean temp = logic.SignIn.check(textUser.getText(),passwordbox.getText().toString());
				if(temp) {
					tabbedPane.setSelectedIndex(3);
					
					
					//if(chckbx.isSelected()) {
					//	
					//}
					
					 
			                 
			           
					
					
					textUser.setText(null);
					passwordbox.setText(null);
				}
				else {
					
				}
			}
		});
		btnSignin.setBounds(265, 226, 116, 37);
		panel_login.add(btnSignin);
		
		textUser = new JTextField();
		textUser.setForeground(Color.LIGHT_GRAY);
		textUser.setText("username");
		textUser.setBounds(298, 88, 202, 29);
		panel_login.add(textUser);
		textUser.setColumns(10);
		
		passwordbox = new JPasswordField();
		passwordbox.setForeground(new Color(0, 0, 0));
		passwordbox.setBounds(298, 136, 202, 29);
		panel_login.add(passwordbox);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(0, 0, 646, 55);
		panel_login.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(176, 3, 294, 49);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 287, 626, 59);
		panel_login.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnErase = new JButton("Erase");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordbox.setText(null);
				textUser.setText(null);
			}
		});
		btnErase.setToolTipText("Erase everything from input box.");
		btnErase.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnErase.setBackground(new Color(255, 69, 0));
		btnErase.setForeground(new Color(255, 255, 255));
		btnErase.setBounds(10, 11, 89, 37);
		panel_1.add(btnErase);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton.setBackground(new Color(0, 139, 139));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(303, 19, 127, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane = new JPanel();
				if (JOptionPane.showConfirmDialog(contentPane,"Confirm if you want to Exit","Student Payment",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(527, 12, 89, 37);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Don't have an account?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(154, 23, 138, 14);
		panel_1.add(lblNewLabel_1);
		
		//JCheckBox chckbx = new JCheckBox("Remember Username");
		chckbx.setBounds(255, 187, 168, 23);
		panel_login.add(chckbx);
		
		
		
		JPanel panel_register = new JPanel();
		tabbedPane.addTab("New tab", null, panel_register, null);
		panel_register.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBounds(0, 0, 646, 53);
		panel_register.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Register");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 11, 626, 36);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_profile = new JPanel();
		tabbedPane.addTab("New tab", null, panel_profile, null);
		panel_profile.setLayout(null);
		
		JPanel panel_payment = new JPanel();
		tabbedPane.addTab("New tab", null, panel_payment, null);
		panel_payment.setLayout(null);
		
		JPanel panel_admin = new JPanel();
		tabbedPane.addTab("New tab", null, panel_admin, null);
		panel_admin.setLayout(null);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
