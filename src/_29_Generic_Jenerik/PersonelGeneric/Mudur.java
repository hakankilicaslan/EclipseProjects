package _29_Generic_Jenerik.PersonelGeneric;

public class Mudur extends Personel { //Mudur sınıfı Personel sınıfından miras alıyor.

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	public String yonetimDepartmani;
	public int mudurDerecesi;
	public int sorumluOlduguPersonelSayisi;
	
	//Constructor:
	public Mudur(String yonetimDepartmani, String ad, String soyad, String tel) {
		super(ad,soyad,tel);  
		this.yonetimDepartmani = yonetimDepartmani; 
	}

	//Getters and Setters:
	public String getYonetimDepartmani() {
		return yonetimDepartmani;
	}

	public void setYonetimDepartmani(String yonetimDepartmani) {
		this.yonetimDepartmani = yonetimDepartmani;
	}

	public int getMudurDerecesi() {
		return mudurDerecesi;
	}

	public void setMudurDerecesi(int mudurDerecesi) {
		this.mudurDerecesi = mudurDerecesi;
	}

	public int getSorumluOlduguPersonelSayisi() {
		return sorumluOlduguPersonelSayisi;
	}

	public void setSorumluOlduguPersonelSayisi(int sorumluOlduguPersonelSayisi) {
		this.sorumluOlduguPersonelSayisi = sorumluOlduguPersonelSayisi;
	}

	//toString: 
	@Override
	public String toString() {
		return "Mudur [yonetimDepartmani=" + yonetimDepartmani + ", ad=" + ad + ", soyad=" + soyad + ", tel=" + tel+ "]";
	}
	
}
