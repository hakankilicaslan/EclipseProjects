package _24_NestedClass_IcIceSinif.NestedOlmadanKullanim;

import java.util.ArrayList;
import java.util.List;

public class Universite {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String universiteAd;
	private List<Ogrenci> ogrenciListesi; //Universite içinde Ogrencileri ogrenciListesi içinde List olarak tutacağız.

	//Dolu Constructor:
	public Universite(String universiteAd) {
		super();
		this.universiteAd = universiteAd;
		this.ogrenciListesi=new ArrayList<>(); //Universite nesnesi oluştururken öğrenci ekleyebilmek için ogrenciListesi ArrayListi de oluşturduk.
	}

	//Getters and Setters:
	public String getUniversiteAd() {
		return universiteAd;
	}

	public void setUniversiteAd(String universiteAd) {
		this.universiteAd = universiteAd;
	}

	public List<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}

	public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}

	
	public void ogrenciEkle(Ogrenci ogr) { //Metodu çağırdığımızda parametre olarak verilen Ogrenci ogrenciListesi içine eklenecek.
		ogrenciListesi.add(ogr); 
	}
	
	public void ogrenciListele() { //ogrenciListele() çağrıldığında foreach ile beraber ogrenciEkle() metoduyla liste içine eklediğimiz öğrencileri liste üzerinde ulaşıp bilgilerini yazdırıyoruz.
		for (Ogrenci ogrenci : ogrenciListesi) {
			System.out.println("Üniversite Adı: "+universiteAd+" Öğrenci Adı: "+ogrenci.getOgrenciAd()+" Öğrenci No: "+ogrenci.getOgrenciNo());
		}
	}
	
}
