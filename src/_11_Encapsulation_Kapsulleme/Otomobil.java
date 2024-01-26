package _11_Encapsulation_Kapsulleme;

public class Otomobil {
	
	//Sınıf Değişkenleri
	public static final int MAX_HIZ=180; //Bütün üretilen otomobillerin maksimum bir hız değeri belirlemek istedik. Bundan dolayı bütün otomobilleri kapsadığı için static olarak belirledik ve sabit-constant olarakta final keywordu atadık. Artık Otomobil sınıfından üretilen bütün otomobillerin ulaşabileceği maksimum hız 180 olmuş oldu.

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	public String marka;
	public String model;
	public int yil;
	public int km;
	private double hiz; //hiz değişkenine kontrolsüz bir şekilde veri girişleri olabileceği için private yaptık ve dışardan direkt erişimi engellemiş olduk sadece bulunduğu sınıftan erişilebilecek. Sadece 0 ile 180 arası değer ataması yapılmasını istediğimizden kontrollü bir şekilde erişebilmesi ve değişiklik yapabilmesi içinde set ve get metotlarını kullanacağız. Bu metotlar dışardan erişilip çağrılacağı için public olmalıdır.
	
	
	/*
	 * Sınıf içerisindeki nesne değişkenlerimize dışardan direkt erişim ve değişiklik yapılmasını istemediğiz durumlarda private yapıyoruz ve dışardan kontrollü erişim ve değişiklik yapılmasını sağlamak içinde get ve set metotlarını kullanıyoruz.
	 * Bu get set metotlarını tek tek yazmak yerine hazır bir şekilde oluşturmak için sağ tıklayıp Source -> Generate Getters and Setters... -> get set metodu oluşturmak istediğimiz nesne değişkenlerini seçiyoruz -> Generate tıklıyoruz. Bu şekilde bize hazır şekilde get ve set metotları yazdırılıyor.
	 *
	 */
	public double getHiz() { //private olan hiz değişkenimize dışardan direkt erişim sağlanamıyor. Bundan dolayı getHiz metodu hiz değişkenine dışardan kontrollü bir şekilde erişebilmemizi yazdırabilmemizi sağlar. get metodu sınıfın özelliklerini okumak için kullanılır. get metodu dışardan erişilebilmesi için public atadık ama geriye değer döneceği için void atayamayız.
		return hiz; //return hiz da yapsak return this.hiz da yapsak ikisi de aynı yeri gösteriyor. Sınıfın içinde ulaşabileceği tek hız olduğu için ikisi de olur. 
	}
	
	public void setHiz(int hiz) { //private olan hiz değişkenimize dışardan direkt erişim sağlanamıyor. Bundan dolayı setHiz metodu hiz değişkenine dışardan kontrollü bir şekilde erişebilmemizi değişiliklik yapmamızı sağlar. set metodu sınıfın özelliklerine yeni değerler atamak için kullanılır. set metodu dışardan erişilebilmesi için public geriye değer dönmeyeceği için void atadık.
		if(hiz>=0 && hiz<=MAX_HIZ) { //Kullanıcının parametre olarak girdiği hiz değerini setHiz metodunun içinde koşula sokarak 0 ile 180 arasında olduğu durumlarda hiz değişkenine aktarmasını sağlıyoruz.
		this.hiz=hiz; //Kullanıcının parametre olarak verdiği hiz değeri neyse sınıf içindeki private yaptığımız hiz değişkenine aktarmış oluyor.
		}
		else if (hiz<0) {
			System.err.println("Girdiginiz deger 0'dan kucuk oldugu icin hiz 0'a esitlendi");
			this.hiz=0; //Kullanıcı eksi değer giremesin diye hiz değişkenini alabileceği minimum değer olan 0'a eşitliyoruz.
		}
		else {
			System.err.println("Girdiginiz deger 180'den buyuk oldugu icin hiz 180'e esitlendi");
			this.hiz=MAX_HIZ; //Kullanıcı maksimum değer verdiğimiz 180'den büyük değer girerse hiz değişkenini alabileceği maksimum değer olan  180'e eşitliyoruz.
		}
	}
	
	
	public double git(double gidilenKm) {
		km+=gidilenKm;
		return gidilenKm/hiz;
	}
	public void hizlan(int hizArtisMiktari) {
		hiz+=hizArtisMiktari;
		if(hiz>180) hiz=180;
	}
	public void yavasla(int hizAzalisMiktari) {	
		hiz-=hizAzalisMiktari;
		if(hiz<0) hiz=0;
	}
	public void dur() {
		hiz=0;
	}
	public String bilgileriGetir() {
		return "Araç bilgileri: \nMarka: "+marka+" Model: "+model+
				" Yıl: "+yil+" Km: "+km+" Hiz: "+hiz;
	}
	
}
