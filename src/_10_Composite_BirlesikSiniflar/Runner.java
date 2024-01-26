package _10_Composite_BirlesikSiniflar;

public class Runner {

	public static void main(String[] args) {
	
		Bolum bolum1=new Bolum();
		Hoca hoca1=new Hoca();
		Ders ders1=new Ders();
		Ogrenci ogrenci1=new Ogrenci();
		//Bütün sınıflardan birer nesne oluşturduk.
		
		
		bolum1.ad="Yazılım Mühendisliği";
		bolum1.baskan=hoca1; //Bölüm başkanı Hoca tipinde tanımladığımız için hoca1'i atayabiliriz.
		bolum1.dersler=new Ders[20]; //Bölümün derslerini dizi olarak tanımladığımız için 20 derslik bir dizi nesnesi oluşturuyoruz.
		bolum1.dersler[0]=ders1; //bolum1'in ilk dersine de ders1'i atamış olduk.
		bolum1.ogrenciler=new Ogrenci[100]; //Bölümün öğrencilerini dizi olarak tanımladığımız için 100 öğrencilik bir dizi nesnesi oluşturuyoruz.
		bolum1.ogrenciler[0]=ogrenci1; //bolum1'in ilk öğrencisine de ogrenci1'i atamış olduk.
		
		hoca1.ad="Ahmet Kara";
		hoca1.unvan="Prof.";
		hoca1.bolum=bolum1; //hoca1'in bölümüne bolum1'i atamış olduk.
		hoca1.verdigiDersler=new Ders[5]; //Hocanın verdiği dersleri dizi olarak tanımladığımız için 5 derslik bir dizi nesnesi oluşturuyoruz.
		hoca1.verdigiDersler[0]=ders1; //hoca1'in ilk verdiği derse ders1'i atamış olduk.
		hoca1.danisanlar=new Ogrenci[10]; //Hocanın danışanlarını dizi olarak tanımladığımız için 10 öğrencilik bir dizi nesnesi oluşturuyoruz.
		hoca1.danisanlar[0]=ogrenci1; //hoca1'in ilk danışan öğrencisine ogrenci1'i atamış olduk.
		
		ders1.dersKodu="CS50";
		ders1.ad="Computer Science";
		ders1.kredi=3;
		ders1.bolum=bolum1; //ders1'in bölümüne bolum1'i atamış olduk.
		ders1.hoca=hoca1; //ders1'in hocası olarak hoca1'i atamış olduk.
		ders1.ogrenciler=new Ogrenci[30]; //Dersin öğrencilerini dizi olarak tanımladığımız için 30 öğrencilik bir dizi nesnesi oluşturuyoruz.
		ders1.ogrenciler[0]=ogrenci1; //ders1'in ilk öğrencisine ogrenci1'i atamış olduk.
		
		ogrenci1.no="20230517";
		ogrenci1.ad="Hakan Kılıçaslan";
		ogrenci1.bolum=bolum1; //ogrenci1'in bölümüne bolum1'i atamış olduk.
		ogrenci1.aldigiDersler=new Ders[8]; //Öğrencinin aldığı dersleri dizi olarak tanımladığımız için 8 derslik bir dizi nesnesi oluşturuyoruz.
		ogrenci1.aldigiDersler[0]=ders1; //ogrenci1'in ilk dersine ders1'i atamış olduk.
		ogrenci1.danisman=hoca1; //ogrenci1'in danışmanı olarak hoca1'i atamış olduk.
		
		//ogrenci1 aldığı ilk dersin adını yazdıralım.
		System.out.println(ogrenci1.aldigiDersler[0].ad);
		//ogrenci1 aldığı derslerin ilkinin hocasının adını yazdıralım.
		System.out.println(ogrenci1.aldigiDersler[0].hoca.ad);
		//ogrenci1 aldığı derslerin ilkinin hocasının bölümünün adını yazdıralım.
		System.out.println(ogrenci1.aldigiDersler[0].hoca.bolum.ad);
		
		//Dört sınıfımızda iç içe olduğu için hepsine değişken sonuna nokta(.) koyarak erişebiliyoruz.
		
	}
}
