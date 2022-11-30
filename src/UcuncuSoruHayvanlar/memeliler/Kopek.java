package UcuncuSoruHayvanlar.memeliler;

import UcuncuSoruHayvanlar.MemeliHayvan;

public class Kopek extends MemeliHayvan {

	public Kopek(String ad, int kilosu, int uzunlugu, boolean temkinliMi) {
		super(ad, kilosu, uzunlugu, temkinliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		System.out.println(this.ad+" yuruyor.");
		
	}

	@Override
	public void sesCikar() {
	System.out.println(this.ad+" havlıyor hav hav.");
		
	}

}
