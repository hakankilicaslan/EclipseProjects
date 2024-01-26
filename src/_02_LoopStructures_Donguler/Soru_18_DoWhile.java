package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_18_DoWhile {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan sayıların toplamını do-while döngüsüyle yazdıralım.(0 ile sonlansın)
		
		Scanner scanner = new Scanner(System.in);
		
		int toplam=0;
		int sayi;
		do {
			System.out.println("Sayı giriniz");
			sayi = scanner.nextInt();
			toplam+=sayi;	
		} while (sayi!=0);
		System.out.println("Sayıların toplamı:"+toplam);
	}
}
