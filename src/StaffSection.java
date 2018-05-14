import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DebugGraphics;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StaffSection {

	private JFrame frame;
	private JTextField borid;
	private JTextField bookid;
	private JTextField loan;
	private JTextField due;
	private JTextField title;
	private JTextField bkid;
	private JTextField author;
	private JTextField pub;
	private JTextField lan;
	private JTextField stname;
	private JTextField stid;
	private JTextField dob;
	private JTextField major;
	private JTextField borrid;
	private JTextField bokid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSection window = new StaffSection();
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
	public StaffSection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel rebo = new JPanel();
		rebo.setBackground(Color.WHITE);
		rebo.setBounds(286, 0, 698, 611);
		frame.getContentPane().add(rebo);
		rebo.setLayout(null);
		rebo.setVisible(false);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(49, 58, 115));
		panel_4.setBounds(0, 0, 698, 113);
		rebo.add(panel_4);
		
		JTextPane txtpnRemoveBorrowing = new JTextPane();
		txtpnRemoveBorrowing.setText("Remove Borrowing");
		txtpnRemoveBorrowing.setForeground(new Color(255, 153, 0));
		txtpnRemoveBorrowing.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnRemoveBorrowing.setEditable(false);
		txtpnRemoveBorrowing.setBackground(new Color(49, 58, 115));
		txtpnRemoveBorrowing.setBounds(10, 43, 279, 36);
		panel_4.add(txtpnRemoveBorrowing);
		
		JTextPane txtpnBorrowerId_1 = new JTextPane();
		txtpnBorrowerId_1.setText("Borrower ID");
		txtpnBorrowerId_1.setForeground(new Color(0, 153, 204));
		txtpnBorrowerId_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnBorrowerId_1.setEditable(false);
		txtpnBorrowerId_1.setBounds(10, 147, 104, 29);
		rebo.add(txtpnBorrowerId_1);
		
		borrid = new JTextField();
		borrid.setForeground(new Color(0, 153, 204));
		borrid.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		borrid.setColumns(10);
		borrid.setBorder(new LineBorder(new Color(0, 153, 204), 2));
		borrid.setBounds(10, 187, 351, 36);
		rebo.add(borrid);
		
		JButton button_3 = new JButton("DELETE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;"+"databaseName=library;user=sa;password=123");
					 Statement st = con.createStatement();
					 String sql = "delete from borrow "+"where borrower_id="+borrid.getText()+" and book_id="+bokid.getText();
					 st.executeQuery(sql);
					 
				 } 
				catch (Exception exc) {
					exc.printStackTrace();
				}
				JOptionPane.showMessageDialog(frame, "Delete successful!");
				bokid.setText(null); borrid.setText(null);
			
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		button_3.setFocusable(false);
		button_3.setBackground(new Color(0, 153, 102));
		button_3.setBounds(547, 409, 125, 41);
		rebo.add(button_3);
		
		JTextPane txtpnBookId_4 = new JTextPane();
		txtpnBookId_4.setText("Book ID :");
		txtpnBookId_4.setForeground(new Color(0, 153, 204));
		txtpnBookId_4.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnBookId_4.setEditable(false);
		txtpnBookId_4.setBounds(10, 276, 104, 29);
		rebo.add(txtpnBookId_4);
		
		bokid = new JTextField();
		bokid.setForeground(new Color(0, 153, 204));
		bokid.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		bokid.setColumns(10);
		bokid.setBorder(new LineBorder(new Color(0, 153, 204), 2));
		bokid.setBounds(10, 316, 351, 36);
		rebo.add(bokid);
		
		JPanel bklist = new JPanel();
		bklist.setBackground(Color.WHITE);
		bklist.setBounds(286, 0, 698, 611);
		frame.getContentPane().add(bklist);
		bklist.setLayout(null);
		bklist.setVisible(false);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(49, 58, 115));
		panel_3.setBounds(0, 0, 698, 113);
		bklist.add(panel_3);
		
		JTextPane txtpnBookList = new JTextPane();
		txtpnBookList.setText("Book List");
		txtpnBookList.setForeground(new Color(255, 153, 0));
		txtpnBookList.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnBookList.setEditable(false);
		txtpnBookList.setBackground(new Color(49, 58, 115));
		txtpnBookList.setBounds(10, 43, 279, 36);
		panel_3.add(txtpnBookList);
		
		JTextArea resultset = new JTextArea();
		resultset.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		resultset.setBounds(22, 219, 654, 366);
		bklist.add(resultset);
		resultset.setEditable(false);
		
		JTextPane txtpnBookId_3 = new JTextPane();
		txtpnBookId_3.setText("Book ID");
		txtpnBookId_3.setForeground(new Color(51, 153, 102));
		txtpnBookId_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtpnBookId_3.setEditable(false);
		txtpnBookId_3.setBounds(10, 176, 96, 32);
		bklist.add(txtpnBookId_3);
		
		JTextPane txtpnBookTitle_1 = new JTextPane();
		txtpnBookTitle_1.setText("Book Title");
		txtpnBookTitle_1.setForeground(new Color(51, 153, 102));
		txtpnBookTitle_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtpnBookTitle_1.setEditable(false);
		txtpnBookTitle_1.setBounds(116, 176, 113, 32);
		bklist.add(txtpnBookTitle_1);
		
		JTextPane txtpnAuthor_1 = new JTextPane();
		txtpnAuthor_1.setText("Author");
		txtpnAuthor_1.setForeground(new Color(51, 153, 102));
		txtpnAuthor_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtpnAuthor_1.setEditable(false);
		txtpnAuthor_1.setBounds(321, 176, 76, 32);
		bklist.add(txtpnAuthor_1);
		
		JTextPane txtpnPublisher = new JTextPane();
		txtpnPublisher.setText("Publisher");
		txtpnPublisher.setForeground(new Color(51, 153, 102));
		txtpnPublisher.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtpnPublisher.setEditable(false);
		txtpnPublisher.setBounds(433, 176, 113, 32);
		bklist.add(txtpnPublisher);
		
		JTextPane txtpnLanguage_1 = new JTextPane();
		txtpnLanguage_1.setText("Language");
		txtpnLanguage_1.setForeground(new Color(51, 153, 102));
		txtpnLanguage_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtpnLanguage_1.setEditable(false);
		txtpnLanguage_1.setBounds(556, 176, 113, 32);
		bklist.add(txtpnLanguage_1);
		try {
			 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;"+"databaseName=library;user=sa;password=123");
			 Statement st = con.createStatement();
			 String sql = "select * from book_info ";
			 ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next()) {
				 resultset.append(" "+rs.getString("book_id")+"\t"+rs.getString("book_name")+"\t"+rs.getString("author")+"\t"+rs.getString("publisher")+"\t"
			 +rs.getString("language")+"\n");	 
			 }	 
		
		 } 
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		JPanel borli = new JPanel();
		borli.setBackground(Color.WHITE);
		borli.setBounds(286, 0, 698, 611);
		frame.getContentPane().add(borli);
		borli.setLayout(null);
		borli.setVisible(false);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(49, 58, 115));
		panel_2.setBounds(0, 0, 698, 120);
		borli.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane txtpnBorrowList = new JTextPane();
		txtpnBorrowList.setText("Borrow List");
		txtpnBorrowList.setForeground(new Color(255, 153, 0));
		txtpnBorrowList.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnBorrowList.setEditable(false);
		txtpnBorrowList.setBackground(new Color(49, 58, 115));
		txtpnBorrowList.setBounds(10, 43, 279, 36);
		panel_2.add(txtpnBorrowList);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("ID");
		textPane_2.setForeground(new Color(51, 153, 102));
		textPane_2.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		textPane_2.setEditable(false);
		textPane_2.setBounds(22, 175, 43, 36);
		borli.add(textPane_2);
		
		JTextArea result = new JTextArea();
		result.setEditable(false);
		result.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		result.setBounds(22, 223, 654, 366);
		borli.add(result);
		
		JTextPane txtpnName_1 = new JTextPane();
		txtpnName_1.setText("Name");
		txtpnName_1.setForeground(new Color(51, 153, 102));
		txtpnName_1.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnName_1.setEditable(false);
		txtpnName_1.setBounds(113, 175, 121, 36);
		borli.add(txtpnName_1);
		
		JTextPane txtpnBookId_2 = new JTextPane();
		txtpnBookId_2.setText("Book ID");
		txtpnBookId_2.setForeground(new Color(51, 153, 102));
		txtpnBookId_2.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnBookId_2.setEditable(false);
		txtpnBookId_2.setBounds(294, 175, 100, 36);
		borli.add(txtpnBookId_2);
		
		JTextPane txtpnLoan = new JTextPane();
		txtpnLoan.setText("Loan");
		txtpnLoan.setForeground(new Color(51, 153, 102));
		txtpnLoan.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnLoan.setEditable(false);
		txtpnLoan.setBounds(434, 175, 100, 36);
		borli.add(txtpnLoan);
		
		JTextPane txtpnDue = new JTextPane();
		txtpnDue.setText("Due");
		txtpnDue.setForeground(new Color(51, 153, 102));
		txtpnDue.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnDue.setEditable(false);
		txtpnDue.setBounds(539, 175, 100, 36);
		borli.add(txtpnDue);
		try {
			 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;"+"databaseName=library;user=sa;password=123");
			 Statement st = con.createStatement();
			 String sql = "select distinct * from borrow,borrower where borrow.borrower_id=borrower.borrower_id";
			 ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next()) {
				 result.append(" "+rs.getString("borrower_id")+"\t"+rs.getString("borrower_name")+"\t\t"
			 +rs.getString("book_id")+"\t"+rs.getString("loandate")+"\t"+rs.getString("duedate")+"\n");	 
			 }	 
		
		 } 
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		JPanel addbo = new JPanel();
		addbo.setBackground(new Color(49, 58, 115));
		addbo.setBounds(286, 0, 698, 611);
		frame.getContentPane().add(addbo);
		addbo.setLayout(null);
		addbo.setVisible(false);
		
		JTextPane txtpnAddNewBook = new JTextPane();
		txtpnAddNewBook.setText("Add New Borrower");
		txtpnAddNewBook.setForeground(new Color(255, 153, 0));
		txtpnAddNewBook.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnAddNewBook.setEditable(false);
		txtpnAddNewBook.setBackground(new Color(49, 58, 115));
		txtpnAddNewBook.setBounds(10, 34, 279, 36);
		addbo.add(txtpnAddNewBook);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(255, 153, 0));
		separator_2.setBackground(new Color(255, 153, 0));
		separator_2.setBounds(10, 97, 678, 2);
		addbo.add(separator_2);
		
		stname = new JTextField();
		stname.setForeground(Color.WHITE);
		stname.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		stname.setColumns(10);
		stname.setBorder(new LineBorder(Color.WHITE, 2));
		stname.setBackground(new Color(49, 58, 115));
		stname.setBounds(10, 174, 351, 36);
		addbo.add(stname);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setText("Name");
		txtpnName.setForeground(Color.WHITE);
		txtpnName.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnName.setEditable(false);
		txtpnName.setBackground(new Color(49, 58, 115));
		txtpnName.setBounds(10, 134, 176, 29);
		addbo.add(txtpnName);
		
		stid = new JTextField();
		stid.setForeground(Color.WHITE);
		stid.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		stid.setColumns(10);
		stid.setBorder(new LineBorder(Color.WHITE, 2));
		stid.setBackground(new Color(49, 58, 115));
		stid.setBounds(10, 271, 351, 36);
		addbo.add(stid);
		
		JTextPane txtpnStudentId = new JTextPane();
		txtpnStudentId.setText("Student ID");
		txtpnStudentId.setForeground(Color.WHITE);
		txtpnStudentId.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnStudentId.setEditable(false);
		txtpnStudentId.setBackground(new Color(49, 58, 115));
		txtpnStudentId.setBounds(10, 231, 176, 29);
		addbo.add(txtpnStudentId);
		
		dob = new JTextField();
		dob.setForeground(Color.WHITE);
		dob.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		dob.setColumns(10);
		dob.setBorder(new LineBorder(Color.WHITE, 2));
		dob.setBackground(new Color(49, 58, 115));
		dob.setBounds(10, 383, 351, 36);
		addbo.add(dob);
		
		JTextPane txtpnDateOfBirth = new JTextPane();
		txtpnDateOfBirth.setText("Date of Birth");
		txtpnDateOfBirth.setForeground(Color.WHITE);
		txtpnDateOfBirth.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnDateOfBirth.setEditable(false);
		txtpnDateOfBirth.setBackground(new Color(49, 58, 115));
		txtpnDateOfBirth.setBounds(10, 343, 176, 29);
		addbo.add(txtpnDateOfBirth);
		
		major = new JTextField();
		major.setForeground(Color.WHITE);
		major.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		major.setColumns(10);
		major.setBorder(new LineBorder(Color.WHITE, 2));
		major.setBackground(new Color(49, 58, 115));
		major.setBounds(10, 491, 351, 36);
		addbo.add(major);
		
		JTextPane txtpnMajor = new JTextPane();
		txtpnMajor.setText("Major");
		txtpnMajor.setForeground(Color.WHITE);
		txtpnMajor.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnMajor.setEditable(false);
		txtpnMajor.setBackground(new Color(49, 58, 115));
		txtpnMajor.setBounds(10, 451, 176, 29);
		addbo.add(txtpnMajor);
		
		JButton button_2 = new JButton("ADD");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;"+"databaseName=library;user=sa;password=123");
					 Statement st = con.createStatement();
					
					 String sql = "insert into borrower "+"(borrower_id,borrower_name,dob,major) "+"values ("+"'"+stid.getText()+"','"
					 +stname.getText()+"','"+dob.getText()+"','"+major.getText()+"')";
					 st.executeQuery(sql);		 
				 }
				catch (Exception exc) {
					exc.printStackTrace();
				} 
				JOptionPane.showMessageDialog(frame, stname.getText()+" has been added!");
				dob.setText(null);major.setText(null);stname.setText(null);stid.setText(null);
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		button_2.setFocusable(false);
		button_2.setBackground(new Color(0, 191, 255));
		button_2.setBounds(552, 537, 125, 41);
		addbo.add(button_2);
		
		JPanel addb = new JPanel();
		addb.setBackground(new Color(49, 58, 115));
		addb.setBounds(286, 0, 698, 611);
		frame.getContentPane().add(addb);
		addb.setLayout(null);
		addb.setVisible(false);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Create Borrowing");
		textPane.setForeground(new Color(255, 153, 0));
		textPane.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		textPane.setEditable(false);
		textPane.setBackground(new Color(49, 58, 115));
		textPane.setBounds(10, 34, 279, 36);
		addb.add(textPane);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 153, 0));
		separator_1.setBackground(new Color(255, 153, 0));
		separator_1.setBounds(10, 96, 678, 2);
		addb.add(separator_1);
		
		title = new JTextField();
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		title.setColumns(10);
		title.setBorder(new LineBorder(Color.WHITE, 2));
		title.setBackground(new Color(49, 58, 115));
		title.setBounds(10, 172, 351, 36);
		addb.add(title);
		
		JTextPane txtpnBookTitle = new JTextPane();
		txtpnBookTitle.setText("Book Title");
		txtpnBookTitle.setForeground(Color.WHITE);
		txtpnBookTitle.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnBookTitle.setEditable(false);
		txtpnBookTitle.setBackground(new Color(49, 58, 115));
		txtpnBookTitle.setBounds(10, 132, 176, 29);
		addb.add(txtpnBookTitle);
		
		bkid = new JTextField();
		bkid.setForeground(Color.WHITE);
		bkid.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		bkid.setColumns(10);
		bkid.setBorder(new LineBorder(Color.WHITE, 2));
		bkid.setBackground(new Color(49, 58, 115));
		bkid.setBounds(10, 281, 234, 36);
		addb.add(bkid);
		
		JTextPane txtpnBookId_1 = new JTextPane();
		txtpnBookId_1.setText("Book ID");
		txtpnBookId_1.setForeground(Color.WHITE);
		txtpnBookId_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnBookId_1.setEditable(false);
		txtpnBookId_1.setBackground(new Color(49, 58, 115));
		txtpnBookId_1.setBounds(10, 241, 176, 29);
		addb.add(txtpnBookId_1);
		
		author = new JTextField();
		author.setForeground(Color.WHITE);
		author.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		author.setColumns(10);
		author.setBorder(new LineBorder(Color.WHITE, 2));
		author.setBackground(new Color(49, 58, 115));
		author.setBounds(313, 281, 351, 36);
		addb.add(author);
		
		JTextPane txtpnAuthor = new JTextPane();
		txtpnAuthor.setText("Author");
		txtpnAuthor.setForeground(Color.WHITE);
		txtpnAuthor.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnAuthor.setEditable(false);
		txtpnAuthor.setBackground(new Color(49, 58, 115));
		txtpnAuthor.setBounds(313, 241, 176, 29);
		addb.add(txtpnAuthor);
		
		pub = new JTextField();
		pub.setForeground(Color.WHITE);
		pub.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		pub.setColumns(10);
		pub.setBorder(new LineBorder(Color.WHITE, 2));
		pub.setBackground(new Color(49, 58, 115));
		pub.setBounds(10, 394, 351, 36);
		addb.add(pub);
		
		JTextPane txtpnPushl = new JTextPane();
		txtpnPushl.setText("Publishser");
		txtpnPushl.setForeground(Color.WHITE);
		txtpnPushl.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnPushl.setEditable(false);
		txtpnPushl.setBackground(new Color(49, 58, 115));
		txtpnPushl.setBounds(10, 354, 176, 29);
		addb.add(txtpnPushl);
		
		lan = new JTextField();
		lan.setForeground(Color.WHITE);
		lan.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		lan.setColumns(10);
		lan.setBorder(new LineBorder(Color.WHITE, 2));
		lan.setBackground(new Color(49, 58, 115));
		lan.setBounds(10, 511, 351, 36);
		addb.add(lan);
		
		JTextPane txtpnLanguage = new JTextPane();
		txtpnLanguage.setText("Language");
		txtpnLanguage.setForeground(Color.WHITE);
		txtpnLanguage.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnLanguage.setEditable(false);
		txtpnLanguage.setBackground(new Color(49, 58, 115));
		txtpnLanguage.setBounds(10, 471, 176, 29);
		addb.add(txtpnLanguage);
		
		JButton button_1 = new JButton("ADD");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 
					 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;"+"databaseName=library;user=sa;password=123");
				     Statement st2 = con.createStatement();
					 String sql2 = "insert into book_info "+"(book_id,book_name,author,publisher,language) "
								+" values ("+bkid.getText()+",'"+title.getText()+"','"+author.getText()+"','"+pub.getText()+"','"+lan.getText()+"') ";
					st2.executeQuery(sql2);
				}
				catch (Exception exc) {
					exc.printStackTrace();}
			JOptionPane.showMessageDialog(frame, "The information has been added!");	
			pub.setText(null);title.setText(null);author.setText(null);lan.setText(null);bkid.setText(null);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		button_1.setFocusable(false);
		button_1.setBackground(new Color(0, 191, 255));
		button_1.setBounds(539, 506, 125, 41);
		addb.add(button_1);
		
		JPanel crepane = new JPanel();
		crepane.setBackground(new Color(49, 58, 115));
		crepane.setBounds(286, 0, 698, 611);
		frame.getContentPane().add(crepane);
		crepane.setLayout(null);
		crepane.setVisible(false);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 153, 0));
		separator.setForeground(new Color(255, 153, 0));
		separator.setBounds(10, 105, 678, 2);
		crepane.add(separator);
		
		JTextPane txtpnCreateBorrowing = new JTextPane();
		txtpnCreateBorrowing.setBackground(new Color(49, 58, 115));
		txtpnCreateBorrowing.setText("Create Borrowing");
		txtpnCreateBorrowing.setForeground(new Color(255, 153, 0));
		txtpnCreateBorrowing.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnCreateBorrowing.setEditable(false);
		txtpnCreateBorrowing.setBounds(10, 38, 279, 36);
		crepane.add(txtpnCreateBorrowing);
		
		borid = new JTextField();
		borid.setBackground(new Color(49, 58, 115));
		borid.setForeground(Color.WHITE);
		borid.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		borid.setColumns(10);
		borid.setBorder(new LineBorder(Color.WHITE, 2));
		borid.setBounds(10, 170, 351, 36);
		crepane.add(borid);
		
		JTextPane txtpnBorrowerId = new JTextPane();
		txtpnBorrowerId.setBackground(new Color(49, 58, 115));
		txtpnBorrowerId.setText("Borrower ID :");
		txtpnBorrowerId.setForeground(Color.WHITE);
		txtpnBorrowerId.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnBorrowerId.setEditable(false);
		txtpnBorrowerId.setBounds(10, 130, 176, 29);
		crepane.add(txtpnBorrowerId);
		
		JTextPane txtpnBookId = new JTextPane();
		txtpnBookId.setText("Book ID :");
		txtpnBookId.setForeground(Color.WHITE);
		txtpnBookId.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnBookId.setEditable(false);
		txtpnBookId.setBackground(new Color(49, 58, 115));
		txtpnBookId.setBounds(10, 225, 176, 29);
		crepane.add(txtpnBookId);
		
		JTextPane txtpnLoadDate = new JTextPane();
		txtpnLoadDate.setText("Loan Date :");
		txtpnLoadDate.setForeground(Color.WHITE);
		txtpnLoadDate.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnLoadDate.setEditable(false);
		txtpnLoadDate.setBackground(new Color(49, 58, 115));
		txtpnLoadDate.setBounds(10, 326, 176, 29);
		crepane.add(txtpnLoadDate);
		
		JTextPane txtpnDueDate = new JTextPane();
		txtpnDueDate.setText("Due Date :");
		txtpnDueDate.setForeground(Color.WHITE);
		txtpnDueDate.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtpnDueDate.setEditable(false);
		txtpnDueDate.setBackground(new Color(49, 58, 115));
		txtpnDueDate.setBounds(10, 424, 176, 29);
		crepane.add(txtpnDueDate);
		
		bookid = new JTextField();
		bookid.setForeground(Color.WHITE);
		bookid.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		bookid.setColumns(10);
		bookid.setBorder(new LineBorder(Color.WHITE, 2));
		bookid.setBackground(new Color(49, 58, 115));
		bookid.setBounds(10, 265, 351, 36);
		crepane.add(bookid);
		
		loan = new JTextField();
		loan.setForeground(Color.WHITE);
		loan.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		loan.setColumns(10);
		loan.setBorder(new LineBorder(Color.WHITE, 2));
		loan.setBackground(new Color(49, 58, 115));
		loan.setBounds(10, 366, 351, 36);
		crepane.add(loan);
		
		due = new JTextField();
		due.setForeground(Color.WHITE);
		due.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		due.setColumns(10);
		due.setBorder(new LineBorder(Color.WHITE, 2));
		due.setBackground(new Color(49, 58, 115));
		due.setBounds(10, 462, 351, 36);
		crepane.add(due);
		
		JButton button = new JButton("ADD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 
					 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;"+"databaseName=library;user=sa;password=123");
				     Statement st3 = con.createStatement();
					 String sql3 = "insert into borrow "+"(book_id,borrower_id,loandate,duedate) "
								+" values ("+bookid.getText()+",'"+borid.getText()+"','"+loan.getText()+"','"+due.getText()+"')";
					st3.executeQuery(sql3);
				}
				catch (Exception exc) {
					exc.printStackTrace();}
				JOptionPane.showMessageDialog(frame, "The information has been added!");	
			bookid.setText(null);borid.setText(null);loan.setText(null);due.setText(null);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		button.setFocusable(false);
		button.setBackground(new Color(0, 191, 255));
		button.setBounds(552, 544, 125, 41);
		crepane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 51));
		panel.setBounds(0, 0, 286, 611);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lib = new JLabel("LIbrarian");
		lib.setForeground(Color.WHITE);
		lib.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		lib.setBounds(40, 39, 246, 55);
		Image img = new ImageIcon(this.getClass().getResource("user.png")).getImage();
		lib.setIcon(new ImageIcon(img));
		panel.add(lib);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 51));
		panel_1.setBounds(0, 0, 45, 611);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("list.png")).getImage();
		label.setIcon(new ImageIcon(img2));
		label.setBounds(-14, 121, 53, 31);
		
		panel_1.add(label);
		
		JLabel lbb = new JLabel("");
		lbb.setToolTipText("Log Out");
		lbb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				Login.main(new String[]{});
				
			}
		});
		lbb.setBounds(10, 519, 35, 31);
		panel_1.add(lbb);
		Image imga = new ImageIcon(this.getClass().getResource("logout.png")).getImage();
		lbb.setIcon(new ImageIcon(imga));
		
		JButton create = new JButton(" Create Borrowing");
		
		JButton addbook = new JButton("Add New Book");
		
		JButton addbor = new JButton("Add New Borrower");
		
		JButton borlist = new JButton("Borrowing List");
		
		JButton booklist = new JButton("Book List");
		
		JButton removelist = new JButton("Remove Borrowing");
		
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				create.setBackground(new Color(77,96,180));
				addbook.setBackground(new Color(0, 153, 51));
				addbor.setBackground(new Color(0, 153, 51));
				borlist.setBackground(new Color(0, 153, 51));
				booklist.setBackground(new Color(0, 153, 51));
				removelist.setBackground(new Color(0, 153, 51));
				crepane.setVisible(true);
				bklist.setVisible(false);
				addb.setVisible(false);
				addbo.setVisible(false);
				borli.setVisible(false);
				rebo.setVisible(false);
			}
		});
		create.setHorizontalAlignment(SwingConstants.LEADING);
		create.setForeground(Color.WHITE);
		create.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		create.setFocusable(false);
		create.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		create.setBorderPainted(false);
		create.setBorder(null);
		create.setBackground(new Color(0, 153, 51));
		create.setBounds(50, 105, 236, 55);
		Image img1 = new ImageIcon(this.getClass().getResource("bk2.png")).getImage();
		create.setIcon(new ImageIcon(img1));
		panel.add(create);
		
		addbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addbook.setBackground(new Color(77,96,180));
				create.setBackground(new Color(0, 153, 51));
				addbor.setBackground(new Color(0, 153, 51));
				borlist.setBackground(new Color(0, 153, 51));
				booklist.setBackground(new Color(0, 153, 51));
				removelist.setBackground(new Color(0, 153, 51));
				crepane.setVisible(false);
				bklist.setVisible(false);
				addb.setVisible(true);
				addbo.setVisible(false);
				borli.setVisible(false);
				rebo.setVisible(false);
			}
		});
		addbook.setHorizontalAlignment(SwingConstants.LEFT);
		addbook.setForeground(Color.WHITE);
		addbook.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		addbook.setFocusable(false);
		addbook.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		addbook.setBorderPainted(false);
		addbook.setBorder(null);
		addbook.setBackground(new Color(0, 153, 51));
		addbook.setBounds(50, 185, 236, 57);
		Image img3 = new ImageIcon(this.getClass().getResource("re2.png")).getImage();
		addbook.setIcon(new ImageIcon(img3));
		panel.add(addbook);
		
		addbor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addbor.setBackground(new Color(77,96,180));
				create.setBackground(new Color(0, 153, 51));
				addbook.setBackground(new Color(0, 153, 51));
				borlist.setBackground(new Color(0, 153, 51));
				booklist.setBackground(new Color(0, 153, 51));
				removelist.setBackground(new Color(0, 153, 51));
			
				crepane.setVisible(false);
				bklist.setVisible(false);
				addb.setVisible(false);
				addbo.setVisible(true);
				borli.setVisible(false);
				rebo.setVisible(false);
			}
		});
		addbor.setHorizontalAlignment(SwingConstants.LEFT);
		addbor.setForeground(Color.WHITE);
		addbor.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		addbor.setFocusable(false);
		addbor.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		addbor.setBorderPainted(false);
		addbor.setBorder(null);
		addbor.setBackground(new Color(0, 153, 51));
		addbor.setBounds(50, 262, 236, 57);
		Image img4 = new ImageIcon(this.getClass().getResource("plus.png")).getImage();
		addbor.setIcon(new ImageIcon(img4));
		panel.add(addbor);
		
		borlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borlist.setBackground(new Color(77,96,180));
				create.setBackground(new Color(0, 153, 51));
				addbook.setBackground(new Color(0, 153, 51));
				addbor.setBackground(new Color(0, 153, 51));
				booklist.setBackground(new Color(0, 153, 51));
				removelist.setBackground(new Color(0, 153, 51));
				crepane.setVisible(false);
				bklist.setVisible(false);
				addb.setVisible(false);
				addbo.setVisible(false);
				borli.setVisible(true);
				rebo.setVisible(false);
			}
			
		});
		borlist.setHorizontalAlignment(SwingConstants.LEFT);
		borlist.setForeground(Color.WHITE);
		borlist.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		borlist.setFocusable(false);
		borlist.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		borlist.setBorderPainted(false);
		borlist.setBorder(null);
		borlist.setBackground(new Color(0, 153, 51));
		borlist.setBounds(50, 343, 236, 57);
		Image img5 = new ImageIcon(this.getClass().getResource("lis2.png")).getImage();
		borlist.setIcon(new ImageIcon(img5));
		panel.add(borlist);
		
		booklist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				booklist.setBackground(new Color(77,96,180));
				create.setBackground(new Color(0, 153, 51));
				addbook.setBackground(new Color(0, 153, 51));
				addbor.setBackground(new Color(0, 153, 51));
				borlist.setBackground(new Color(0, 153, 51));
				removelist.setBackground(new Color(0, 153, 51));
				bklist.setVisible(true);
				crepane.setVisible(false);
				addb.setVisible(false);
				addbo.setVisible(false);
				borli.setVisible(false);
				rebo.setVisible(false);
				
			}
		});
		booklist.setHorizontalAlignment(SwingConstants.LEFT);
		booklist.setForeground(Color.WHITE);
		booklist.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		booklist.setFocusable(false);
		booklist.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		booklist.setBorderPainted(false);
		booklist.setBorder(null);
		booklist.setBackground(new Color(0, 153, 51));
		booklist.setBounds(50, 421, 236, 57);
		Image img6 = new ImageIcon(this.getClass().getResource("bs.png")).getImage();
		booklist.setIcon(new ImageIcon(img6));
		panel.add(booklist);
		
		removelist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removelist.setBackground(new Color(77,96,180));
				create.setBackground(new Color(0, 153, 51));
				addbook.setBackground(new Color(0, 153, 51));
				addbor.setBackground(new Color(0, 153, 51));
				borlist.setBackground(new Color(0, 153, 51));
				booklist.setBackground(new Color(0, 153, 51));
				rebo.setVisible(true);
				crepane.setVisible(false);
				bklist.setVisible(false);
				addb.setVisible(false);
				addbo.setVisible(false);
				borli.setVisible(false);
			
			}
		});
		removelist.setHorizontalAlignment(SwingConstants.LEFT);
		removelist.setForeground(Color.WHITE);
		removelist.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		removelist.setFocusable(false);
		removelist.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		removelist.setBorderPainted(false);
		removelist.setBorder(null);
		removelist.setBackground(new Color(0, 153, 51));
		removelist.setBounds(50, 503, 236, 57);
		Image img7 = new ImageIcon(this.getClass().getResource("rev.png")).getImage();
		removelist.setIcon(new ImageIcon(img7));
		panel.add(removelist);
		
		JTextPane txtpnWelcomeToLibrary = new JTextPane();
		txtpnWelcomeToLibrary.setText("Welcome to Library ");
		txtpnWelcomeToLibrary.setForeground(new Color(0, 153, 204));
		txtpnWelcomeToLibrary.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		txtpnWelcomeToLibrary.setEditable(false);
		txtpnWelcomeToLibrary.setBounds(304, 45, 279, 36);
		frame.getContentPane().add(txtpnWelcomeToLibrary);
		frame.setBounds(100, 100, 1000, 650);
		Image icon = new ImageIcon(this.getClass().getResource("book2.png")).getImage();
		frame.setIconImage(icon);
		frame.setTitle("Library Management System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
