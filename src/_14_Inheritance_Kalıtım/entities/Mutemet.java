package _14_Inheritance_Kalıtım.entities;

public class Mutemet {

	//Bütün alt sınıflar için maasHesapla metodunu yazmak yerine bütün sınıflardaki elemanlar aslında personel olduğu için personel diyebiliriz.
	//Polymorphism-> Bir türün başka bir tür gibi davranabilme ve bu tür gibi kullanılabilme özelliğidir.
	public void maasHesapla(Personel personel) { //Personelin maaşı belirlenirken default değer gibi verdiğimiz 10000 ile katsayısı çarpılarak sınıflara maaş belirlensin diye maasHesapla metodunu kullanıyoruz.
		System.out.println("Maaş: "+personel.getMaas()*personel.getMaasKatSayisi());
	}
	
}
