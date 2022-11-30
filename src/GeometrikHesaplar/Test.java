package GeometrikHesaplar;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Hesap hesap = new Hesap();

		boolean deger = true;
		while (deger) {

			menu();
			Scanner scanner = new Scanner(System.in);
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.print("Kerenin bir kerarını giriniz : ");
				double kenarA = scanner.nextDouble();
				System.out.println(hesap.kareAlan(kenarA));
				System.out.println("===========================");
				break;

			case 2:
				System.out.print("Kerenin bir kerarını giriniz : ");
				double kenarC = scanner.nextDouble();
				System.out.println(hesap.kareAlan(kenarC));
				System.out.println("===========================");
				break;
			case 3:
				System.out.print(" Kısa kerarını giriniz : ");
				double kenarAKisa = scanner.nextDouble();
				System.out.print(" Kısa kerarını giriniz : ");
				double kenarAUzun = scanner.nextDouble();
				System.out.println(hesap.dikdortgenAlan(kenarAKisa, kenarAUzun));
				System.out.println("===========================");
				break;

			case 4:
				System.out.print(" Kısa kerarını giriniz : ");
				double kenarCKisa = scanner.nextDouble();
				System.out.print(" Kısa kerarını giriniz : ");
				double kenarCUzun = scanner.nextDouble();
				System.out.println(hesap.dikdortgenCevre(kenarCKisa, kenarCUzun));
				System.out.println("===========================");
				break;

			case 5:
				System.out.print(" Yari capi giriniz : ");
				double yariCapA = scanner.nextDouble();

				System.out.println(hesap.daireAlan(yariCapA));
				System.out.println("===========================");
				break;
			case 6:
				
				System.out.print(" Yari capi giriniz : ");
				double yariCapC = scanner.nextDouble();

				System.out.println(hesap.daireAlan(yariCapC));
				System.out.println("===========================");
				break;
			case 7:
				System.out.println("Cıkıs Yapiliyor...");
				deger = false;
			}

		}

	}

	public static void menu() {

		System.out.println("-------------------------");
		System.out.println("1. Kare alan hesaplama");
		System.out.println("2. Kare çevre hesaplama");
		System.out.println("3. Dikdörtgen alan hesaplama");
		System.out.println("4. Dikdörtgen çevre hesaplama");
		System.out.println("5. Daire alan hesaplama");
		System.out.println("6. Daire Çevre hesaplama");
		System.out.println("7. Çıkış");
		System.out.println("-------------------------");
		System.out.println("Yapacağınız işlem için sayı giriniz : ");
	}

}
