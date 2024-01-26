package _14_Inheritance_Kalıtım.entities;

public class Personel {

	/* 
	 * Personel sınıfı içinde tanımladığımız nesne değişkenleri Mudur, Muhendis, Muhasebeci, Hizmetli sınıflarının hepsinde ortak nesne değişkenleridir.
	 * Bundan dolayı bu nesne değişkenlerini bütün sınıflarda tek tek tanımlamak yerine Personel isminde bir üst sınıf oluşturuyoruz ve burada nesne değişkenlerini tanımlıyoruz.
	 * Diğer sınıfların bu ortak nesne değişkenlerine ulaşabilmeleri için Personel sınıfından miras almalarını sağlamamız gerekiyor.
	 * Diğer sınıfların Personel sınıfından miras alabilmeleri içinde sınıf isimlerinin sonuna extends Personel eklememiz lazım. (public class Muhendis extends Personel) gibi
	 * Java da bir sınıf direkt olarak sadece bir sınıftan miras alabilir. extends Personel diyerek diğer sınıfların Personel sınıfından miras almasını sağladık ama Personel,Mudur gibi birkaç sınıftan aynı anda miras alma durumu yoktur.
	 * Dolaylı olarak miras aldığı sınıfın üst sınıflarından da miras alabilir. İçinde bulunduğumuz Personel 0sınıfı başka bir sınıftan miras alsaydı o zaman alt sınıf direkt olarak Personel sınıfından dolaylı olarakta Personel sınıfının miras aldığı sınıftan miras alacaktı.
	 * Normalde yazılmasa bile bir sınıftan miras almamış sınıflar default olarak Object sınıfından miras alırlardı. Aslında public class Personel extends Object gibi bir durum var.
	 * Diğer sınıflar Personel sınıfından miras aldığı ve Personel sınıfı da default olarak Object sınıfından miras aldığı için Muhendis sınıfı ve diğerleri artık direkt olarak Personel sınıfından dolaylı olarak Object sınıfından miras alıyorlar
	 * Eğer bir sınıftan miras alınmasını engellemek istiyorsak o sınıfı final olarak belirlememiz gerekiyor. (public final class Personel) yaptığımız durumda artık diğer sınıflar Personel sınıfından miras alamazlar.
	 * Bir sınıfı final olarak tanımlarsak o sınıfın tüm metotları da doğrudan final tanımlanmış olur.
	 */
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	public String ad;
	public String adres;
	public String tel;
	public String tc;
	public String cepTel;
	public int yas;
	public int hizmetYili;
	private int maas=10000; //Default maas değeri olarak 10000 belirledik. Herkesin katsayısına göre maaşı belirlenecek.
	private int maasKatSayisi=1; //Normalde default değerimiz 0 ama biz maasKatSayisi olarak girilmeyen sınıflar için default değerin 1 olmasını istediğimizden 1 ataması yaptık.
	
	/*
	 * Sınıfımız içindeki nesne değişkenlerinin hepsini private olarak tanımladık diyelim ama daha sonra herhangi bir durumdan hepsini ya da çoğunu public yapmamız gerekti.
	 * Bu durumda (Alt+Shift+A) basarak hangi satırlara aynı şeyi yazmak istiyorsak o satırları yukarıdan aşağı doğru seçiyoruz ve hepsinin başına eklemek istediğimiz kelimeyi yazıp tekrar (Alt+Shift+A) dersek hepsine eklemiş oluyor.
	 * Bu yöntem alt alta olan satırlar için geçerli arada bir satır atlamız gerekirse bunu kullanmak mantıklı oluyor çünkü onu da değiştiriyor.
	 * Bunun yerine bütün satırı değiştirmek istemiyorsak (Altgr) basılı tutarak değiştirmek istediğimiz satırları seçiyoruz ve istediğimiz kelimeyi yazınca o satırlara eklemiş oluyor.
	 * (Altgr) yöntemi sadece satır başı için değil Altgr basılı tutarak tıkladığımız her yerde o an yazdığımız kelimeyi ekliyor.
	 */
	
	//Default Constructor:
	public Personel() {
		super(); //super() miras alınan sınıftan constructor çağırdığı için diğer sınıflardaki super() personel sınıfından constructor çağırıyor ama Personel sınıfı herhangi bir sınıftan miras almadığı için default halde miras aldığı en üst Object sınıfından constructor çağırıyor.
		System.out.println("Personel boş constructor çalıştı.");
		
	}

	//Dolu Constructor: Bir parametreli constructor
	public Personel(String cepTel) {
		super();
		this.cepTel = cepTel;
		System.out.println("Personel 1 parametreli constructor çalıştı.");
	}
	
	//Dolu Constructor: İki parametreli constructor
	public Personel(String ad, String cepTel) {
		super();
		this.ad = ad;
		this.cepTel = cepTel;
		System.out.println("Personel 2 parametreli constructor çalıştı.");
	}
	
	//Dolu Constructor: Üç parametreli constructor
	public Personel(String ad, String adres, String tel) {
		super();
		this.ad = ad;
		this.adres = adres;
		this.tel = tel;
		System.out.println("Personel 3 parametreli constructor çalıştı.");
	}

	//Getters and Setters:
	public int getMaas() { //Katsayıya göre herkesin maaşı belirlensin diye maaş içinde default bir değer gibi 10000 değerini atıyoruz. 
		return maas;
	}

	public int getMaasKatSayisi() {
		return maasKatSayisi; //Diğer sınıflarda herhangi bir katsayı belirlenmediyse kat sayımızı default olarak 1 alsın diye belirledik.
	}
	
	public void setMaasKatSayisi(int maasKatSayisi) {
		this.maasKatSayisi = maasKatSayisi;
	}

	//toString:
	@Override //@ ifadesi ile başlayanlara annotation denir. İzah edici not
	public String toString() {
		return "Personel [ad=" + ad + ", adres=" + adres + ", tel=" + tel + ", tc=" + tc + ", cepTel=" + cepTel
				+ ", yas=" + yas + ", hizmetYili=" + hizmetYili + "]";
	}
	
	public void calis() { //public final void calis() -> Bir metot final olarak tanımlanırsa miras alan alt sınıflar onu override edemez.
		System.out.println("Personel çalışıyor.");
	}
	
}
