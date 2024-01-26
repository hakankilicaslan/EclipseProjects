package _21_InterfaceKatmanliSistem.repository.entities;

public class Musteri extends Kullanici { //Kullanici sınıfından miras alıyoruz.

	//Nesne Değişkenleri: Kendi bulunduğu package içinden çağrılmayacağı için nesne değişkenlerini default olarak tanımladık.
	String ad;
	String telefon;
	String adres;
	
	//Dolu Constructor: Beş parametreli Constructor(2 parametre super() ile Kullanici sınıfından 3 parametre ise Musteri sınfından içeriyor.
	//Constructor oluştururken sınıfımız içindeki 3 nesne değişkenini de seçip oluşturunca Kullanicidan miras aldığımız için ordaki constructor içindeki parametreleri de otomatik olarak super() içinde kendisi getiriyor.
	public Musteri(String kullaniciAdi, String sifre, String ad, String telefon, String adres) {
		super(kullaniciAdi, sifre);
		this.ad = ad;
		this.telefon = telefon;
		this.adres = adres;
	}
	
	//Getters and Setters:
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getTelefon() {
		return telefon;
	}
	
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
}
