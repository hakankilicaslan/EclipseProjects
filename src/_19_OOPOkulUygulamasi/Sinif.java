package _19_OOPOkulUygulamasi;

import java.util.ArrayList;

public class Sinif {
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String sinifAd;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrenciArrayList;
	
	//Dolu Constructor: İki parametreli constructor
	public Sinif(String sinifAd, String lokasyon) {
		super();
		this.sinifAd = sinifAd;
		this.lokasyon = lokasyon;
		this.ogrenciArrayList = new ArrayList<>();
	}
	
	//Dolu Constructor: Üç parametreli constructor
	public Sinif(String sinifAd, String lokasyon, ArrayList<Ogrenci> ogrenciArrayList) {
		super();
		this.sinifAd = sinifAd;
		this.lokasyon = lokasyon;
		this.ogrenciArrayList = ogrenciArrayList;
	}

	//Getters and Setters:
	public String getSinifAd() {
		return sinifAd;
	}

	public void setSinifAd(String sinifAd) {
		this.sinifAd = sinifAd;
	}

	public String getLokasyon() {
		return lokasyon;
	}

	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}

	public ArrayList<Ogrenci> getOgrenciArrayList() {
		return ogrenciArrayList;
	}

	public void setOgrenciArrayList(ArrayList<Ogrenci> ogrenciArrayList) {
		this.ogrenciArrayList = ogrenciArrayList;
	}
 
	//foreach döngüsünü kullanarak sınıf listemize eklediğimiz öğrencileri yazdırmak için ogrenciListeYazdir() metodunu kullanıyoruz.
	public void ogrenciListeYazdir() {
		System.out.println("*****"+sinifAd+" Sınıfı Öğrenci Listesi*****");
		System.out.println("Ad\tSoyad\t\tNo");
		for (Ogrenci ogrenci : ogrenciArrayList) {
			System.out.println(ogrenci);
		}
	}
	
	//.add() diyerek öğrencileri tek tek eklemek yerine varargs kullanarak ogrenciEkle metoduyla kaç tane ogrenci verildiyse foreach döngüsünde hepsini ogrenciArrayList içine ekliyor.
	public void ogrenciEkle(Ogrenci...ogrenci) {
		for (Ogrenci ogr : ogrenci) {
			ogrenciArrayList.add(ogr);
		}
	}
	
	//toString:
	@Override
	public String toString() {
		return sinifAd+"\t"+lokasyon;
	}
	
}
