package GeometrikHesaplar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKisaKenar;
	private JTextField txtUzunKenar;
	private Hesap hesap;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdortgenCevreHesaplamaFormu window = new DikdortgenCevreHesaplamaFormu();
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
	public DikdortgenCevreHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 638, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kisa Kenar");
		lblNewLabel.setBounds(49, 86, 85, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Uzun Kenar");
		lblNewLabel_1.setBounds(49, 128, 106, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblSonuc = new JLabel("Sonuc : ");
		lblSonuc.setBounds(49, 323, 408, 13);
		frame.getContentPane().add(lblSonuc);
		
		txtKisaKenar = new JTextField();
		txtKisaKenar.setBounds(373, 83, 96, 19);
		frame.getContentPane().add(txtKisaKenar);
		txtKisaKenar.setColumns(10);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setBounds(373, 125, 96, 19);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		JButton btnCevreHesapla = new JButton("Cevre Hesapla");
		btnCevreHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesap=new Hesap();
				double kisaKenar=Double.valueOf(txtKisaKenar.getText());
				double uzunKenar=Double.valueOf(txtUzunKenar.getText());
				double cevre= hesap.dikdortgenCevre(kisaKenar, uzunKenar);
				lblSonuc.setText("Cevre : "+cevre);
			}
		});
		btnCevreHesapla.setBounds(341, 194, 128, 21);
		frame.getContentPane().add(btnCevreHesapla);
	}

}
