package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_15_While {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan sayının faktöriyelini bulalım
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi = scanner.nextInt();
		int faktoriyel=1;
		
		while(sayi>0) {
			faktoriyel*=sayi;
			sayi--;
		}
		System.out.println("Sayının faktöriyeli: "+faktoriyel);
	}
}
