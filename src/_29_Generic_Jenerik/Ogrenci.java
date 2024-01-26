package _29_Generic_Jenerik;

public class Ogrenci<T> {
	
	/*
	 * Generic genellikle tiplerin belirsiz olduğu durumlarda kullanılır. Derlenme zamanında(compile time) tip güvenliğini sağlar.
	 * Daha esnek yapılar kurgulamamıza yardımcı olur. Kod tekrarından kurtarır.
	 * Sınıf veya metotların farklı sınıflarla çalışmasına yardımcı olur.
	 * Örnek olarak dogumTarihi tipinin ne olduğuna karar veremedik ve T olarak belirledik.
	 * Tip olarak belirlerken Ogrenci sınıfının yanına da bu tanımı eklememiz gerekiyor.
	 * Ogrenci nesnesi oluşturulurken <T> kısmına tip olarak ne girilirse artık dogumTarihi değişkeni içinde o tip alınacak.
	 * 
	 */
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields:
	private String ad;
	private T dogumTarihi; 
	
	//Default Constructor:
	public Ogrenci() {
		super();
	}
	
	//Getters and Setters:
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public T getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(T dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	//toString:
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", dogumTarihi=" + dogumTarihi + "]";
	}
	
}
