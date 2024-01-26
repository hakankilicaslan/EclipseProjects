package _10_Composite_BirlesikSiniflar;

public class Hoca {

	//ÜYE DEĞİŞKENLER: Diğer sınıflarda aynı package içinde olduğu için public eklemiyoruz. Default haliyle hepsi birbirine erişebilir.
	String ad;
	String unvan;
	Bolum bolum; //Hocanın bölümü olduğu için Bolum tipinde bolum tanımlıyoruz.
	Ders[] verdigiDersler; //Hoca birden fazla ders verdiği için Ders tipinde verdigiDersler dizisi oluşturuyoruz.
	Ogrenci[] danisanlar; //Hocanın danışman öğrencileri birden fazla olduğu için Ogrenci tipinde danismanlar dizisi oluşturuyoruz.
	
}
