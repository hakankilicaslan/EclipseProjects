package _19_OOPOkulUygulamasi;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		//1.Sınıf Öğrencileri Oluşturma:
		Ogrenci ogrenci1=new Ogrenci("Hakan", "Kılıçaslan", 101, 100);
		Ogrenci ogrenci2=new Ogrenci("Selma", "Kılıçaslan", 102, 95);
		Ogrenci ogrenci3=new Ogrenci("Seda", "Gelişken", 103, 90);
		Ogrenci ogrenci4=new Ogrenci("Burak", "Gelişken", 104, 85);

		//1.Sınıf Nesnesi Oluşturma ve Öğrenci Ekleme: Önce constructor ile sınıf nesnemizi oluşturup .add() ile öğrencileri sınıf listesine ekliyoruz.
		Sinif sinif1=new Sinif("12A", "Zemin kat 001 nolu derslik", new ArrayList<Ogrenci>());
		sinif1.getOgrenciArrayList().add(ogrenci1);
		sinif1.getOgrenciArrayList().add(ogrenci2);
		sinif1.getOgrenciArrayList().add(ogrenci3);
		sinif1.getOgrenciArrayList().add(ogrenci4);
		
		sinif1.ogrenciListeYazdir(); //1.Sınıf Listesi Yazdırma
		
		//2.Sınıf Öğrencileri Oluşturma:
		Ogrenci ogrenci5=new Ogrenci("Volkan", "Kılıçaslan", 105, 80);
		Ogrenci ogrenci6=new Ogrenci("Burcu", "Kılıçaslan", 106, 75);
		Ogrenci ogrenci7=new Ogrenci("Elis", "Kılıçaslan", 107, 70);
		Ogrenci ogrenci8=new Ogrenci("Almila", "Kılıçaslan", 108, 65);
		
		//2.Sınıf Nesnesi Oluşturma ve Öğrenci Ekleme: Önce sınıf listemizi oluşturup .add() ile öğrencileri sınıf listesine ekleyip daha sonra constructor ile sınıf nesnemizi oluşturuyoruz.
		ArrayList<Ogrenci> sinif2OgrenciArrayList=new ArrayList<>();
		sinif2OgrenciArrayList.add(ogrenci5);
		sinif2OgrenciArrayList.add(ogrenci6);
		sinif2OgrenciArrayList.add(ogrenci7);
		sinif2OgrenciArrayList.add(ogrenci8);
		Sinif sinif2=new Sinif("11A", "Birinci kat 101 nolu derslik", sinif2OgrenciArrayList);
		
		sinif2.ogrenciListeYazdir(); //2.Sınıf Listesi Yazdırma
		
		//3.Sınıf Öğrencileri Oluşturma:
		Ogrenci ogrenci9=new Ogrenci("Gökhan", "Kılıçaslan", 109, 60);
		Ogrenci ogrenci10=new Ogrenci("Gökçen", "Kılıçaslan", 110, 55);
		Ogrenci ogrenci11=new Ogrenci("Gülsen", "Kılıçaslan", 111, 50);
		Ogrenci ogrenci12=new Ogrenci("Sultan", "Kılıçaslan", 112, 45);
		
		//3.Sınıf Nesnesi Oluşturma ve Öğrenci Ekleme: Önce sınıfımızı oluşturup daha sonra ogrenciEkle() metodu ile tüm öğrencileri aynı anda ekliyoruz.
		Sinif sinif3=new Sinif("10A", "İkinci kat 201 nolu derslik");
		sinif3.ogrenciEkle(ogrenci9,ogrenci10,ogrenci11,ogrenci12); //dizi elemanı gibi bütün öğrencileri verip metot içinde .add kullanarak hepsini aynı anda sınıfa eklemiş olduk.
		
		sinif3.ogrenciListeYazdir(); //3.Sınıf Listesi Yazdırma
		
		//4.Sınıf Nesnesi Oluşturma ve Öğrenci Ekleme: Önce sınıfımızı oluşturup daha sonra ogrenciEkle() metodu ile öğrenci eklerken öğrenci nesnemizi oluşturuyoruz.
		Sinif sinif4=new Sinif("9A", "Üçüncü kat 301 nolu derslik");
		sinif4.ogrenciEkle(new Ogrenci("Adnan", "Kılıçaslan", 113, 40));
		
		sinif4.ogrenciListeYazdir(); //4.Sınıf Listesi Yazdırma
		
		//2.sınıftaki 3.öğrencinin adını yazdıralım.
		System.out.println(sinif2.getOgrenciArrayList().get(2).getAd());
		
		//Okul Nesnesi Oluşturma ve Öğrenci Ekleme:
		Okul okul1=new Okul("Atatürk Anadolu Lisesi", "Ankara");
		okul1.sinifEkle(sinif1,sinif2,sinif3,sinif4);
		okul1.siniflariYazdir();
		
		System.out.println("----------------------------------------");
		okul1.tumOgrenciListesiYazdir();
		
	}
	
}
