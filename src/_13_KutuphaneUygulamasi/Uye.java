package _13_KutuphaneUygulamasi;

public class Uye {
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String ad;
	private String soyad;;
	private String tcNo;
	private String telefon;
	private String adres;
	private String uyelikTarihi;
	private int uyeNo;
	private int puan;
	private int oduncKitapSayisi;
	
	//Default Constructor: Üye olan kişinin bilgilerini alarak üye yapacağımız için boş constructor kullanmıyoruz kaldırıyoruz.
//	public Uye() {
//		super();
//	}
	
	//Dolu Constructor:
	public Uye(String ad, String soyad, String tcNo, String telefon, String adres, String uyelikTarihi, int puan, int oduncKitapSayisi) {
		super();
		this.uyeNo=uyeNo++; 
		this.ad = ad;
		this.soyad = soyad;
		this.tcNo = tcNo;
		this.telefon = telefon;
		this.adres = adres;
		this.uyelikTarihi = uyelikTarihi;
		this.puan = puan;
		this.oduncKitapSayisi = oduncKitapSayisi;
	}

	//Getters and Setters:
	public int getUyeNo() {
		return uyeNo;
	}

	public void setUyeNo(int uyeNo) {
		this.uyeNo = uyeNo;
	}

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

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
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

	public String getUyelikTarihi() {
		return uyelikTarihi;
	}

	public void setUyelikTarihi(String uyelikTarihi) {
		this.uyelikTarihi = uyelikTarihi;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public int getOduncKitapSayisi() {
		return oduncKitapSayisi;
	}

	public void setOduncKitapSayisi(int oduncKitapSayisi) {
		this.oduncKitapSayisi = oduncKitapSayisi;
	}
	
	//toString:
	@Override
	public String toString() {
		return "Uye [uyeNo=" + uyeNo + ", ad=" + ad + ", soyad=" + soyad + ", tcNo=" + tcNo + ", telefon=" + telefon + ", adres=" + adres
				+ ", uyelikTarihi=" + uyelikTarihi + ", puan=" + puan + ", oduncKitapSayisi="
				+ oduncKitapSayisi + "]";
	}
	
}
