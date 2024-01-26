package _06_Arrays_Diziler;

import java.util.Arrays;

public class _09_DizideSatirSutunToplama {

	public static void main(String[] args) {
		
		//Çoklu dizideki her satırdaki ve sütundaki sayıların toplamını ayrı ayrı yazdıralım.

		int[][] sayilar= {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //Bu çoklu dizi 3 satır 4 sütundan oluşan 3x4'lük bir dizidir.
		
		//İlk for döngümüzde satırdaki sayıların toplamını buluyoruz:
		for (int i = 0; i < sayilar.length; i++) {
			int satirToplam=0;
			for (int j = 0; j < sayilar[i].length; j++) { 
				satirToplam+=(sayilar[i][j]);
			}
			String satirElemanlar=Arrays.toString(sayilar[i]);
			System.out.println((i+1)+". satır: "+satirElemanlar+" = "+satirToplam);
		}
		
		
		System.out.println("**************************");
		
		
		//İkinci for döngümüzde sütundaki sayıların toplamını buluyoruz:
		for (int i = 0; i < sayilar[0].length; i++) { 
			int sutunToplam=0;
			int[] sutunDizi=new int[sayilar.length];
			for (int j = 0; j < sayilar.length; j++) { 
				sutunDizi[j]=sayilar[j][i];
				sutunToplam+=sutunDizi[j];
			}
			System.out.println((i+1)+".sütun: "+Arrays.toString(sutunDizi)+" = "+sutunToplam);
		}
	}
}
