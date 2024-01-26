package _24_NestedClass_IcIceSinif;

import _24_NestedClass_IcIceSinif.Universite.Ogrenci; 

public class NestedRunner {

	public static void main(String[] args) {

		Universite uni1=new Universite("Anadolu Üniversitesi"); //Inner class nesnesini oluşturabilmek için önce outer class nesnesi oluşturuyoruz.
		
		/*
		 * Ogrenci sınıfı inner class olduğu için üst sınıfın yani outer class nesnesi oluşturulmadan direkt olarak inner classın nesnesi oluşturulamaz.
		 * Inner classtan nesne oluşturabilmek için mutlaka öncesinde Outer classın nesnesi oluşturulmalıdır.
		 * Nesne oluşturulurken de Ogrenci sınıfı inner class olduğu için uni1 diyerek üst sınıf referansı üzerinden ona bağlı olarak inner class nesnesi oluşturabiliyoruz.
		 * Hiyerarşik bir durum olduğu için üst sınıfı refere etmeden alt sınıf nesnesi oluşmuyor.
		 * Ogrenci ogr1=Universite.new Ogrenci("Hakan", 456); -> Bu durumda sınıf üzerinden değil nesne(uni1) üzerinden yeni bir Ogrenci nesnesi oluşturulabilir.
		 */
		
		Ogrenci ogr1=uni1.new Ogrenci("Hakan", 456);
		Ogrenci ogr2=uni1.new Ogrenci("Selma", 756);
	
		ogr1.ogrenciBilgiGetir();
		ogr2.ogrenciBilgiGetir();
		
	}

}
