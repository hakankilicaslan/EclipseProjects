package _28_CollectionFramework._4_Map;

public class Ogrenci {

	//Nesne Değişkenleri:
	private String ad;
	private String soyad;
	private int ogrNo;
	
	//Constructor:
	public Ogrenci(String ad, String soyad, int ogrNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.ogrNo = ogrNo;
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

	public int getOgrNo() {
		return ogrNo;
	}

	public void setOgrNo(int ogrNo) {
		this.ogrNo = ogrNo;
	}

	//toString:
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", soyad=" + soyad + ", ogrNo=" + ogrNo + "]";
	}
	
}
