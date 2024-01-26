package _14_Inheritance_Kalıtım.entities;

public class Muhendis extends Personel{ //extends Personel diyerek Personel sınıfındaki özellikleri Muhendis sınıfına aktarmış yani miras almış oluyoruz.

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	public String uzmanlikAlani;
	public String calismaSekli;
	public String unvan;
	
	//Default Constructor:
	public Muhendis() {
		super();
		System.out.println("Mühendis boş constructor çalıştı.");
	}

	/*
	 *Dolu Constructor: Dört parametreli constructor. Bu constructorda bir tane mühendis sınıfında üç tane de Personel sınıfından field var.
	 *Dört parametreli Muhendis nesnesi oluşturulurken hem Muhendis sınıfından hem de miras aldığımız Personel sınıfından değişkenler kullanılıyor. 
	 *super(ad,adres,tel) şeklinde yazarak Personel sınıfında üç parametreli constructor olduğu için çalıştırılıp değişkenler atanıyor. Eğer üç parametreli Personel constructor'ı olmasaydı hata alırdık.
	 *super() diyerek this.ad = ad ya da super.ad = ad şeklinde üçünü de altına ekleyerekte atayabiliriz ama super(ad,adres,tel) daha işlevsel olduğu için öyle yaptık çünkü bizi kod tekrarından kurtarıyor.
	 *Daha sonra Muhendis sınıfından dört parametreli constructor çalıştırılıp uzmanlıkAlani atanarak nesne oluşturuluyor.
	 *Bu şekilde iç içe hem sınıfımızdan hem de miras aldığı sınıftan nesne değişkenleriyle constructorlar kullanılarak nesne oluşturmuş oluyoruz.
	 *Hem sınıfımızdan hem miras aldığımız sınıftan değişkenleri alarak constructor oluşturmak için Generate kısmını kullanamıyoruz.
	 *Fields ya da SuperClass kullanıp oluşturduktan sonra diğer taraftaki değişkenleri kendimiz eklemeliyiz.
	 */
	public Muhendis(String uzmanlikAlani, String ad, String adres, String tel) {
		super(ad,adres,tel); //super(ad,adres,tel) dediğimizde miras aldığımız sınıfta üç parametreli constructor arıyor. Eğer yoksa sistem hata veriyor. 
		this.uzmanlikAlani = uzmanlikAlani;
		System.out.println("Mühendis 4 parametreli constructor çalıştı.");
	}
	
	//toString: Personel sınıfındaki toString'i değil kendi fieldlarımız ya da inherited fieldlardan istediklerimizi yazdırsın diye toString override ediyoruz.
	@Override
	public String toString() {
		return "Muhendis [uzmanlikAlani=" + uzmanlikAlani + ", ad=" + ad + ", adres=" + adres + ", tel=" + tel + "]";
	}
	
	//toString yazdırırken metot içinde super.toString() diyerek Personel sınıfındaki toStringi çağırıyoruz. + kısmından sonra Personel sınıfındaki toString kısmını yazdırmamızı sağlıyor.
//	public String toString() {
//		return super.ad+ " Muhendis [uzmanlikAlani=" + uzmanlikAlani + " " + super.toString(); 
//	}
	
	/*
	 * this.   -> Aynı sınıftaki üye değişken ya da metotlara ulaşırken kullanılır.
	 * 
	 * super.  -> Üst sınıftaki yani miras aldığı sınıftaki üye değişken ya da metotlara ulaşırken kullanılır.
	 * 
	 * this()  -> Aynı sınıf içindeki diğer constructor çağrılırken kullanılır. 
	 * 			  Bir constructor içinden birden fazla constructor çağıramıyoruz. 
	 *            Her zaman ilk satırda olmalıdır. 
	 *            Parantez içine kaç tane parametre girdiysek o kadar parametreye sahip olan constructor çağrılır.
	 *            
	 * super() -> Üst sınıftaki yani miras aldığı sınıf içindeki diğer constructor çağrılırken kullanılır.
	 * 			  Bir constructor içinden sadece miras aldığı sınıf içindeki constructor çağrılabilir. Miras alınan sınıftan birden fazla constructor çağrılamaz.
	 *			  Her zaman ilk satırda olmalıdır. super() kullanmak zorunludur eklenmese bile sistem default olarak arka planda super() ekleyerek derler.
	 *			  Parantez içine kaç tane parametre girdiysek miras alınan sınıftan o kadar parametreye sahip olan constructor çağrılır.
	 *
	 *!!!this() ve super() ikisi de constructor içinde ilk satırda olması gerektiği için aynı constructor içinde hem this() hem super() kullanılamaz.
	 */
	
}
