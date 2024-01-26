package _33_DateTime_TarihZamanIslemleri;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _03_LocalTime {

	public static void main(String[] args) {
	
		//LocalTime -> Zaman işlemleri -> LocalTime final class olduğu için new'leyemiyoruz yani nesne üretemiyoruz.
		
		System.out.println("Belirlenen Zaman: "+LocalTime.of(13, 40, 26)); //LocalTime.of() kullanarak parametre olarak saat dakika saniye bilgilerini verip bir LocalTime oluşturabiliriz.
		
		System.out.println("----------------------------------------");
		
		LocalTime localTime=LocalTime.now(); //LocalTime.now() şu anki zaman bilgisini tutuyor. 
		
		System.out.println("Şu anki Zaman: "+localTime); //Verilen zaman bilgisini dönüyor. (Saat-Dakika-Saniye-Nanosaniye)
		
		System.out.println("----------------------------------------");
		
		System.out.println("getHour(): "+localTime.getHour()); //getHour() verilen zaman bilgisinin saat değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMinute(): "+localTime.getMinute()); //getMinute() verilen zaman bilgisinin dakika değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getSecond(): "+localTime.getSecond()); //getSecond() verilen zaman bilgisinin saniye değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getNano(): "+localTime.getNano()); //getNano() verilen zaman bilgisinin nanosaniye değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("10 Saat Sonraki Zaman: "+localTime.plusHours(10)); //plusHours() verilen zaman bilgisinin üzerine parametre olarak verilen saat sayısını ekleyip o zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("15 Dakika Önceki Zaman: "+localTime.minusMinutes(15)); //minusMinutes() verilen zaman bilgisinden parametre olarak verilen dakika sayısını çıkarıp o zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("40 Saniye Sonraki Zaman: "+localTime.plusSeconds(40)); //plusSeconds() verilen zaman bilgisinin üzerine parametre olarak verilen saniye sayısını ekleyip o zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("20 Saniye Önceki Zaman: "+localTime.minusSeconds(20)); //minusSeconds() verilen zaman bilgisinden parametre olarak verilen saniye sayısını çıkarıp o zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		//ChronoUnit: İçinde tarih ve zaman elemanları barındıran bir Enum'dır. plus() ve minus() metotları ikinci parametre olarak TemporalUnit interface istiyor. ChronoUnit Enum'ı TemporalUnit interface'ini implement ettiği için kullanabiliyoruz.
		//plus() ve minus() metotlarında önce değeri verip sonra enumdan değeri ne olarak ekleyip çıkaracağımızı seçerek ekleme ve çıkarma işlemini yapabiliriz.
		//Bu şekilde her değer için ayrı ayrı metot kullanmak yerine sadece iki metot kullanarak enum içindeki eleman tercihimize göre zaman üzerine ekleme ya da çıkarma yapabiliriz.
				
		System.out.println("45 Dakika Sonraki Zaman: "+localTime.plus(45, ChronoUnit.MINUTES)); //plus() metodu ile önce eklenecek değeri veriyoruz sonra bu değeri ne olarak ekleyeceğimizi ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen zamandan 45 dakika sonraki zaman bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("5 Saat Önceki Zaman: "+localTime.minus(5, ChronoUnit.HOURS)); //minus() metodu ile önce çıkarılacak değeri veriyoruz sonra bu değeri ne olarak çıkaracağımızı ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen zamandan 5 saat önceki zaman bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		LocalTime localTime1=LocalTime.of(13, 26, 06); //LocalTime.of() kullanarak parametre olarak saat dakika saniye bilgilerini verip bir LocalTime oluşturuyoruz.
		LocalTime localTime2=LocalTime.of(20, 30, 40); //LocalTime.of() kullanarak parametre olarak saat dakika saniye bilgilerini verip bir LocalTime oluşturuyoruz.
		
		System.out.println("Aradaki Saat Farkı: "+ChronoUnit.HOURS.between(localTime1, localTime2)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından HOURS seçerek between() metodu çağırılıp içine iki LocalTime veriyoruz ve aralarındaki zaman farkını saat olarak long türünde dönüyoruz.		
		System.out.println("Aradaki Dakika Farkı: "+ChronoUnit.MINUTES.between(localTime1, localTime2)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından MINUTES seçerek between() metodu çağırılıp içine iki LocalTime veriyoruz ve aralarındaki zaman farkını dakika olarak long türünde dönüyoruz.	
		System.out.println("Aradaki Saniye Farkı: "+ChronoUnit.SECONDS.between(localTime1, localTime2)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından SECONDS seçerek between() metodu çağırılıp içine iki LocalTime veriyoruz ve aralarındaki zaman farkını saniye olarak long türünde dönüyoruz.	
		
	}
	
}
