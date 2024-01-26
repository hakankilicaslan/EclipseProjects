package _01_DecisionStructures_KararYapilari;

import java.util.Scanner;

public class Soru_07_Ternary {

	public static void main(String[] args) {
		
		// Kullanıcıdan girdiği sayının negatif ya da pozitif olduğunu ternary operatörüyle yazdıralım.
				
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi = scanner.nextInt();
				
		//String sonuc=(sayi>=0)? "Pozitif" : "Negatif";
		//System.out.println(sonuc);
		
		//Ternary operatörünü içine bir tane daha ternary atayarak üçüncü bir koşul koyabiliriz.
		
		String sonuc=(sayi>=0)? (sayi==0) ? "Sıfır" : "Pozitif" : "Negatif";
		System.out.println(sonuc);
 }
}
