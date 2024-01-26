package _24_NestedClass_IcIceSinif.NestedStaticKullanimi;

import _24_NestedClass_IcIceSinif.NestedStaticKullanimi.Kitaplik.Kitap; 

public class KitaplikRunner {

	public static void main(String[] args) {

		//Kitaplik kitaplik1=new Kitaplik("A Kitaplığı"); //Inner class statik tanımlandığı için artık outer class nesnesi oluşturmak zorunda değiliz.
		
		/*
		 * Inner class statik olarak tanımlandığı için outer class nesnesi oluşturulmadan direkt olarak inner classın nesnesi oluşturulabilir.
		 * Kitaplik kitaplik1=new Kitaplik("A Kitaplığı"); diyerek outer classtan nesne oluşturuyorduk.
		 * Daha sonra Kitap kitap1=kitaplik1.new Kitap("A kitabı", "A Yayınevi"); diyerek kitaplik1 outer class referansı üzerinden inner classa erişip nesne oluşturuyorduk.
		 * Inner class statik olduğu için artık Kitap kitap1=new Kitap("A kitabı", "A Yayınevi"); diyerek inner class nesnesini outer class referansı kullanmadan oluşturabiliriz.
		 * 
		 */
		 
		Kitap kitap1=new Kitap("A kitabı", "A Yayınevi");
		kitap1.kitapBilgileriniYazdir();
		
		Kitaplik kitaplik1=new Kitaplik("A Kitaplığı");
		kitaplik1.kitaplikBilgileriniYazdir();
		
	}

}
