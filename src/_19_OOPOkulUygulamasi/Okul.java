package _19_OOPOkulUygulamasi;

import java.util.ArrayList;

public class Okul {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String okulAd;
	private String okulAdres;
	private ArrayList<Sinif> sinifArrayList;
	
	//Dolu Constructor: İki parametreli constructor
	public Okul(String okulAd, String okulAdres) {
		super();
		this.okulAd = okulAd;
		this.okulAdres = okulAdres;
		this.sinifArrayList = new ArrayList<>();
	}

	//Dolu Constructor: Üç parametreli constructor
	public Okul(String okulAd, String okulAdres, ArrayList<Sinif> sinifArrayList) {
		super();
		this.okulAd = okulAd;
		this.okulAdres = okulAdres;
		this.sinifArrayList = sinifArrayList;
	}

	//Getters and Setters:
	public String getOkulAd() {
		return okulAd;
	}

	public void setOkulAd(String okulAd) {
		this.okulAd = okulAd;
	}

	public String getOkulAdres() {
		return okulAdres;
	}

	public void setOkulAdres(String okulAdres) {
		this.okulAdres = okulAdres;
	}

	public ArrayList<Sinif> getSinifArrayList() {
		return sinifArrayList;
	}

	public void setSinifArrayList(ArrayList<Sinif> sinifArrayList) {
		this.sinifArrayList = sinifArrayList;
	}
	
	//.add() diyerek sınıfları tek tek eklemek yerine varargs kullanarak sinifEkle metoduyla kaç tane sınıf verildiyse foreach döngüsünde hepsini sinifArrayList içine ekliyor.
	public void sinifEkle(Sinif...sinif) {
		for (Sinif snf : sinif) {
			sinifArrayList.add(snf);
		}
	}
	
	//foreach döngüsünü kullanarak okula eklediğimiz sınıfları yazdırmak için siniflariYazdir() metodunu kullanıyoruz.
	public void siniflariYazdir() {
		System.out.println("*****"+okulAd+" Sınıf Listesi*****");
		System.out.println("SınıfAd\tLokasyon");
		for (Sinif sinif : sinifArrayList) {
			System.out.println(sinif);
		}
	}
	
	//tumOgrenciListesiYazdir() metoduyla okula eklediğimiz her sınıf için foreach döngüsü kullanarak ogrenciListeYazdir() metodunu çağırıp okuldaki tüm sınıf ve öğrenci bilgilerini yazdırıyoruz.
	public void tumOgrenciListesiYazdir() {
		System.out.println("*****"+okulAd+" Sınıf Öğrenci Listesi*****");
		for (Sinif sinif : sinifArrayList) {
			sinif.ogrenciListeYazdir();			
		}
	}
	
}