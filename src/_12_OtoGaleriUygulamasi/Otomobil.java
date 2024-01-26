package _12_OtoGaleriUygulamasi;

public class Otomobil {

	/*
	 * Java Encapsulation: Temel olarak sınıf içinde bulunan değişkenleri koruma işlemidir.
	 * Amacımız: Bazı bilgilerin her yerden ulaşılması ve değiştirilmesi istenmeyebilir.
	 * Bu durumda Java Encapsulation kullanımı ile üye değişkenlere erişim diğer sınıflardan gizlenir.
	 * Bunu access modifier'ı private yaparak sağlarız.
	 * 
	 * Bu üye değişkenlere dışarıdan değer atanması için set metotları, değerin alınabilmesi için de get metotları public olarak tanımlanır.
	 * Get metotları sadece veriye erişimi sağlar.
	 * Set metotları ise değer atamasını kurallı hale getirmiş oluruz.
	 *
	 * Dolu constructor ile nesne yaratılırken set metotları devreye alınmaz ise kurallı veri girişi ihlal edilmiş olur.
	 * Bu yüzden dolu constructor kullanıyorsak verileri set metotları ile nesne değişkenlerine aktarmalıyız.
	 * 
	 * Get/set metotları: Sadece bilgi alışverişi sağlar. (Kontrollü bir şekilde)
	 * Diğer metotlar: bir iş veya hizmet yaparlar.
	 * 
	 * Gerçekten ihtiyacımız varsa set metotları kullanmanız gereklidir.(Dışardan bir değer alınacaksa)
	 * 
	 * toString() override edilmezse Object class'ın içindeki toString metotu çalışır.
	 * Eğer toString() kullanmazsak direkt adres gösterir ama kendi sınıfımız içinde toString metotunu override edersek istediğimiz şekilde gösterir.
	 * Bu sayede sysout(nesneadi) şeklinde yazdırdığımızda kendi nesnemizle ilgili bilgileri gösterebiliriz.
	 *
	 * POJO - Plain Old Java Object: En temel java nesnesi
	 * Herhangi bir nesne ile bağlantısı olmayan
	 * İçinde sadece nesne değişkenleri ve bunların getter&setter metotlarını barındıran sınıflara verilen isimdir.
	 * Ayrıca default constructor veya başka constructor da olabilir.
	 */
	
	//Sınıf Değişkenleri:
	public static final int MAX_HIZ=180;
	
	//Nesne Değişkenleri: Tüm nesne değişkenlerimizi dışarıdan direkt erişilemesin diye private yapıyoruz.
	private String marka;
	private String model;
	private int yil;
	private int km;
	private double hiz;
	private Motor motor;
	
	//Boş(default) Constructor: Hiçbir nesne değişkenimizi seçmeden Source içinden boş constructor oluşturuyoruz.
	//Boş Constructor ile oluşturduğumuz nesneye setHiz diyerek değer atadığımızda yine set metodundaki koşullara göre atama yapacak getHiz diyerek yazdırdığımızda hangi koşulu sağlıyorsa o değeri dönecek.
	public Otomobil() {
		super();
		//marka="BMW"; marka değerini parametre olarak dışardan almak istemezsek sabit olarak bütün üretilen otomobiller BMW marka olsun istersek set metodu içinde koşula sokmayıp tek değer ataması da yapabiliriz.
	}
	
	//Dolu Constructor: Bütün nesne değişkenlerini seçerek Source içinden dolu bir constructor oluşturuyoruz.
	//Dolu Constructor içinde aldığımız parametreleri this.hiz=hiz; olarak atadığımızda kullanıcının atadığı değeri direkt yukarıdaki nesne değişkenimize aktarıyor.
	//Kullandığımız get set metotlarının işlevi kalmıyor. Kullanıcı kontrollü şekilde bu nesne değişkenlerine ulaşabilsin ve değişiklik yapabilsin diye Constructor içindeki parametreleri setHiz(hiz); şeklinde yazarak set metoduna gönderip ordaki koşula göre nesne değişkenimize göndermesini sağlıyoruz.
	public Otomobil(String marka, String model, int yil, int km, double hiz, Motor motor) {
		super();
		setMarka(marka); //marka="BMW"; marka değerini parametre olarak dışardan almak istemezsek sabit olarak bütün üretilen otomobiller BMW marka olsun istersek set metodu içinde koşula sokmayıp tek değer ataması da yapabiliriz.
		setModel(model);
		setYil(yil);
		setKm(km);
		setHiz(hiz);
		setMotor(motor);
	}

	//Getters and Setters: Bütün nesne değişkenlerimiz için Source içinden get-set metotlarını oluşturuyoruz.
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public double getHiz() {
		return hiz;
	}
	public void setHiz(double hiz) {
		if(hiz>=0 && hiz<=MAX_HIZ) {
			this.hiz=hiz;
			}
		else if (hiz<0) {
			System.err.println("Girdiginiz deger 0'dan kucuk oldugu icin hiz 0'a esitlendi");
			this.hiz=0;
			}
		else {
			System.err.println("Girdiginiz deger 180'den buyuk oldugu icin hiz 180'e esitlendi");
			this.hiz=MAX_HIZ;
			}
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	//toString: Override(ezmek) etmediğimizde nesneyi çağırdığımızda, yazdırdığımızda adres bilgisini yazdıran Object Class içindeki default haldeki toString çalışıyor. Bu yazdığımız toString metodu ile default haldeki toString metodunu override ederek default olanı değil artık yarattığımız nesneyi çağırırken nesne değişkenlerin değerlerini yazdırıyoruz.
	//toString metodunu yazdırmak için sağ tıklayıp Source->Generate toString()...->yazdırmak istediğimiz nesne değişkenlerini seçiyoruz ve Generate diyerek yazdırıyoruz.
	//Otomobil sınıfımız Object sınıfından miras aldığı için toString metodunuz override edebildik. Override edebilmek için sınıflar arası bağlantı miras durumu olmalıdır aksi taktirde override edemeyiz.
	//Sınıfımız public class Otomobil extends Object şeklinde tanımlanıyor. Object sınıfı en üst sınıf olduğu için bütün sınıflar ordan miras alıyorlar. default durum gibi bir şey olduğu için sınıf yaratılınca extends Object şeklinde yazmıyor. 
	//toString metodumuz da Object Class içinde olduğu için ve sınıfımız zaten o sınıftan miras aldığı için override edebiliyoruz ama mesela Motor sınıfından miras almadığımız için o sınıf üzerinden bir şeyi override edemeyiz.
	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", km=" + km + ", hiz=" + hiz
				+ ", motor=" + motor + "]";
	}

}
