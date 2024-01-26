package _10_Composite_BirlesikSiniflar;

public class Ders {

	//ÜYE DEĞİŞKENLER: Diğer sınıflarda aynı package içinde olduğu için public eklemiyoruz. Default haliyle hepsi birbirine erişebilir.
	String ad;
	String dersKodu;
	int kredi;
	
	Bolum bolum; //Ders bir bölüme ait olduğu için Bolum tipinde bolum tanımlıyoruz.
	Hoca hoca; //Dersin hocası olduğu için Hoca tipinde bir hoca belirliyoruz.
	Ogrenci[] ogrenciler; //Birden çok öğrenci bu dersi aldığı için ogrenciler isminde bir Ogrenci dizisi oluşturduk.
	
}
