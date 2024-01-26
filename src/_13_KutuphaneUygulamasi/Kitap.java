package _13_KutuphaneUygulamasi;

public class Kitap {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String ad;
	private String yazar;
	private String yayinEvi;
	private String tur;
	private String basimTarihi;
	private int sayfaSayisi;
	private int adet;
	
	//Default Constructor: Kitap sınıfı için yeni nesne yaratırken kitap bilgilerini de alacağımız istediğimiz için boş constructor kullanmaya gerek kalmadı kaldırıyoruz.
//	public Kitap() {
//		super();
//	}

	//Dolu Constructor:
	public Kitap(String ad, String yazar, String yayinEvi, String tur, String basimTarihi, int sayfaSayisi, int adet) {
		super();
		this.ad = ad;
		this.yazar = yazar;
		this.yayinEvi = yayinEvi;
		this.tur = tur;
		this.basimTarihi = basimTarihi;
		this.sayfaSayisi = sayfaSayisi;
		this.adet = adet;
	}

	//Getters and Setters:
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getYayinEvi() {
		return yayinEvi;
	}

	public void setYayinEvi(String yayinEvi) {
		this.yayinEvi = yayinEvi;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public String getBasimTarihi() {
		return basimTarihi;
	}

	public void setBasimTarihi(String basimTarihi) {
		this.basimTarihi = basimTarihi;
	}

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

	//toString:
	@Override
	public String toString() {
		return "Kitap [ad=" + ad + ", yazar=" + yazar + ", yayinEvi=" + yayinEvi + ", tur=" + tur + ", basimTarihi="
				+ basimTarihi + ", sayfaSayisi=" + sayfaSayisi + ", adet=" + adet + "]";
	}

}
