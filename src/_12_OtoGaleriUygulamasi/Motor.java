package _12_OtoGaleriUygulamasi;

public class Motor {
	
	//Nesne Değişkenleri: Tüm nesne değişkenlerimizi dışarıdan direkt erişilemesin diye private yapıyoruz.
	private int motorHacmi;
	private String saseNo;
	private int tork;
	private int beygir;
	
	//Boş Constructor: Hiçbir nesne değişkenimizi seçmeden Source içinden boş constructor oluşturuyoruz.
	public Motor() {
		super();
	}
	
	//Dolu Constructor: Bütün nesne değişkenlerini seçerek Source içinden dolu bir constructor oluşturuyoruz.
	//Dolu Constructor içinde aldığımız parametreleri this.saseNo=saseNo; olarak atadığımızda kullanıcının atadığı değeri direkt yukarıdaki nesne değişkenimize aktarıyor.
	//Kullandığımız get set metotlarının işlevi kalmıyor. Kullanıcı kontrollü şekilde bu nesne değişkenlerine ulaşabilsin ve değişiklik yapabilsin diye Constructor içindeki parametreleri setSaseNo(saseNo); şeklinde yazarak set metoduna gönderip ordaki koşula göre nesne değişkenimize göndermesini sağlıyoruz.
	public Motor(int motorHacmi, String saseNo, int tork, int beygir) {
		super();
		setMotorHacmi(motorHacmi);;
		setSaseNo(saseNo);
		setTork(tork);;
		setBeygir(beygir);;
	}
	
	//Getters and Setters: Bütün nesne değişkenlerimiz için Source içinden get-set metotlarını oluşturuyoruz.
	public int getMotorHacmi() {
		return motorHacmi;
	}
	public void setMotorHacmi(int motorHacmi) {
		this.motorHacmi = motorHacmi;
	}
	public String getSaseNo() {
		return saseNo;
	}
	public void setSaseNo(String saseNo) {
		if(saseNo.length()>8) {
			System.out.println("Şase no 8 karakterden oluşmalıdır. İlk 8 karakteriniz alınır");
		this.saseNo = saseNo.substring(0,8);	
		}
		else if(saseNo.length()<8) {
			System.out.println("Şase no 8 karakterden oluşmalıdır.");
		}
		else {
			this.saseNo=saseNo;
		}
	}
	public int getTork() {
		return tork;
	}
	public void setTork(int tork) {
		this.tork = tork;
	}
	public int getBeygir() {
		return beygir;
	}
	public void setBeygir(int beygir) {
		this.beygir = beygir;
	}

	//toString: Override(ezmek) etmediğimizde nesneyi çağırdığımızda, yazdırdığımızda adres bilgisini yazdıran Object Class içindeki default haldeki toString çalışıyor. Bu yazdığımız toString metodu ile default haldeki toString metodunu override ederek default olanı değil artık yarattığımız nesneyi çağırırken nesne değişkenlerin değerlerini yazdırıyoruz.
	//toString metodunu yazdırmak için sağ tıklayıp Source->Generate toString()...->yazdırmak istediğimiz nesne değişkenlerini seçiyoruz ve Generate diyerek yazdırıyoruz.
	//Motor sınıfımız Object sınıfından miras aldığı için toString metodunuz override edebildik. Override edebilmek için sınıflar arası bağlantı miras durumu olmalıdır aksi taktirde override edemeyiz.
	//Sınıfımız public class Motor extends Object şeklinde tanımlanıyor. Object sınıfı en üst sınıf olduğu için bütün sınıflar ordan miras alıyorlar. default durum gibi bir şey olduğu için sınıf yaratılınca extends Object şeklinde yazmıyor. 
	//toString metodumuz da Object Class içinde olduğu için ve sınıfımız zaten o sınıftan miras aldığı için override edebiliyoruz ama mesela Otomobil sınıfından miras almadığımız için o sınıf üzerinden bir şeyi override edemeyiz.
	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", saseNo=" + saseNo + ", tork=" + tork + ", beygir=" + beygir + "]";
	}

}
