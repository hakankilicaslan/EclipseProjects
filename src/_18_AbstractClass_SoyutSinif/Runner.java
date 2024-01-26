package _18_AbstractClass_SoyutSinif;

public class Runner {

	public static void main(String[] args) {
		
		ElektronikUrun telefon=new ElektronikUrun("Iphone 14", 20000);
		
		//Urun urun=new Urun(); //Urun sınıfını abstract olarak tanımladığımız için artık o sınıftan nesne üretemeyiz.
		Urun urun=telefon; //Abstract sınıftan nesne üretemiyoruz ama hala referans olarak gösterebiliyoruz. Kendisinden miras alan bir sınıfın nesnesini tutabiliyor yani referans gösterebiliyor.
		
		System.out.println(urun.fiyatHesapla());
	}
}
