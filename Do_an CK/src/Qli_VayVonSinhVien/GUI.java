package Qli_VayVonSinhVien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.Toolkit;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class GUI extends JFrame {

	private static final Object ID = null;
	private JPanel contentPane;
	private JTable table;
	private JTextField tf_hovaten;
	private JTextField tf_ngaysinh;
	private JTextField tf_sdt;
	private JTextField tf_email;
	private JTextField tf_sotienvay;
	private JTextField tf_ngayvay;
	private JTextField tf_ngaytra;
	private JTextField tf_laisuat;
	private JTable table_1;
	private JComboBox cbb_gioitinh;
	private JComboBox cbb_kyhan;
	private Vector vData, vTitle;
	private JTextField tf_msv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Quản lí sinh viên vay vốn tại ngân hàng");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\DOWNLOADS\\bank.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1325, 691);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 1301, 644);
		tabbedPane.setBackground(Color.LIGHT_GRAY);
		contentPane.add(tabbedPane);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setForeground(Color.LIGHT_GRAY);
		layeredPane_2.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("Cập Nhật Sinh Viên Vay Tiền", new ImageIcon("E:\\DOWNLOADS\\team-management.png"), layeredPane_2, null);
		tabbedPane.setBackgroundAt(0, Color.LIGHT_GRAY);
		
		JPanel panel_table = new JPanel();
		panel_table.setToolTipText("");
		panel_table.setBorder(new TitledBorder(null,"Danh sách", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_table.setBounds(453, 167, 837, 390);
		layeredPane_2.add(panel_table);
		panel_table.setLayout(null);
		
		
		
		table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 20, 812, 258);
		panel_table.add(scrollPane);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("X\u00F3a");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(250, 317, 120, 40);
		panel_table.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("S\u1EEDa");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(399, 317, 120, 41);
		panel_table.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("L\u00E0m M\u1EDBi");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(546, 317, 120, 40);
		panel_table.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Tho\u00E1t");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3.setBounds(688, 317, 120, 40);
		panel_table.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Thêm");
		btnNewButton_4.setBounds(10, 325, 203, 32);
		panel_table.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try{
			            LocalDateTime current = LocalDateTime.now();
			            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			            String formatted = current.format(formatter);
			            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qli_vayvonsinhvien", "hongphong", "phong1953");
			            PreparedStatement pst = conn.prepareStatement("INSERT INTO vaytien VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			            
						pst.setString(1,tf_msv.getText());
			            pst.setString(2,tf_hovaten.getText());
			            pst.setString(3,tf_ngaysinh.getText());
			            
			            pst.setString(4, (String) cbb_gioitinh.getSelectedItem());
			            pst.setString(5,tf_sdt.getText());
			            pst.setString(6,tf_email.getText());
			            pst.setString(7,tf_sotienvay.getText());
			            pst.setString(8,tf_ngayvay.getText());
			            pst.setString(9,tf_ngaytra.getText());
			            pst.setString(10,tf_laisuat.getText());
			            pst.setString(11, (String) cbb_kyhan.getSelectedItem());
			         
			            pst.execute();

			        } catch (Exception ex){
			            ex.printStackTrace();
			        }

			        
			      
			        tf_hovaten.setText("");
			        tf_ngaysinh.setText("");
			        tf_sdt.setText("");
			        tf_email.setText("");
			        tf_sotienvay.setText("");
			        tf_ngayvay.setText("");
			        tf_ngaytra.setText("");
			        tf_laisuat.setText(""); 
			    }

			

				

		});
		
		JLabel lblNewLabel = new JLabel("Qu\u1EA3n L\u00ED Sinh Vi\u00EAn Vay V\u1ED1n T\u1EA1i Ng\u00E2n H\u00E0ng");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(623, 34, 556, 86);
		layeredPane_2.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng tin", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 22, 433, 535);
		layeredPane_2.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Họ và tên");
		lblNewLabel_1.setBounds(10, 64, 203, 32);
		panel_1.add(lblNewLabel_1);
		
		tf_hovaten = new JTextField();
		tf_hovaten.setBounds(223, 64, 203, 32);
		panel_1.add(tf_hovaten);
		tf_hovaten.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày sinh");
		lblNewLabel_2.setBounds(10, 106, 203, 32);
		panel_1.add(lblNewLabel_2);
		
		tf_ngaysinh = new JTextField();
		tf_ngaysinh.setBounds(223, 106, 203, 32);
		panel_1.add(tf_ngaysinh);
		tf_ngaysinh.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Giới tính");
		lblNewLabel_3.setBounds(10, 148, 203, 32);
		panel_1.add(lblNewLabel_3);
		
		cbb_gioitinh = new JComboBox();
		cbb_gioitinh.setBounds(223, 148, 203, 32);
		cbb_gioitinh.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ "}));
		panel_1.add(cbb_gioitinh);
		
		JLabel lblNewLabel_4 = new JLabel("Số điện thoại");
		lblNewLabel_4.setBounds(10, 190, 203, 32);
		panel_1.add(lblNewLabel_4);
		
		tf_sdt = new JTextField();
		tf_sdt.setBounds(223, 190, 203, 32);
		panel_1.add(tf_sdt);
		tf_sdt.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(10, 232, 203, 32);
		panel_1.add(lblNewLabel_5);
		
		tf_email = new JTextField();
		tf_email.setBounds(223, 232, 203, 32);
		panel_1.add(tf_email);
		tf_email.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Số tiền vay");
		lblNewLabel_6.setBounds(10, 274, 203, 32);
		panel_1.add(lblNewLabel_6);
		
		tf_sotienvay = new JTextField();
		tf_sotienvay.setBounds(223, 274, 174, 32);
		panel_1.add(tf_sotienvay);
		tf_sotienvay.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.setBackground(Color.WHITE);
		slider.setBounds(10, 316, 418, 42);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				tf_sotienvay.setText(""+ slider.getValue());
			}
			
		});
		slider.setMaximum(10000000);
		slider.setValue(0);
		slider.setMajorTickSpacing(5000000);
		slider.setMinorTickSpacing(1000000);
		panel_1.add(slider);
		
		JLabel lblNewLabel_7 = new JLabel("Ngày vay");
		lblNewLabel_7.setBounds(10, 365, 203, 32);
		panel_1.add(lblNewLabel_7);
		
		tf_ngayvay = new JTextField();
		tf_ngayvay.setBounds(223, 365, 203, 32);
		panel_1.add(tf_ngayvay);
		tf_ngayvay.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Ngày trả");
		lblNewLabel_8.setBounds(10, 407, 203, 32);
		panel_1.add(lblNewLabel_8);
		
		tf_ngaytra = new JTextField();
		tf_ngaytra.setBounds(223, 407, 203, 32);
		panel_1.add(tf_ngaytra);
		tf_ngaytra.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Lãi suất");
		lblNewLabel_9.setBounds(10, 449, 203, 32);
		panel_1.add(lblNewLabel_9);
		
		tf_laisuat = new JTextField();
		tf_laisuat.setBounds(223, 449, 203, 32);
		panel_1.add(tf_laisuat);
		tf_laisuat.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Kỳ hạn");
		lblNewLabel_11.setBounds(10, 491, 203, 32);
		panel_1.add(lblNewLabel_11);
		
		cbb_kyhan = new JComboBox();
		cbb_kyhan.setBounds(223, 491, 203, 32);
		cbb_kyhan.setModel(new DefaultComboBoxModel(new String[] {"Tháng", "Quý", "Năm"}));
		panel_1.add(cbb_kyhan);
		
		JLabel lblNewLabel_12 = new JLabel("VND");
		lblNewLabel_12.setBounds(400, 284, 27, 13);
		panel_1.add(lblNewLabel_12);
		
		JLabel lb_msv = new JLabel("Mã sinh viên");
		lb_msv.setBounds(10, 22, 203, 32);
		panel_1.add(lb_msv);
		
		tf_msv = new JTextField();
		tf_msv.setBounds(223, 19, 203, 35);
		panel_1.add(tf_msv);
		tf_msv.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("E:\\DOWNLOADS\\bank (1).png"));
		lblNewLabel_10.setBounds(448, 10, 155, 129);
		layeredPane_2.add(lblNewLabel_10);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Thông tin sinh viên", new ImageIcon("E:\\DOWNLOADS\\information.png"), layeredPane, null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Danh s\u00E1ch sinh vi\u00EAn \u0111ang vay ti\u1EC1n", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 1276, 546);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 23, 1256, 513);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		
		
		
		scrollPane_1.setViewportView(table_1);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Hổ trợ và tư vấn", new ImageIcon("E:\\DOWNLOADS\\social-care.png"), layeredPane_1, null);
		
		
	
		
		
	}
	
	private void reload() {
		try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qli_vayvonsinhvien", "hongphong", "phong1953");
		 Statement stm = conn.createStatement();
         ResultSet rst = stm.executeQuery("SELECT * FROM vaytien ");
         ResultSetMetaData rstmeta = rst.getMetaData();
         int num_columns = rstmeta.getColumnCount();
         String[] title = new String[]{
        		 "ID",
                 "Họ và Tên",
                 "Ngày sinh",
                 "Giới tính",
                 "Số điện thoại",
                 "Email",
                 "Số tiền vay",
                 "Ngày vay",
                 "Ngày trả",
                 "Lãi suất",
                 "Kì hạn",
               
         };

         while (rst.next()) {
             Vector row = new Vector<>();
             for (int i = 1; i <= num_columns; i++)
                 row.add(rst.getString(i));
             vData.add(row);
         }
         for (int i=1;i<=num_columns;i++){
             vTitle.add(title[i-1]);
         }
         conn.close();
         stm.close();
         rst.close();
	} catch (Exception ex) {
         ex.printStackTrace();   
	}
		table.setModel(new DefaultTableModel(vData,vTitle));
}
}
	