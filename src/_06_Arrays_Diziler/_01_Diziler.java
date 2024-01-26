package _06_Arrays_Diziler;

import java.util.Arrays;
import java.util.Random;

public class _01_Diziler {

	public static void main(String[] args) {
		
		//DİZİLER_ARRAYS
		//Diziler aynı tipte birden çok değeri tutmak için hazır yapılardır.
		//Diziyi tanımladıktan sonra ya boyutunu ya da dizinin elemanlarını hemen girmek gerekiyor.
				
		String ogrenci1Ad="Hakan";
		String ogrenci2Ad="Selma";
		String ogrenci3Ad="Seda";
		String ogrenci4Ad="Burak";
		//Kaç tane öğrenci varsa o kadar değişken tanımlamamız gerekiyor. Onun yerine hepsi aynı tipte olduğu için dizi kalıbını kullanabiliriz.
				
				
		//String []ogrenciAdlar;
		//String ogrenciAdlar[]; //Köşeli parantezi bu şekilde farklı farklı yerlerde de kullanabiliriz ama her koşulda değerin tipinden yani Stringten sonra olmalı.
		String[] ogrenciAdlar=new String[] {"Hakan", "Selma", "Seda", "Burak"}; //Dizimiz 4 elemandan oluştuğunu belirledik. Daha sonra eleman sayısını değiştiremiyoruz. Bunun için beşinci bir eleman ataması yapamayız hata alırız.
		String[] ogrenciSoyadlar= {"Kılıçaslan", "Kılıçaslan", "Gelişken", "Gelişken"};
		String[] ogrenciNotlar=new String[4]; //Öğrenci notlarının kaç olduğunu bilmiyorsak diziyi tanımlamak için kaç tane elemandan oluştuğunu girmemiz lazım.
		ogrenciNotlar[0]="100";
		ogrenciNotlar[3]="90"; //Eleman sayısı verilerek tanımlanan diziye daha sonra değer atabiliriz.
				
				
		for (String eleman : ogrenciNotlar) { //foreach READONLY'dir. Dizilerdeki elemanları görüntülemek için kullanılır.
			System.out.println(eleman); //Sadece dizinin ilk ve son elemanına değer atadığımız için diğer elemanlar null olarak görünüyor. Eleman sayısı belli olduğu için bellekte yer açılıyor ama değer ataması olmadığı için null görünüyor.
		}
				
		int elemanSayisi=ogrenciAdlar.length; //Dizinin eleman sayısını verir ama String değişkenlerdeki gibi sonuna () koymuyoruz.
			System.out.println("Dizinin eleman sayısı: "+elemanSayisi);
				
					
		System.out.println("*************");
				
				
		String[] dizi1=new String[2];
		dizi1[0]="Hakan";
		dizi1[1]="Kılıçaslan";
				
		String[] dizi2=dizi1; //İki dizi birbirine eşitlendiği zaman ikisi de aynı adresi gösterir
			System.out.println(dizi1[0]);
					
		dizi1[0]="Selma";
			System.out.println(dizi1[0]);
			System.out.println(dizi2[0]); //İki dizininde 0'ncı elemanı "Selma" oldu. "Hakan" silinip onun yerine "Selma" yazıldı.
					
					
		System.out.println("*************");
					
				
		boolean[] degerler=new boolean[3]; //boolean için eleman sayısı kaç girersek girelim alabileceği değerler sadece true ve false olur.
		degerler[0]=false;
		degerler[1]=true;
		degerler[2]=true;
	}
}
