package UcuncuSoruHayvanlar;

import java.util.ArrayList;
import java.util.List;

import UcuncuSoruHayvanlar.memeliler.Aslan;
import UcuncuSoruHayvanlar.memeliler.Kedi;
import UcuncuSoruHayvanlar.memeliler.Kopek;
import UcuncuSoruHayvanlar.surungenler.Solucan;
import UcuncuSoruHayvanlar.surungenler.Yilan;

public class Test {

	public static void main(String[] args) {

		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();

		Aslan aslan1 = new Aslan("Simba ", 100, 20, true);
		Kedi kedi1 = new Kedi("tom", 12, 12, false);
		Kopek kopek1 = new Kopek("karabas", 14, 16, false);

		Solucan solucan = new Solucan("ttsolucan", 1, 1, false);
		Yilan yilan = new Yilan("anakonda", 15, 15, true);

		List<Hayvan> hayvanlar = new ArrayList<>();
		hayvanlar.add(kopek1);
		hayvanlar.add(aslan1);
		hayvanlar.add(kedi1);
		hayvanlar.add(solucan);
		hayvanlar.add(yilan);

		hayvanatBahcesi.hayvaniHareketEttir(aslan1);
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		System.out.println("---------------------------------");

	//	hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("kral", 152, 25, true));

	//	hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Kedi("siyahkedi", 152, 25, false));

		hayvanatBahcesi.hayvaniHareketEttir(aslan1);
		hayvanatBahcesi.hayvaniHareketEttir(kopek1);
		hayvanatBahcesi.hayvaniHareketEttir(kedi1);
		hayvanatBahcesi.hayvaniHareketEttir(solucan);
		hayvanatBahcesi.hayvaniHareketEttir(yilan);

		System.out.println("---------------------------------");

		hayvanatBahcesi.hayvaninCinsiniBul(yilan);
		hayvanatBahcesi.hayvaninCinsiniBul(aslan1);
		hayvanatBahcesi.hayvaninCinsiniBul(kopek1);
		hayvanatBahcesi.hayvaninCinsiniBul(kedi1);
		hayvanatBahcesi.hayvaninCinsiniBul(solucan);
		hayvanatBahcesi.hayvaninCinsiniBul(yilan);

		
		for (Hayvan hayvan : hayvanlar) {
			String name="ali";
			if(hayvan.ad.equals(name)) {
				System.out.println(name+" hayvanat bahçesinde");
			}else {
				System.out.println(name+" hayvanat bahçesinde yok");
				break;
			}
		}
	}

}
