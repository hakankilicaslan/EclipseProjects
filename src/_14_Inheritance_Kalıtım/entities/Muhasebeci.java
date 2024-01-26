package _14_Inheritance_Kalıtım.entities;

public class Muhasebeci extends Personel { //extends Personel diyerek Personel sınıfındaki özellikleri Muhasebeci sınıfına aktarmış yani miras almış oluyoruz.

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	public String muhasebeUnvani;

	//Dolu Constructor: Dört parametreli constructor. Bu constructorda bir tane muhasebeci sınıfından üç tane de Personel sınıfından field var.
	public Muhasebeci(String muhasebeUnvani, String ad, String adres, String tel) {
		super(ad,adres,tel); //Üç parametreli Personel constructor'ı olduğu için super() yazıp this. kullanmak yerine üç parametreli Personel constructor'ını kullanarak değişken değerlerini alıyor.
		this.muhasebeUnvani = muhasebeUnvani; //Kendi sınıfından da bu değeri alıyor.
		System.out.println("Muhasebeci 4 parametreli constructor çalıştı.");
	}

	//toString: super.toString() diyerek miras aldığımız Personel sınıfındaki toString metodunu çağırmış olduk.
	@Override
	public String toString() {
		return "Muhasebeci [muhasebeUnvani=" + muhasebeUnvani + " -> " + super.toString();
	}

}
