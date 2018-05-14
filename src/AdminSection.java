import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.DebugGraphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

public class AdminSection {

	private JFrame frame;
	private JTextField first;
	private JTextField last;
	private JTextField id;
	private JTextField tel;
	private JTextField staffid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSection window = new AdminSection();
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
	public AdminSection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		Image icon = new ImageIcon(this.getClass().getResource("book2.png")).getImage();
		frame.setIconImage(icon);
		frame.setTitle("Library Management System");
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel viewpane = new JPanel();
		viewpane.setBackground(Color.WHITE);
		viewpane.setBounds(276, 0, 708, 611);
		frame.getContentPane().add(viewpane);
		viewpane.setLayout(null);
		viewpane.setVisible(false);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 153, 204));
		separator_1.setForeground(new Color(0, 153, 204));
		separator_1.setBounds(10, 99, 688, 2);
		viewpane.add(separator_1);
		
		JTextPane txtpnLibrarianList = new JTextPane();
		txtpnLibrarianList.setText("Librarian List");
		txtpnLibrarianList.setForeground(new Color(0, 153, 204));
		txtpnLibrarianList.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnLibrarianList.setEditable(false);
		txtpnLibrarianList.setBounds(29, 33, 279, 36);
		viewpane.add(txtpnLibrarianList);
		
		JTextArea result = new JTextArea();
		result.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		result.setBounds(59, 187, 639, 413);
		viewpane.add(result);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setText("ID");
		txtpnId.setForeground(new Color(51, 153, 102));
		txtpnId.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnId.setEditable(false);
		txtpnId.setBounds(59, 140, 214, 36);
		viewpane.add(txtpnId);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setText("Name");
		txtpnName.setForeground(new Color(51, 153, 102));
		txtpnName.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnName.setEditable(false);
		txtpnName.setBounds(293, 140, 214, 36);
		viewpane.add(txtpnName);
		
		JTextPane txtpnTelephone_1 = new JTextPane();
		txtpnTelephone_1.setText("Telephone");
		txtpnTelephone_1.setForeground(new Color(51, 153, 102));
		txtpnTelephone_1.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnTelephone_1.setEditable(false);
		txtpnTelephone_1.setBounds(518, 140, 166, 36);
		viewpane.add(txtpnTelephone_1);
		
		JPanel delelepane = new JPanel();
		delelepane.setBackground(Color.WHITE);
		delelepane.setBounds(276, 0, 708, 611);
		frame.getContentPane().add(delelepane);
		delelepane.setLayout(null);
		delelepane.setVisible(false);
		
		JTextPane txtpnDeleteLibrarian = new JTextPane();
		txtpnDeleteLibrarian.setText("Delete Librarian");
		txtpnDeleteLibrarian.setForeground(new Color(0, 153, 204));
		txtpnDeleteLibrarian.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnDeleteLibrarian.setEditable(false);
		txtpnDeleteLibrarian.setBounds(27, 38, 279, 36);
		delelepane.add(txtpnDeleteLibrarian);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 153, 204));
		separator_2.setBackground(new Color(0, 153, 204));
		separator_2.setBounds(10, 95, 688, 2);
		delelepane.add(separator_2);
		
		JTextPane txtpnStaffId_1 = new JTextPane();
		txtpnStaffId_1.setText("Staff ID :");
		txtpnStaffId_1.setForeground(new Color(0, 153, 204));
		txtpnStaffId_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnStaffId_1.setEditable(false);
		txtpnStaffId_1.setBounds(27, 146, 104, 29);
		delelepane.add(txtpnStaffId_1);
		
		staffid = new JTextField();
		staffid.setForeground(new Color(0, 153, 204));
		staffid.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		staffid.setColumns(10);
		staffid.setBorder(new LineBorder(new Color(0, 153, 204), 2));
		staffid.setBounds(27, 186, 351, 36);
		delelepane.add(staffid);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;"+"databaseName=library;user=sa;password=123");
					 Statement st = con.createStatement();
					 String sql = "delete from staff "+"where staff_id="+staffid.getText();
					 st.executeQuery(sql);
					 
				 } 
				catch (Exception exc) {
					exc.printStackTrace();
				}
				JOptionPane.showMessageDialog(btnDelete, "Delete successful!");
				staffid.setText(null);
			
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btnDelete.setFocusable(false);
		btnDelete.setBackground(new Color(0, 153, 102));
		btnDelete.setBounds(253, 249, 125, 41);
		delelepane.add(btnDelete);
		
		JLabel lb1 = new JLabel("");
		lb1.setBounds(470, 546, 56, 54);
		Image img1 = new ImageIcon(this.getClass().getResource("facebook.png")).getImage();
		lb1.setIcon(new ImageIcon(img1));
		delelepane.add(lb1);
		
		JLabel lb2 = new JLabel("");
		lb2.setBounds(542, 546, 67, 54);
		Image img2 = new ImageIcon(this.getClass().getResource("youtube.png")).getImage();
		lb2.setIcon(new ImageIcon(img2));
		delelepane.add(lb2);
		
		JLabel lb3 = new JLabel("");
		lb3.setBounds(619, 546, 67, 54);
		Image img3 = new ImageIcon(this.getClass().getResource("appbar.java.png")).getImage();
		lb3.setIcon(new ImageIcon(img3));
		delelepane.add(lb3);
		try {
			 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;"+"databaseName=library;user=sa;password=123");
			 Statement st = con.createStatement();
			 String sql = "select * from staff ";
			 ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next()) {
				 result.append(" "+rs.getString("staff_id")+"\t\t"+rs.getString("staff_name")+"\t\t"+rs.getString("tel_no")+"\n");	 
			 }	 
		
		 } 
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 277, 611);
		panel.setBackground(new Color(49, 58, 115));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		Image bc = new ImageIcon(this.getClass().getResource("bookcase.png")).getImage();
		
		
		JLabel user = new JLabel(" Administrator\r\n");
		user.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		user.setForeground(Color.WHITE);
		user.setBounds(16, 36, 246, 45);
		Image img = new ImageIcon(this.getClass().getResource("user.png")).getImage();
		user.setIcon(new ImageIcon(img));
		panel.add(user);
		
		JPanel addpane = new JPanel();
		addpane.setFocusable(false);
		addpane.setBackground(Color.WHITE);
		addpane.setBounds(276, 0, 708, 611);
		frame.getContentPane().add(addpane);
		addpane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 51, 204));
		separator.setBounds(0, 92, 708, 2);
		addpane.add(separator);
		
		JTextPane addnew = new JTextPane();
		addnew.setEditable(false);
		addnew.setForeground(new Color(0, 153, 204));
		addnew.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		addnew.setText("Add New Librarian");
		addnew.setBounds(21, 32, 300, 36);
		addpane.add(addnew);
		
		JTextPane txtpnFirstName = new JTextPane();
		txtpnFirstName.setEditable(false);
		txtpnFirstName.setText("First name :");
		txtpnFirstName.setForeground(new Color(0, 153, 204));
		txtpnFirstName.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnFirstName.setBounds(37, 145, 104, 29);
		addpane.add(txtpnFirstName);
		
		JTextPane txtpnLastName = new JTextPane();
		txtpnLastName.setEditable(false);
		txtpnLastName.setText("Last name :");
		txtpnLastName.setForeground(new Color(0, 153, 204));
		txtpnLastName.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnLastName.setBounds(37, 235, 114, 29);
		addpane.add(txtpnLastName);
		
		JTextPane txtpnStaffId = new JTextPane();
		txtpnStaffId.setEditable(false);
		txtpnStaffId.setText("Staff ID :");
		txtpnStaffId.setForeground(new Color(0, 153, 204));
		txtpnStaffId.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnStaffId.setBounds(37, 326, 114, 29);
		addpane.add(txtpnStaffId);
		
		JTextPane txtpnTelephone = new JTextPane();
		txtpnTelephone.setEditable(false);
		txtpnTelephone.setText("Telephone :");
		txtpnTelephone.setForeground(new Color(0, 153, 204));
		txtpnTelephone.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnTelephone.setBounds(37, 419, 114, 29);
		addpane.add(txtpnTelephone);
		
		first = new JTextField();
		first.setBorder(new LineBorder(new Color(0, 153, 204), 2));
		first.setForeground(new Color(0, 153, 204));
		first.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		first.setBounds(37, 185, 351, 36);
		addpane.add(first);
		first.setColumns(10);
		
		last = new JTextField();
		last.setForeground(new Color(0, 153, 204));
		last.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		last.setColumns(10);
		last.setBorder(new LineBorder(new Color(0, 153, 204), 2));
		last.setBounds(37, 275, 351, 36);
		addpane.add(last);
		
		id = new JTextField();
		id.setForeground(new Color(0, 153, 204));
		id.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		id.setColumns(10);
		id.setBorder(new LineBorder(new Color(0, 153, 204), 2));
		id.setBounds(37, 366, 351, 36);
		addpane.add(id);
		
		tel = new JTextField();
		tel.setForeground(new Color(0, 153, 204));
		tel.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		tel.setColumns(10);
		tel.setBorder(new LineBorder(new Color(0, 153, 204), 2));
		tel.setBounds(37, 459, 351, 36);
		addpane.add(tel);
		
		JButton addd = new JButton("ADD");
		addd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;"+"databaseName=library;user=sa;password=123");
					 Statement st = con.createStatement();
					 String sql = "insert into staff "+"(staff_id,staff_name,tel_no) "
					 +" values ("+id.getText()+",'"+first.getText()+" "+last.getText()+"',"+tel.getText()+")" ;
					 st.executeQuery(sql);
					 
				 } 
				catch (Exception exc) {
					exc.printStackTrace();
				}
				JOptionPane.showMessageDialog(addd, first.getText()+" "+last.getText()+" has been added to database!");
				first.setText(null);last.setText(null); id.setText(null); tel.setText(null);
			
			}
		});
		addd.setForeground(Color.WHITE);
		addd.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		addd.setFocusable(false);
		addd.setBackground(new Color(0, 153, 102));
		addd.setBounds(573, 559, 125, 41);
		addpane.add(addd);
		
		JLabel pn = new JLabel("");
		pn.setBounds(492, 200, 125, 243);
		addpane.add(pn);
		addpane.setVisible(false);
		pn.setIcon(new ImageIcon(bc));
		
		JButton view = new JButton("View Librarian List");
		JButton add = new JButton("Add New Librarian");
		JButton delete = new JButton("Delete Librarian");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete.setBackground(new Color(77,96,180));
				view.setBackground(new Color(49, 58, 115));
				add.setBackground(new Color(49, 58, 115));
				addpane.setVisible(false);
				viewpane.setVisible(false);
				delelepane.setVisible(true);
				
			}
		});
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add.setBackground(new Color(77,96,180));
				view.setBackground(new Color(49, 58, 115));
				delete.setBackground(new Color(49, 58, 115));
				addpane.setVisible(true);
				viewpane.setVisible(false);
				delelepane.setVisible(false);
				
			}
		});
		add.setFocusable(false);
		add.setHorizontalAlignment(SwingConstants.LEFT);
		add.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		add.setBorderPainted(false);
		add.setBorder(null);
		
		add.setForeground(Color.WHITE);
		add.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		add.setBackground(new Color(49, 58, 115));
		add.setBounds(0, 142, 277, 57);
		Image adding = new ImageIcon(this.getClass().getResource("adduser.png")).getImage();
		add.setIcon(new ImageIcon(adding));
		panel.add(add);
		
		
		view.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				view.setBackground(new Color(77,96,180));
				add.setBackground(new Color(49, 58, 115));
				delete.setBackground(new Color(49, 58, 115));
				viewpane.setVisible(true);
				addpane.setVisible(false);
				delelepane.setVisible(false);
			}
		});
		view.setFocusable(false);
		view.setHorizontalAlignment(SwingConstants.LEFT);
		view.setForeground(Color.WHITE);
		view.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		view.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		view.setBorderPainted(false);
		view.setBorder(null);
		view.setBackground(new Color(49, 58, 115));
		view.setBounds(0, 233, 277, 57);
		Image viewer = new ImageIcon(this.getClass().getResource("list.png")).getImage();
		view.setIcon(new ImageIcon(viewer));
		panel.add(view);
		
		
		delete.setFocusable(false);
		delete.setHorizontalAlignment(SwingConstants.LEFT);
		delete.setForeground(Color.WHITE);
		delete.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		delete.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		delete.setBorderPainted(false);
		delete.setBorder(null);
		delete.setBackground(new Color(49, 58, 115));
		delete.setBounds(0, 326, 277, 57);
		Image deleter = new ImageIcon(this.getClass().getResource("delete.png")).getImage();
		delete.setIcon(new ImageIcon(deleter));
		panel.add(delete);
		
		JButton logout = new JButton("Log Out");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Login.main(new String[]{});
			}
		});
		logout.setBackground(new Color(49, 58, 115));
		logout.setFocusable(false);
		logout.setForeground(Color.WHITE);
		logout.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		logout.setBounds(70, 559, 125, 41);

		panel.add(logout);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 153, 204));
		separator_3.setBackground(new Color(0, 153, 204));
		separator_3.setBounds(276, 89, 708, 2);
		frame.getContentPane().add(separator_3);
		
		JTextPane txtpnWelcomeToLibrary = new JTextPane();
		txtpnWelcomeToLibrary.setText("Welcome to Library");
		txtpnWelcomeToLibrary.setForeground(new Color(0, 153, 204));
		txtpnWelcomeToLibrary.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnWelcomeToLibrary.setEditable(false);
		txtpnWelcomeToLibrary.setBounds(297, 30, 279, 36);
		frame.getContentPane().add(txtpnWelcomeToLibrary);
		
		
		
	}
}
