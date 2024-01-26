package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_14_While {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan sayıların toplamını 0 girilene kadar hesaplayalım.
		
		Scanner scanner = new Scanner(System.in);
		int sayi=1;
		int toplam=0;
		
		while(sayi!=0) {
			System.out.println("Sayı giriniz");
			sayi = scanner.nextInt();
			toplam+=sayi;
		}
		System.out.println("Sayıların toplamı: " +toplam);
	}
}
