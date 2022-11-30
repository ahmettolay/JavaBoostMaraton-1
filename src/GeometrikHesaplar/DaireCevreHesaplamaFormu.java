package GeometrikHesaplar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtYariCap;
	private 	Hesap hesap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireCevreHesaplamaFormu window = new DaireCevreHesaplamaFormu();
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
	public DaireCevreHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 675, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Yari cap");
		lblNewLabel.setBounds(77, 94, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		txtYariCap = new JTextField();
		txtYariCap.setBounds(436, 91, 96, 19);
		frame.getContentPane().add(txtYariCap);
		txtYariCap.setColumns(10);
		
		JLabel lblSonuc = new JLabel("Sonuc : ");
		lblSonuc.setBounds(77, 363, 443, 13);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnCevreHesapla = new JButton("Cevre Hesapla");
		btnCevreHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hesap hesap = new Hesap();
				double yariCap= Double.valueOf(txtYariCap.getText());
				double cevre =hesap.daireCevre(yariCap);
				
				lblSonuc.setText("Cevre : "+cevre);
				
				
			}
		});
		btnCevreHesapla.setBounds(447, 196, 85, 21);
		frame.getContentPane().add(btnCevreHesapla);
	}

}
