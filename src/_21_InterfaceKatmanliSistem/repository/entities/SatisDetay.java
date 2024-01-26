package _21_InterfaceKatmanliSistem.repository.entities;

public class SatisDetay {

	//Nesne Değişkenleri: Kendi bulunduğu package içinden çağrılmayacağı için nesne değişkenlerini default olarak tanımladık.
	String uuid;
	String satisID; 		 //1         -> Hangi satış içinde olduğunu göstermek için satisID oluşturuyoruz.
	String urunID;  		 //13(Ekmek) -> Satılan her ürünün kendine özgü bir kodu olduğu için urunID oluşturuyoruz.
	double miktar;  		 //2         -> O üründen kaç adet ya da kaç kilo satıldığını göstermesi için miktar oluşturuyoruz.
	double birimFiyat; 		 //9TL       -> Ürünlerin birim fiyatını yani kdvsiz fiyatlarını göstermesi için birimFiyat oluşturuyoruz.
	double toplamBirimFiyat; //18TL      -> Ürünlerin kaç adet satıldıysa o kadar kdvsiz fiyatını bulmak için yani kdvsiz toplam birim fiyatını bulmak için toplamBirimFiyat(birimFiyat*miktar) oluşturuyoruz.
	double kdvOran;		     //1%        -> Ürünlerin birim fiyata uygulanan kdv oranlarını tutması için kdvOran oluşturuyoruz.
	double satisFiyat;		 //20TL      -> Ürünlerin kdv dahil satış fiyatlarını göstermesi için satisFiyat oluşturuyoruz.
	
}
