package _13_KutuphaneUygulamasi;

public class Kutuphane {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private Kitap[] kitaplar;
	private Uye[] uyeler;
	private Odunc[] oduncListesi;
	private int kitapSayisi;
	private int uyeSayisi;
	private int uyeIndex;
	private int oduncSayisi;
	
	//Default Constructor: Nesne değişkenlerimiz dizi olarak tanımlandığı ve nesne yaratılırken parametre olarak girmemiz gerektiği için ve elimizde bütün dizilere ait bilgiler olmadığından dolu constructor oluşturmuyoruz.
	public Kutuphane() {
		super();
		kitaplar=new Kitap[200]; //Kütüphanemizin alabileceği maksimum kitap sayısını 200 olarak belirledik.
		uyeler=new Uye[50]; //Kütüphanemizin alabileceği maksimum üye sayısını 50 olarak belirledik.
		oduncListesi=new Odunc[100]; //Kütüphanemizde 50 üye olduğu için alınabilecek kitap sayısını 2 olarak belirliyoruz yani oduncListesinin alabilecği maksimum sayıyı 100 belirledik.
	}
	
	/*
	 * kitapEkle metodu ile parametre olarak verdiğimiz kitabın kitaplar dizimizin length'inden küçük olması şartını ekliyoruz.
	 * Çünkü maksimum alabileceğimiz kitap sayısı 200. Eklediğimiz kitabı kitaplar dizimizin kitapSayisi index'ine atıyoruz. 
	 * kitapSayisi default olarak 0 olduğu için ilk eklenen kitap dizimizin ilk elemanı olacak. 
	 * Kitap eklendikçe de kitapSayisi'ni 1 artırıyoruz ve dizimizin indexi de 1 artmış oluyor. 
	 * Böylelikle kitap eklendikçe dizimizin içine de atanmış oluyor.
	 */
	public void kitapEkle(Kitap kitap) { 
		if(kitapSayisi<kitaplar.length) {
			kitaplar[kitapSayisi]=kitap;
			kitapSayisi++;
		}else 
			System.out.println("Kütüphane dolu. Yeni kitap eklenemiyor.");
	}
	
	//kitapEkle metodun da yaptığımız mantığın aynısını uyeEkle metodu içinde yapıyoruz. Eklediğimiz üye alabileceğimiz üye sayısından küçük mü şartını ekliyoruz. uyeSayi'sini dizimizin index'i alarak eklenen üyeyi dizimize ekleyip uyeSayisi'ni 1 artırıyoruz.
	public void uyeEkle(Uye uye) {
		uyeIndex++; //Üye eklerken uyeIndex 1 artırılıyor. Default değeri 0 olduğu için ilk üye eklendiğinde uyeIndex 1 oldu. Bu uyeIndex'i de uyeNo'ya set ediyoruz ve oluşturulan üyeye uyeNo olarak atıyoruz.
		uye.setUyeNo(uyeIndex); //İlk olarak Uye sınıfında static uyeIndex'i kullanarak uyeNo ataması yapmıştık ama kütüphaneye üye eklediğimiz static olan uyeIndex üzerinden uyeNo artıyordu. Her oluşturulan kütüphanenin üyelerine üye numarasını kütüphane tarafından verilmesini istediğimiz için Kutuphane sınıfında uyeNo değerimizi koşullu artırdık.
		if(uyeSayisi<uyeler.length) {
			uyeler[uyeSayisi]=uye;
			uyeSayisi++;
	}else
		System.out.println("Kütüphane üye sayısı dolu. Yeni üyelik kabul edilmiyor.");
	}
	
	public void kitaplariListele() {
		System.out.println("*****Kütüphanedeki Kitaplar*****");
		for (Kitap kitap : kitaplar) { //foreach döngüsünde Kitap sınıfından kitaplar dizisinin referans olarak kitap ismi verdiğimiz elemanlarını dolaş demiş oluyoruz.
			if(kitap!=null)
				System.out.println(kitap);
		}
	}
	
	public void uyerleriListele() {
		System.out.println("*****Kütüphanedeki Üyeler*****");
		for (Uye uye : uyeler) {
			if(uye!=null)
				System.out.println(uye);
		}
	}
	
	public void uyeArama(int uyeNo) {
		System.out.println("*****Üye Arama*****");
		if(uyeNo<=uyeSayisi && uyeNo>0) { //Aradığımız üyenin sisteme kayıtlı olduğunu bulurken uyeNo 0dan büyük ve uyeSayisi'ndan küçük mü şartını ekliyoruz. Aradığımız üyenin bizim dizi eleman aralığımızda olmasını sağlıyoruz.
			System.out.println(uyeler[uyeNo-1]); //Verilen uyeNo bizim dizimizin ilk indexi 0 olduğu için 1 eksiğine denk geliyor. Bundan dolayı uyeNo-1 yazıyoruz.
		}else
			System.out.println("Aradığınız üye sisteme kayıtlı değil.");
	}
	
	public void kitapOduncVer(Kitap kitap, Uye uye, String oduncVermeTarihi) {
		if(uye.getOduncKitapSayisi()<2) { //Üyeler 2 tane ödünç kitap alabilirler şartı ekliyoruz.
			oduncListesi[oduncSayisi++]=new Odunc(kitap, uye, oduncVermeTarihi); //Koşulumuz sağlanıyorsa yeni bir Odunc nesnesi oluşturuyoruz. Kitap ödünç verdiğimiz için ödünç listemize bu kitap eklenecek yani oduncListesi dizisine oduncSayisi index'i olarak oluşturulan Odunc nesnesi eklenecek.
			uye.setOduncKitapSayisi(uye.getOduncKitapSayisi()+1); //Üyelerimiz maksimum 2 kitap ödünç alma şartı koyduğumuz için alınan oduncKitapSayisini her ödünç kitap verdikçe 1 artırarak set ediyoruz ki koşulu sağlayıp sağlamadığını kontrol edelim bunu yapmazsak ödünç verdikçe oduncKitapSayimiz artmayacağı için istediğimiz kadar kitap ödünç verebiliriz.
			System.out.println("*****Üyeye Ödünç Verilen Kitaplar*****");
		}else
			System.out.println("Bu üye 2 kitap ödünç almış. Yeni bir kitap ödünç alamaz.");
	}
	
	public void oduncleriListele() {
		for (Odunc odunc : oduncListesi) {
			if(odunc!=null)
				//System.out.println(odunc); //Direkt odunc yazdırırsak kitap ve üye ile ilgili her şeyi yazdırdığı için onun yerine sadece istediğimiz değişkenleri yazdıralım.
				System.out.println(odunc.getUye().getUyeNo()+" - "+odunc.getUye().getAd()+" - "+odunc.getKitap().getAd()+" - "+odunc.getOduncTarihi());
		}
	}
	
}
