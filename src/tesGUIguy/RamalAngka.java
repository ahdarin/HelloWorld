package tesGUIguy;

import java.awt.BorderLayout;
import java.awt.image.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class RamalAngka extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAngka;
	JLabel lbljawaban;
	JLabel lblfoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RamalAngka frame = new RamalAngka();
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
	public RamalAngka() {
		setTitle("Think of a number!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblfoto = new JLabel("");
		lblfoto.setBounds(137, 249, 259, 126);
		contentPane.add(lblfoto);
		
		JLabel lblJudul = new JLabel("Think of a number!");
		lblJudul.setHorizontalAlignment(SwingConstants.CENTER);
		lblJudul.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblJudul.setBounds(10, 22, 520, 31);
		contentPane.add(lblJudul);
		
		JLabel lblIWillPredict = new JLabel("I will predict your guess.");
		lblIWillPredict.setHorizontalAlignment(SwingConstants.CENTER);
		lblIWillPredict.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblIWillPredict.setBounds(10, 55, 520, 31);
		contentPane.add(lblIWillPredict);
		
		JButton btnGuess = new JButton("GUESS IT!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textAngka.getText();
				lbljawaban.setText("You think of number " + num + "!");
				lblfoto.setIcon(new ImageIcon("C:\\Users\\Ahda\\Downloads\\two.jpg"));
			}
		});
		btnGuess.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnGuess.setBounds(188, 147, 158, 37);
		contentPane.add(btnGuess);
		
		JLabel lblNewLabel_2 = new JLabel("Input your thought :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(145, 112, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		textAngka = new JTextField();
		textAngka.setBounds(271, 109, 96, 20);
		contentPane.add(textAngka);
		textAngka.setColumns(10);
		
		lbljawaban = new JLabel("");
		lbljawaban.setHorizontalAlignment(SwingConstants.CENTER);
		lbljawaban.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lbljawaban.setBounds(10, 207, 520, 31);
		contentPane.add(lbljawaban);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbljawaban.setText("");
				textAngka.setText("");
				lblfoto.setIcon(null);
			}
		});
		btnRestart.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnRestart.setBounds(188, 386, 158, 37);
		contentPane.add(btnRestart);
	}
}
