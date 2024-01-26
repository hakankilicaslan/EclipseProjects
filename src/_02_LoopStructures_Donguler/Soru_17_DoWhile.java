package _02_LoopStructures_Donguler;

public class Soru_17_DoWhile {

	public static void main(String[] args) {
		
		// 1'den 100'e kadar olan sayıların toplamını yazdıralım.
		
		int toplam=0;
		int sayi=1;
		
		while(sayi<=100) {
			toplam+=sayi;
			sayi++;
		}System.out.println("Sayıların toplamı: "+toplam);
		
		//do-while ile yapalım.
		
		toplam=0;
		sayi=1;
		do {
			toplam+=sayi;
			sayi++;
		} while (sayi<=100);
		System.out.println("Sayıların toplamı: "+toplam);
	}
}
