package _18_AbstractClass_SoyutSinif;
/*
 * Urun sınıfından nesne oluşturmuyoruz. Urun sınıfından miras alan sınıflardan nesne oluşturuyoruz. Eğer Urun sınıfından nesne oluşturmak istemiyorsak bu sınıfı abstract olarak tanımlamalıyız.
 * Urun Sınıfını abstract olarak tanımlarsak o sınıftan yeni nesne oluşturmaya izin vermiyoruz. Urun urun=new Urun(); şeklinde burdan nesne üretme artık yapılamayacak.
 * Sınıfın abstract olması miras alınmasını engellemez.
 * Bir sınıfın final olarak tanımlanması miras alınmasını engeller ama abstract olarak tanımlanması nesne oluşturulmasını engelliyor.
 * Bir sınıf hem abstract hem final olarak tanımlanamaz çünkü abstract miras alınan sınıflar için kullanılabilir final ise o sınıftan miras alınmasını engeller. Beraber kullanmak saçma olur.
 * abstract yani soyutlaştırma yapmış oluyoruz bundan dolayı somutlama yapamazsın yani nesne oluşturamazsın demek oluyor.
 */
public abstract class Urun {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String ad;
	private double fiyat;
	private double kdvOran=0.18;
	
	
	//İki parametreli constructor:
	public Urun(String ad, double fiyat) {
		super();
		this.ad = ad;
		this.fiyat = fiyat;
	}
	
	
	//Getters and Setters:
	public double getKdvOran() {
		return kdvOran;
	}

	public void setKdvOran(double kdvOran) {
		this.kdvOran = kdvOran;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	/*
	 * Urun sınıfından miras alan sınıflarda kdvOran her sınıf için farklı olduğundan fiyatHesapla metodu hepsi için override edilip farklı değerlerle kullanılıyor. 
	 * Urun sınıfındaki metot sadece override etmek için kullanılıyor. Bundan dolayı bu metodu da abstract tanımlayıp alt sınıfların metodu override ederek kullanmasını sağlıyoruz.
	 *  
	 * Abstract metotların gövdeleri yani method body'leri olmaz. public abstract double fiyatHesapla(); şeklinde ; ile bitirmeliyiz.
	 * Metodun gövdesini kaldırdığımızda sadece interface kısmı kalmış oldu yani metodun interface'i kaldı.
	 * Abstract metotlar hiçbir iş yapmaz. Kullanım amacı alt sınıfların metodu override ederek aynı isimle kullanılmasını sağlamaktır. 
	 * Sadece abstract sınıfların içindeki metotlar abstract olarak tanımlanabilir. 
	 * Abstract sınıf içinde hem normal hem abstract metot yazabiliriz. 
	 * Bu sınıftan miras alan tüm sınıflar abstract sınıftaki fiyatHesapla metodunu override etmek zorundadır.
	 */
	public abstract double fiyatHesapla();
//	{
//		return fiyat+(fiyat*kdvOran);
//	}
	
}
