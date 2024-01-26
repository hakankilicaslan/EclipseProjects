package _30_StreamAPI_AkisUPA;

//Personel sınıfına Comparable interface'i implement edip tür olarak Personel veriyoruz.
//Bu şekilde override ettiğimiz metotla tür olarak içine Personel verdiğimiz için metot şartına göre Personel'leri sıralayacak.

public class Personel implements Comparable<Personel>{ 
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields:
	private int id;
	private String ad;
	private String soyad;
	private String departman;
	private double maas;
	
	//Constructor:
	public Personel(int id, String ad, String soyad, String departman, double maas) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.departman = departman;
		this.maas = maas;
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

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	//toString:
	@Override
	public String toString() {
		return "Personel [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", departman=" + departman + ", maas=" + maas + "]";
	}
	
	@Override
	public int compareTo(Personel o) { //this.maas-o.maas diyerek metot çağrıldığında geriye maaşları küçükten büyüğe sıralamış olarak dönecek.
		return (int)(this.maas-o.maas); //Aradaki fark geriye double döndüğü için int'e cast ediyoruz.
	}
	
	public void maasArtir(double artisMiktari) { //maasArtir() metoduna parametre olarak verilen artisMiktari ile personel maaşına zam yapıyoruz.
		setMaas(getMaas()*artisMiktari); //getMaas ile şu anki maaşı alınıyor ve artisMiktari ile çarpılıyor çıkan sonuçta setMaas ile personelin maaşına set ediliyor.
	}

}
