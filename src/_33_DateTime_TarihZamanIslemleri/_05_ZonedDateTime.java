package _33_DateTime_TarihZamanIslemleri;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class _05_ZonedDateTime {

	public static void main(String[] args) {

		/* 
		 * ZonedDateTime -> Zone'lu Tarih + Zaman işlemleri -> ZonedDateTime final class olduğu için new'leyemiyoruz yani nesne üretemiyoruz.
		 * ZonedDateTime içinde hem LocalDate hem de LocalTime barındıran bir yapıdır.
		 * ZonedDateTime.of() kullanarak parametre olarak LocalDate ve LocalTime verip ya da LocalDateTime verip daha sonra zone bilgisi vererek bir ZonedDateTime oluşturabiliriz.
		 * ZonedDateTime.of() kullanarak bütün tarih, zaman ve zone değerlerini tek tek girerekte bir ZonedDateTime oluşturabiliriz.
		 * 
		 * LocalDate ve LocalTime içerdiği için bu ikisinde yer alan bütün metotlar ZonedDateTime içinde de yer alıyor.
		 * getYear(), getMonth(), getMonthValue(), getDayOfYear(), getDayOfMonth(), getDayOfWeek(), getHour(), getMinute(),
		 * getSecond(), getNano(), plusYears(), minusYears(), plusMonths(), minusMonths(), plusWeeks(), minusWeeks(),
		 * plusDays(), minusDays(), plusHour(), minusHour(), plusMinutes(), minusMinutes(), plusSecond(), minusSecond() vb.
		 * gibi get, plus, minus metotlarının hepsi LocalDateTime içinde de aynı şekilde çalışıyor.
		 * Tarih ve zaman değerleri için plus() ve minus() metotları ile ChronoUnit Enum alan verisyonlar da aynı şekilde çalışıyor.
		 * 
		 */
		
		//ZonedDateTime -> Zone'lu Tarih + Zaman işlemleri -> ZonedDateTime final class olduğu için new'leyemiyoruz yani nesne üretemiyoruz.
		//ZonedDateTime ile şu anki tarih ve zaman bilgisiyle beraber hangi zone içinde olduğumuz bilgisini de tutabiliyoruz. LocalDateTime için geçerli olan metotlar ZonedDateTime içinde geçerlidir.
		
		ZonedDateTime zdt=ZonedDateTime.now(); //ZonedDateTime.now() diyerek şu anki tarih , zaman ve zone bilgisini tutabiliyoruz.
		System.out.println("İstanbul ZonedDateTime: "+zdt); //Şu anki tarih, zaman ve zone bilgisini dönüyor.
		
		System.out.println("----------------------------------------");
		
		//ZoneId.of() metoduyla içine String türünde formata uygun zone bilgisini verdiğimizde metot onu ZoneId olarak geri dönüyor.
		//Şu anki ZonedDateTime yani tarih,zaman ve zone bilgimizi tutan metoda ZonedDateTime.now() metoduna ZoneId olarak Los Angeles saat dilimini vermiş oluyoruz.
		//Artık ZonedDateTime.now() metodu geriye bizim tarih-zaman bilgilerimizi Los Angeles karşılığını dönecek.
		ZonedDateTime zdtLosAngeles=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Los Angeles ZonedDateTime: "+zdtLosAngeles);
		
		System.out.println("----------------------------------------");
		
		System.out.println("getDayOfMonth(): "+zdt.getDayOfMonth()); //getDayOfMonth() verilen tarih-zaman bilgisinin ayın kaçıncı günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getDayOfYear(): "+zdt.getDayOfYear()); //getDayOfYear() verilen tarih-zaman bilgisinin yılın kaçıncı günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getDayOfWeek(): "+zdt.getDayOfWeek()); //getDayOfWeek() verilen tarih-zaman bilgisinin haftanın hangi günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getYear(): "+zdt.getYear()); //getYear() verilen tarih-zaman bilgisinin yıl değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMonth(): "+zdt.getMonth()); //getMonth() verilen tarih-zaman bilgisinin hangi ay olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMonthValue(): "+zdt.getMonthValue()); //getMonthValue() verilen tarih-zaman bilgisinin yılın kaçıncı ayı olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getHour(): "+zdt.getHour()); //getHour() verilen tarih-zaman bilgisinin saat değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMinute(): "+zdt.getMinute()); //getMinute() verilen tarih-zaman bilgisinin dakika değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getSecond(): "+zdt.getSecond()); //getSecond() verilen tarih-zaman bilgisinin saniye değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getNano(): "+zdt.getNano()); //getNano() verilen tarih-zaman bilgisinin nanosaniye değerini dönüyor.
		
		System.out.println("----------------------------------------");
	
		System.out.println("10 Saat Sonraki Zaman: "+zdt.plusHours(10)); //plusHours() verilen tarih-zaman bilgisinin üzerine parametre olarak verilen saat sayısını ekleyip o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("15 Dakika Önceki Zaman: "+zdt.minusMinutes(15)); //minusMinutes() verilen tarih-zaman bilgisinden parametre olarak verilen dakika sayısını çıkarıp o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("40 Saniye Sonraki Zaman: "+zdt.plusSeconds(40)); //plusSeconds() verilen tarih-zaman bilgisinin üzerine parametre olarak verilen saniye sayısını ekleyip o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("20 Saniye Önceki Zaman: "+zdt.minusSeconds(20)); //minusSeconds() verilen tarih-zaman bilgisinden parametre olarak verilen saniye sayısını çıkarıp o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("40 Gün Sonraki Tarih-Zaman: "+zdt.plusDays(40)); //plusDays() verilen tarih-zaman bilgisinin üzerine parametre olarak verilen gün sayısını ekleyip o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("13 Gün Önceki Tarih-Zaman: "+zdt.minusDays(13)); //minusDays() verilen tarih-zaman bilgisinden parametre olarak verilen gün sayısını çıkarıp o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("3 Ay Önceki Tarih-Zaman: "+zdt.minusMonths(3)); //minusMonths() verilen tarih-zaman bilgisinden parametre olarak verilen ay sayısını çıkarıp o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("4 Ay Sonrasının 2 Hafta Öncesinin Tarih-Zamanı: "+zdt.plusMonths(4).minusWeeks(2)); //plusMonths(4).minusWeeks(2) verilen tarih-zaman bilgisinden 4 ay sonraki tarihin 2 hafta öncesindeki tarih-zaman bilgisini döner. Metotlar geriye LocalDateTime döndüğü için zincirleme şeklinde metot kullanımı yapabiliriz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("30 Yıl Sonraki Tarih-Zaman: "+zdt.plusYears(30)); //plusYears() verilen tarih-zaman bilgisinin üzerine parametre olarak verilen yıl sayısını ekleyip o tarih-zaman bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		//ChronoUnit: İçinde tarih ve zaman elemanları barındıran bir Enum'dır. plus() ve minus() metotları ikinci parametre olarak TemporalUnit interface istiyor. ChronoUnit Enum'ı TemporalUnit interface'ini implement ettiği için kullanabiliyoruz.
		//plus() ve minus() metotlarında önce değeri verip sonra enumdan değeri ne olarak ekleyip çıkaracağımızı seçerek ekleme ve çıkarma işlemini yapabiliriz.
		//Bu şekilde her değer için ayrı ayrı metot kullanmak yerine sadece iki metot kullanarak enum içindeki eleman tercihimize göre tarih-zaman üzerine ekleme ya da çıkarma yapabiliriz.
		
		System.out.println("100 Yıl Önceki Tarih-Zaman: "+zdt.minus(100, ChronoUnit.YEARS)); //minus() metodu ile önce çıkarılacak değeri veriyoruz sonra bu değeri ne olarak çıkaracağımızı ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarih-zamandan 100 yıl önceki tarih-zaman bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("100 Yıl Sonraki Tarih-Zaman: "+zdt.plus(100, ChronoUnit.YEARS)); //plus() metodu ile önce eklenecek değeri veriyoruz sonra bu değeri ne olarak ekleyeceğimizi ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarih-zamandan 100 yıl sonraki tarih-zaman bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("45 Dakika Sonraki Tarih-Zaman: "+zdt.plus(45, ChronoUnit.MINUTES)); //plus() metodu ile önce eklenecek değeri veriyoruz sonra bu değeri ne olarak ekleyeceğimizi ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarih-zamandan 45 dakika sonraki tarih-zaman bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("5 Saat Önceki Tarih-Zaman: "+zdt.minus(5, ChronoUnit.HOURS)); //minus() metodu ile önce çıkarılacak değeri veriyoruz sonra bu değeri ne olarak çıkaracağımızı ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarih-zamandan 5 saat önceki tarih-zaman bilgisini dönebiliyoruz.
			
		System.out.println("----------------------------------------");
		
		ZonedDateTime zdt2=ZonedDateTime.of(1993, 02, 12, 13, 40, 06, 429098200, ZoneId.of("America/Los_Angeles")); //ZonedDateTime.of() kullanarak parametre olarak yıl, ay, gün, saat, dakika, saniye, nanosaniye ve zoneId bilgilerini verip bir ZonedDateTime oluşturuyoruz.
		
		System.out.println("Aradaki Yıl Farkı: "+ChronoUnit.YEARS.between(zdt2, zdt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından YEARS seçerek between() metodu çağırılıp içine iki ZonedDateTime veriyoruz ve aralarındaki tarih-zaman farkını yıl olarak long türünde dönüyoruz.		
		System.out.println("Aradaki Ay Farkı: "+ChronoUnit.MONTHS.between(zdt2, zdt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından MONTHS seçerek between() metodu çağırılıp içine iki ZonedDateTime veriyoruz ve aralarındaki tarih-zaman farkını ay olarak long türünde dönüyoruz.	
		System.out.println("Aradaki Gün Farkı: "+ChronoUnit.DAYS.between(zdt2, zdt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından DAYS seçerek between() metodu çağırılıp içine iki ZonedDateTime veriyoruz ve aralarındaki tarih-zaman farkını gün olarak long türünde dönüyoruz.	
		System.out.println("Aradaki Saat Farkı: "+ChronoUnit.HOURS.between(zdt2, zdt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından HOURS seçerek between() metodu çağırılıp içine iki ZonedDateTime veriyoruz ve aralarındaki tarih-zaman farkını saat olarak long türünde dönüyoruz.		
		System.out.println("Aradaki Dakika Farkı: "+ChronoUnit.MINUTES.between(zdt2, zdt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından MINUTES seçerek between() metodu çağırılıp içine iki ZonedDateTime veriyoruz ve aralarındaki tarih-zaman farkını dakika olarak long türünde dönüyoruz.	
		System.out.println("Aradaki Saniye Farkı: "+ChronoUnit.SECONDS.between(zdt2, zdt)); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından SECONDS seçerek between() metodu çağırılıp içine iki ZonedDateTime veriyoruz ve aralarındaki tarih-zaman farkını saniye olarak long türünde dönüyoruz.	
		
		System.out.println("----------------------------------------");
		
		//ZoneId.getAvailableZoneIds() metodu içinde bulunan bütün ZoneId değerlerini geriye içine String alan bir Set olarak dönüyor.
		Set<String> zoneIds=ZoneId.getAvailableZoneIds();
		
		System.out.println("ZoneId Sayısı: "+zoneIds.size()); //Kaç tane ZoneId olduğunu görmek için size() metodunu kullanıyoruz.
		
		for (String zoneId : zoneIds) { //foreach döngüsüyle ZoneId değerlerimizi tek tek yazdırıyoruz. 
			System.out.println(zoneId);
		}
				
	}

}
