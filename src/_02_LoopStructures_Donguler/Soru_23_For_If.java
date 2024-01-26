package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_23_For_If {

	public static void main(String[] args) {
		
		// Kullanıcıdan alınan sayıya kadar olan sayıların toplamını ve toplanan sayıları for döngüsüyle beraber yazdıralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayıyı giriniz");
		int sayi = scanner.nextInt();
		int toplam=0;
		
		for (int i = 1; i <= sayi; i++) {
			toplam+=i;
			System.out.print(i);
			if(i!=sayi)
				System.out.print("+");
		}System.out.println("="+toplam);
	}
}
