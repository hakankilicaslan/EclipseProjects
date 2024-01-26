package _12_OtoGaleriUygulamasi;

public class Runner {

	public static void main(String[] args) {

		Otomobil oto1 = new Otomobil("Toyota", "Corolla", 2020, 100, 130, new Motor(1500, "45673562", 300, 120)); //Motor sınıfından yeni bir nesne oluşturup yazdırmak yerine direkt yazdırırken bir Motor nesnesi oluşturduk.
		System.out.println(oto1);
		System.out.println(oto1.toString()); //toString(); metodu Object sınıfının içinde olduğundan yazdırırken sonuna toString() eklemesekte hata vermeden yazdırır. Biz toString metodunu override ettiğimiz için geriye nesnenin değişken değerlerini dönüyor. 
		
		OtoGaleri galeri1 = new OtoGaleri(10); //Yeni bir OtoGaleri nesnesi yaratıyoruz. İçinde de 10 otomobil kapasitesi olduğunu belirterek oluşturuyoruz.
		
		galeri1.otomobilEkle(oto1); //Galerimize oto1 aracını ekledi ve kapasitemiz 9'a düştü.
		galeri1.otomobilleriListele(); //oto1 aracımız galeriye eklendiği için onun bilgilerini yazdıracak.

		Otomobil oto2 = new Otomobil(); //Boş Constructor kullanarak yeni bir otomobil nesnesi üretiyoruz.
		galeri1.otomobilEkle(oto2); //Galerimize oto2 aracını ekledi ve kapasitemiz 8'e düştü.
		galeri1.otomobilleriListele(); //oto1 aracımız zaten vardı oto2'de galeriye eklendiği için ikisinin bilgilerini yazdıracak.
		
	}
	
	//int sayi=0708; //Sayının başına 0 yazınca bunu octal yani 8'lik sayı olarak görüyor. Sadece 0 ile 7 arası sayıları yazınca hata vermiyor. Sayı içinde 8 ya da 9 barındırırsa hata veriyor.
}
