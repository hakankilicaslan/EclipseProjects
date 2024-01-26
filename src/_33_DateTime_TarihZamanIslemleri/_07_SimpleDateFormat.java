package _33_DateTime_TarihZamanIslemleri;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _07_SimpleDateFormat {

	public static void main(String[] args) {
		
		/*
		 * SimpleDateFormat nesnesi içine parametre olarak aşağıdaki harf kombinasyonlarını giriyoruz.
		 * Girdiğimiz harf kombinasyonlarına göre format() metodu tarih ve zaman bilgilerini formatlayıp geriye dönüyor.
		 * SimpleDateFormat üzerinden format() metodunu çağırıp tarihi vererek formatlıyoruz.
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
		
		//Date Formatlama:
		Date bugun=new Date(); //Date nesnesi üretiyoruz. Bu nesne şu anki tarih ve zaman bilgisini tutuyor.
		System.out.println(bugun);
		
		System.out.println("----------------------------------------");
		
		//SimpleDateFormat nesnesi oluşturuyoruz ve tarihi neye göre formatlayacağını parametre olarak pattern şeklinde veriyoruz.
		SimpleDateFormat sdf1=new SimpleDateFormat("dd MMMM yyyy"); 
				
		//SimpleDateFormat üzerinden format() metoduna şu anki Date'i gösteren referansı parametre olarak veriyoruz ve verdiğimiz pattern formatına çevirip geriye String olarak dönüyor.
		System.out.println("dd MMMM yyyy -> "+sdf1.format(bugun));
		
		System.out.println("----------------------------------------");
		
		//SimpleDateFormat nesnesi oluşturuyoruz ve tarihi neye göre formatlayacağını parametre olarak pattern şeklinde veriyoruz. Aralarına / koyduğumuzda çıktı onunla birlikte gösteriyor.
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MMM/yy"); 
				
		//SimpleDateFormat üzerinden format() metoduna şu anki Date'i gösteren referansı parametre olarak veriyoruz ve verdiğimiz pattern formatına çevirip geriye String olarak dönüyor.
		System.out.println("dd/MMM/yy -> "+sdf2.format(bugun));
		
		System.out.println("----------------------------------------");
		
		//SimpleDateFormat nesnesi oluşturuyoruz ve tarihi ve zamanı neye göre formatlayacağını parametre olarak pattern şeklinde veriyoruz. Aralarına - koyduğumuzda çıktı onunla birlikte gösteriyor.
		SimpleDateFormat sdf3=new SimpleDateFormat("dd-MM-yyyy HH:mm");
				
		//SimpleDateFormat üzerinden format() metoduna şu anki Date'i gösteren referansı parametre olarak veriyoruz ve verdiğimiz pattern formatına çevirip geriye String olarak dönüyor.
		System.out.println("dd-MM-yyyy HH:mm -> "+sdf3.format(bugun));
		
		System.out.println("----------------------------------------");
		
		//Oluşturduğumuz SimpleDateFormat üzerinden format() metodunu çağırıp parametre olarak şu anki tarih ve zaman bilgisini tutan Date nesnesi veriyoruz ve daha önce verdiğimiz pattern formatına çevirip geriye String dönüyor.
		System.out.println("dd MMMM yyyy -> "+sdf1.format(new Date()));
		
		System.out.println("----------------------------------------");
		
		//Yeni bir SimpleDateFormat nesnesi oluşturup tarihi neye göre formatlayacağını parametre olarak pattern şeklinde veriyoruz. Onun üzerinden format() metodunu çağırıp parametre olarak şu anki tarih ve zaman bilgisini tutan Date nesnesi veriyoruz. Geriye verdiğimiz pattern formatına çevirip geriye String olarak dönüyor.
		System.out.println("dd/MM/yy EEEE -> "+new SimpleDateFormat("dd/MM/yy EEEE").format(new Date()));
		
		System.out.println("----------------------------------------");
		
		//Calendar Formatlama:
		
		//Calendar üzerinden getInstance() metoduyla tarih zaman takvim zone gibi birçok bilgiyi tutuyor. 
		//Calendar abstract bir sınıf olduğu için nesnesini üretemiyoruz. get metotlarıyla Calendar üzerinden bazı değerleri alabiliriz.
		Calendar calendar=Calendar.getInstance();
		
		System.out.println("getInstance(): "+calendar); //Tarih, zaman, zone bilgilerini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getTimeZone(): "+calendar.getTimeZone()); //getTimeZone() içindeki bulunduğumuz lokasyonun ait olduğu zone bilgisini dönüyor.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getTime(): "+calendar.getTime()); //getTime() şu anki tarih zaman bilgisini dönüyor. Date ile aynı değeri taşıyor. 
		
		System.out.println("----------------------------------------");
		
		//SimpleDateFormat nesnesi oluşturuyoruz ve tarihi ve zamanı neye göre formatlayacağını parametre olarak pattern şeklinde veriyoruz.
		//Pattern içinde tek tırnak içerisine yazmak istediğimiz String ifadeyi eklersek formatlama için o kısmı kullanmıyor ve yazdırma işleminde tek tırnak içindeki ifadeyle beraber yazdırabiliyoruz.
		SimpleDateFormat sdf4=new SimpleDateFormat("'Gün: 'dd");
		
		//SimpleDateFormat üzerinden format() metoduna calendar.getTime() parametre olarak veriyoruz. calendar.getTime() geriye Date döndüğü için verebiliyoruz verdiğimiz pattern formatına çevirip sadece gün bilgisini geriye String olarak dönüyor.
		System.out.println(sdf4.format(calendar.getTime())); //09
		
		System.out.println("----------------------------------------");
		
		//SimpleDateFormat nesnesi oluşturuyoruz ve tarihi ve zamanı neye göre formatlayacağını parametre olarak pattern şeklinde veriyoruz.
		//Pattern içinde tek tırnak içerisine yazmak istediğimiz String ifadeyi eklersek formatlama için o kısmı kullanmıyor ve yazdırma işleminde tek tırnak içindeki ifadeyle beraber yazdırabiliyoruz.
		SimpleDateFormat sdf5=new SimpleDateFormat("'Ay: 'MM");
		
		//SimpleDateFormat üzerinden format() metoduna calendar.getTime() parametre olarak veriyoruz. calendar.getTime() geriye Date döndüğü için verebiliyoruz verdiğimiz pattern formatına çevirip sadece ay bilgisini geriye String olarak dönüyor.
		System.out.println(sdf5.format(calendar.getTime())); //10
		
		System.out.println("----------------------------------------");
		
		//SimpleDateFormat nesnesi oluşturuyoruz ve tarihi ve zamanı neye göre formatlayacağını parametre olarak pattern şeklinde veriyoruz.
		//Pattern içinde tek tırnak içerisine yazmak istediğimiz String ifadeyi eklersek formatlama için o kısmı kullanmıyor ve yazdırma işleminde tek tırnak içindeki ifadeyle beraber yazdırabiliyoruz.
		SimpleDateFormat sdf6=new SimpleDateFormat("'Yıl: 'yyyy");
		
		//SimpleDateFormat üzerinden format() metoduna calendar.getTime() parametre olarak veriyoruz. calendar.getTime() geriye Date döndüğü için verebiliyoruz verdiğimiz pattern formatına çevirip sadece yıl bilgisini geriye String olarak dönüyor.
		System.out.println(sdf6.format(calendar.getTime())); //2023
		
	}

}
