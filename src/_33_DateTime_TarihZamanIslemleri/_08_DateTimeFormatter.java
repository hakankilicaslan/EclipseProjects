package _33_DateTime_TarihZamanIslemleri;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class _08_DateTimeFormatter {

	public static void main(String[] args) {

		/*
		 * DateTimeFormatter bir final class olduğu için new'leyemiyoruz yani nesne üretemiyoruz.
		 * Direkt sınıf üzerinden ofPattern() metodunu çağırıp içine parametre olarak aşağıdaki harf kombinasyonlarını giriyoruz.
		 * Girdiğimiz harf kombinasyonlarına göre format() metodu tarih ve zaman bilgilerini formatlayıp geriye dönüyor.
		 * Tarih üzerinden format() metodunu çağırıp DateTimeFormatter vererek formatlıyoruz.
		 * LocalDate, LocalTime, LocalDateTime ya da ZonedDateTime üzerinden verilen formatlama şekline göre format() metoduyla formatlama yapabiliriz.
		 * Pattern içinde ama pattern olmayan ifadeler tek tırnak içine alınarak yazdırılabilir.
		 * 
		 * yyyy  : Yıl bilgisinin tamamını dört hane şeklinde dönüyor. -> 1993
		 * yy    : Yıl bilgisinin son iki hanesini dönüyor. -> 93
		 * MMMM  : Ay bilgisinin tamamını dönüyor. -> Şubat
		 * MMM   : Ay bilgisinin ilk üç harfini dönüyor. -> Şub
		 * MM    : Ay bilgisinin yılın kaçıncı ayı olduğunu dönüyor. -> 02
		 * dd    : Gün bilgisinin ayın kaçıncı günü olduğunu dönüyor. -> 12
		 * EEEE  : Gün bilgisinin tamamını dönüyor. -> Cuma
		 * EEE   : Gün bilgisinin ilk üç harfini dönüyor. -> Cum
		 * EE    : Gün bilgisinin ilk üç harfini dönüyor. -> Cum
		 * HH    : Saat bilgisini 24'lük sisteme göre dönüyor. -> 13
		 * hh    : Saat bilgisini 12'lik sisteme göre dönüyor. -> 1
		 * mm    : Dakika bilgisini dönüyor. -> 45
		 * 
		 */
		
		//LocalDate.now() ile şu anki tarihin formatsız halini alıyoruz. Daha sonra LocalDate üzerinden format() metodunu çağırıyoruz.
		//Metot içine DateTimeFormatter sınıfından ofPattern() metodunu çağırıyoruz ve parametre olarak String türünde pattern veriyoruz.
		System.out.println("Formatsız Tarih: "+LocalDate.now()+" Formatlı Tarih: "+LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yy"))); 
		
		System.out.println("----------------------------------------");
		
		LocalDate dogumGunu=LocalDate.of(1993, 2, 12); //LocalDate.of() kullanarak parametre olarak yıl ay gun bilgilerini verip bir LocalDate oluşturuyoruz.
		
		//DateTimeFormatter sınıfı üzerinden ofPattern() metodunu çağırıp içine tarihi neye göre formatlayacaksa parametre olarak String türünde pattern veriyoruz.
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MM-yy");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden format() metodunu çağırıyoruz ve içine parametre olarak DateTimeFormatter referansını veriyoruz ordaki pattern formatına çevirerek geriye String olarak dönüyor.
		System.out.println("dd-MM-yy -> "+dogumGunu.format(dtf1));
		
		System.out.println("----------------------------------------");
				
		//DateTimeFormatter sınıfı üzerinden ofPattern() metodunu çağırıp içine tarihi neye göre formatlayacaksa parametre olarak String türünde pattern veriyoruz.
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden format() metodunu çağırıyoruz ve içine parametre olarak DateTimeFormatter referansını veriyoruz ordaki pattern formatına çevirerek geriye String olarak dönüyor.
		System.out.println("dd/MMM/yyyy -> "+dogumGunu.format(dtf2));
		
		System.out.println("----------------------------------------");
		
		//DateTimeFormatter sınıfı üzerinden ofPattern() metodunu çağırıp içine tarihi neye göre formatlayacaksa parametre olarak String türünde pattern veriyoruz.
		//Pattern içinde tek tırnak içerisine yazmak istediğimiz String ifadeyi eklersek formatlama için o kısmı kullanmıyor ve yazdırma işleminde tek tırnak içindeki ifadeyle beraber yazdırabiliyoruz.
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("'Gün:'dd 'Ay:'MMMM 'Yıl:'yyyy");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden format() metodunu çağırıyoruz ve içine parametre olarak DateTimeFormatter referansını veriyoruz ordaki pattern formatına çevirerek geriye String olarak dönüyor.
		System.out.println("dd MMMM yyyy -> "+dogumGunu.format(dtf3));
		
		System.out.println("----------------------------------------");
		
		//DateTimeFormatter sınıfı üzerinden ofPattern() metodunu çağırıp içine tarihi neye göre formatlayacaksa parametre olarak String türünde pattern veriyoruz.
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("EE dd MMMM yyyy");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden format() metodunu çağırıyoruz ve içine parametre olarak DateTimeFormatter referansını veriyoruz ordaki pattern formatına çevirerek geriye String olarak dönüyor.
		System.out.println("EE dd MMMM yyyy -> "+dogumGunu.format(dtf4));
		
		System.out.println("----------------------------------------");
		
		//DateTimeFormatter sınıfı üzerinden ofPattern() metodunu çağırıp içine tarihi neye göre formatlayacaksa parametre olarak String türünde pattern veriyoruz.
		DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("EEE dd MMMM yyyy");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden format() metodunu çağırıyoruz ve içine parametre olarak DateTimeFormatter referansını veriyoruz ordaki pattern formatına çevirerek geriye String olarak dönüyor.
		System.out.println("EEE dd MMMM yyyy -> "+dogumGunu.format(dtf5));
		
		System.out.println("----------------------------------------");
		
		//DateTimeFormatter sınıfı üzerinden ofPattern() metodunu çağırıp içine tarihi neye göre formatlayacaksa parametre olarak String türünde pattern veriyoruz.
		DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden format() metodunu çağırıyoruz ve içine parametre olarak DateTimeFormatter referansını veriyoruz ordaki pattern formatına çevirerek geriye String olarak dönüyor.
		System.out.println("EEEE dd MMMM yyyy -> "+dogumGunu.format(dtf6));
		
		System.out.println("----------------------------------------");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden getDayOfWeek() metoduyla verilen tarih bilgisinin haftanın hangi günü olduğunu dönüyor.
		//getDisplayName() metodunu çağırarak içine TextStyle Enum'ından SHORT diyerek yazacağı değerin kısa halini seçmiş oluyoruz. 
		//Locale üzerinden getDefault() metodunu çağırdığımızda da yerel dil karşılığını yazdırmış oluyoruz.
		System.out.println("Short -> "+dogumGunu.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault()));
			
		System.out.println("----------------------------------------");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden getDayOfWeek() metoduyla verilen tarih bilgisinin haftanın hangi günü olduğunu dönüyor.
		//getDisplayName() metodunu çağırarak içine TextStyle Enum'ından FULL diyerek yazacağı değerin tamamını seçmiş oluyoruz. 
		//Locale üzerinden getDefault() metodunu çağırdığımızda da yerel dil karşılığını yazdırmış oluyoruz.
		System.out.println("Full -> "+dogumGunu.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
		
		System.out.println("----------------------------------------");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden getDayOfWeek() metoduyla verilen tarih bilgisinin haftanın hangi günü olduğunu dönüyor.
		//getDisplayName() metodunu çağırarak içine TextStyle Enum'ından FULL diyerek yazacağı değerin tamamını seçmiş oluyoruz. 
		//Locale üzerinden forLanguageTag() metodunu çağırdığımızda da içine dil etiketini vererek o dilde karşılığını yazdırmış oluyoruz.
		System.out.println("forLanguageTag() -> "+dogumGunu.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("tr-TR")));
		
		System.out.println("----------------------------------------");
		
		//Girdiğimiz tarihi gösteren LocalDate referansı üzerinden getDayOfWeek() metoduyla verilen tarih bilgisinin haftanın hangi günü olduğunu dönüyor.
		//getDisplayName() metodunu çağırarak içine TextStyle Enum'ından FULL diyerek yazacağı değerin tamamını seçmiş oluyoruz. 
		//Locale üzerinden kütüphane de olan locale değerlerinden birini seçerek o dilde karşılığını yazdırmış oluyoruz.
		System.out.println("Germany -> "+dogumGunu.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.GERMANY));
		
	}

}
