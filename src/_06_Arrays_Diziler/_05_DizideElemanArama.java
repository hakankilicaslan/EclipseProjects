package _06_Arrays_Diziler;

import java.util.Scanner;

public class _05_DizideElemanArama {

	public static void main(String[] args) {
		
		//Elemanları kullanıcı tarafından belirlenen 5 elemanlı bir dizide kullanıcının aradığı sayının olup olmadığını bulalım.
		
		Scanner scanner = new Scanner(System.in);
		int[] dizi=new int[5];

		for (int i = 0; i < dizi.length; i++) {
			System.out.println(i+1+ ".sayıyı giriniz");
			dizi[i] = scanner.nextInt();
		}
		System.out.println("Aradığınız sayıyı giriniz");
		int arananSayi=scanner.nextInt();
				
		for (int i = 0; i < dizi.length; i++) {
			if(arananSayi==dizi[i]) {
				System.out.println("Aradığınız sayı dizide bulunuyor.");
				break;
			}else if(i==dizi.length-1)
				System.out.println("Aradığınız sayı dizide bulunmuyor");
			}
	}
}
