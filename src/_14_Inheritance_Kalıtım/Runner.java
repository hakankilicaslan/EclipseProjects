package _14_Inheritance_Kalıtım;

import _14_Inheritance_Kalıtım.entities.*; //Runner ile entities içindeki sınıflarımız farklı packagelarda olduğu için entities package içindeki sınıfların import edilmesi gerekiyor. Biz tek tek 6 sınıfı ayrı ayrı import etmekle uğraşmamak için (_14_Inheritance_Kalıtım.entities.*;) diyerek package sonuna .* koyarak o package içindeki bütün sınıfları import etmiş oluyoruz. 

public class Runner {

	public static void main(String[] args) {
		
		Mudur mudur1=new Mudur(); //Miras alan Mudur sınıfından default constructor ile yeni nesne oluşturuyoruz.
		System.out.println(mudur1.ad); //Mudur sınıfı Personel sınıfından miras aldığı için önce miras alınan Personel sınıfına gidip ordaki default constructor çalışıyor ondan sonra miras alan Mudur sınıfındaki default constructor çalışıyor. Bundan dolayı çıktıyı önce Personel constructor çalıştı daha sonra Mudur constructor çalıştı olarak verdi. Biz ad kısmına heniz bir atama yapmadığımız için default olarak null geri döndü.
		
		System.out.println("----------------------------------------");
		
		mudur1.ad="Sait";
		mudur1.cepTel="5356803134";
		System.out.println(mudur1.ad); //Önce miras alınan Personel sınıfına gidip ordakini daha sonra miras alınan Mudur sınıfına gidip ordaki constructorları çalıştırıyor. Default haldeki verileri yazıyor ama biz mudur1.ad="Sait" ataması yaptığımız için onları ezip ekrana Sait çıktısı veriyor.
		
		System.out.println("----------------------------------------");
	
		Mudur mudur2=new Mudur("Onur","5327389464"); //Miras aldığımız sınıftaki ad ve cepTel değişkenlerine ulaşarak iki parametreli bir Mudur nesnesi oluştururken SuperClass üzerinden çağırdığımız constructor ile nesne oluşturduk.
		mudur2.yonetimDepartmani="Satış";
		System.out.println(mudur2.ad+" "+mudur2.cepTel);
		System.out.println(mudur2.toString());
		
		System.out.println("----------------------------------------");
		
		Muhendis muhendis1=new Muhendis("NDT", "Hakan", "Ankara", "5354920892"); //Bir tane mühendis sınıfından üç tane de Personel sınıfından nesne değişkeni alarak nesnemizi oluşturuyoruz.
		System.out.println(muhendis1);
		
		System.out.println("----------------------------------------");
		
		Muhasebeci muhasebeci1=new Muhasebeci("Mali Müşavir", "Haydar", "Ankara", "5324750623"); //Bir tane muhasebeci sınıfından üç tane de Personel sınıfından nesne değişkeni alarak nesnemizi oluşturuyoruz.
		System.out.println(muhasebeci1);
	
		System.out.println("----------------------------------------");
		
		Hizmetli hizmetli1=new Hizmetli();
		hizmetli1.ad="Zafer";
		System.out.println(hizmetli1);

		System.out.println("----------------------------------------");
		
		mudur1.calis();//Mudur sınıfındaki calis() metodunu çağırdığımızda Personel sınıfındaki calis() metodu override edildiği için sadece Mudur sınıfındaki metot çalışacak bundan dolayı ekrana sadece Müdür çalışıyor yazdırıyor.
		
		System.out.println("----------------------------------------");
		
		//Mudur sınıfından bir nesne üretip Personel sınıfına atama yapıyoruz. Bu durum yerine geçebilme(substitutability) olarak ifade edilir ve miras katmanlarında aşağıdan yukarı doğru çalışır. Personel superclass Mudur sub-class olduğu için hata vermiyor. Üst sınıfın referansı alt sınıfın nesnesini taşıyabilir.
		Personel personel1=new Mudur(); //mudur is a personel durumu olduğundan hata vermez.(mudur'u personel'e atamaya upcasting denir)
		//Mudur mudur3=new Personel(); //personel is a mudur diyemeyiz yani alt sınıf referansı üst sınıf nesnesini taşıyamaz.
		//Mudur mudur3=(Mudur)new Personel(); //(Downcasting)Cast yaparak zorla yapabiliyoruz artık hata vermez ama istediğimiz bu değil.
		System.out.println(personel1.toString()); //Nesnemiz Mudur sınıfına oluşturulduğu için ordaki toString() metodu çağrılmış olur.
		
		/*
		 * Compile Time(Derlenme Zamanı) - Run Time(Çalışma Zamanı)
		 * Kodu yazarken derleme aşamasındayız yani derlenme zamanındayız personel1 derleme aşamasında Personel tutacağını düşünüyor ama çalışma zamanına geçince Mudur nesnesini alıyor.
		 * Bundan dolayı derleme aşamasında sadece Personel sınıfının içindeki metotlara erişim sağlayabiliyor. Mudur sınıfında olan metotlara erişemediği içinde hata veriyor.
		 * Çalışma zamanına geçince de artık Mudur sınıfından bir nesneyi tuttuğu için ordaki metotlar override ettiğinden ordaki metotları çağırabiliyor.
		 */
		personel1.calis(); //personel1 referansımız Mudur sınıfına ait bir nesneyi gösteriyor yani işaret ediyor olsa da Personel sınıfındaki metotları çağırabilir. Hem alt hem üst sınıfta calis() metodu olduğu için Mudur sınıfındaki calis() metodu Personel sınıfındakini Override ediyor ve Mudur sınıfındakini çağırmış oluyoruz ama Personel sınıfında yok Mudur sınıfında metot varsa üst sınıfta metot olmadığı için hata verir çalışmaz.
		((Mudur)personel1).hesapla(); //personel1.hesapla(); -> Personel sınıfında hesapla metodu olmadığı için çalışmaz ama başına (Mudur) ekleyerek downcasting yaptığımızda Mudur sınıfındaki hesapla() metodunu çağırmış oluruz.
		
		personel1=new Hizmetli(); //personel1 referansı artık Hizmetli sınıfından üretilen yeni nesneyi gösteriyor.
		System.out.println(personel1);
		
		System.out.println("----------------------------------------");
		
		Mudur mudur3=new Mudur();
		System.out.println(mudur1.getMaasKatSayisi()); //default değerimiz 1 ama Mudur 5 katı alsın diye get metodunda return olarak 5 verdik ve Mudur için maaş katsayısını 5 dönecek.
	
		Hizmetli hizmetli2=new Hizmetli();
		System.out.println(hizmetli2.getMaasKatSayisi()); //Hizmetli için bir maaş katsayısı belirlemediğimiz için default değer olarak atadığımız 1 geri dönecek.
		
		Muhendis muhendis2=new Muhendis();
		muhendis2.setMaasKatSayisi(4); //muhendis2 için Personel sınıfındaki setMaasKatSayisi() metodunu kullanarak 4 ataması yapıyoruz.
		System.out.println(muhendis2.getMaasKatSayisi());
		
		Muhendis muhendis3=new Muhendis();
		muhendis3.setMaasKatSayisi(10); //muhendis3 için Personel sınıfındaki setMaasKatSayisi() metodunu kullanarak 10 ataması yapıyoruz.
		System.out.println(muhendis3.getMaasKatSayisi());
		
		
		Mutemet mutemet1=new Mutemet(); //Mutemet sınıfından yeni bir nesne üretip maasHesapla metodunu çağırıyoruz ve belirlenen katsayıya göre herkesin maaşını hesaplıyoruz.
		mutemet1.maasHesapla(mudur3); //Mudur sınıfı için getMaasKatSayisi() override edip 5 belirlediğimiz için default maaş 10000 belirlendiği için 50000 olarak dönecek.
		mutemet1.maasHesapla(hizmetli2); //hizmetli2 için herhangi bir katsayı belirlenmediği için Personel sınıfında default olarak belirlenen katsayıyı 1 alacak ve maaşı 10000 olarak dönecek.
		mutemet1.maasHesapla(muhendis2); //muhendis2 için setMaasKatSayisi() metodu ile katsayımız 4 belirlendiği için maaşı 40000 dönecek.
		mutemet1.maasHesapla(muhendis3); //muhendis3 için setMaasKatSayisi() metodu ile katsayımız 10 belirlendiği için maaşı 100000 dönecek.
		
	}
}
