package _01_DecisionStructures_KararYapilari;

import java.util.Scanner;

public class Soru_04_If {

	public static void main(String[] args) {
		
		//Kullanıcının girdiği fiyata göre indirim uygulayalım ve indirimli fiyatını yazdıralım.
		//1000TL ve üzerine %20, 500 ile 1000TL arasına %10 ve 100 ile 500 arasına %5 indirim uygulanacak.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ürünün fiyatını giriniz:");
		double fiyat = scanner.nextDouble();
		
		if(fiyat>=1000)
			fiyat*=0.8;
		else if(fiyat>=500)
			fiyat*=0.9;
		else if(fiyat>=100)
			fiyat*=0.95;
		
		System.out.println("İndirimli fiyat: " +fiyat+ "TL");
 }
}
