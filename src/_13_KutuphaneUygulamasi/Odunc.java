package _13_KutuphaneUygulamasi;

public class Odunc {
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private Kitap kitap;
	private Uye uye;
	private String oduncTarihi;
	
	//Dolu Constructor: Boş constructor oluşturmuyoruz çünkü ödünç kitap alınırken parametreler direkt verilecek.
	public Odunc(Kitap kitap, Uye uye, String oduncTarihi) {
		super();
		this.kitap = kitap;
		this.uye = uye;
		this.oduncTarihi = oduncTarihi;
	}

	//Getters: Nesne değişkenlerimiz üzerinde dışardan erişip değişiklik yapılmayacağı için sadece ulaşılabilinsin diye get metotlarını ekliyoruz.
	public Kitap getKitap() {
		return kitap;
	}

	public Uye getUye() {
		return uye;
	}

	public String getOduncTarihi() {
		return oduncTarihi;
	}

	//toString:
	@Override
	public String toString() {
		return "Odunc [kitap=" + kitap + ", uye=" + uye + ", oduncTarihi=" + oduncTarihi + "]";
	}
	

	
	
	
	
}
