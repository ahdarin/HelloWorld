package belajarUAP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TesStringPesanan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jmlBurger;
	private JTextField jmlSoda;
	private JTextField jmlRoti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesStringPesanan frame = new TesStringPesanan();
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
	public TesStringPesanan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBurger = new JLabel("Burger ($2)");
		lblBurger.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBurger.setBounds(146, 39, 131, 45);
		contentPane.add(lblBurger);
		
		jmlBurger = new JTextField();
		jmlBurger.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jmlBurger.setBounds(40, 48, 96, 27);
		contentPane.add(jmlBurger);
		jmlBurger.setColumns(10);
		
		JLabel labeldoang = new JLabel("jumlah");
		labeldoang.setBounds(56, 23, 49, 14);
		contentPane.add(labeldoang);
		
		JLabel lblSoda = new JLabel("Soda ($0,75)");
		lblSoda.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSoda.setBounds(146, 105, 117, 45);
		contentPane.add(lblSoda);
		
		jmlSoda = new JTextField();
		jmlSoda.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jmlSoda.setColumns(10);
		jmlSoda.setBounds(40, 114, 96, 27);
		contentPane.add(jmlSoda);
		
		JLabel lblRoti = new JLabel("Roti Jala Mak Limah Biadab ($1200)");
		lblRoti.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRoti.setBounds(146, 174, 285, 45);
		contentPane.add(lblRoti);
		
		jmlRoti = new JTextField();
		jmlRoti.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jmlRoti.setColumns(10);
		jmlRoti.setBounds(40, 183, 96, 27);
		contentPane.add(jmlRoti);
		
		JLabel lblTotal = new JLabel("");
		lblTotal.setBounds(446, 64, 331, 25);
		contentPane.add(lblTotal);
		
		JLabel lblHarga = new JLabel("");
		lblHarga.setBounds(446, 123, 331, 25);
		contentPane.add(lblHarga);
		
		JButton btnPesan = new JButton("Total");
		btnPesan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jmlburger = jmlBurger.getText();
				String jmlsoda = jmlSoda.getText();
				String jmlroti = jmlRoti.getText();
				String  orderburger, ordersoda, orderroti;
				int intburger, intsoda, introti;
				
				if (jmlburger.isEmpty()) {
					orderburger="";
					intburger=0;
				} else {
					intburger = Integer.parseInt(jmlburger);
					orderburger=(intburger + "x Burger");
				}
				
				if (jmlsoda.isEmpty()) {
					ordersoda="";
					intsoda=0;
				} else {
					intsoda = Integer.parseInt(jmlsoda);
					ordersoda=(intsoda + "x Soda");
				}

				if (jmlroti.isEmpty()) {
					orderroti="";
					introti=0;
				} else {
					introti = Integer.parseInt(jmlroti);
					orderroti=(introti + "x Roti Jala Mak Limah Biadab");
				}
				String total = (orderburger + "\n " + ordersoda + "\n " + orderroti);
				lblTotal.setText(total);
				double harga = (double) (intburger*2)+(intsoda*0.75)+(introti*1200);
				lblHarga.setText("$"+harga);
				
				jmlBurger.setText("");
				jmlSoda.setText("");
				jmlRoti.setText("");
			}
		});
		btnPesan.setBounds(40, 252, 89, 23);
		contentPane.add(btnPesan);
		
		JLabel lbldoang2 = new JLabel("pesanan");
		lbldoang2.setBounds(387, 75, 49, 14);
		contentPane.add(lbldoang2);
		
		JLabel lblNewLabel = new JLabel("total");
		lblNewLabel.setBounds(387, 123, 49, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pesan");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ntar disini pesanan segala macam nya kita masukkan ke struktur data *emot jempol
				if(e.getSource()==btnNewButton) {
					try {
						Windowbaru newwindow = new Windowbaru();
						newwindow.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
			});
		btnNewButton.setBounds(676, 252, 89, 23);
		contentPane.add(btnNewButton);

	}
}
