import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class loader {

	private JFrame frame;
	private JTextField txtLoading;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loader window = new loader();
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
	public loader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		txtLoading = new JTextField();
		txtLoading.setBorder(null);
		txtLoading.setForeground(new Color(0, 153, 153));
		txtLoading.setHorizontalAlignment(SwingConstants.CENTER);
		txtLoading.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		txtLoading.setText("Loading");
		txtLoading.setBounds(129, 171, 184, 47);
		frame.getContentPane().add(txtLoading);
		txtLoading.setColumns(10);
		
		Image loading = new ImageIcon(this.getClass().getResource("loading.gif")).getImage();
		JLabel load = new JLabel("");
		load.setBackground(Color.WHITE);
	
		load.setBounds(171, 68, 95, 86);
		load.setIcon(new ImageIcon(loading));
		frame.getContentPane().add(load);
		frame.setBounds(100, 100, 466, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
