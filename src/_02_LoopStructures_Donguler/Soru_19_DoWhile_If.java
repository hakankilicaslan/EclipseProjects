package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_19_DoWhile_If {

	public static void main(String[] args) {
		
		// Kullanıcıdan alınan sayının fakötriyelini do-while dögüsüyle yazdıralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi = scanner.nextInt();
		int faktoriyel=1;
		
		do {
			if(sayi!=0)
			faktoriyel*=sayi;
			sayi--;			
		} while (sayi>=1);
		System.out.println("Sayının faktöriyeli:"+faktoriyel);
	}
}
