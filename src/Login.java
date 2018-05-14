import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Login {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Image icon = new ImageIcon(this.getClass().getResource("book2.png")).getImage();
		frame.setIconImage(icon);
		frame.setTitle("Library Management System");
		frame.getContentPane().setBackground(new Color(36, 47, 65));
		frame.setBounds(100, 100, 799, 650);
		frame.getContentPane().setLayout(null);
		
		password = new JPasswordField();
		password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			password.setText(null);
			}
		});
		
		
		
		password.setText("123456");
		password.setBorder(null);
		password.setToolTipText("");
		password.setForeground(new Color(255, 255, 255));
		password.setBackground(new Color(36, 47, 65));
		password.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		password.setBounds(426, 341, 211, 27);
		frame.getContentPane().add(password);
		
		JTextPane username = new JTextPane();
		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				username.setText(null);
			}
		});
		username.setText("Enter Username\r\n");
		username.setForeground(new Color(240, 255, 255));
		username.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		username.setBackground(new Color(36, 47, 65));
		username.setBounds(426, 241, 323, 27);
		frame.getContentPane().add(username);
		panel.setBounds(0, 0, 381, 611);
		panel.setBorder(null);
		panel.setBackground(new Color(97, 212, 195));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton login = new JButton("LOGIN");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x = username.getText();
				String y = String.valueOf(password.getPassword());
						if(x.equals("admin") && y.equals("admin123")) {
						JOptionPane.showMessageDialog(frame, "Admin Login successful"); 
						AdminSection.main(new String[]{});
						frame.dispose();
						}   
						else if (x.equals("librarian") && y.equals("librarian123")) {
							JOptionPane.showMessageDialog(frame, "Staff Login successful");
							StaffSection.main(new String[]{});
							frame.dispose();
						}
					    else	{
					    	JOptionPane.showMessageDialog(frame, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					    }
			}
			
		});
		login.setBorder(null);
		login.setForeground(new Color(255, 255, 255));
		login.setBackground(new Color(72, 209, 204));
		login.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		login.setBounds(426, 444, 140, 53);
		frame.getContentPane().add(login);
		
		
		
		
		JTextPane title = new JTextPane();
		title.setEditable(false);
		title.setForeground(new Color(240, 255, 255));
		title.setBackground(new Color(97, 212, 195));
		title.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		title.setText("Library Management System");
		title.setBounds(31, 77, 318, 34);
		panel.add(title);
		
		JLabel label = new JLabel("");
		Image book = new ImageIcon(this.getClass().getResource("book4.png")).getImage();
		label.setIcon(new ImageIcon(book));
		label.setBounds(57, 124, 263, 294);
		panel.add(label);
		
		JTextPane txtpnMetroUiDesigned = new JTextPane();
		txtpnMetroUiDesigned.setText("UI designed by DB\r\n\r\n");
		txtpnMetroUiDesigned.setForeground(new Color(240, 255, 255));
		txtpnMetroUiDesigned.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtpnMetroUiDesigned.setEditable(false);
		txtpnMetroUiDesigned.setBackground(new Color(97, 212, 195));
		txtpnMetroUiDesigned.setBounds(121, 575, 138, 25);
		panel.add(txtpnMetroUiDesigned);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(248, 248, 255));
		separator.setBounds(67, 454, 256, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(248, 248, 255));
		separator_1.setBounds(93, 496, 202, 2);
		panel.add(separator_1);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setText("Login :\r\n");
		txtpnLogin.setForeground(new Color(240, 255, 255));
		txtpnLogin.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtpnLogin.setEditable(false);
		txtpnLogin.setBackground(new Color(36, 47, 65));
		txtpnLogin.setBounds(407, 123, 80, 34);
		frame.getContentPane().add(txtpnLogin);
		
		JTextPane user = new JTextPane();
		user.setText("USER NAME");
		user.setForeground(new Color(240, 255, 255));
		user.setFont(new Font("Century Gothic", Font.BOLD, 16));
		user.setEditable(false);
		user.setBackground(new Color(36, 47, 65));
		user.setBounds(426, 203, 102, 27);
		frame.getContentPane().add(user);
		
		JTextPane pass = new JTextPane();
		pass.setText("PASSWORD");
		pass.setForeground(new Color(240, 255, 255));
		pass.setFont(new Font("Century Gothic", Font.BOLD, 16));
		pass.setEditable(false);
		pass.setBackground(new Color(36, 47, 65));
		pass.setBounds(426, 305, 102, 27);
		frame.getContentPane().add(pass);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(248, 248, 255));
		separator_2.setBounds(426, 279, 323, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(248, 248, 255));
		separator_3.setBounds(426, 379, 323, 2);
		frame.getContentPane().add(separator_3);
	}
}
