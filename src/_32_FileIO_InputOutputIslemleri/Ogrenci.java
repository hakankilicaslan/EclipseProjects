package _32_FileIO_InputOutputIslemleri;

public class Ogrenci {

	//Nesne Değişkenleri:
	private String adSoyad;
	private int ogrNo;
	
	//Constructor:
	public Ogrenci(String adSoyad, int ogrNo) {
		super();
		this.adSoyad = adSoyad;
		this.ogrNo = ogrNo;
	}
	
	//Getters and Setters:
	public String getAdSoyad() {
		return adSoyad;
	}
	
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
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
		return "Ogrenci [adSoyad=" + adSoyad + ", ogrNo=" + ogrNo + "]";
	}
	
}
