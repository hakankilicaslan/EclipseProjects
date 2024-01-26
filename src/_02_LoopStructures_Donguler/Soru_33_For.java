package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_33_For {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan sayıların toplamını for döngüsüyle yazdıralım.(0 ile sonlansın)
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi = scanner.nextInt();
		int toplam=0;
		
		for (int i =0 ; sayi!=0 ; i++) {
			toplam+=sayi;
			System.out.println("Sayı giriniz");
			sayi = scanner.nextInt();
		}System.out.println("Toplamı: "+toplam);
	}
}
