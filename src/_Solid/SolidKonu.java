package _Solid;

/**
 * 
 * @author barisd Uncle Bob Robert Martin Kötü Tasarım: 1. Katılık: Sistemde bir
 *         değişiklik yapmaya çalıştığınızda eğer bir zorluk yaşıyorsanız bunun
 *         sebebi yazılımızın katı olmasıdır. 2. Kırılganlık: Sistemde bir
 *         hatayı gidermeye çalışırken başka yerlerde hata oluşuyorsa buna da
 *         Kırılganlık denir. 3. Taşınmazlık: Tasarımda tekrar kodu kullanmakta
 *         zorluk yaşıyorsanız tasarımınız hatalıdır.
 * 
 *         Solid ile beraber kötü tasarımlardan kurtulma çabasına girişeceğiz.
 *         SOLID: Kötü tasarımlardan kaçınmak için öne sürülen yöntemlerdir.
 *         Hedef: Tasarımlarımızın esnek, anlaşılabilir ve yönetilebilir
 *         olmasını sağlamak.
 * 
 *         1. Single Responsibility Principle - SRP Oluşturduğunuz tüm yapılar(
 *         metod-sınıf-interface) tek bir görevi yerine getirmeli ve belli bir
 *         işi yapmalıdır. Metod için: tek bir görev Sınıf için: aynı tip
 *         görevler
 * 
 *         Bu yapılarda değişime gitmek için yalnızca bir sebebiniz olmalıdır.
 * 
 *         İsviçre çakısını sevmiyoruz! Takım çantası istiyoruz. Tek işi yapan
 *         alet istiyoruz.
 * 
 *         Superman Class da sevmiyoruz. Giant Hulk class da sevmiyoruz.
 * 
 *         Eğer bir cümle birden fazla iş yapıyorsa onu bir metoda çevirmeyi
 *         düşünün. Eğer bit metod birden fazla iş yapıyorsa cut-paste ile
 *         ffarklı metodlar oluşturun. Eğer bir sınıf birden fazla işlev
 *         barındırıyorsa yeni sınıflar açıp o işlevleri taşıyın.
 * 
 *         kaydet() findById() findAll()
 * 
 *         kaydet(Musteri m,IslemTuru t){ servisTur(t) }
 * 
 *         2. Open/Closed Principle - OCP Projeye ait tüm yapıların gelişime
 *         açık ama değişime kapalı olması. Yazılan kodlarda değişim ihtiyacı
 *         olmadan yeni eklemeler yapılabilmeli. Kodunuzu değişim
 *         gerektirmeyecek şekilde yapılandırabilirseniz çok doğru yoldasınız.
 * 
 * 
 *         3. Liskov Substitution Principle - LSP MIT - Barbara Liskov Alt
 *         sınıflardan oluşan nesneler, üst sınıf nesneleri ile yer
 *         değiştirdiğinde aynı davranışı sergilemeli. Türetilen sınıflar,
 *         türeyen sınıfların tüm özelliklerini kullanabilmeli. KUllanılmaması
 *         gereken durumlar var ise onları ayrıştırın.
 * 
 * 
 * 
 *         Interface Segragation Principle - ISP Nesnelerin ihtiyaç duymadıkları
 *         metodları interfaceten çıkarın. Bir interface gereğinden fazla metod
 *         barındırmasın. Böyle bir durumda interfaceleri bölerek kullanmalısın.
 * 
 * 
 * 
 *         Dependency Inversion Principle - DIP
 *         Yüksek seviye sınıflar, düşük seviye sınıflara bağlı olmamalıdır.
 *         Her 2si de soyut kavramlara bağlı olmalıdır(Abstract class, interface)
 *
 */

public class SolidKonu {

//	public static void main(String[] args) {
//
//
//interface IDatabase{
//	void ekle(Object o);
//}
//
//class OracleDatabase implements IDatabase{
//	@Override
//	public void ekle(Object o) {
//		System.out.println("eklendi...");
//	}
//}
//
//class MongoDatabase implements IDatabase{
//	@Override
//	public void ekle(Object o) {
//		System.out.println("eklendi...");
//	}
//}
//
//class HataRaporlama{
//	private IDatabase database;
//	
//	public HataRaporlama(IDatabase database){
//		this.database=database;
//	}
//	
//	public void hataRaporla(Exception exception) {
//		database.ekle(exception);
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// interface Vehicle {
//	void startEngine();
//
//	void stopEngine();
//
//	void accelerate();
//
//	void brake();
//
//	void turn();
//	
//	
//}
//
// class Car implements Vehicle {
//	@Override
//	public void startEngine() {
//		System.out.println("Car engine started");
//	}
//
//	@Override
//	public void stopEngine() {
//		System.out.println("Car engine stopped");
//	}
//
//	@Override
//	public void accelerate() {
//		System.out.println("Car accelerating");
//	}
//
//	@Override
//	public void brake() {
//		System.out.println("Car braking");
//	}
//
//	@Override
//	public void turn() {
//		System.out.println("Car turning");
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//interface IEleman {
//
//	void calis();
//
//	void maas();
//
//	void dinlen();
//}
//
//interface IOfisteYiyebilen {
//	void yemekYe();
//}
//
//class Calisan implements IEleman, IOfisteYiyebilen {
//
//	@Override
//	public void yemekYe() {
//	}
//
//	@Override
//	public void calis() {
//	}
//
//	@Override
//	public void maas() {
//	}
//
//	@Override
//	public void dinlen() {
//	}
//
//}
//
//class RemoteCalisan implements IEleman {
//
//	@Override
//	public void calis() {
//	}
//
//	@Override
//	public void maas() {
//	}
//
//	@Override
//	public void dinlen() {
//	}
//
//}
//
//public class Vehicle {
//	public void startEngine() {
//		System.out.println("Engine started");
//	}
//
//	public void accelerate() {
//		System.out.println("Accelerating");
//	}
//}
//
//public class Car extends Vehicle {
//	@Override
//	public void startEngine() {
//		System.out.println("Car engine started");
//	}
//
//	@Override
//	public void accelerate() {
//		System.out.println("Car accelerating");
//	}
//}
//
//public class Bicycle extends Vehicle {
//	@Override
//	public void startEngine() {
//		throw new UnsupportedOperationException("Bicycles don't have engines");
//	}
//
//	@Override
//	public void accelerate() {
//		System.out.println("Bicycle accelerating");
//	}
//}
//
//public class Scooter extends Vehicle {
//	@Override
//	public void startEngine() {
//		throw new UnsupportedOperationException("Scooter don't have engines");
//	}
//
//	@Override
//	public void accelerate() {
//		System.out.println("Bicycle accelerating");
//	}
//}
//
//public class Motobike extends Vehicle {
//	@Override
//	public void startEngine() {
//		System.out.println("Car engine started");
//	}
//
//	@Override
//	public void accelerate() {
//		System.out.println("Car accelerating");
//	}
//}
//
//interface IShape {
//	public int calculateArea();
//}
//
//class Rectangle implements IShape {
//	protected int width;
//	protected int height;
//
//	public Rectangle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
//
//	public void setHeight(int height) {
//		this.height = height;
//	}
//
//	public int calculateArea() {
//		return width * height;
//	}
//}
//
//class Square implements IShape {
//	protected int side;
//
//	public Square(int side) {
//		this.side = side;
//	}
//
//	@Override
//	public int calculateArea() {
//		return 0;
//	}
//}
//
//interface Logger {
//
//	void log();
//}
//
//interface BaglantiliLogger extends Logger {
//	void baglantiAc();
//
//	void baglantiKapat();
//}
//
//class DatabaseLogger implements BaglantiliLogger {
//
//	@Override
//	public void log() {
//	}
//
//	@Override
//	public void baglantiAc() {
//	}
//
//	@Override
//	public void baglantiKapat() {
//	}
//
//}
//
//class FileLogger implements Logger {
//
//	@Override
//	public void log() {
//	}
//
//}
//
////2. Open/Closed Principle - OCP 
//abstract class IShape {
//	abstract void draw();
//}
//
//class Circle extends IShape {
//
//	@Override
//	public void draw() {
//		System.out.println("Drawing a circle");
//	}
//
//}
//
//class Square implements IShape {
//
//	@Override
//	public void draw() {
//		System.out.println("Drawing a square");
//	}
//
//}
//
//public class Shape {
//	private String type;
//
//	public Shape(String type) {
//		this.type = type;
//	}
//
//	public void draw() {
//		if (type.equals("circle")) {
//			drawCircle();
//		} else if (type.equals("square")) {
//			drawSquare();
//		} else if (type.equals("triangle")) {
//			drawTriangle();
//		}
//	}
//
//	private void drawCircle() {
//		System.out.println("Drawing a circle");
//	}
//
//	private void drawSquare() {
//		System.out.println("Drawing a square");
//	}
//
//	private void drawTriangle() {
//		System.out.println("Drawing a triangle");
//	}
//}
//
//class Isci {
//	//
//}
//
//interface IDatabase {
//	void veritabaninaEkle(Isci isci);
//}
//
//class OracleDatabase implements IDatabase {
//
//	@Override
//	public void veritabaninaEkle(Isci isci) {
//	}
//
//}
//
//class MySqlDatabase implements IDatabase {
//
//	@Override
//	public void veritabaninaEkle(Isci isci) {
//	}
//
//}
//
//class PostgreSqlDatabase implements IDatabase {
//
//	@Override
//	public void veritabaninaEkle(Isci isci) {
//	}
//
//}
//
//class IsciManager {
//	public void isciEkle(IDatabase database, Isci isci) {
//		database.veritabaninaEkle(isci);
//	}
//}
//
////1. Single Responsibility Principle - SRP
//class DosyaIslemleri {
//	public void oku(String dosyaAd) {
//
//	}
//
//	public void yaz(String dosyaAd, String metin) {
//
//	}
//
//	public void sil(String dosyaAd) {
//
//	}
//
//}
//
//class Dogrulama {
//	public void dosyaAdiniDogrula(String dosyaAd) {
//
//	}
//}
//
//class FileEncryptor {
//
//	public void dosyayiSifrele(String dosyaAd) {
//
//	}
//}
//
//class Kisi {
//	private String ad;
//	private String soyad;
//
//}
//
//class EmailService {
//	public void sifreResetlemeLinkiGonder(Kisi k) {
//		// link gönderme işlemi ile ilgili kodlar.
//	}
//}
//
//		
//	}

}
