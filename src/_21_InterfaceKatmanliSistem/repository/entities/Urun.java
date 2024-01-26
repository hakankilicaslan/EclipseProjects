package _21_InterfaceKatmanliSistem.repository.entities;

public class Urun {

	//Nesne Değişkenleri: Kendi bulunduğu package içinden çağrılmayacağı için nesne değişkenlerini default olarak tanımladık.
	static int urunIndex;
	int urunid;
	String ad;
	double birimFiyat;
	double kdvOran;
	String birimTur;
	double birimMiktar;
	
	//Dolu Constructor: Beş parametreli Constructor
	public Urun(String ad, double birimFiyat, double kdvOran, String birimTur, double birimMiktar) {
		super();
		urunIndex++; //Her constructor çağırıldığında yani her nesne(Urun) üretildiğinde urunid bir artsın diye urunIndex++ yapıp urunid içine atama yapıyoruz.
		this.urunid=urunIndex;
		this.ad = ad;
		this.birimFiyat = birimFiyat;
		this.kdvOran = kdvOran;
		this.birimTur = birimTur;
		this.birimMiktar = birimMiktar;
	}

	//Getters and Setters:
	public static int getUrunIndex() {
		return urunIndex;
	}

	public static void setUrunIndex(int urunIndex) {
		Urun.urunIndex = urunIndex;
	}

	public int getUrunid() {
		return urunid;
	}

	public void setUrunid(int urunid) {
		this.urunid = urunid;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public double getBirimFiyat() {
		return birimFiyat;
	}

	public void setBirimFiyat(double birimFiyat) {
		this.birimFiyat = birimFiyat;
	}

	public double getKdvOran() {
		return kdvOran;
	}

	public void setKdvOran(double kdvOran) {
		this.kdvOran = kdvOran;
	}

	public String getBirimTur() {
		return birimTur;
	}

	public void setBirimTur(String birimTur) {
		this.birimTur = birimTur;
	}

	public double getBirimMiktar() {
		return birimMiktar;
	}

	public void setBirimMiktar(double birimMiktar) {
		this.birimMiktar = birimMiktar;
	}
	
}
