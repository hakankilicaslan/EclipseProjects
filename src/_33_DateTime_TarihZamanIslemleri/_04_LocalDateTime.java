package _33_DateTime_TarihZamanIslemleri;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _04_LocalDateTime {

	public static void main(String[] args) {

		/* 
		 * LocalDateTime -> Tarih + Zaman işlemleri -> LocalDateTime final class olduğu için new'leyemiyoruz yani nesne üretemiyoruz.
		 * LocalDateTime içinde hem LocalDate hem de LocalTime barındıran bir yapıdır.
		 * LocalDateTime.of() kullanarak parametre olarak LocalDate ve LocalTime vererek bir LocalDateTime oluşturabiliriz.
		 * LocalDateTime.of() kullanarak bütün tarih ve zaman değerlerini tek tek girerekte bir LocalDateTime oluşturabiliriz.
		 * 
		 * LocalDate ve LocalTime içerdiği için bu ikisinde yer alan bütün metotlar LocalDateTime içinde de yer alıyor.
		 * getYear(), getMonth(), getMonthValue(), getDayOfYear(), getDayOfMonth(), getDayOfWeek(), getHour(), getMinute(),
		 * getSecond(), getNano(), plusYears(), minusYears(), plusMonths(), minusMonths(), plusWeeks(), minusWeeks(),
		 * plusDays(), minusDays(), plusHour(), minusHour(), plusMinutes(), minusMinutes(), plusSecond(), minusSecond() vb.
		 * gibi get, plus, minus metotlarının hepsi LocalDateTime içinde de aynı şekilde çalışıyor.
		 * Tarih ve zaman değerleri için plus() ve minus() metotları ile ChronoUnit Enum alan verisyonlar da aynı şekilde çalışıyor.
		 * 
		 */
		
		LocalDateTime ldt=LocalDateTime.of(LocalDate.now(), LocalTime.now()); //Şu anki tarih ve şu anki zaman değerlerini parametre olarak vererek bir LocalDateTime oluşturuyoruz.
		
		System.out.println("Şu anki Tarih-Zaman: "+ldt); //Verilen tarih ve zaman bilgisini dönüyor.
		System.out.println("Şu anki Tarih-Zaman: "+LocalDateTime.now()); //Ayrı ayrı vermek yerine direkt LocalDateTime.now() diyerek şu anki tarih ve zaman bilgisini de dönebiliriz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getDayOfMonth(): "+ldt.getDayOfMonth()); //getDayOfMonth() verilen tarih-zaman bilgisinin ayın kaçıncı günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getDayOfYear(): "+ldt.getDayOfYear()); //getDayOfYear() verilen tarih-zaman bilgisinin yılın kaçıncı günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getDayOfWeek(): "+ldt.getDayOfWeek()); //getDayOfWeek() verilen tarih-zaman bilgisinin haftanın hangi günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getYear(): "+ldt.getYear()); //getYear() verilen tarih-zaman bilgisinin yıl değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMonth(): "+ldt.getMonth()); //getMonth() verilen tarih-zaman bilgisinin hangi ay olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMonthValue(): "+ldt.getMonthValue()); //getMonthValue() verilen tarih-zaman bilgisinin yılın kaçıncı ayı olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getHour(): "+ldt.getHour()); //getHour() verilen tarih-zaman bilgisinin saat değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMinute(): "+ldt.getMinute()); //getMinute() verilen tarih-zaman bilgisinin dakika değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getSecond(): "+ldt.getSecond()); //getSecond() verilen tarih-zaman bilgisinin saniye değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getNano(): "+ldt.getNano()); //getNano() verilen tarih-zaman bilgisinin nanosaniye değerini dönüyor.
		
		System.out.println("----------------------------------------");
	
		System.out.println("10 Saat Sonraki Zaman: "+ldt.plusHours(10)); //plusHours() verilen tarih-zaman bilgisinin üzerine parametre olarak verilen saat sayısını ekleyip o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("15 Dakika Önceki Zaman: "+ldt.minusMinutes(15)); //minusMinutes() verilen tarih-zaman bilgisinden parametre olarak verilen dakika sayısını çıkarıp o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("40 Saniye Sonraki Zaman: "+ldt.plusSeconds(40)); //plusSeconds() verilen tarih-zaman bilgisinin üzerine parametre olarak verilen saniye sayısını ekleyip o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("20 Saniye Önceki Zaman: "+ldt.minusSeconds(20)); //minusSeconds() verilen tarih-zaman bilgisinden parametre olarak verilen saniye sayısını çıkarıp o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("40 Gün Sonraki Tarih-Zaman: "+ldt.plusDays(40)); //plusDays() verilen tarih-zaman bilgisinin üzerine parametre olarak verilen gün sayısını ekleyip o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("13 Gün Önceki Tarih-Zaman: "+ldt.minusDays(13)); //minusDays() verilen tarih-zaman bilgisinden parametre olarak verilen gün sayısını çıkarıp o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("3 Ay Önceki Tarih-Zaman: "+ldt.minusMonths(3)); //minusMonths() verilen tarih-zaman bilgisinden parametre olarak verilen ay sayısını çıkarıp o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("4 Ay Sonrasının 2 Hafta Öncesinin Tarih-Zamanı: "+ldt.plusMonths(4).minusWeeks(2)); //plusMonths(4).minusWeeks(2) verilen tarih-zaman bilgisinden 4 ay sonraki tarihin 2 hafta öncesindeki tarih-zaman bilgisini döner. Metotlar geriye LocalDateTime döndüğü için zincirleme şeklinde metot kullanımı yapabiliriz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("30 Yıl Sonraki Tarih-Zaman: "+ldt.plusYears(30)); //plusYears() verilen tarih-zaman bilgisinin üzerine parametre olarak verilen yıl sayısını ekleyip o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		//ChronoUnit: İçinde tarih ve zaman elemanları barındıran bir Enum'dır. plus() ve minus() metotları ikinci parametre olarak TemporalUnit interface istiyor. ChronoUnit Enum'ı TemporalUnit interface'ini implement ettiği için kullanabiliyoruz.
		//plus() ve minus() metotlarında önce değeri verip sonra enumdan değeri ne olarak ekleyip çıkaracağımızı seçerek ekleme ve çıkarma işlemini yapabiliriz.
		//Bu şekilde her değer için ayrı ayrı metot kullanmak yerine sadece iki metot kullanarak enum içindeki eleman tercihimize göre tarih-zaman üzerine ekleme ya da çıkarma yapabiliriz.
		
		System.out.println("100 Yıl Önceki Tarih-Zaman: "+ldt.minus(100, ChronoUnit.YEARS)); //minus() metodu ile önce çıkarılacak değeri veriyoruz sonra bu değeri ne olarak çıkaracağımızı ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarih-zamandan 100 yıl önceki tarih-zaman bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("100 Yıl Sonraki Tarih-Zaman: "+ldt.plus(100, ChronoUnit.YEARS)); //plus() metodu ile önce eklenecek değeri veriyoruz sonra bu değeri ne olarak ekleyeceğimizi ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarih-zamandan 100 yıl sonraki tarih-zaman bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("45 Dakika Sonraki Tarih-Zaman: "+ldt.plus(45, ChronoUnit.MINUTES)); //plus() metodu ile önce eklenecek değeri veriyoruz sonra bu değeri ne olarak ekleyeceğimizi ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarih-zamandan 45 dakika sonraki tarih-zaman bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("5 Saat Önceki Tarih-Zaman: "+ldt.minus(5, ChronoUnit.HOURS)); //minus() metodu ile önce çıkarılacak değeri veriyoruz sonra bu değeri ne olarak çıkaracağımızı ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarih-zamandan 5 saat önceki tarih-zaman bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		LocalDateTime ldt2=LocalDateTime.of(1993, 02, 12, 13, 40, 06); //LocalDateTime.of() kullanarak parametre olarak yıl, ay, gün, saat, dakika, saniye bilgilerini verip bir LocalDateTime oluşturuyoruz.
		
		System.out.println("Aradaki Yıl Farkı: "+ChronoUnit.YEARS.between(ldt2, ldt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından YEARS seçerek between() metodu çağırılıp içine iki LocalDateTime veriyoruz ve aralarındaki tarih-zaman farkını yıl olarak long türünde dönüyoruz.		
		System.out.println("Aradaki Ay Farkı: "+ChronoUnit.MONTHS.between(ldt2, ldt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından MONTHS seçerek between() metodu çağırılıp içine iki LocalDateTime veriyoruz ve aralarındaki tarih-zaman farkını ay olarak long türünde dönüyoruz.	
		System.out.println("Aradaki Gün Farkı: "+ChronoUnit.DAYS.between(ldt2, ldt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından DAYS seçerek between() metodu çağırılıp içine iki LocalDateTime veriyoruz ve aralarındaki tarih-zaman farkını gün olarak long türünde dönüyoruz.	
		System.out.println("Aradaki Saat Farkı: "+ChronoUnit.HOURS.between(ldt2, ldt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından HOURS seçerek between() metodu çağırılıp içine iki LocalDateTime veriyoruz ve aralarındaki tarih-zaman farkını saat olarak long türünde dönüyoruz.		
		System.out.println("Aradaki Dakika Farkı: "+ChronoUnit.MINUTES.between(ldt2, ldt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından MINUTES seçerek between() metodu çağırılıp içine iki LocalDateTime veriyoruz ve aralarındaki tarih-zaman farkını dakika olarak long türünde dönüyoruz.	
		System.out.println("Aradaki Saniye Farkı: "+ChronoUnit.SECONDS.between(ldt2, ldt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından SECONDS seçerek between() metodu çağırılıp içine iki LocalDateTime veriyoruz ve aralarındaki tarih-zaman farkını saniye olarak long türünde dönüyoruz.	
		
	}

}
