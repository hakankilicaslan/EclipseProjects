package _33_DateTime_TarihZamanIslemleri;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class _06_Period {

	public static void main(String[] args) {
		
		//Period sınıfı bir final class'tır yani new'leyemiyoruz, nesne üretemiyoruz.
		
		LocalDate dogumGunu=LocalDate.of(1993, 2, 12); //Yıl, ay, gun şeklide parametreleri girerek of() metoduyla bir LocalDate oluşturuyoruz.
		LocalDate bugun=LocalDate.now(); //LocalDate.now() ile şu anki tarihi tutan bir LocalDate oluşturuyoruz.
		
		Period gecenSure=Period.between(dogumGunu, bugun); //Period üzerinden between() metoduyla başlangıç ve bitiş tarihlerini LocalDate olarak verdiğimizde metot bize Period türünde aradaki farkı dönüyor.
		
		System.out.println("Doğum Günü Period: "+gecenSure); //İki LocalDate arasında geçen süreyi Period olarak yazdırıyoruz.
		
		System.out.println("----------------------------------------");
		
		//ChronoUnit Enum üzerinden tarih-zaman elemanlarından biri seçerek between() metodu çağırılıp içine iki LocalDate verildiğinde arasında geçen süreyi o eleman ne ise onun karşılığı olarak long türünde dönüyor.
		System.out.println("ChronoUnit.between(): "+ChronoUnit.DAYS.between(dogumGunu, bugun));
				
		System.out.println("----------------------------------------");
		
		//compareTo() metodu içine iki LocalDate verildiği zaman tarihler eşitse 0, parametre olarak verilen tarih küçükse ilk farklı bilginin eksi hali, parametre olarak verilen tarih büyükse ilk farklı bilginin artı halini dönüyor.
		System.out.println("compareTo(): "+dogumGunu.compareTo(bugun));
		
		System.out.println("----------------------------------------");
		
		System.out.println("getYears(): "+gecenSure.getYears()); //İki LocalDate arasında geçen süreyi Period olarak döndüğü için getYears() ile geçen sürenin yıl değerini alıyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getMonths(): "+gecenSure.getMonths()); //İki LocalDate arasında geçen süreyi Period olarak döndüğü için getMonths() ile geçen sürenin ay değerini alıyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("getDays(): "+gecenSure.getDays()); //İki LocalDate arasında geçen süreyi Period olarak döndüğü için getDays() ile geçen sürenin gün değerini alıyoruz.
		
		System.out.println("----------------------------------------");
		
		Period period=Period.ofDays(13); //Period.ofDays() ile içine parametre olarak verilen değer kadar Period oluşturuyoruz.
		System.out.println("Period plus(): "+dogumGunu.plus(period)); //LocalDate üzerinden plus() metodunu çağırıyoruz ve parametre olarak Period verebiliyoruz. Verilen tarihin üstüne Period değerini ekleyerek geri dönüyor. 
		
		System.out.println("----------------------------------------");
		
		//İşlem Sırasında Geçen Süreyi Bulma:
		Instant baslangicIns=Instant.now(); //Döngümüz başlamadan önceki zamanı Instant olarak tutuyoruz. Instant final class olduğu içine nesne üretmeden now() metodu ile o anı alabiliyoruz.
		Long baslangicMs=System.currentTimeMillis(); //Döngümüz başlamadan önceki milisaniye değerini tutuyoruz. System üzerinden currentTimeMillis() ile o anki milisaniye değerini alabiliyoruz.
		Long baslangicNs=System.nanoTime(); //Döngümüz başlamadan önceki nanosaniye değerini tutuyoruz. System üzerinden nanoTime() ile o anki nanosaniye değerini alabiliyoruz.
		
		long toplam=0;
		for (int i = 0; i < 2_000_000_000; i++) {
			toplam+=i;
		}
		System.out.println(toplam);
		
		Long bitisNs=System.nanoTime(); //Döngümüz bittikten sonraki nanosaniye değerini tutuyoruz. System üzerinden nanoTime() ile o anki nanosaniye değerini alabiliyoruz.
		Long bitisMs=System.currentTimeMillis(); //Döngümüz bittikten sonraki milisaniye değerini tutuyoruz. System üzerinden currentTimeMillis() ile o anki milisaniye değerini alabiliyoruz.
		Instant bitisIns=Instant.now(); //Döngümüz bittikten sonraki zamanı Instant olarak tutuyoruz. Instant final class olduğu içine nesne üretmeden now() metodu ile o anı alabiliyoruz.
		
		System.out.println("Geçen Süre Milisaniye: "+(bitisMs-baslangicMs)); //Döngünün çalışma süresini milisaniye olarak yazdırıyoruz.
		System.out.println("Geçen Süre Nanosaniye: "+(bitisNs-baslangicNs)); //Döngünün çalışma süresini nanosaniye olarak yazdırıyoruz.
		 
		Duration duration=Duration.between(baslangicIns, bitisIns); //Duration final class'ından between() metodu ile başlangıç ve bitiş değerlerini Temporal olarak verdiğimizde geriye Duration olarak geçen süreyi dönüyor.
		System.out.println("Geçen Süre Instant: "+duration); //Döngünün çalışma süresini duration olarak yazdırıyoruz.
		
		//Duration sınıfı üzerinden to metotları ile süreyi istediğimiz versiyona dönüştürebiliyoruz. 
		System.out.println("Geçen Süre Duration Nanosaniye: "+duration.toNanos()); //toNanos() metodu ile geçen süreyi nanosaniye olarak dönüştürüp yazdırıyoruz.
		System.out.println("Geçen Süre Duration Milisaniye: "+duration.toMillis()); //toMillis() metodu ile geçen süreyi milisaniye olarak dönüştürüp yazdırıyoruz.
		
	}

}
