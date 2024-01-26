package _16_ETicaretUygulamasi;

public class KirtasiyeUrun extends Urun { //Urun sınıfından extends ediyoruz yani miras alıyoruz. Urun sınıfında default constructor olmadığı için ElektronikUrun sınıfı içinde iki parametreli constructor tanımlamamız gerekiyor.

	private double kdvOran=0.10; //Kırtasiye ürünleri için Kdv oranını 0.10 alıyoruz.
	
	
	//İki parametreli constructor:
	public KirtasiyeUrun(String ad, double fiyat) {
		super(ad, fiyat);
	}

	
	//kdvOran KirtasiyeUrun sınıfı için farklı olduğunda fiyatHesapla() metodunu override edip getFiyat diyerek verilen fiyatı alıp belirlediğimiz kdv ile çarparak hesaplıyoruz.
	@Override
	public double fiyatHesapla() {
		return getFiyat()*(1+kdvOran);
	}

}
