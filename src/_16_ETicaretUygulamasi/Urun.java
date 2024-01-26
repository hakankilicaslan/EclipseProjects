package _16_ETicaretUygulamasi;

public class Urun {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String ad;
	private double fiyat;
	private double kdvOran=0.18; //Genel ürünler için Kdv oranını default olarak 0.18 alıyoruz.
	
	
	//İki parametreli constructor:
	public Urun(String ad, double fiyat) {
		super();
		this.ad = ad;
		this.fiyat = fiyat;
	}
	
	
	//Getters and Setters:
	public double getKdvOran() {
		return kdvOran;
	}

	public void setKdvOran(double kdvOran) {
		this.kdvOran = kdvOran;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	
	//fiyatHesapla() metoduyla verilen ham fiyata üstüne belirlenen kdvOranı nı ekleyerek satış fiyatını hesaplıyoruz.
	public double fiyatHesapla() {
		return fiyat+(fiyat*kdvOran); //fiyat*(1+kdvOran) gibi de yazabiliriz
	}
	
}
