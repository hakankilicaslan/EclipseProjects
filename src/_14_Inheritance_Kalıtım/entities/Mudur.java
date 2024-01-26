package _14_Inheritance_Kalıtım.entities;

public class Mudur extends Personel{ //extends Personel diyerek Personel sınıfındaki özellikleri Mudur sınıfına aktarmış yani miras almış oluyoruz.

	//private: Sadece yazdığımız sınıf içerisinden erişilebilir. Encapsulation yapılarak get ve set metotları ile de erişilebileceğini gördük. Runner sınıfımız farklı package olduğu için değişkenimizi private tanımlarsak erişemez.
	//default: Package friendly. Yani aynı sınıftan, alt sınıflarından ve  aynı package içindeki sınıflardan erişilebilir. Runner sınıfımız farklı package olduğu için değişkenimizi default tanımlarsak erişemez.
	//protected: Package friendly. Yani aynı sınıftan, alt sınıflarından ve  aynı package içindeki sınıflardan erişilebilir. Runner sınıfımız farklı package olduğu için değişkenimizi protected tanımlarsak erişemez.
	//!!! protected tanımladığımızda farklı package içinde bile olsa miras alan sınıflar miras aldıkları sınıflardaki protected nesne değişkenlerine erişebilirler. default ile protected arasındaki fark miras alma durumundan geliyor.
	//public : Her yerden erişilebilir. Runner sınıfımız diğer package içindeki sınıflara erişebilsin diye nesne değişkenlerimizi public olarak tanımladık.
	//public>protected>default>private 
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	public String yonetimDepartmani;
	public int mudurDerecesi;
	public int sorumluOlduguPersonelSayisi;
	
	//Default Constructor:
	public Mudur() {
		super(); //super() sayesinde miras alınan sınıftan yani Personel sınıfından constructor çağırıyoruz. super() silinse bile default constructor gibi sınıf içinde default halde bulunuyor.
		//super() constructor içinde ilk satırda olmalıdır. Nesne yaratılıp constructor çağrıldığında super() ile miras alınan sınıftaki constructor çalıştırılarak önce orda nesne yaratılıp daha sonra sınıfımızın nesnesi yaratılmalıdır. Bundan dolayı super() ilk satıra koyarak önce miras alınan sınıftaki constructor çalıştırılmış olur aksi halde sistem hata veriyor.
		System.out.println("Müdür boş constructor çalıştı.");
	}

	/*
	*SuperClassten Constructor oluşturma:
	*Constructor oluştururken Generate Constructor using Fields... üzerinden sadece sınıfımız içindeki nesne değişkenlerine ulaşarak constructor oluşturabiliyoruz.
	*Miras aldığımız sınıftaki nesne değişkenlerini de parametre vererek oluşturmak istediğimizde Generate Constructor using Fields... üzerinden o nesnelere erişemiyoruz.
	*Miras aldığımız sınıftaki nesneleri parametre olarak kullanıp constructor oluşturmak istediğimizde artık SuperClass üzerinden o nesnelere ulaşmamız gerekiyor.
	*Source -> Generate Constructors from Superclass.. diyerek miras aldığımız sınıftaki hangi parametreli constructor'ı kullanmak istiyorsak onları seçiyoruz.
	*Generate dediğimizde artık miras aldığımız sınıftaki nesne değişkenlerini de kullanarak constructor oluşturabiliyoruz.
	*/
	
	//Dolu Constructor from SuperClass: Bir parametreli constructor
	public Mudur(String cepTel) {
		super(cepTel); 
		System.out.println("Müdür 1 parametreli constructor çalıştı.");
	}
	
	/*
	 * SuperClasstan oluşturulan constructor için yukarıdaki gibi super(cepTel) diyerek ya da super() altına this.cepTel = cepTel(super.cepTel = cepTel) şeklinde de kullanabiliriz.
	 * super(cepTel) kullanımında Personel sınıfından 1 parametreli constructor çalıştırılır ama super() kullanımında Personel sınıfından default constructor çalıştırılır.
	 * 
	 * SuperClasstan oluşturulan constructor için aşağıdaki gibi super() altına this.ad = ad(super.ad = ad) ve this.cepTel = cepTel(super.cepTel = cepTel) diyerek ya da super(ad, cepTel) şeklinde de kullanabiliriz.
	 * super() kullanımında Personel sınıfından default constructor çalıştırılır ama super(ad, cepTel) kullanımında Personel sınıfından 2 parametreli constructor çalıştırılır.
	 * 
	 * ad ya da cepTel Personel sınıfına ait nesne değişkenleri olsa da Mudur sınıfında ait sayılır. 
	 * Bundan dolayı this.ad = ad şeklinde atama yaptığımızda sadece tek ad olduğu için sorun yaşamıyoruz.
	 * Hem Personel hem de Mudur sınıfında aynı isimli değişken ya da metot olduğunu varsayarsak this.ad = ad dediğimizde bu sınıftaki değişkene atama yapar. super.ad = ad dediğimizde miras aldığımız sınıftaki değişkene atama yapar.
	 * Bundan dolayı aynı isimli değişken ya da metot durumlarında this. ve super. kullanarak neye atama yapacaksak onu seçmeliyiz.
	 */
	
	//Dolu Constructor from SuperClass: İki parametreli constructor
	public Mudur(String ad, String cepTel) {
		super(); 
		this.ad = ad; 
		this.cepTel = cepTel;
		System.out.println("Müdür 2 parametreli constructor çalıştı.");
	}

	/*
	 *toString: Sadece Mudur sınıfı içindeki fieldlarımızı seçerek toString metodu oluşturduğumuzda miras aldığımız Personel sınıfı içindeki nesneleri yazdırmıyor.
	 *Personel sınıfında da toString metodu olsa bile ordaki nesne bilgilerine erişip yazırmıyor. 
	 *toString metodu sadece ilk gördüğü sınıftaki toString metodunun içindeki bilgileri yazdırıyor.
	 *Sadece Mudur sınıfımız içinde toString metodu olmasaydı bu kez miras alınan Personel sınıfının içine gidip ordaki toString metodunu yazdıracaktı.
	 *Mudur sınıfının fieldları ile toString oluşturmazsak sadece miras aldığımız sınıf içindeki nesneleri yazdırabiliriz. 
	 *Mudur sınıfı içinde sadece o sınıftaki fieldları seçerek toString oluşturursak bu kez de miras aldığımız Personel sınıfı içindeki nesne bilgilerini yazdıramayız.
	 *Bundan dolayı hem kendi sınıfımızdaki hem miras aldığımız sınıftaki fieldları kullanarak toString metodu oluşturmalıyız.
	 *Source -> Generate toString()... -> hem fieldlar hem de inherited fieldlar içinden istediklerimizi seçerek Generate dediğimizde hem sınıf içi hem de miras alınan sınıftaki fieldları kullanarak toString oluşturmuş oluyoruz.
	 *Eğer hem kendi sınıfımızda hem de miras aldığımız sınıfta aynı isimli iki nesne değişkeni olduğunu varsayarsak ya da aynı isimli iki metot olduğunda super. kullanarak miras aldığımız sınıftaki nesne ya da metoda ulaşabiliriz.
	 *toString metodunda ad yazdırırken sadece ad olarak bırakırsak kendi sınıfımız içindeki ad değişkeninin değerini yazdırır ama super.ad dersek bu kez de miras aldığımız sınıftaki ad değişkeninin değerini yazırmış oluruz. 
	 */
	
	//toString: Override ederek toString yazdığı için normalde Object sınıfındakini override ediyordu artık miras aldığı sınıftaki toString'i override edip sadece burdakini yazdıracak.
	//toString metodu üst sınıftakini override ettiği için onun erişim belirtecinin daha düşüğü olamaz zaten en üstte Object sınıfındaki override edildiği ve ordaki public olduğu için her halükarda toString metotlarımız public olmalıdır.
	@Override
	public String toString() {
		return "Mudur [yonetimDepartmani=" + yonetimDepartmani + ", mudurDerecesi=" + mudurDerecesi
				+ ", sorumluOlduguPersonelSayisi=" + sorumluOlduguPersonelSayisi + ", ad=" + ad + ", adres=" + adres
				+ ", tel=" + tel + ", tc=" + tc + ", cepTel=" + cepTel + ", yas=" + yas + ", hizmetYili=" + hizmetYili
				+ "]";
	}

	//Miras aldığımız sınıftan herhangi bir metodu eziyorsak override ediyorsak o metodun erişim belirtecini düşüremeyiz ama artırabiliriz.
	//calis metodu Personel sınıfındakini override ettiği için orda public iken biz burdakini protected ya da private yapamayız.
	//public>protected>default>private bu duruma göre erişim belirteci tanımlamalıyız.
	//calis() metodunu çağırdığımız da override ettiğimiz için Personel sınıfındaki calis() metodu çağrılmayacak. Override yaptığımız için constructor da olduğu gibi önce miras alınan sınıftaki metot çağrılmıyor.
	//Üst sınıftaki bir metodu Override edeceksek Source->Override/Implement Methods...-> diyerek ezmek override etmek istediğimiz metodu seçip hazır şekilde yazılmış metoda ulaşabiliriz.
	@Override
	public void calis() {
		System.out.println("Müdür çalışıyor...");
	}
	
	public void hesapla() {
		System.out.println("Müdür hesaplıyor...");
	}
	
	@Override
	public int getMaasKatSayisi() { //Mudur için Personel sınıfındaki getMaasKatSayisi() metodunu override ederek kat sayımızı 5 olarak belirliyoruz.
		return 5;
	}
	
}
