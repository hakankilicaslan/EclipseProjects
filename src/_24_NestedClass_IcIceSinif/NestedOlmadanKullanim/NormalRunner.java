package _24_NestedClass_IcIceSinif.NestedOlmadanKullanim;

public class NormalRunner {

	public static void main(String[] args) {

		//Nested Class kullanımında Universite sınıfı oluşturup içine bir Ogrenci sınıfı ekledik ve bilgileri getirecek metot oluşturmuştuk. Main sınıfından da o metodu çağırarak her iki sınıfın eleman bilgilerini yazdırmıştık.
		//Normal Class kullanımında ise iki sınıfı da ayrı ayrı oluşturduk ve Universite sınıfı içinde bir Ogrenci List oluşturup öğrencileri bu liste içine ekleyerek tuttuk. Daha sonra Main sınıfımızdan da bilgileri getirecek metodu çağırarak eleman bilgilerini yazdırdık.
		
		Universite uni1=new Universite("Anadolu Üniversitesi"); //Universite sınıfından bir nesne oluşturuyoruz.
		
		//Ogrenci sınıfından bir nesne oluşturup ogrenciEkle() metoduyla listemize öğrencilerimizi ekliyoruz.
		Ogrenci ogr1=new Ogrenci("Hakan", 456);
		uni1.ogrenciEkle(ogr1);
		Ogrenci ogr2=new Ogrenci("Selma", 756);
		uni1.ogrenciEkle(ogr2);
		
		uni1.ogrenciListele(); //ogrenciListele() metodunu çağırarak listemizdeki öğrencilerin bilgilerini yazdırıyoruz.
		
	}

}
