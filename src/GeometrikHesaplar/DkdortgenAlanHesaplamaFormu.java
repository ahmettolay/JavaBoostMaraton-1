package GeometrikHesaplar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DkdortgenAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKisaKenar;
	private JTextField txtUzunKenar;
	private Hesap hesap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DkdortgenAlanHesaplamaFormu window = new DkdortgenAlanHesaplamaFormu();
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
	public DkdortgenAlanHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 667, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kısa kenar");
		lblNewLabel.setBounds(43, 52, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Uzun Kenar");
		lblNewLabel_1.setBounds(43, 100, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSonuc = new JLabel("Sonuc : ");
		lblSonuc.setBounds(43, 361, 524, 13);
		frame.getContentPane().add(lblSonuc);
		
		txtKisaKenar = new JTextField();
		txtKisaKenar.setBounds(421, 49, 96, 19);
		frame.getContentPane().add(txtKisaKenar);
		txtKisaKenar.setColumns(10);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setBounds(421, 97, 96, 19);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		JButton btnAlanHesapla = new JButton("Alan Hesapla");
		btnAlanHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hesap hesap= new Hesap();
					double kisaKenar = Double.valueOf(txtKisaKenar.getText());
					double uzunKenar = Double.valueOf(txtUzunKenar.getText());
					double alan = hesap.dikdortgenAlan(kisaKenar, uzunKenar);
				
						lblSonuc.setText("Alan : "+alan);	
						
						
			}
		});
		btnAlanHesapla.setBounds(432, 193, 85, 21);
		frame.getContentPane().add(btnAlanHesapla);
	}

}
