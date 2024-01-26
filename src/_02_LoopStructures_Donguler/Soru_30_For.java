 package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_30_For {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan sayı kadar satır ve sütundan oluşan bir kareyi for döngüsüyle çizelim.(* kullanarak)

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayıyı giriniz");
		int sayi = scanner.nextInt();
		String karakter="*";
		
		
		for (int i = 1 ; i <=sayi ; i++) {
			for (int j = 1 ; j <=sayi ; j++) 
				System.out.print(karakter);
			System.out.println();
		}
	}
}

