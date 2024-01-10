package tesGUIguy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UAPgantidesimal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textInput;
	JLabel lblhasilBiner;
	JLabel lblhasilDesimal;
	JLabel lblhasilOktal;
	JLabel lblhasilHexa;
	JLabel lblerror;
	methoduntukuapbilangankomputer bantuan = new methoduntukuapbilangankomputer();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UAPgantidesimal frame = new UAPgantidesimal();
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
	public UAPgantidesimal() {
		setTitle("Sistem Bilangan Komputer Konverter");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistem Bilangan Komputer Konverter");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 18));
		lblNewLabel.setBounds(50, 21, 524, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jenis Input");
		lblNewLabel_1.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 105, 107, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Input");
		lblNewLabel_1_1.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(59, 140, 58, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox cbJenis = new JComboBox();
		cbJenis.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		cbJenis.setModel(new DefaultComboBoxModel(new String[] {"Biner", "Desimal", "Oktal", "Hexadesimal"}));
		cbJenis.setBounds(120, 105, 165, 27);
		contentPane.add(cbJenis);
		
		textInput = new JTextField();
		textInput.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		textInput.setBounds(122, 140, 163, 24);
		contentPane.add(textInput);
		textInput.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Biner       :");
		lblNewLabel_1_1_1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 222, 119, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Desimal     :");
		lblNewLabel_1_1_1_1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(10, 257, 119, 24);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Oktal       :");
		lblNewLabel_1_1_1_2.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 14));
		lblNewLabel_1_1_1_2.setBounds(10, 292, 119, 24);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Hexadesimal :");
		lblNewLabel_1_1_1_3.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 14));
		lblNewLabel_1_1_1_3.setBounds(10, 327, 119, 24);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		lblhasilBiner = new JLabel("");
		lblhasilBiner.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 14));
		lblhasilBiner.setBounds(139, 222, 119, 24);
		contentPane.add(lblhasilBiner);
		
		lblhasilDesimal = new JLabel("");
		lblhasilDesimal.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 14));
		lblhasilDesimal.setBounds(139, 257, 119, 24);
		contentPane.add(lblhasilDesimal);
		
		lblhasilOktal = new JLabel("");
		lblhasilOktal.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 14));
		lblhasilOktal.setBounds(139, 292, 119, 24);
		contentPane.add(lblhasilOktal);
		
		lblhasilHexa = new JLabel("");
		lblhasilHexa.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 14));
		lblhasilHexa.setBounds(139, 327, 119, 24);
		contentPane.add(lblhasilHexa);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblerror.setText(null);
				int input; //input dipanggil di masing2 case, soalny hexa pakai string, yg lain pakai int
				String jenis = cbJenis.getSelectedItem().toString();
				
				switch (jenis) {
				
				case "Biner":
					input = Integer.parseInt(textInput.getText());
					String hasilbiner=Integer.toString(input);
					lblhasilBiner.setText(hasilbiner);
					boolean isBiner = bantuan.Binerkah(input);
					
					if (isBiner) {
						int desimal = bantuan.B2D(input);
						String hasildesimal = Integer.toString(desimal);
						lblhasilDesimal.setText(hasildesimal);
						
						int oktal = bantuan.D2O(desimal);
						String hasiloktal = Integer.toString(oktal);
						lblhasilOktal.setText(hasiloktal);
						
						String hexa = bantuan.D2H(desimal);
						lblhasilHexa.setText(hexa);
					}	
						else {
						lblerror.setText("Error! Input bukan Biner!");
						lblhasilBiner.setText("0");
						lblhasilDesimal.setText("0");
						lblhasilOktal.setText("0");
						lblhasilHexa.setText("0");
					}
					break;
					
				case "Desimal":
					input = Integer.parseInt(textInput.getText());
					String desimal2=Integer.toString(input);
					lblhasilDesimal.setText(desimal2);
					
					int biner2 = bantuan.D2B(input);
					String hasilbiner2 = Integer.toString(biner2);
					lblhasilBiner.setText(hasilbiner2);
					
					int oktal2 = bantuan.D2O(input);
					String hasiloktal2 = Integer.toString(oktal2);
					lblhasilOktal.setText(hasiloktal2);
					
					String hexa2 = bantuan.D2H(input);
					lblhasilHexa.setText(hexa2);
					break;
					
				case "Oktal":
					input = Integer.parseInt(textInput.getText());
					String oktal3=Integer.toString(input);
					lblhasilOktal.setText(oktal3);
					
					int desimal3 = bantuan.O2D(input);
					String hasildesimal3 = Integer.toString(desimal3);
					lblhasilDesimal.setText(hasildesimal3);
					
					int biner3 = bantuan.D2B(desimal3);
					String hasilbiner3 = Integer.toString(biner3);
					lblhasilBiner.setText(hasilbiner3);
					
					String hexa3 = bantuan.D2H(desimal3);
					lblhasilHexa.setText(hexa3);
					break;
					
				case "Hexadesimal":
					String strhexa = textInput.getText();
					String buathexa= strhexa.toUpperCase(); //jadi kalau input ndk capslock bisa diantisipasi
					lblhasilHexa.setText(buathexa);
					
					int desimal4 = bantuan.H2D(buathexa);
					String hasildesimal4 = Integer.toString(desimal4);
					lblhasilDesimal.setText(hasildesimal4);
					
					int biner4 = bantuan.D2B(desimal4);
					String hasilbiner4 = Integer.toString(biner4);
					lblhasilBiner.setText(hasilbiner4);
					
					int oktal4 = bantuan.D2O(desimal4);
					String hasiloktal4 = Integer.toString(oktal4);
					lblhasilOktal.setText(hasiloktal4);
					break;
				}
				int x = Integer.parseInt(lblhasilBiner.getText());
				boolean binerkah = bantuan.Binerkah(x);
				if (x>1111111111 || !binerkah) {
					lblerror.setText("Maaf! Biner Melebihi Batas");
					lblhasilBiner.setText("Error!");
				}
				String[] hasil = new String[4];
				hasil[0] = lblhasilBiner.getText();
				hasil[1] = lblhasilDesimal.getText();
				hasil[2] = lblhasilOktal.getText();
				hasil[3] = lblhasilHexa.getText();
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(hasil);
				
			}
		});
		btnProses.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		btnProses.setBounds(295, 141, 89, 24);
		contentPane.add(btnProses);
		
		lblerror = new JLabel("");
		lblerror.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 12));
		lblerror.setBounds(120, 175, 198, 36);
		contentPane.add(lblerror);
		
		table = new JTable();
		table.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Biner", "Desimal", "Oktal", "Hexadesimal"},
			},
			new String[] {
				"Biner", "Desimal", "Oktal", "Hexadesimal"
			}
		));
		table.setBounds(394, 126, 397, 225);
		contentPane.add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Histori");
		lblNewLabel_2.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(560, 99, 58, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(1);
			}
		});
		btnReset.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		btnReset.setBounds(547, 358, 89, 24);
		contentPane.add(btnReset);
	}
}
