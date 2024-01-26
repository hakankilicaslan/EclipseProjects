package _16_ETicaretUygulamasi;

public class ElektronikUrun extends Urun{ //Urun sınıfından extends ediyoruz yani miras alıyoruz. Urun sınıfında default constructor olmadığı için ElektronikUrun sınıfı içinde iki parametreli constructor tanımlamamız gerekiyor.

	private double kdvOran=0.20; //Elektronik ürünler için Kdv oranını 0.20 alıyoruz.
	
	
	//İki parametreli constructor:
	public ElektronikUrun(String ad, double fiyat) {
		super(ad, fiyat);
	}

	
	//kdvOran ElektronikUrun sınıfı için farklı olduğunda fiyatHesapla() metodunu override edip getFiyat diyerek verilen fiyatı alıp belirlediğimiz kdv ile çarparak hesaplıyoruz.
	@Override
	public double fiyatHesapla() {
		return getFiyat()*(1+kdvOran);
	}

}
