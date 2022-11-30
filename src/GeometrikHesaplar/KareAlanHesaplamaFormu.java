package GeometrikHesaplar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKareKenarı;
	private JButton btnAlanHesapla;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareAlanHesaplamaFormu window = new KareAlanHesaplamaFormu();
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
	public KareAlanHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Karenin Kenarı");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(53, 87, 111, 33);
		frame.getContentPane().add(lblNewLabel);
		
		txtKareKenarı = new JTextField();
		txtKareKenarı.setBounds(395, 95, 96, 19);
		frame.getContentPane().add(txtKareKenarı);
		txtKareKenarı.setColumns(10);
		
		btnAlanHesapla = new JButton("Alan Hesapla");
		btnAlanHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hesap hesap=new Hesap();
				double kenar = Double.valueOf(txtKareKenarı.getText());
				double alan=hesap.kareAlan(kenar);
				lblSonuc.setText( "Alan = "+alan);
				
			}
		});
		btnAlanHesapla.setBounds(395, 171, 85, 21);
		frame.getContentPane().add(btnAlanHesapla);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSonuc.setBounds(53, 418, 590, 26);
		frame.getContentPane().add(lblSonuc);
	}
}
