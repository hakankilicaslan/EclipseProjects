package _01_DecisionStructures_KararYapilari;

import java.util.Scanner;

public class Soru_06_Ternary {

	public static void main(String[] args) {
		
		// Kullanıcıdan aldığımız öğrenci notu 50 ve üzeri ise geçer altındaysa kalır.
		//Ternary operatörünü kullanarak yazdıralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Öğrencinin notunu giriniz:");
		double not = scanner.nextDouble();
		
		String sonuc=(not>=50)? "Geçer" : "Kaldı";
		System.out.println(sonuc);
 }
}
