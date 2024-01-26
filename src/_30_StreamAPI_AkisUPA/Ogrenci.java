package _30_StreamAPI_AkisUPA;

//Ogrenci sınıfına Comparable interface'i implement edip tür olarak Ogrenci veriyoruz.
//Bu şekilde override ettiğimiz metotla tür olarak içine Ogrenci verdiğimiz için metot şartına göre Ogrenci'leri sıralayacak.

public class Ogrenci implements Comparable<Ogrenci> {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields:
	private int id;
	private String ad;
	private String soyad;
	private String bolum;
	private double not;
	
	//Constructor:
	public Ogrenci(int id, String ad, String soyad, String bolum, double not) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.bolum = bolum;
		this.not = not;
	}

	//Getters and Setters:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public double getNot() {
		return not;
	}

	public void setNot(double not) {
		this.not = not;
	}

	//toString:
	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", bolum=" + bolum + ", not=" + not + "]";
	}

	@Override
	public int compareTo(Ogrenci o) { //this.not-o.not diyerek metot çağrıldığında geriye notları küçükten büyüğe sıralamış olarak dönecek.
		return (int)(this.not-o.not); //Aradaki fark geriye double döndüğü için int'e cast ediyoruz.
	}
	
}
