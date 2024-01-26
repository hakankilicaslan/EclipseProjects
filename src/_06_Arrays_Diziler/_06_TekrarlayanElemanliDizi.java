package _06_Arrays_Diziler;

import java.util.Arrays;

public class _06_TekrarlayanElemanliDizi {

	public static void main(String[] args) {
		
		//{20,19,20,40,3,40,5,3,7,3} elemanlarından oluşan dizideki elemanlardan tekrar eden değerlerin fazlalarını çıkararak yeni bir dizi yazdıralım.
		//{20,19,40,3,5,7} şeklinde yazdıracağız.
				
		int[] dizi= {20,19,20,40,3,40,5,3,7,3};
		int[] yeniDizi; //Dizinin boyutu şu an belli olmadığı için bu şekilde bırakıyoruz.
		int yeniDiziElemanSayisi=dizi.length; //Yeni dizinin eleman sayısını eski dizinin eleman sayısına eşitledik ve tekrar eden değer oldukça azaltarak yeni dizinin eleman sayısını bulacağız.
				
		//yeniDizinin eleman sayısını belirleme:
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i+1; j < dizi.length; j++) {
				if(dizi[i]==dizi[j]) {
					yeniDiziElemanSayisi--;
					break; //iç döngüyü kırar.
				}
			}
		}
		int sayac=0;
		boolean esitMi;
		yeniDizi=new int[yeniDiziElemanSayisi];
			for (int i = 0; i < dizi.length; i++) { //dizi içinde tüm elemanları geziniyor.
				esitMi=false;
				for (int j = 0; j < yeniDizi.length; j++) { //yeniDizi içinde elemanları geziniyor.
					if(dizi[i]==yeniDizi[j]) {
						esitMi=true;
						break;				
					}
				}
				if(esitMi==false) {
					yeniDizi[sayac]=dizi[i];
					sayac++;
				}
			}
			System.out.println(Arrays.toString(yeniDizi));
	}
}
