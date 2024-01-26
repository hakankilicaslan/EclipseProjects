package _33_DateTime_TarihZamanIslemleri;

import java.util.Calendar;
import java.util.Date;

public class _01_Date_Calendar {

	@SuppressWarnings("deprecation") //Program bazı metotların kullanımdan kaldırıldığı artık desteklenmediği uyarısını veriyor.
	public static void main(String[] args) {

		/*
		 * Tarih-Zaman bilgisinin programımızda kullanılabileceği yerler:
		 * Programın ayağa kalktığı başladığı an, Programın çalışma hızını test etmek için, Bir verinin kaydedilme zamanını tutmak için,
		 * Bir veride değişiklik yapılma zamanı tutmak için, Kullanıcının sisteme giriş çıkış yaptığı saat bilgisini tutmak için,
		 * Programın çalışma süresini tutmak için, Doğum tarihlerini tutmak için kullanılabilir.
		 *
		 * Unix Epoch Time: 01.01.1970 00:00:00.000 Başlangıç Milat Tarihi kabul ediliyor.
		 * EpochTime long cinsinde o günden bu zamana kadar olan süreyi milisaniye olarak dönüyor.
		 * Long tipinde zaman bilgisini tutması daha az yer kaplamasını sağlar. Hesaplama işlemlerinde daha efektif alınabilir.
		 * 
		 * 1 000 000 000ns(nanosaniye) = 1 000ms(milisaniye) = 1sn
		 * 60sn = 1dk , 60dk = 1sa , 24sa = 1gün
		 *
		 */
		
		System.out.println("Şu an ki zaman: "+System.currentTimeMillis()); //Programı çalıştırdığımız anın zaman bilgisini long tipinde EpochTime dönüyor.
		
		System.out.println("----------------------------------------");
		
		Date date=new Date(); //Date nesnesi üretiyoruz. Bu nesne şu anki tarih ve zaman bilgisini tutuyor. get metotlarıyla Date üzerinden bazı değerleri alabiliriz.
		
		System.out.println("Tarih-Zaman: "+date); //Şu anki tarih zaman bilgisini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("EpochTime: "+date.getTime()); //getTime() şu anki zamanın Epoch Time değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("Ayın kaçıncı günü: "+date.getDate()); //Şu anki zamanın ayın kaçıncı günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("Haftanın kaçıncı günü: "+date.getDay()); //Şu anki zamanın haftanın kaçıncı günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		//Calendar üzerinden getInstance() metoduyla tarih zaman takvim zone gibi birçok bilgiyi tutuyor. 
		//Calendar abstract bir sınıf olduğu için nesnesini üretemiyoruz. get metotlarıyla Calendar üzerinden bazı değerleri alabiliriz.
		Calendar calendar=Calendar.getInstance();
		
		System.out.println(calendar); //Tarih, zaman, zone bilgilerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println(calendar.getTimeZone()); //getTimeZone() içindeki bulunduğumuz lokasyonun ait olduğu zone bilgisini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println(calendar.getTime()); //getTime() şu anki tarih zaman bilgisini dönüyor. Date ile aynı değeri taşıyor. 
		
	}

}
