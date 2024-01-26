package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_32_For {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan sayı kadar satır ve sütundan oluşan bir ters üçgeni for döngüsüyle yazdıralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayıyı giriniz");
		int sayi = scanner.nextInt();
		String karakter="*";
		
		for (int i = sayi ; i >=1 ; i--) {
			for (int j = 1 ; j <=i ; j++) 
				System.out.print(karakter);
			System.out.println();
		    }
	}
}
