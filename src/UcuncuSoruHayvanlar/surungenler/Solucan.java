package UcuncuSoruHayvanlar.surungenler;

import UcuncuSoruHayvanlar.Surungen;

public class Solucan extends Surungen {

	public Solucan(String ad, int kilosu, int uzunlugu, boolean temkinliMi) {
		super(ad, kilosu, uzunlugu, temkinliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		System.out.println(this.ad+" surunuyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(this.ad+" ses cikariyor ........");
		
	}

}
