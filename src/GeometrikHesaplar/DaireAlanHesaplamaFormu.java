package GeometrikHesaplar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtYariCap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireAlanHesaplamaFormu window = new DaireAlanHesaplamaFormu();
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
	public DaireAlanHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 653, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Yarı Cap");
		lblNewLabel.setBounds(48, 71, 45, 13);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblSonuc = new JLabel("Sonuc :");
		lblSonuc.setBounds(48, 339, 460, 13);
		frame.getContentPane().add(lblSonuc);

		txtYariCap = new JTextField();
		txtYariCap.setBounds(412, 68, 96, 19);
		frame.getContentPane().add(txtYariCap);
		txtYariCap.setColumns(10);

		JButton btnAlanHesapla = new JButton("Alan Hesapla");
		btnAlanHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hesap hesap = new Hesap();
				double yariCap = Double.valueOf(txtYariCap.getText());
				double alan = hesap.daireAlan(yariCap);
				lblSonuc.setText("Alan : " + alan);

			}
		});
		btnAlanHesapla.setBounds(423, 192, 85, 21);
		frame.getContentPane().add(btnAlanHesapla);
	}

}
