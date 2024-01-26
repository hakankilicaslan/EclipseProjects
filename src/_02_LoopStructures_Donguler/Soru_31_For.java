package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_31_For {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan sayı kadar satır ve sütundan oluşan bir üçgeni for döngüsüyle yazdıralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayıyı giriniz");
		int sayi = scanner.nextInt();
		String karakter="*";
		
		for (int i = 1 ; i <=sayi ; i++) {
			for (int j = 1 ; j <=i ; j++) 
				System.out.print(karakter);
			System.out.println();
		    }
	}
}
