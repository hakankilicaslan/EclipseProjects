package _02_LoopStructures_Donguler;

import java.util.Scanner;

public class Soru_27_For {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan kelimeyi for döngüsüyle tersten yazdıralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelimeyi giriniz");
		String kelime = scanner.next();
		
		for (int i = kelime.length()-1 ; i >=0 ; i--) 
			System.out.print(kelime.charAt(i));
	}
}
