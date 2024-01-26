package _06_Arrays_Diziler;

import java.util.Arrays;
import java.util.Random;

public class _02_RastgeleDiziOlusturma {

	public static void main(String[] args) {
		
		//10 elemanlı bir int dizisine for döngüsüyle rastgele 0 ile 100 arasında değer atayarak yazdıralım ve değerlerin toplamlarını bulalım.
		
		int[] sayilar=new int[10];
		Random rnd=new Random();
		int toplam=0;
		
		for (int i = 0; i<10 ; i++) {
			sayilar[i]=rnd.nextInt(0,101); //0 ile 100 arasında sayı üretip sayilar dizisinin içine tanımlıyoruz.
			toplam+=sayilar[i]; 
		}
		System.out.println("Dizideki değerlerin toplamı: "+toplam); //Dizideki değerlerin toplamını yazdırır.
		System.out.println(Arrays.toString(sayilar)); //Dizinin içindeki tüm elemanları yazdırır.
	}
}
