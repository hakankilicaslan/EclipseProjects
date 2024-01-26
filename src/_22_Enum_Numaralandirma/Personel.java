package _22_Enum_Numaralandirma;

import java.util.UUID;

public class Personel {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	String uuid;
	String ad;
	String adres;
	PersonelUnvanlar unvan; //Kullanıcı unvan kısmına kafasına göre değer vermesin diye PersonelUnvanlar enum oluşturduk ve PersonelUnvanlar türünde yani Enum içindeki unvanlardan birisini atamaya zorladık.
	
	//Dolu Constructor:
	public Personel(String ad, String adres, PersonelUnvanlar unvan) {
		super();
		this.uuid=UUID.randomUUID().toString(); //Sistem eşsiz bir uuid tanımlasın diye UUID(Universally Unique Identifier) sınıfından random bir uuid atanıyor.
		this.ad = ad;
		this.adres = adres;
		this.unvan = unvan;
	}

	//Getters and Setters:
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public PersonelUnvanlar getUnvan() {
		return unvan;
	}

	public void setUnvan(PersonelUnvanlar unvan) {
		this.unvan = unvan;
	}

	public String getUuid() { //uuid sistem tarafından random olarak atanacağından uuid için setUuid() tanımlamadık.
		return uuid;
	}
	
}
