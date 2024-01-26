package _29_Generic_Jenerik.PersonelGeneric;

public class Muhendis extends Personel implements IPersonel{ //Muhendis sınıfı hem Personel sınıfından miras alıyor hem de IPersonel interface'i implement ediyor.
	
	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	public String uzmanlikAlani;
	public String calismaSekli;
	public String unvan;
	
	//Constructor:
	public Muhendis(String uzmanlikAlani, String ad, String soyad, String tel) {
		super(ad,soyad,tel);  
		this.uzmanlikAlani = uzmanlikAlani;
	}

	//Getters and Setters:
	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}

	public String getCalismaSekli() {
		return calismaSekli;
	}

	public void setCalismaSekli(String calismaSekli) {
		this.calismaSekli = calismaSekli;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	//toString: 
	@Override
	public String toString() {
		return "Muhendis [uzmanlikAlani=" + uzmanlikAlani + ", ad=" + ad + ", soyad=" + soyad + ", tel=" + tel + "]";
	}

	@Override
	public void calis() { //IPersonel interface implement edildiği için içindeki metodu override ediyoruz.
		System.out.println("Çalışın ulan köpekler!!!");
	}
	
}
