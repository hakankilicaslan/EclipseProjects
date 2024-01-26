package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_20_DoWhile_If {

	public static void main(String[] args) {
		
		//Kullanıcın girdiği kelimenin tersten yazılışı ile kendisi aynıysa kelime aynıdır değilse farklıdır do-while ile yazdıralım.

		
		 Scanner scanner = new Scanner(System.in);
		 /* 
		System.out.println("Kelimeyi giriniz");
		String kelime = scanner.next();
		String tersKelime="";
		int sonIndex=kelime.length()-1;
		do {
			tersKelime+=kelime.charAt(sonIndex);
			sonIndex--;
		} while (sonIndex>=0);
		System.out.println("Kelimenin tersi: "+tersKelime);
		
		if(kelime.equals(tersKelime)) 
			System.out.println("Tersi aynı kelimedir");
		else 
			System.out.println("Tersi farklı kelimedir");
		*/
		
		System.out.println("Kelimeyi giriniz");
		String kelime = scanner.next();
		int sonIndex=kelime.length()-1;
		int ilkIndex=0;
		boolean polindrome=true;
		
		do {
			System.out.println(sonIndex+" index harf: "+kelime.charAt(sonIndex));
			System.out.println(ilkIndex+" index harf: "+kelime.charAt(ilkIndex));
			if(kelime.charAt(sonIndex)!=kelime.charAt(ilkIndex)) {
				polindrome=false;
				break;
			}
			sonIndex--;
			ilkIndex++;
		} while (ilkIndex<sonIndex);
		
		if(polindrome)
			System.out.println("Polindromedur.");
		else
			System.out.println("Polindrome değildir.");
	}
}
