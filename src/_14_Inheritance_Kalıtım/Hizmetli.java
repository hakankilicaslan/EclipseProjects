package _14_Inheritance_Kalıtım;

import _14_Inheritance_Kalıtım.entities.Personel; //Personel ve Hizmetli sınıfları farklı package içinde olduğu için Personel sınıfını import ediyoruz.

public class Hizmetli extends Personel{ //extends Personel diyerek Personel sınıfındaki özellikleri Hizmetli sınıfına aktarmış yani miras almış oluyoruz.

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	public String gorev;
	public int gorevTazminati;
	
	//Default Constructor:
	public Hizmetli() {
		super();
		System.out.println("Hizmetli boş constructor çalıştı.");
	}

	//toString:
	@Override
	public String toString() {
		return "Hizmetli [gorev=" + gorev + ", gorevTazminati=" + gorevTazminati + ", ad=" + ad + "]";
	}
	
}
