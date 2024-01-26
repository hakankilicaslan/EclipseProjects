package _13_KutuphaneUygulamasi;

public class Runner {

	public static void main(String[] args) {
		
		//Uye sınıfından parametrelerini vererek yeni iki tane uye oluşturuyoruz.
		Uye uye1=new Uye("Hakan", "Kılıçaslan", "17059342526", "5324371355", "Beşiktaş,İstanbul", "28.01.2023", 100, 0);
		System.out.println(uye1);
		Uye uye2=new Uye("Sultan", "Kılıçaslan", "12029342526", "5357605500", "Eryaman,Ankara", "05.05.2023", 50, 1);
		System.out.println(uye2);
		
		System.out.println("----------------------------------------");
		
		//Kitap sınıfından parametrelerini vererek yeni iki tane kitap oluşturuyoruz
		Kitap kitap1=new Kitap("Simyaci", "Paulo Coelho", "Can Yayınları", "Fantastik Roman", "12.02.1988", 500, 3);
		System.out.println(kitap1);
		Kitap kitap2=new Kitap("Beşinci Dağ", "Paulo Coelho", "Can Yayınları", "Dini Kurgu Roman", "17.05.1996", 500, 2);
		System.out.println(kitap2);
		
		System.out.println("----------------------------------------");
		
		
		Kutuphane milletKutuphanesi=new Kutuphane(); //Kutuphane sınıfından milletKutuphanesi adında boş constructor ile yeni bir kutuphane oluşturuyoruz.
		milletKutuphanesi.kitapEkle(kitap1); //kitap1'i milletKutuphanesine ekliyoruz.
		milletKutuphanesi.kitaplariListele();
		milletKutuphanesi.kitapEkle(kitap2); //kitap2'yi milletKutuphanesine ekliyoruz.
		milletKutuphanesi.kitaplariListele(); //milletKutuphanesine eklenen kitapları yazdırıyoruz.
		
		milletKutuphanesi.uyeEkle(uye1); //uye1'i milletKutuphanesine ekliyoruz.
		milletKutuphanesi.uyeEkle(uye2); //uye2'yi milletKutuphanesine ekliyoruz.
		milletKutuphanesi.uyerleriListele(); //milletKutuphanesine eklenen üyeleri yazdırıyoruz.
		
		milletKutuphanesi.uyeArama(2); //milletKutuphanesinde uyeNo=2 bilgilerini bulmak için yazdığımız uyeArama metodu ile kütüphanemizde bu üye kayıtlı mı değil mi onu kontrol ediyoruz.
		
		System.out.println("----------------------------------------");
		
		Kutuphane okulKutuphanesi=new Kutuphane(); //Kutuphane sınıfından okulKutuphanesi adında boş constructor ile yeni bir kutuphane oluşturuyoruz.
		okulKutuphanesi.kitapEkle(kitap1); //kitap1'i okulKutuphanesine ekliyoruz.
		okulKutuphanesi.kitapEkle(kitap2); //kitap2'yi okulKutuphanesine ekliyoruz.
		okulKutuphanesi.kitaplariListele(); //okulKutuphanesine eklenen kitapları yazdırıyoruz.
		
		Uye uye3=new Uye("Selma", "Kılıçaslan", "73562425260", "5354920802", "Beşiktaş,İstanbul", "24.06.2023", 90, 2); //Uye sınıfından parametrelerini vererek yeni bir uye oluşturuyoruz.
		okulKutuphanesi.uyeEkle(uye1); //uye1'i okulKutuphanesine ekliyoruz.
		okulKutuphanesi.uyeEkle(uye2); //uye2'yi okulKutuphanesine ekliyoruz.
		okulKutuphanesi.uyeEkle(uye3); //uye3'ü okulKutuphanesine ekliyoruz.
		okulKutuphanesi.uyerleriListele(); //okulKutuphanesine eklenen üyeleri yazdırıyoruz.
		
		System.out.println("----------------------------------------");
		
		okulKutuphanesi.kitapOduncVer(kitap2, uye1, "02.09.2023"); //Kutuphane sınıfında kitapOduncVer metodumuzla kitap2'yi uye1'e ödünç veriyoruz.
		okulKutuphanesi.oduncleriListele(); //Ödünç verilen kitapları yazdırıyoruz.
		okulKutuphanesi.kitapOduncVer(kitap1, uye1, "02.09.2023"); //Kutuphane sınıfında kitapOduncVer metodumuzla kitap1'i uye1'e ödünç veriyoruz.
		okulKutuphanesi.oduncleriListele(); //Ödünç verilen kitapları yazdırıyoruz.
	}
	/*
	 * KitapTakipSistemimiz de geliştirilebilecek şeyler var. 
	 * Mesela bir kitap birden fazla aynı üyeye ya da başka üyeye ödünç verilebiliyor. 
	 * Ödünç verilen kitabı başka bir metot ile ödünç verildiyse bir şarta koşu başkasına ya da aynı üyeye ödünç verilmesini engelleyebiliriz.
	 * Ödünç alınan kitabın son teslim tarihi şeklinde bir şart ekleyebilir ve puan sistemi gibi bir şey oluşturarak zamanında getirmeyen üyeler için ceza sistemi ekleyebiliriz.
	 *  
	 */
}
