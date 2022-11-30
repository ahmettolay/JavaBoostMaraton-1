package UcuncuSoruHayvanlar.memeliler;

import UcuncuSoruHayvanlar.MemeliHayvan;

public class Aslan extends MemeliHayvan {

	public Aslan(String ad, int kilosu, int uzunlugu, boolean temkinliMi) {
		super(ad, kilosu, uzunlugu, temkinliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		System.out.println(this.ad + "Yürüyor.");

	}

	@Override
	public void sesCikar() {
		System.out.println(this.ad + " kükrüyor kauvvv");

	}

}
