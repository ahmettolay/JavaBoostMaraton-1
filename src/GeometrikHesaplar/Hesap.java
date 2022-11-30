package GeometrikHesaplar;

public class Hesap {

	// -------------ALAN-----------------------//
	public double kareAlan(double kenar) {
		return kenar * kenar;
	}

	public double dikdortgenAlan(double kenarKisa, double kenarUzun) {
		return kenarKisa * kenarUzun;
	}

	public double daireAlan(double yariCap) {
		return Math.PI * yariCap * yariCap;
	}

//--------------------CEVRE-----------------------//
	public double kareCevre(double kenar) {
		return 4 * kenar;
	}

	public double dikdortgenCevre(double kenarKisa, double kenarUzun) {
		return 2 * (kenarKisa * kenarUzun);
	}

	public double daireCevre(double yariCap) {
		return 2 * Math.PI * yariCap;
	}

}
