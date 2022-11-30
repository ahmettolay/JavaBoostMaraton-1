package UcuncuSoruHayvanlar.surungenler;

import UcuncuSoruHayvanlar.Surungen;


public class Yilan extends Surungen  {

	public Yilan(String ad, int kilosu, int uzunlugu, boolean temkinliMi) {
		super(ad, kilosu, uzunlugu, temkinliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		System.out.println("Yilan surunuyor.");
		
	}

	@Override
	public void sesCikar() {
		System.out.println("Yilan ses cikariyor tısss..");
		
	}

	

}
