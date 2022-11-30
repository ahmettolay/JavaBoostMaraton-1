package UcuncuSoruHayvanlar;

public abstract class MemeliHayvan extends Hayvan  {
	
	
	
public MemeliHayvan(String ad, int kilosu, int uzunlugu, boolean temkinliMi) {
		super(ad, kilosu, uzunlugu, temkinliMi);
	
	}


public void hareketEt(){
	 yuru();
}


public abstract void yuru();


public String cinsi(){
	
	return "Memeli";
}


}
