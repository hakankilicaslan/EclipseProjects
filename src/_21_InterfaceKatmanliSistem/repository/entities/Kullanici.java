package _21_InterfaceKatmanliSistem.repository.entities;

import java.util.UUID;

public class Kullanici {

	//Nesne Değişkenleri: Kendi bulunduğu package içinden çağrılmayacağı için nesne değişkenlerini default olarak tanımladık.
	String uuid;
	String kullaniciAdi;
	String sifre;
	int durum; //0 ise pasif, 1 ise aktif
	
	//Dolu Constructor: İki parametreli Constructor
	public Kullanici(String kullaniciAdi, String sifre) {
		super();
		this.uuid=UUID.randomUUID().toString(); //Sistem eşsiz bir uuid tanımlasın diye UUID(Universally Unique Identifier) sınıfından random bir uuid atanıyor.
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}

	//Getters and Setters:
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public int getDurum() {
		return durum;
	}

	public void setDurum(int durum) {
		this.durum = durum;
	}
	
}
