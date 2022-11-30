package UcuncuSoruHayvanlar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HayvanatBahcesi {

	List<Hayvan> hayvan;
	

	public HayvanatBahcesi() {
		
	}
	

	public HayvanatBahcesi(List<Hayvan> hayvan) {
		super();
		this.hayvan = hayvan;
	}
	

	List<MemeliHayvan> bahceyeMemeliHayvanEkle(MemeliHayvan m) {

		List<MemeliHayvan> memeliHayvanList= new ArrayList<>();
		memeliHayvanList.add(m);
		
		return memeliHayvanList;
		
	}

	void bahceyeSurungenEkle(Surungen s) {

		List<Surungen> surungenList= new ArrayList<>();
		surungenList.add(s);
	}

	public void hayvanSesCikarsin(Hayvan hayvan) {

		hayvan.sesCikar();
	}

	public void hayvaninCinsiniBul(Hayvan hayvan) {
		
	System.out.println(hayvan.ad+"  "+hayvan.cinsi());

	}

	public void hayvaninBilgileriniYazdir(Hayvan h) {

		
		System.out.println("Adı :"+h.ad+ " -- "+  "Kilosu : "+ h.kilosu+ " -- "+"usunlugu : "+h.uzunlugu+" Tehlikeli mi : " +h.temkinliMi);
	}
	
	

	

	public void hayvaniHareketEttir(Hayvan hayvan) {
		
		hayvan.hareketEt();
	}
	
public void tehlikeliHayvanMi(Hayvan hayvan) {
		
		if(hayvan.temkinliMi==true) {
			System.out.println(hayvan.ad+" teklikeli hayandır.");
		}
	}

public void tehlikeliHayvanlar(List<Hayvan> hayvans) {
	List<Hayvan> tehlikeliHayvanlarr =new ArrayList<>();
	for (Hayvan hayvan : hayvans) {
		if(hayvan.temkinliMi==true) {
			tehlikeliHayvanlarr.add(hayvan);
	}
	}
	System.out.print("Teklikeli Hayvanlar : ");
	for (Hayvan hayvan : tehlikeliHayvanlarr) {
		System.out.print(hayvan.ad);
	}
}

}
