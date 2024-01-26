package _01_DecisionStructures_KararYapilari;

import java.util.Scanner;

public class Soru_05_If {

	public static void main(String[] args) {
		
		//Kullanıcın girdiği sayının pozitif, negatif veya sıfır olduğunu belirleyelim.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi = scanner.nextInt();
		
		if(sayi==0)
			System.out.println("Girdiğiniz sayı 0'a eşittir");
		else if(sayi>0)
			System.out.println("Girdiğiniz sayı pozitiftir");
		else 
			System.out.println("Girdiğiniz sayı negatiftir");
 }
}
