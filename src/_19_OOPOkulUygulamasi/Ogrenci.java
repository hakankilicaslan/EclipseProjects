package _19_OOPOkulUygulamasi;

public class Ogrenci {
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String ad;
	private String soyad;
	private int okulNo;
	private double notOrt;
	
	//Dolu Constructor: Dört parametreli constructor
	public Ogrenci(String ad, String soyad, int okulNo, double notOrt) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.okulNo = okulNo;
		setNotOrt(notOrt); //notOrt set metodu içinde bir koşula soktuğumuz için this.notOrt = notOrt; kullanırsak girilen değeri direkt atayacağından koşula sokup ona göre ataması için setNotOrt(notOrt); kullanıyoruz. 
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

	public int getOkulNo() {
		return okulNo;
	}

	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}

	public double getNotOrt() {
		return notOrt;
	}

	public void setNotOrt(double notOrt) {
		if(notOrt>=0 && notOrt<=100) {
			this.notOrt = notOrt;
		}else
		System.out.println("Ortalama 0 ile 100 arasında bir değer olmalıdır.");
	}

	//toString:
	@Override
	public String toString() {
		return ad+"\t"+soyad+"\t"+okulNo;
	}
	
}
