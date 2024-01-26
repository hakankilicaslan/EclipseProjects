package _33_DateTime_TarihZamanIslemleri;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class _02_LocalDate {

	public static void main(String[] args) {
		
		//LocalDate -> Tarih işlemleri -> LocalDate final class olduğu için new'leyemiyoruz yani nesne üretemiyoruz.
		
		System.out.println("Şu anki Tarih: "+LocalDate.now()); //LocalDate.now() şu anki tarih bilgisini dönüyor. (Yıl-Ay-Gün)
		
		System.out.println("----------------------------------------");
		
		LocalDate localDate=LocalDate.of(1993, 2, 12); //LocalDate.of() kullanarak parametre olarak yıl ay gun bilgilerini verip bir LocalDate oluşturuyoruz.
		//LocalDate localDate=LocalDate.of(1993, Month.FEBRUARY, 12); //LocalDate.of() parametre verirken ay kısmı için Month Enum'ı elemanlarını da kullanabiliriz.
		
		System.out.println("Doğum Tarihi: "+localDate); //Verilen tarih bilgisini dönüyor.
		
		System.out.println("----------------------------------------");
	
		System.out.println("getDayOfMonth(): "+localDate.getDayOfMonth()); //getDayOfMonth() verilen tarih bilgisinin ayın kaçıncı günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getDayOfYear(): "+localDate.getDayOfYear()); //getDayOfYear() verilen tarih bilgisinin yılın kaçıncı günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getDayOfWeek(): "+localDate.getDayOfWeek()); //getDayOfWeek() verilen tarih bilgisinin haftanın hangi günü olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getYear(): "+localDate.getYear()); //getYear() verilen tarih bilgisinin yıl değerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMonth(): "+localDate.getMonth()); //getMonth() verilen tarih bilgisinin hangi ay olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMonthValue(): "+localDate.getMonthValue()); //getMonthValue() verilen tarih bilgisinin yılın kaçıncı ayı olduğunu dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("Artık Yıl mı..."+localDate.isLeapYear()); //isLeapYear() verilen tarih bilgisinin artık yıl olup olmadığını true ya da false olarak dönüyor yani geriye boolean dönüyor. Artık yıl 4'e tam bölünen ama 100'e tam bölünüyorsa 400'e de tam bölünen yıllar		
	
		System.out.println("----------------------------------------");
		
		System.out.println("40 Gün Sonraki Tarih: "+localDate.plusDays(40)); //plusDays() verilen tarih bilgisinin üzerine parametre olarak verilen gün sayısını ekleyip o tarih bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("13 Gün Önceki Tarih: "+localDate.minusDays(13)); //minusDays() verilen tarih bilgisinden parametre olarak verilen gün sayısını çıkarıp o tarih bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("3 Ay Önceki Tarih: "+localDate.minusMonths(3)); //minusMonths() verilen tarih bilgisinden parametre olarak verilen ay sayısını çıkarıp o tarih bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		System.out.println("4 Ay Sonrasının 2 Hafta Öncesinin Tarihi: "+localDate.plusMonths(4).minusWeeks(2)); //plusMonths(4).minusWeeks(2) verilen tarih bilgisinden 4 ay sonraki tarihin 2 hafta öncesindeki tarih bilgisini döner. Metotlar geriye LocalDate döndüğü için zincirleme şeklinde metot kullanımı yapabiliriz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("30 Yıl Sonraki Tarih: "+localDate.plusYears(30)); //plusYears() verilen tarih bilgisinin üzerine parametre olarak verilen yıl sayısını ekleyip o tarih bilgisini döner.
		
		System.out.println("----------------------------------------");
		
		//ChronoUnit: İçinde tarih ve zaman elemanları barındıran bir Enum'dır. plus() ve minus() metotları ikinci parametre olarak TemporalUnit interface istiyor. ChronoUnit Enum'ı TemporalUnit interface'ini implement ettiği için kullanabiliyoruz.
		//plus() ve minus() metotlarında önce değeri verip sonra enumdan değeri ne olarak ekleyip çıkaracağımızı seçerek ekleme ve çıkarma işlemini yapabiliriz.
		//Bu şekilde her değer için ayrı ayrı metot kullanmak yerine sadece iki metot kullanarak enum içindeki eleman tercihimize göre tarih üzerine ekleme ya da çıkarma yapabiliriz.
		
		System.out.println("100 Yıl Önceki Tarih: "+localDate.minus(100, ChronoUnit.YEARS)); //minus() metodu ile önce çıkarılacak değeri veriyoruz sonra bu değeri ne olarak çıkaracağımızı ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarihten 100 yıl önceki tarih bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("100 Yıl Sonraki Tarih: "+localDate.plus(100, ChronoUnit.YEARS)); //plus() metodu ile önce eklenecek değeri veriyoruz sonra bu değeri ne olarak ekleyeceğimizi ChronoUnit Enum içindeki elemanlardan seçerek onu atıyoruz ve bu şekilde verilen tarihten 100 yıl sonraki tarih bilgisini dönebiliyoruz.
		
		System.out.println("----------------------------------------");
		
	    //System.out.println(LocalDate.of(2023, 2, 30)); //Olmayan bir tarihi yazdırmaya çalıştığımızda InvalidDate hatası yani geçersiz tarhi hatası alıyoruz.
	
		LocalDate tarih=LocalDate.of(2023, 1, 31); //LocalDate.of() kullanarak parametre olarak yıl ay gun bilgilerini verip bir LocalDate oluşturuyoruz.
		
		//31 Ocak üstüne 1 ay eklediğimiz zaman 31 Şubat geçerli olmadığı için ayın son günü olan 28 Şubat dönüyor. Artık tarihimiz 28 Şubat olduğu için tekrar 1 ay çıkarırsak 31 Ocak yerine 28 Ocak dönüyor.
		System.out.println(tarih.plusMonths(1).minusMonths(1)); 
	
		System.out.println("----------------------------------------");
		
		LocalDate ld1=LocalDate.of(2022, 7, 28); //LocalDate.of() kullanarak parametre olarak yıl ay gun bilgilerini verip bir LocalDate oluşturuyoruz.
		LocalDate ld2=LocalDate.of(2023, 6, 24); //LocalDate.of() kullanarak parametre olarak yıl ay gun bilgilerini verip bir LocalDate oluşturuyoruz.
		
		System.out.println("Aradaki Gün Farkı: "+gunFarki(ld1, ld2)); //İki LocalDate arasındaki gün farkını buluyoruz.
		System.out.println("Aradaki Ay Farkı: "+ayFarki(ld1,ld2)); //İki LocalDate arasındaki ay farkını buluyoruz.
		System.out.println("Aradaki Yıl Farkı: "+yilFarki(ld1, ld2)); //İki LocalDate arasındaki yıl farkını buluyoruz.
		
	}
	
	public static long gunFarki(LocalDate date1,LocalDate date2) { //Verilen iki LocalDate arasındaki zaman farkını gün olarak dönen bir metot yazıyoruz.
		return ChronoUnit.DAYS.between(date1, date2); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından DAYS seçerek between() metodu çağırılıp içine iki LocalDate veriyoruz ve aralarındaki tarih farkını gün olarak long türünde dönüyoruz.		
	}
	
	public static long ayFarki(LocalDate date1,LocalDate date2) { //Verilen iki LocalDate arasındaki zaman farkını ay olarak dönen bir metot yazıyoruz.
		return ChronoUnit.MONTHS.between(date1, date2);	//ChronoUnit Enum üzerinden tarih-zaman elemanlarından MONTHS seçerek between() metodu çağırılıp içine iki LocalDate veriyoruz ve aralarındaki tarih farkını ay olarak long türünde dönüyoruz.		
	}
	
	public static long yilFarki(LocalDate date1,LocalDate date2) { //Verilen iki LocalDate arasındaki zaman farkını yıl olarak dönen bir metot yazıyoruz.
		return ChronoUnit.YEARS.between(date1, date2); //ChronoUnit Enum üzerinden tarih-zaman elemanlarından YEARS seçerek between() metodu çağırılıp içine iki LocalDate veriyoruz ve aralarındaki tarih farkını yıl olarak long türünde dönüyoruz.			
	}
		
}
