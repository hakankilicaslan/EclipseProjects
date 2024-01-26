package _06_Arrays_Diziler;

import java.util.Scanner;

public class _04_DizidekiEnBuyukElemaniBulma {

	public static void main(String[] args) {
		
		//Kullanıcıdan dizideki eleman sayısını ve dizinin elemanlarını alalım.
		//Dizideki en büyük elemanı ve bulunduğu indexi yazdıralım.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dizideki eleman sayısını giriniz");
		int elemanSayisi = scanner.nextInt();
		int[] dizi=new int[elemanSayisi];
		
		int enBuyuk=Integer.MIN_VALUE;
		int index=0;
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(i+1+ ".elemanı giriniz");
			dizi[i] = scanner.nextInt();
			if(dizi[i]>enBuyuk) {
				enBuyuk=dizi[i];
				index=i;
			}
		}
		System.out.println("En büyük: "+enBuyuk+" sayısı "+index+".indexte bulundu");
	}
}
