package _10_Composite_BirlesikSiniflar;

public class Bolum {

	//ÜYE DEĞİŞKENLER: Diğer sınıflarda aynı package içinde olduğu için public eklemiyoruz. Default haliyle hepsi birbirine erişebilir.
	String ad;
	Hoca baskan; //Bölüm başkanı hoca olduğu için hoca tipinde başkan tanımladık.
	Ders[] dersler; //Bölümde birden fazla ders olduğu için Ders tipinde dersler dizisi oluşturuyoruz.
	Ogrenci[] ogrenciler; //Bölümde birden fazla öğrenci olduğu için Ogrenci tipinde ogrenciler dizisi oluşturuyoruz.
	
}
