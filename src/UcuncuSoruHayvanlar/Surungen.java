package UcuncuSoruHayvanlar;

public abstract class Surungen extends Hayvan {
	
	
public Surungen(String ad, int kilosu, int uzunlugu, boolean temkinliMi) {
		super(ad, kilosu, uzunlugu, temkinliMi);
		
	}



public void hareketEt(){
	surun();
}
public abstract void  surun();


public String cinsi(){
	
	return "Surungen";
}


}
