package _29_Generic_Jenerik.PersonelGeneric;

import java.util.Arrays;

public class PersonelMain {

	public static void main(String[] args) {

		PersonelYazdir personelYazdir=new PersonelYazdir(); //PersonelYazdir sınıfından yeni bir nesne üretip PersonelYazdir sınıfının referansının onu göstermesini sağlıyoruz.
		
		//Muhendis sınıfından istenilen parametreleri girerek yeni nesneler üretip Muhendis sınıfının referansının onu göstermesini sağlıyoruz ve oluşturduğumuz mühendisleri muhendisDizisi içine ekliyoruz.
		Muhendis muhendis1=new Muhendis("ECT", "Hakan", "Kılıçaslan", "5354920892");
		Muhendis muhendis2=new Muhendis("GWT", "Cem", "Ünal", "5305724468");
		Muhendis[] muhendisDizisi= {muhendis1,muhendis2};
		
		//Muhendis sınıfı hem Personel sınıfından miras alıyor hem de IPersonel sınıfını implement ediyor.
		//yazdir() metodu da hem Personelden miras alan ve hem de IPersonel implement eden sınıflara izin verdiği için Muhendis sınıfı bu metoda erişebiliyor.
		//Muhendis nesneleri olan bir diziyi yazdir() metoduna göndermeye çalıştığımızda gönderebiliyoruz.
		personelYazdir.yazdir(muhendisDizisi);
		
		//Mudur sınıfından istenilen parametreleri girerek yeni nesneler üretip Mudur sınıfının referansının onu göstermesini sağlıyoruz ve oluşturduğumuz müdürleri mudurDizisi içine ekliyoruz.
		Mudur mudur1=new Mudur("NDT","Sait","Kökoğlu","5356803134");
		Mudur mudur2=new Mudur("ARGE","Onur","Yalım","5327389464");
		Mudur[] mudurDizisi= {mudur1,mudur2};
		
		//Mudur sınıfı Personel sınıfından miras alıyor ama IPersonel sınıfını implement etmemiş.
		//yazdir() metodu da hem Personelden miras alan ve hem de IPersonel implement eden sınıflara izin verdiği için Mudur sınıfı bu metoda erişemiyor.
		//Mudur nesneleri olan bir diziyi yazdir() metoduna göndermeye çalıştığımızda hata alıyoruz.
		//personelYazdir.yazdir(mudurDizisi);
		
		System.out.println(Arrays.toString(mudurDizisi)); //mudurDizisi yazdırmak için Arrays.toString() kullanabiliriz.
		
	}

}
