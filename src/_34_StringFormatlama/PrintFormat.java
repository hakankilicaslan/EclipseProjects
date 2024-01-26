package _34_StringFormatlama;

import java.time.LocalDate;

public class PrintFormat {

	public static void main(String[] args) {

		/*
		 * System.out.printf() -> String ifadeleri formatlamak için kullanılır.
		 * Parametre olarak önce formatlayacağımız String ifadeyi giriyoruz.
		 * Daha sonra formatlama da kullanacağımız Objectleri giriyoruz. Object girerken varargs şeklinde yani istediğimiz kadar girebiliriz.
		 * Bu String ifadedeki harf kombinasyonlarına String ifadeden sonra verdiğimiz Object'leri atayarak yazdırma işlemi yapmış oluyoruz.
		 * 
		 * printf() metodu new line içermiyor yani println() gibi yazdırırken bir alt satıra geçmiyor.
		 * Alt satıra geçmek için %n kullanmalıyız. %n önceden kullandığımız \n ile aynı kullanımdır. Alt satıra geçmemizi sağlıyor.
		 * 
		 * % yüzde işareti ile yazdığımız yere bir place holder eklemiş oluyoruz. 
		 * Yüzdeden sonra değişken türüne uygun bir kısaltma yazmamız gerekiyor.
		 * String ifadeden sonra girdiğimiz Object'ler bu kısaltmaların olduğu yere atanmış oluyor.
		 * %n -> Bir alt satıra geçmemizi sağlıyor.
		 * %s -> String değerler için kullanılacak kısaltmadır.
		 * %d -> byte,short,int,long gibi decimal türdeki tam sayı değerleri için kullanılacak kısaltmadır.
		 * %f -> float, double gibi ondalıklı sayı değerleri için kullanılacak kısaltmadır.
		 * %o -> Octal yani 8'lik sayı sistemi için kullanılacak kısaltmadır.
		 * %x -> Hexadecimal yani 16'lık sayı sistemi için kullanılacak kısaltmadır.
		 * Kısaltmaya karşılık gelen değer ataması yapmadığımızda hata alabiliriz.
		 * %s -> %d ve %f yerine de kullanılabiliyor ama kesin sonuç almak için kendi kısaltmaları kullanılmalıdır.
		 */
		
		//%s -> String değerler için kullanılacak kısaltmadır. %s String değeri olduğu gibi yazdırıyor %S bütün harfleri büyüterek yazdırıyor.
		
		String isim="Hakan";
		String soyisim="Kılıçaslan";
		
		//Birinci %s yerine isim, ikinci %s yerine soyisim ataması yapılıyor.
		System.out.printf("Benim adım %s'dır ve soyadım %S'dır. %n",isim,soyisim);
		
		System.out.println("----------------------------------------");
		
		//%10s dediğimizde verilen isim değişkenini 10 karakter içinde kullanıyor. isim değişkenini sağa yaslı şekilde yazıyor ve başına 5 karakterlik boşluk bırakıyor.
		System.out.printf("Benim adım %10s'dır. %n",isim); 
		
		System.out.println("----------------------------------------");
		
		//%-8s dediğimizde verilen isim değişkenini 8 karakter içinde kullanıyor. isim değişkenini sola yaslı şekilde yazıyor ve sonuna 3 karakterlik boşluk bırakıyor.
		System.out.printf("Benim adım %-8s'dır. %n",isim); 
		
		System.out.println("----------------------------------------");
		
		//%3s dediğimizde verilen isim değişkenini 3 karakter içinde kullanmaya çalışıyor ama isim 3'ten fazla karakter içeriyor. 
		//Değişkenimizin karakter sayısından daha az karakter sınırı koyduğumuzda bu kez belirli bir kısmını değil tamamını mecbur yazdırıyor.
		System.out.printf("Benim adım %3s'dır. %n",isim);
		
		System.out.println("----------------------------------------");
		
		//|%10s| dediğimizde verilen isim değişkenini 10 karakter içinde kullanıyor ve başlangıç bitiş yerlerine | işareti ekliyor.
		System.out.printf("Benim adım |%10s|'dır. %n",isim);
		
		System.out.println("----------------------------------------");
		
		//%d -> byte,short,int,long gibi decimal türdeki tam sayı değerleri için kullanılacak kısaltmadır.
		//%d yerine %s de kullanılabiliyor ama %d kullanmak öneriliyor.
		
		byte byteMax=Byte.MAX_VALUE;
		short shortMax=Short.MAX_VALUE;
		int intMax=Integer.MAX_VALUE;
		long longMax=Long.MAX_VALUE;
		
		//|%d| dediğimizde verilen byteMax değişkeninin başlangıç bitiş yerlerine | işareti ekliyor.
		System.out.printf("byteMax  -> |%d| %n",byteMax);
		
		//%-10d dediğimizde verilen shortMax değişkenini 10 karakter içinde kullanıyor. shortMax değişkenini sola yaslı şekilde yazıyor ve sonuna 5 karakterlik boşluk bırakıyor.
		System.out.printf("shortMax -> %-10d %n",shortMax);
		
		//%19d dediğimizde verilen intMax değişkenini 19 karakter içinde kullanıyor. intMax değişkenini sağa yaslı şekilde yazıyor ve önüne 9 karakterlik boşluk bırakıyor.
		System.out.printf("intMax   -> %19d %n",intMax);
		
		//%10d dediğimizde verilen longMax değişkenini 10 karakter içinde kullanmaya çalışıyor ama longMax 10'dan fazla karakter içeriyor. 
		//Değişkenimizin karakter sayısından daha az karakter sınırı koyduğumuzda bu kez belirli bir kısmını değil tamamını mecbur yazdırıyor.
		System.out.printf("longMax  -> %10d %n",longMax);
		
		System.out.println("----------------------------------------");
		
		//%f -> float, double gibi ondalıklı sayı değerleri için kullanılacak kısaltmadır.
		
		float floatSayi=987.654321f;
				
		//%f dediğimizde verilen floatSayi değişkeninin atamasını yapıyor ama ondalıklı kısımdaki kısmı yuvarlayarak getirdi. Bizim yazdığımız şekilde getirmedi.
		System.out.printf("%f %n",floatSayi);
		
		//%20f dediğimizde verilen floatSayi değişkenini 20 karakter içinde kullanıyor. floatSayi değişkenini sağa yaslı şekilde yazıyor ve önüne 10 karakterlik boşluk bırakıyor.
		System.out.printf("%20f %n",floatSayi);
		
		//%.2f dediğimizde verilen floatSayi değişkeninin ondalıklı kısımdaki ilk iki basamaklı halini yazdırıyor.
		System.out.printf("%.2f %n",floatSayi);
		
		//%10.2f dediğimizde verilen floatSayi değişkenini 10 karakter içinde kullanıyor sağa yaslı şekilde yazdırıyor ve .2 dediğimiz için ondalıklı kısımdaki ilk iki basamaklı halini yazdırıyor.
		System.out.printf("%10.2f %n",floatSayi);
		
		//%.6f dediğimizde verilen floatSayi değişkeninin ondalıklı kısımdaki ilk 6 basamaklı halini yazdırıyor. 
		//Ondalıklı kısımdaki basamak sayısı kadar yazdırma yaptığımızda ondalıklı kısımı 6 basamaklı olarak yazdırıyor ama yine yuvarlama yaparak yazdırıyor. Bizim yazdığımız şekilde yine getirmedi.
		System.out.printf("%.8f %n",floatSayi);
		
		System.out.println("----------------------------------------");
		
		double doubleSayi=987.654321;
		
		//%f dediğimizde verilen doubleSayi değişkeninin atamasını yapıyor. Ondalıklı kısımdaki kısmı yazdığımız gibi getirdi ama son rakamlar 5 üstü rakamlar olduğunda yine yukarı yuvarlayarak getiriyor.
		System.out.printf("%f %n",doubleSayi);
		
		//%20f dediğimizde verilen doubleSayi değişkenini 20 karakter içinde kullanıyor. doubleSayi değişkenini sağa yaslı şekilde yazıyor ve önüne 10 karakterlik boşluk bırakıyor.
		System.out.printf("%20f %n",doubleSayi);
		
		//%.2f dediğimizde verilen doubleSayi değişkeninin ondalıklı kısımdaki ilk iki basamaklı halini yazdırıyor.
		System.out.printf("%.2f %n",doubleSayi);
		
		//%10.2f dediğimizde verilen doubleSayi değişkenini 10 karakter içinde kullanıyor sağa yaslı şekilde yazdırıyor ve .2 dediğimiz için ondalıklı kısımdaki ilk iki basamaklı halini yazdırıyor.
		System.out.printf("%10.2f %n",doubleSayi);
		
		//%.6f dediğimizde verilen doubleSayi değişkeninin ondalıklı kısımdaki ilk 6 basamaklı halini yazdırıyor.
		//Ondalıklı kısımdaki basamak sayısı kadar yazdırma yaptığımızda float değişkende olduğu gibi yuvarlama yapmıyor ve bizim yazdığımız değeri getiriyor.
		System.out.printf("%.6f %n",doubleSayi);
		
		//%.10f dediğimizde verilen doubleSayi değişkeninin ondalıklı kısımdaki ilk 10 basamaklı halini yazdırıyor.
		//Ondalıklı kısımdaki basamak sayısından fazla yazdırma yaptığımızda fazla olan kısmı 0 yazarak dönüyor.
		System.out.printf("%.10f %n",doubleSayi);
		
		System.out.println("----------------------------------------");
		
		//%o -> Octal yani 8'lik sayı sistemi için kullanılacak kısaltmadır.
		
		int sayi1=16;
		System.out.printf("%o %n",sayi1); //16 sayısını octal karşılığı olarak atamasını yapıyor.
		
		//%x -> Hexadecimal yani 16'lık sayı sistemi için kullanılacak kısaltmadır.
		
		int sayi2=10;
		System.out.printf("%x %n",sayi2); //10 sayısını Hexadecimal karşılığı olarak atamasını yapıyor.
		
		System.out.println("----------------------------------------");
		
		//Farklı değerlerin beraber kullanımı:
		
		int i=100;
		String sehir="Ankara";
		double d=13.13;
		
		//String int ve double değerleri yazıldığı sıraya göre Object tarafına ekledik ve ataması yapıldı.
		System.out.printf("%s-%d-%.2f %n",sehir,i,d);
		
		//String ifadeyi iki kere atama yapmak istediğimizde 1$s kısaltmasını kullanıyoruz.
		//Birinci Object olduğu için 1 yazıyoruz sonra $ işareti koyuyoruz. Bu şekilde sıralama gözetmeksizin 1$ işareti olan yere ilk Object atanacak.
		System.out.printf("%s %1$s %n",sehir);
		
		//Dördüncü atamaya geldiğimizde hata almamak için başına 1$ diyerek birinci Object, 3$ diyerek üçüncü Object ataması yapmış olduk.
		System.out.printf("%s - %d - %.2f - %1$s - %3$.2f %n",sehir,i,d);
		
		System.out.println("----------------------------------------");
		
		//25000 olan int değerimizi çıktı olarak $25.000 şeklinde nasıl yazdırırız.
		
		int maas=25000;
		System.out.printf("$%,d %n",maas); //Başına $ işareti koyup % sonrası virgül koyduğumuzda her üç basamakta bir ayırarak yazdırıyor.
		
		double doubleMaas=25000;
		System.out.printf("$%,.2f %n",doubleMaas); //Başına $ işareti koyup % sonrası virgül koyduğumuzda her üç basamakta bir nokta ekledi ve .2 koyduğumuz için ondalık kısımda iki basamak daha gösterdi.
		
		System.out.println("----------------------------------------");
		
		//Tarih formatlama
		
		LocalDate ld=LocalDate.now(); //Şu anki tarih değerini yıl ay gün şeklinde tutuyor.
		System.out.println("Şu anki Tarih: "+ld);
		
		//LocalDate get metotları geriye int döneceği için bu değerleri de kısaltmalara atayarak yazdırabiliriz.
		System.out.printf("Yıl: %d -> Ay: %d -> Gün: %d %n",ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth());
		
		LocalDate ld2=LocalDate.of(2023, 6, 24); //LocalDate.of() diyerek içine yıl ay gün değerlerini girerek LocalDate oluşturuyoruz.
		
		//%02d dediğimizde başına 0 eklenecek ve 2 hane olsun demiş oluyoruz. Bundan dolayı 06 olarak yazdırıyor.
		System.out.printf("Yıl: %d -> Ay: %02d -> Gün: %d %n",ld2.getYear(),ld2.getMonthValue(),ld2.getDayOfMonth());
		
		System.out.println("----------------------------------------");
		
		int sayi3=10;
		int sayi4=-10;
		System.out.printf("%+d %n",sayi3); //%+d dediğimizde + kullanarak bu sayının işareti neyse onunla beraber yazdır demiş oluyoruz yani pozitif olduğu için önüne + koyarak yazdıracak.
		System.out.printf("%+d %n",sayi4); //%+d dediğimizde + kullanarak bu sayının işareti neyse onunla beraber yazdır demiş oluyoruz yani negatif olduğu için değişiklik yapmadan - olan haliyle yazdıracak.
		
		//String üzerinden format() metodunu kullanarak formatlanmış halini String bir değişkende tutabiliyoruz.
		String sayi3String=String.format("%+d %n",sayi3);
		System.out.println(sayi3String);
		
	}

}
