package _01_DecisionStructures_KararYapilari;

import java.util.Scanner;

public class Soru_08_Ternary {

	public static void main(String[] args) {
		
		// Kullanıcıdan girdiği sayının tek mi çift mi olduğunu ternary operatörüyle yazdıralım.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi = scanner.nextInt();
						
		String sonuc=(sayi%2==0)? "Çift" : "Tek";
		System.out.println(sonuc);
 }
}
