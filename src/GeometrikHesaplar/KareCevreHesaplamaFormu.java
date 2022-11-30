package GeometrikHesaplar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKareKenarı;
	private final JLabel lblSonuc = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareCevreHesaplamaFormu window = new KareCevreHesaplamaFormu();
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
	public KareCevreHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 741, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KareKenarı");
		lblNewLabel.setBounds(40, 104, 119, 33);
		frame.getContentPane().add(lblNewLabel);
		
		txtKareKenarı = new JTextField();
		txtKareKenarı.setBounds(436, 111, 96, 19);
		frame.getContentPane().add(txtKareKenarı);
		txtKareKenarı.setColumns(10);
		
		JButton btnCevreHesapla = new JButton("Cevre Hesapla");
		btnCevreHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hesap hesap=new Hesap();
				double kenar = Double.valueOf(txtKareKenarı.getText());
				double cevre=hesap.kareCevre(kenar);
				lblSonuc.setText( "Alan = "+cevre);
				
			}
		});
		btnCevreHesapla.setBounds(447, 213, 85, 21);
		frame.getContentPane().add(btnCevreHesapla);
		lblSonuc.setBounds(33, 429, 126, 36);
		frame.getContentPane().add(lblSonuc);
	}

}
