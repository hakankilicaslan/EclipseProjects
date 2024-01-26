package _21_InterfaceKatmanliSistem.repository.entities;

import java.util.UUID;

public class Satis {

	//Nesne Değişkenleri: Kendi bulunduğu package içinden çağrılmayacağı için nesne değişkenlerini default olarak tanımladık.
	String uuid;
	String calisanID;
	String musteriID;
	double fiyat;            //SatisDetay içindeki kdvsiz birim fiyatlarının yani toplamBirimFiyatlarının toplamı
	double kdvTutari;        //SatisDetay içindeki her ürüne uygulanan kdv oranlarının toplamı -> toplamFiyat-fiyat;
	double toplamSatisFiyat; //SatisDetay içindeki kdv dahil satış fiyatlarının yani toplamFiyatların toplamı
	String satisTarihi;
	
	//Dolu Constructor: Altı parametreli Constructor
	public Satis(String calisanID, String musteriID, double fiyat, double kdvTutari, double toplamSatisFiyat,String satisTarihi) {
		super();
		this.uuid=UUID.randomUUID().toString(); //Sistem eşsiz bir uuid tanımlasın diye UUID(Universally Unique Identifier) sınıfından random bir uuid atanıyor.
		this.calisanID = calisanID;
		this.musteriID = musteriID;
		this.fiyat = fiyat;
		this.kdvTutari = kdvTutari;
		this.toplamSatisFiyat = toplamSatisFiyat;
		this.satisTarihi = satisTarihi;
	}

	//Getters and Setters:
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCalisanID() {
		return calisanID;
	}

	public void setCalisanID(String calisanID) {
		this.calisanID = calisanID;
	}

	public String getMusteriID() {
		return musteriID;
	}

	public void setMusteriID(String musteriID) {
		this.musteriID = musteriID;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public double getKdvTutari() {
		return kdvTutari;
	}

	public void setKdvTutari(double kdvTutari) {
		this.kdvTutari = kdvTutari;
	}

	public double getToplamSatisFiyat() {
		return toplamSatisFiyat;
	}

	public void setToplamSatisFiyat(double toplamSatisFiyat) {
		this.toplamSatisFiyat = toplamSatisFiyat;
	}

	public String getSatisTarihi() {
		return satisTarihi;
	}

	public void setSatisTarihi(String satisTarihi) {
		this.satisTarihi = satisTarihi;
	}
	
}
