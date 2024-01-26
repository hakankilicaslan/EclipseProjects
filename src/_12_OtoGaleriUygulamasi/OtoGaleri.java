package _12_OtoGaleriUygulamasi;

import java.util.Arrays;

public class OtoGaleri {

	//Nesne Değişkenleri: Tüm nesne değişkenlerimizi dışarıdan direkt erişilemesin diye private yapıyoruz.
	private Otomobil[] otomobiller;
	private int galeridekiOtomobilSayisi;
	private String galeriAd;

	//Galeriyi oluştururken kaç tane otomobil kapasitesi olduğu bilgisini de vermek istediğimiz için Boş Constructor oluşturmuyoruz. Kapasite parametresini vererek oluşturmasını sağlıyoruz.
	public OtoGaleri(int kapasite) {
		otomobiller = new Otomobil[kapasite]; //Verilen kapasiteyi otomobiller dizisinin boyutunu tanımlamak için kullanıyoruz.
		galeridekiOtomobilSayisi = 0; //galeridekiOtomobilSayisi aslında sınıf içinde default olarak 0 olmasına rağmen biz belirtmek için yine de yazıyoruz.
	}

	public void otomobilEkle(Otomobil otomobil) { //Bu metotla verilen otomobil parametresini galeridekiOtotmobilSayisina aktarıyoruz.
		if (galeridekiOtomobilSayisi < otomobiller.length) { //Galerimizin otomobiller dizisi kadar kapasitesi olduğu için ve o kadar otomobil alabileceği için dizinin uzunluğu kadar otomobil üretecek koşula sokuyoruz.
			otomobiller[galeridekiOtomobilSayisi] = otomobil; //Yaratılan her otomobil nesnesini otomobiller dizisinin i'nci elemanı olarak atıyoruz.
			galeridekiOtomobilSayisi++;
			System.out.println("Yeni araç eklendi. Kalan kapasite: " + (otomobiller.length - galeridekiOtomobilSayisi));
		} else {
			System.out.println("Galeri dolu. Yeni araç eklenemez.");
		}
	}

	public void otomobilleriListele() {
		for (Otomobil otomobil : otomobiller) { //foreach döngüsüyle otomobiller dizisi içindeki tüm elemanları yazdırmaya çalışıyor ama biz daha kapasitemiz kadar otomobil üretip galeriye eklemediğimiz için diğer dizi elemanları null değer alıyor ve yazdırırken hata alıyoruz.
			if (otomobil != null) //default olarak null değeri atandığı için sadece üretilen otomobilleri yazdırsın diye koşula sokuyoruz.
				System.out.println("Marka=" + otomobil.getMarka() + " Model=" + otomobil.getModel());
		}
	}

	//Dolu Constructor yazdığımızda kullanıcı yeni galeri nesnesi oluştururken kapasiteyi, tüm otomobiller dizisini, galerinin adını otomobil sayısı gibi bütün değişkenleri yazması gerekiyor. Parça parça kullanıcı galieriyi oluşturacağı için dolu constructor kullanmıyoruz ve kaldırıyoruz.
//	public OtoGaleri(Otomobil[] otomobiller, int galeridekiOtomobilSayisi, String galeriAd) {
//		super();
//		setOtomobiller(otomobiller);;
//		setGaleridekiOtomobilSayisi(galeridekiOtomobilSayisi);;
//		setGaleriAd(galeriAd);;
//	}

	//Getters and Setters: Bütün nesne değişkenlerimiz için Source içinden get-set metotlarını oluşturuyoruz.
	public String getGaleriAd() {
		return galeriAd;
	}

	public void setGaleriAd(String galeriAd) {
		this.galeriAd = galeriAd;
	}

	public Otomobil[] getOtomobiller() {
		return otomobiller;
	}

	public void setOtomobiller(Otomobil[] otomobiller) {
		this.otomobiller = otomobiller;
	}

	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}

	//galeridekiOtomobilSayisi'na dışarıdan ulaşılıp değer ataması ve değişiklik yapılmadığı biz kendi sınıfımız içinde metotlarda koşullara bağlı olarak artırdığımız için set metoduna ihtiyacımız yok kaldırabiliriz.
//	public void setGaleridekiOtomobilSayisi(int galeridekiOtomobilSayisi) {
//		this.galeridekiOtomobilSayisi = galeridekiOtomobilSayisi;
//	}

	//toString: Override(ezmek) etmediğimizde nesneyi çağırdığımızda, yazdırdığımızda adres bilgisini yazdıran Object Class içindeki default haldeki toString çalışıyor. Bu yazdığımız toString metodu ile default haldeki toString metodunu override ederek default olanı değil artık yarattığımız nesneyi çağırırken nesne değişkenlerin değerlerini yazdırıyoruz.
	//toString metodunu yazdırmak için sağ tıklayıp Source->Generate toString()...->yazdırmak istediğimiz nesne değişkenlerini seçiyoruz ve Generate diyerek yazdırıyoruz.
	//OtoGaleri sınıfımız Object sınıfından miras aldığı için toString metodunuz override edebildik. Override edebilmek için sınıflar arası bağlantı miras durumu olmalıdır aksi taktirde override edemeyiz.
	//Sınıfımız public class OtoGaleri extends Object şeklinde tanımlanıyor. Object sınıfı en üst sınıf olduğu için bütün sınıflar ordan miras alıyorlar. default durum gibi bir şey olduğu için sınıf yaratılınca extends Object şeklinde yazmıyor. 
	//toString metodumuz da Object Class içinde olduğu için ve sınıfımız zaten o sınıftan miras aldığı için override edebiliyoruz ama mesela Motor sınıfından miras almadığımız için o sınıf üzerinden bir şeyi override edemeyiz.
	@Override
	public String toString() {
		return "OtoGaleri [otomobiller=" + Arrays.toString(otomobiller) + ", galeridekiOtomobilSayisi="
				+ galeridekiOtomobilSayisi + ", galeriAd=" + galeriAd + "]";
	}

}
