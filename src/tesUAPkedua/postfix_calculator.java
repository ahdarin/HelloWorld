package tesUAPkedua;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class postfix_calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TextInput;
	private JTable table;
	JLabel lblHasil;
	algoritmapostfix postfix = new algoritmapostfix();
	String input;
	int hasil;
	JButton btnSimpan;
	Queue<String> qInp = new LinkedList<String>();
	Queue<Integer> qOutp = new LinkedList<Integer>();
	sorting sort = new sorting();

    
    List<sorting.InputOutputPair> pairs = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					postfix_calculator frame = new postfix_calculator();
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
	public postfix_calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJudul = new JLabel("Postfix Calculator");
		lblJudul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJudul.setBounds(264, 11, 149, 32);
		contentPane.add(lblJudul);
		
		JLabel lbljudul2 = new JLabel("Input");
		lbljudul2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbljudul2.setBounds(10, 62, 48, 16);
		contentPane.add(lbljudul2);
		
		TextInput = new JTextField();
		TextInput.setBounds(68, 56, 137, 31);
		contentPane.add(TextInput);
		TextInput.setColumns(10);
		
		JButton btnProses = new JButton("PROSES");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = TextInput.getText();
				hasil = postfix.postfixEvaluate(input);
				lblHasil.setText("Hasil : " + hasil);
				btnSimpan.setEnabled(true);
			}
		});
		btnProses.setBounds(78, 107, 95, 23);
		contentPane.add(btnProses);
		
		lblHasil = new JLabel("");
		lblHasil.setBounds(9, 153, 148, 32);
		contentPane.add(lblHasil);
		
		btnSimpan = new JButton("SIMPAN");
		btnSimpan.setEnabled(false);
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qInp.add(input);
				qOutp.add(hasil);
				
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				while (!qInp.isEmpty() && !qOutp.isEmpty()) {
					pairs.add(new sorting.InputOutputPair(qInp.peek(),qOutp.peek()));
		            model.addRow(new Object[]{qInp.remove(), qOutp.remove()});
		        }
				
				lblHasil.setText(null);
				TextInput.setText(null);
				btnSimpan.setEnabled(false);
			}
		});
		btnSimpan.setBounds(78, 207, 95, 23);
		contentPane.add(btnSimpan);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Input", "Output"},
			},
			new String[] {
				"Input", "Output"
			}
		));
		table.setBounds(274, 54, 331, 176);
		contentPane.add(table);
		
		JButton btnUrutkan = new JButton("URUTKAN");
		btnUrutkan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sort.bubbleSort(pairs);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(1);
				for(sorting.InputOutputPair pair : pairs)
				model.addRow(new Object[]{pair.input,pair.output});
			}
		});
		btnUrutkan.setBounds(615, 176, 112, 23);
		contentPane.add(btnUrutkan);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(1);
				
				while(!pairs.isEmpty()) {
					pairs.clear();
				}
			}
		});
		btnReset.setBounds(615, 210, 112, 23);
		contentPane.add(btnReset);
	}
}
