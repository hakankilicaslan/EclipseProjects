package _09_OOP_Siniflar;

public class Otomobil { //Sınıfımız main metot barındırmadığı için çalıştıramıyoruz. Main metot içeren bir sınıftan bu metodu çağırarak çalıştıracağız.

	//SINIF DEĞİŞKENİ
	public static int tekerSayisi=4; //static değişkenler nesne değişkeni değil sınıf değişkenleridir bu yüzden sınıf üzerinden erişebiliriz.
	//Sınıf değişkenleri her nesne için aynı olan değişkenlerdir. Yarattığımız tüm otomobillerin 4 tekeri olduğu için static olarak tanımladık.
	//Nesne değişkenleri her nesne için ayrı ayrı oluşturulurken sınıf değişkenleri tüm nesnelerin ortak durumu olarak bir kere oluşturulur ve sınıf üzerinde saklanır.
	//public static final int TEKER_SAYISI=4; //Sınıf bazındaki static bir değişkenin değiştirilmesini istemiyorsak final ekleyerek (sabit-constant) son değer ataması yapıp değişiklik yapılmasını engelleyebiliriz. final değer atanan sabitler TEKER_SAYISI şeklinde büyük harf ve aralarına _ konularak yazılır.
	public static int uretilenOtomobilSayisi=0; //Nesneye değil sınıfa bağlı olduğu için static olarak tanımladık. Constructorlar ile her otomobil nesnesi yaratıldığında sayımız bir artacak.
	
	//NESNE DEĞİŞKENLERİ
	//Özellikler(State): Class Members(Sınıf Üyeleri), Instance Variables(Örnek Değişkenler). Üye Değişkenler ya da Nesne Değişkenleri de diyebiliriz. 
	public String marka; //Sınıf içinde oluşturulan üye değişkenlerin bir başlangıç değeri oluyor. String için null, int için 0 gibi default değerler atanıyor. Bu yüzden bir başlangıç değeri olduğu için üzerinde işlem yapabiliyoruz. 
	public String model;
	public int yil;
	public int km;
	public int hiz;
	
	public Motor motor; //Otomobil sınıfı içine Motor türünde(sınıfından) bir motor referansı tanımlıyoruz.
	
	
	//Constructor Method: Kurucu metottur. Yazılmasa da her sınıf içinde mevcuttur. Sınıf adıyla aynı olmalıdır. Geriye dönüş tipi yoktur yani return içermez. default için public olmalıdır. 
	//Boş Constructor: Default Constructor -> Nesne oluşturmak için aslında default constructor çağırmış oluyoruz. Biz eklemesekte sınıf içinde mevcut olduğu için nesne oluştururken onu çağırmış oluyoruz.
	//Boş Constructor oluşturmak için sağ tıklayıp Source -> Generate Constructor using Fields... -> Seçili olan tüm fieldları Deselect All diyerek kaldırıp Generate dediğimizde default constructor oluşturmuş oluyoruz.
	//Normalde metotlarımızı küçük harfle başlatıyoruz ama Constructor metodumuz sınıfımızın ismiyle aynı olması gerektiği için büyük harfle başlıyor.
	public Otomobil() { 
		System.out.println("Otomobil classında default constructor çalıştı.");
		uretilenOtomobilSayisi++; //Her constructor çağırıldığında yeni bir otomobil nesnesi yaratıldığı için uretilenOtomobilSayisi bir artırıyoruz. 
	}
	
	//Dolu Constructor: Constructor Overloading -> Yukarıdaki boş constructor ile aynı isimli 6 parametre alan bir dolu constructor oluşturuyoruz.
	//Dolu Constructor oluşturmak için sağ tıklayıp Source -> Generate Constructor using Fields... -> hangi parametreleri girerek nesne oluşturacaksak onları field ksımından seçip Generate dediğimizde dolu constructor oluşturmuş oluyoruz.
	public Otomobil(String marka, String model, int yil, int km, int hiz, Motor motor) {
		//this(); //Dolu constructor içinden this(); diyerek boş constructor'ı da çağırabiliyoruz. Dolu constructor kullanarak yeni nesne oluşturup bilgilerini çağırırken önce this(); metodu ile boş constructor'a gidip içindeki çıktıyı veriyor sonra dolu constructor'ı çağırıyor. Ama this(); metodu ilk satırda olmalıdır yoksa hata veriyor.
		super();
		this.marka=marka; //this. diyerekte sınıf içindeki marka değişkenine ulaşmış oluyoruz. Girdiğimiz marka parametresini sınıfın değişkeni olan markaya atamış oluyoruz.
		this.model=model;
		this.yil=yil;
		this.km=km;
		this.hiz=hiz;
		this.motor=motor;
		//this(); metodu ile constructor metot çağırabiliyoruz. this. keywordu ile de sınıf içindeki üyelere yani değişkenlere metotlara erişebiliyoruz.
		uretilenOtomobilSayisi++; //Her constructor çağırıldığında yeni bir otomobil nesnesi yaratıldığı için uretilenOtomobilSayisi bir artırıyoruz. 
	}
	
	public Otomobil(String marka, String model) { //İki parametreli bir constructor oluşturduk ama farklı parametreleri seçsek bile tekrar iki parametreli bir constructor oluşturamayız. İmzaları aynı olduğu için hata verir ama tipler farklı olursa parametre sayıları aynı olsa bile oluşturabiliriz.
		this(marka,model,2013,0,0,null); //İki parametreli otomobil nesnesi oluştururken önce bu constructor metoduna geliyor ve this(); metodu ile 6 parametreli constructor'ı çağırmış oluyoruz yani this(); metodunu kullanarak bir constructordan diğer constructor metotları çağrılabiliriz. Sadece yazdığımız constructorları birbirinden çağırabiliriz eğer o parametreli bir constructor yazılmadıysa çağrılamaz.
		//this(); //Bir constructor içinden birden fazla constructor çağıramıyoruz. this(); ilk satırda olmalı o yüzden hata veriyor. this(); sadece constructor içinde yapılabilir ve constructor metotlar çağırabilir.
		//uretilenOtomobilSayisi++; //Bu constructorda 6 parametreli olan constructor'ı çağırdığımız için ikisinde de aynı anda artırmasın diye buraya eklemiyoruz.
	}
	
	//Davranışlar(Behaviour): Class Members(Sınıf Üyeleri), Instance Method(Örnek Metotlar,Üye Metotlar)
	public double git(double gidilenKm) {
		km+=gidilenKm;
		return gidilenKm/hiz; //zamanı geri dönelim
	}
	public void hizlan(int hizArtisMiktari) {
		hiz+=hizArtisMiktari;
		if(hiz>180) hiz=180; //Maksimum hızımızı 180 olarak belirledik kullanıcı hizlan metodunu çağırıp hız artırınca 180 üstünde olsa bile hızımız maksimum 180'e çekilecek.
	}
	public void yavasla(int hizAzalisMiktari) {
		hiz+=hizAzalisMiktari;
		if(hiz<0) hiz=0; //Hızımı eksi değer alamayacağı için yavasla metodunu çağırıp hız azalttıkça eksi değere geçmemesi için minimum değerimiz 0 olacak.
	}
	public void dur() {
		hiz=0;
	}
	public String bilgileriGetir() {
		return "Araç bilgileri: Marka: "+marka+" Model: "+model+" Yıl: "+yil+" Km: "+km+" Hiz: "+hiz;
	}
	
	//Alttaki metot static bir metottur. static metotlar da değişkenler gibi sınıfa aittir. Nesneye ait değildir.
	//static metotları çağırmak için nesneye ihtiyaç yoktur. Sınıfa bağlı olduğu için sınıfın adıyla yani Otomobil. diyerek erişebilir çağırabiliriz.
	//static metotlar sadece static değişkenlere doğrudan erişebilirler. Yani static metodun içindeki her şey static olmalıdır. Nesne değişkenlerine erişemezler.
	//static metotlarda this kullanılmaz. this nesneyi gösterir. static ifadesi ise nesneyi varsaymadığı için kullanılmaz.
	//static kullanımı, tamamen sıra dışı bir durumdur. Aslolan daima nesnedir, yani nesne değişkenleri ve metotlarıdır.
	//Çok fazla static kullanıyorsanız büyük ihtimal OOP'den uzaklaşıyorsunuz demektir.
	//static metot tanımlamak daha çok staic değişken ve static metot tanımlamaya sebep olur. Bu da nesnesiz nesne yönelimli programlama demektir.
	public static void uretilenOtomobilSayisiYazdir() {
		System.out.println("Üretilen otomobil sayısı: "+uretilenOtomobilSayisi);
	}
	
}
