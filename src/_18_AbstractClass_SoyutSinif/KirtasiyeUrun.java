package _18_AbstractClass_SoyutSinif;

public class KirtasiyeUrun extends Urun {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private double kdvOran=0.10;
	
	
	//İki parametreli constructor: extends Urun yaptığımız ve Urun sınıfında default constructor olmadığı için iki parametreli constructor oluşturmamızı istedi.
	public KirtasiyeUrun(String ad, double fiyat) {
		super(ad, fiyat);
	}

	
	//fiyatHesapla() metodu Urun sınıfında abstract olarak tanımladığı için mecburen metodu override edip kullanmak zorunda kalıyoruz.
	@Override
	public double fiyatHesapla() {
		return getFiyat()*(1+kdvOran);
	}

}
