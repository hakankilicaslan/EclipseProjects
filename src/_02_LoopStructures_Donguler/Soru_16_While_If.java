package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_16_While_If {

	public static void main(String[] args) {
		
		// Kullanıcın girdiği kelimenin tersten yazılışı ile kendisi aynıysa kelime aynıdır değilse farklıdır yazdıralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelimeyi giriniz");
		//String kelime = scanner.nextLine(); Bütün satırı alır yani enter tuşuna basana kadar yazdıklarımızı alır.
		String kelime = scanner.next(); //İlk kelimeden sonraki boşluğa kadar alır yani space tuşuna basana kadar olan yazıyı alır.
		String tersKelime="";
		
		//System.out.println(kelime.length()); Kelimenin kaç harften oluştuğunu verir.
		
		int sonIndex=kelime.length()-1;
		while(sonIndex>=0) {
			tersKelime+=kelime.charAt(sonIndex);
			sonIndex--;
		}System.out.println("Kelimenin tersi: "+tersKelime);
		
		if(kelime.equals(tersKelime)) 
			System.out.println("Tersi aynı kelimedir");
		else 
			System.out.println("Tersi farklı kelimedir");	
	}
}
