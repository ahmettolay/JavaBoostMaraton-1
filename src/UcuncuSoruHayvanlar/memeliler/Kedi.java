package UcuncuSoruHayvanlar.memeliler;

import UcuncuSoruHayvanlar.MemeliHayvan;

public class Kedi extends MemeliHayvan {

	public Kedi(String ad, int kilosu, int uzunlugu, boolean temkinliMi) {
		super(ad, kilosu, uzunlugu, temkinliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		System.out.println(this.ad + " yürüyor");

	}

	@Override
	public void sesCikar() {
		System.out.println(this.ad + " miyavlıyor miyav miyav.");

	}

	@Override
	public String toString() {
		return "Kedi [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", temkinliMi=" + temkinliMi + "]";
	}

	
}
