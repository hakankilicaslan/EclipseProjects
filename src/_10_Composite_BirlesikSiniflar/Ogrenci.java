package _10_Composite_BirlesikSiniflar;

public class Ogrenci {

	//ÜYE DEĞİŞKENLER: Diğer sınıflarda aynı package içinde olduğu için public eklemiyoruz. Default haliyle hepsi birbirine erişebilir.
	String ad;
	String no;
	Bolum bolum; //Öğrencinin bölümünü Bolum tipinde tanımladık.
	Ders[] aldigiDersler; // Dersleri birden fazla olduğu için Ders tipinde aldigiDersler dizisi oluşturuyoruz.
	Hoca danisman; //Öğrencinin danışmanı hoca olduğu için Hoca tipinde danisman tanımladık.
	
}
