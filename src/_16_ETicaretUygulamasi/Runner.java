package _16_ETicaretUygulamasi;

public class Runner {

	public static void main(String[] args) {
		
		//Birer adet KirtasiyeUrun ve ElektronikUrun nesnesi oluşturuyoruz.
		ElektronikUrun telefon=new ElektronikUrun("Iphone 14", 20000);
		KirtasiyeUrun defter=new KirtasiyeUrun("A4 Defter", 50);

		//Verilen ürünlerin üzerine kdvOran eklenerek satış fiyatlarını hesaplıyoruz.
		System.out.println(telefon.fiyatHesapla());
		System.out.println(defter.fiyatHesapla());
		
		//Bir Urun dizisi oluşturarak farklı tipteki elemanları ekleyip foreach döngüsüyle kdv dahil satış fiyatlarını yazdırabiliyoruz.
		//Urun sınıfından extends ettiğimiz için urun.getAd() ve urun.fiyatHesapla() metotlarını kullansak bile yine aynı değerleri yazdırıyor.
		//Burada bir çatı altında toplamış genelleştirmiş oluyoruz. Diğer ürünleri Urun sınıfı üzerinden yazıdırıyoruz yani polymorphism yapmış oluyoruz.
		Urun[] urunler= {telefon, defter}; 
		for (Urun urun : urunler) {
			System.out.println(urun.getAd()+" bu ürünün kdv dahil satış fiyatı: "+urun.fiyatHesapla());
		}
		
	}

}
