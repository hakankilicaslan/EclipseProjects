package _29_Generic_Jenerik.PersonelGeneric;

public class Personel {
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields:
	public String ad;
	public String soyad;
	public String tel;
	
	//Constructor:
	public Personel(String ad, String soyad, String tel) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tel = tel;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	//toString:
	@Override
	public String toString() {
		return "Personel [ad=" + ad + ", soyad=" + soyad + ", tel=" + tel + "]";
	}

}
