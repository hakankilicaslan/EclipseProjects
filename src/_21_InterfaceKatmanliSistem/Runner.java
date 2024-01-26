package _21_InterfaceKatmanliSistem;

import _21_InterfaceKatmanliSistem.repository.entities.*; //Üreteceğimiz nesnelerin sınıfları farklı package içinde olduğu için entities package'ının tamamını import ediyoruz.

public class Runner {

	public static void main(String[] args) {
		
		//Musteri sınıfımızdan iki tane Musteri nesnesi oluşturuyoruz.
		Musteri m1=new Musteri("kullanici1", "425260", "Hakan", "05354920892", "Beşiktaş,İstanbul");
		Musteri m2=new Musteri("kullanici2", "123456", "Adnan", "05324371355", "Etimesgut,Ankara");
		
		MusteriRepositoryImpl dbMusteri=new MusteriRepositoryImpl(); //MusteriRepositoryImpl sınıfımızdan o sınıftaki metotlara ulaşabilmek için dbMusteri'nin refere ettiği bir MusteriRepositoryImpl nesnesi oluşturuyoruz.
		
		boolean kaydedildiMi; //kaydet() metodumuz boolean bir değer döndüğü için boolean bir kaydedildiMi değişkeni kullanarak m1 ve m2 nin kaydedilme durumunu yani listemize eklendi mi eklenmedi mi durumunu görüyoruz.
		
		kaydedildiMi=dbMusteri.kaydet(m1); //m1 müşterisini MusteriRepositoryImpl üzerinden çağırdığımız kaydet() metoduyla sisteme kaydediyoruz yani musteriList içine ekliyoruz.
		System.out.println(kaydedildiMi);
		
		System.out.println("--------------------------");
		
		kaydedildiMi=dbMusteri.kaydet(m1); //kaydet() metodumuzdaki şarta göre aynı müşteriyi tekrar kaydetmeye çalıştığımızda sisteme zaten kayıtlı olduğu yani musteriList içinde zaten olduğundan gerçekleşmiyor.
		System.out.println(kaydedildiMi);
		
		System.out.println("--------------------------");
		
		dbMusteri.kaydet(m2); //m2 müşterisini MusteriRepositoryImpl üzerinden çağırdığımız kaydet() metoduyla sisteme kaydediyoruz yani musteriList içine ekliyoruz.
		
		System.out.println("--------------------------");
		
		dbMusteri.listele(); //MusteriRepositoryImpl üzerinden çağırdığımız listele() metoduyla musteriList içine kaydedilen yani eklenen müşterileri yazdırıyoruz.
		
		System.out.println("--------------------------");
		
		dbMusteri.sil(1); //MusteriRepositoryImpl üzerinden çağırdığımız sil() metoduyla musteriList içine kaydedilen yani eklenen 1 nolu indexteki yani ikinci müşteriyi siliyoruz. Musteri sınıfındaki sil() metotlarından parametre olarak int index isteyen dolu olduğu için index numarası vererek metodu çağırabiliyoruz.
		
		System.out.println("--------------------------");
		
		dbMusteri.listele(); //MusteriRepositoryImpl üzerinden çağırdığımız listele() metoduyla musteriList içinde kalan müşterileri yazdırıyoruz.
		
		System.out.println("--------------------------");
		
		//Urun sınıfımızdan iki tane Urun nesnesi oluşturuyoruz.
		Urun u1=new Urun("Urun1", 10, 1, "kilo", 1);
		Urun u2=new Urun("Urun2", 20, 1, "kilo", 2);
		
		UrunRepositoryImpl dbUrun=new UrunRepositoryImpl(); //UrunRepositoryImpl sınıfımızdan o sınıftaki metotlara ulaşabilmek için dbUrun'ün refere ettiği bir UrunRepositoryImpl nesnesi oluşturuyoruz.
		
		dbUrun.kaydet(u1); //u1 ürününü UrunRepositoryImpl üzerinden çağırdığımız kaydet() metoduyla sisteme kaydediyoruz yani urunList içine ekliyoruz.
		
		System.out.println("--------------------------");
		
		dbUrun.kaydet(u2); //u2 ürününü UrunRepositoryImpl üzerinden çağırdığımız kaydet() metoduyla sisteme kaydediyoruz yani urunList içine ekliyoruz.
		
		System.out.println("--------------------------");
		
		dbUrun.listele(); //UrunRepositoryImpl üzerinden çağırdığımız listele() metoduyla urunList içine kaydedilen yani eklenen ürünleri yazdırıyoruz.
		
		System.out.println("--------------------------");
		
		dbUrun.sil(dbUrun.urunList.get(0)); //UrunRepositoryImpl üzerinden çağırdığımız sil(Object o) metoduyla urunList içine kaydedilen yani eklenen 0 nolu indexteki yani birinci ürünü siliyoruz. Metodumuz Object istiyor parametre olarak ya u1 ya da dbUrun.urunList.get(0) diyerek o nesneye ulaşabiliriz.
		
		System.out.println("--------------------------");
		
		dbUrun.listele(); //UrunRepositoryImpl üzerinden çağırdığımız listele() metoduyla urunList içinde kalan ürünleri yazdırıyoruz.
		
		System.out.println("--------------------------");
		
		dbUrun.sil("Urun2"); //UrunRepositoryImpl üzerinden çağırdığımız sil(String ad) metoduyla urunList içine kaydedilen yani eklenen "Urun2" ürünü siliyoruz. Metodumuz ürünün adını istediği için parametre olarak "Urun2" gönderiyoruz.
		
		System.out.println("--------------------------");
		
		dbUrun.listele(); //UrunRepositoryImpl üzerinden çağırdığımız listele() metoduyla urunList içinde kalan ürünleri yazdırıyoruz. İki ürünü de sildiğimiz için listemizde eleman kalmadığında boş yazdırıyor.
	
	}
	
}
