package _28_CollectionFramework._4_Map;

import java.util.HashMap;
import java.util.Map;

public class OgrenciMain {

	public static void main(String[] args) {
		
		//Ogrenci sınıfından constructor parametrelerini girerek yeni Ogrenci nesnesi oluşturup Ogrenci sınıfının referansının nesneyi göstermesini sağlıyoruz
		Ogrenci ogr1=new Ogrenci("Hakan", "Kılıçaslan", 456);
		Ogrenci ogr2=new Ogrenci("Gökhan", "Kılıçaslan", 777);
		Ogrenci ogr3=new Ogrenci("Volkan", "Kılıçaslan", 666);
		Ogrenci ogr4=new Ogrenci("Sultan", "Kılıçaslan", 123);
		
		Map<Integer, Ogrenci> ogrenciler=new HashMap<>(); //HashMap sınıfından nesne oluşturup içine Key olarak Integer değer, Value olarakta Ogrenci nesnesi alan bir Map interface'inden referansının onu göstermesini sağlıyoruz. 
	
		//put() metoduyla Key kısmına öğrencilerin öğrenci numarasını, Value kısmına da öğrencileri ekliyoruz.
		ogrenciler.put(ogr1.getOgrNo(), ogr1);
		ogrenciler.put(ogr2.getOgrNo(), ogr2);
		ogrenciler.put(ogr3.getOgrNo(), ogr3);
		ogrenciler.put(ogr4.getOgrNo(), ogr4);
		
		//456 nolu öğrencinin bilgilerini yazdıralım.
		System.out.println(ogrenciler.get(456));
		
		//777 nolu öğrencinin adını yazdıralım.
		System.out.println(ogrenciler.get(777).getAd()); 
		
		//666 nolu öğrencinin soyadını yazdıralım.
		System.out.println(ogrenciler.get(666).getSoyad());
		
		//123 nolu öğrencinin adını ve soyadını yazdıralım.
		System.out.println(ogrenciler.get(123).getAd()+" "+ogrenciler.get(123).getSoyad());
		
		//456 nolu öğrencinin adını ve notunu yazdıralım.
		System.out.println(ogrenciler.get(456).getAd()+" "+ogrenciler.get(456).getOgrNo());
		
	}

}
