package _24_NestedClass_IcIceSinif.NestedOlmadanKullanim;

public class Ogrenci {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String ogrenciAd;
	private int ogrenciNo;
	
	//Dolu Constructor:
	public Ogrenci(String ogrenciAd, int ogrenciNo) {
		super();
		this.ogrenciAd = ogrenciAd;
		this.ogrenciNo = ogrenciNo;
	}

	//Getters and Setters:
	public String getOgrenciAd() {
		return ogrenciAd;
	}

	public void setOgrenciAd(String ogrenciAd) {
		this.ogrenciAd = ogrenciAd;
	}

	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

}
