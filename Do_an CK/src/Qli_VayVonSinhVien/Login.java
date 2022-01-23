package Qli_VayVonSinhVien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField t2;
	private JTextField t1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setForeground(Color.PINK);
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\DOWNLOADS\\ICON\\icon login.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 335);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(new Color(255, 175, 175));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setForeground(Color.PINK);
		panel.setBounds(0, 10, 587, 294);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setVisible(false);
		panel_1.setBounds(0, 10, 542, 267);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setVisible(false);
		panel_2.setBounds(0, 10, 561, 294);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		JButton btnNewButton = new JButton(" sign in");
		btnNewButton.setBounds(195, 177, 153, 35);
		panel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("E:\\DOWNLOADS\\ICON_ANH\\refer.png"));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel(" password  :");
		lblNewLabel_2.setBounds(55, 133, 136, 26);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("E:\\DOWNLOADS\\ICON_ANH\\unlock.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		t2 = new JPasswordField();
		t2.setBounds(195, 137, 241, 26);
		panel.add(t2);
		
		t1 = new JTextField();
		t1.setBounds(195, 82, 241, 26);
		panel.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" user name :");
		lblNewLabel_1.setBounds(55, 78, 135, 26);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("E:\\DOWNLOADS\\ICON_ANH\\add-user.png"));
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel = new JLabel("Log in to the system");
		lblNewLabel.setBounds(153, 0, 249, 64);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\log-in.png"));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		
		JButton btnNewButton_1 = new JButton("sign up");
		btnNewButton_1.setIcon(new ImageIcon("E:\\DOWNLOADS\\add-user.png"));
		btnNewButton_1.setBackground(new Color(255, 175, 175));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(35, 222, 125, 36);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JButton btnNewButton_2 = new JButton(" forgot password");
		btnNewButton_2.setIcon(new ImageIcon("E:\\DOWNLOADS\\lock.png"));
		btnNewButton_2.setBackground(Color.PINK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setVisible(false);
				panel_2.setVisible(true);
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_2.setBounds(320, 222, 204, 36);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_10 = new JLabel("Vui l\u00F2ng nh\u1EADp th\u00F4ng tin");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(160, 10, 299, 58);
		panel_1.add(lblNewLabel_10);
		
		
		
		JLabel lblNewLabel_3 = new JLabel(" user name :");
		lblNewLabel_3.setIcon(new ImageIcon("E:\\DOWNLOADS\\ICON_ANH\\add-user.png"));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(55, 78, 135, 26);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" password :");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\DOWNLOADS\\ICON_ANH\\unlock.png"));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(55, 133, 136, 26);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(" phone number :");
		lblNewLabel_5.setIcon(new ImageIcon("E:\\DOWNLOADS\\number-blocks.png"));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(24, 186, 167, 26);
		panel_1.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(195, 82, 241, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 137, 241, 26);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(195, 187, 241, 26);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("sign up");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_5.setBounds(205, 223, 117, 34);
		panel_1.add(btnNewButton_5);
		
		
		JLabel lblNewLabel_6 = new JLabel("Vui l\u00F2ng nh\u1EADp l\u1EA1i th\u00F4ng tin");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(167, 10, 274, 58);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(" user name :");
		lblNewLabel_7.setIcon(new ImageIcon("E:\\DOWNLOADS\\ICON_ANH\\add-user.png"));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(55, 78, 135, 26);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(" phone number :");
		lblNewLabel_8.setIcon(new ImageIcon("E:\\DOWNLOADS\\number-blocks.png"));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(24, 133, 167, 26);
		panel_2.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(195, 82, 241, 26);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(195, 137, 241, 26);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Ok");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_3.setBounds(275, 173, 72, 25);
		panel_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_9 = new JLabel(" password :");
		lblNewLabel_9.setIcon(new ImageIcon("E:\\DOWNLOADS\\ICON_ANH\\unlock.png"));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(55, 222, 135, 25);
		panel_2.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(195, 217, 241, 30);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		
		
		JButton btnNewButton_4 = new JButton("Sign in");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_4.setBounds(244, 257, 144, 27);
		panel_2.add(btnNewButton_4);
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setVisible(true);
				panel_2.setVisible(false);
				
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						String username = t1.getText();
						String password = new String(t2.getPassword());

						StringBuilder sb = new StringBuilder();

						if (username.equals("")) {
							sb.append("Username is empty \n");
						}
						if (password.equals("")) {
							sb.append("Password is empty \n");
						}

						if (sb.length() > 0) {
							JOptionPane.showMessageDialog(rootPane, sb.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
							return;
						}

						if (username.equals("admin") && password.equals("phong1953")) {
							JOptionPane.showMessageDialog(rootPane, "Login successfully");
							
							GUI frame = new GUI();
							frame.setVisible(true);
							setVisible(false);
						//	View frame = new View();
							//frame.setVisible(true);
						//	setVisible(false);
						} else {
							JOptionPane.showMessageDialog(rootPane, "Invalid username or password  ","Failure",
									JOptionPane.ERROR_MESSAGE);
						
						}
			}
		});
	}
}
