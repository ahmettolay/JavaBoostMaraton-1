package UcuncuSoruHayvanlar;

public abstract class Hayvan {
	
	public String ad;
	public int kilosu;
	public int uzunlugu;
	public boolean temkinliMi ;


	public abstract void sesCikar();
	public abstract void hareketEt();
	public abstract String cinsi();


	public Hayvan(String ad, int kilosu, int uzunlugu, boolean temkinliMi) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
		this.temkinliMi = temkinliMi;
	}


	

}
