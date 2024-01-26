package _21_InterfaceKatmanliSistem.repository.entities;

public class Calisan extends Kullanici{ //Kullanici sınıfından miras alıyoruz.

	//Nesne Değişkenleri: Kendi bulunduğu package içinden çağrılmayacağı için nesne değişkenlerini default olarak tanımladık.
	String ad;
	String soyad;
	String departman;
	
	//Dolu Constructor: Beş parametreli Constructor(2 parametre super() ile Kullanici sınıfından 3 parametre ise Calisan sınfından içeriyor.
	//Constructor oluştururken sınıfımız içindeki 3 nesne değişkenini de seçip oluşturunca Kullanicidan miras aldığımız için ordaki constructor içindeki parametreleri de otomatik olarak super() içinde kendisi getiriyor.
	public Calisan(String kullaniciAdi, String sifre, String ad, String soyad, String departman) {
		super(kullaniciAdi, sifre);
		this.ad = ad;
		this.soyad = soyad;
		this.departman = departman;
	}

	//Getters and Setters:
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

}
