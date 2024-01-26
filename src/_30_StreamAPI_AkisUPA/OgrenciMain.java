package _30_StreamAPI_AkisUPA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class OgrenciMain {

	public static void main(String[] args) {

		List<Ogrenci> ogrenciler=new ArrayList<>(); //Bir ArrayList nesnesi oluşturduk ve içine Ogrenci nesnesi alan bir List'in referansının onu göstermesini sağladık. Daha sonra List içine Ogrenci ekledik.
		ogrenciler.add(new Ogrenci(1,  "Hakan",    "Kılıçaslan", "İnşaat Mühendisliği",       72.0));
		ogrenciler.add(new Ogrenci(2,  "A.Volkan", "Şahin",      "Uçak Mühendisliği",         80.0));
		ogrenciler.add(new Ogrenci(3,  "Bahadır",  "Ünsal",      "Yazılım Mühendisliği",      90.0));
		ogrenciler.add(new Ogrenci(4,  "Berkan",   "Yılmaz",     "Jeofizik Mühendisliği",     77.0));
		ogrenciler.add(new Ogrenci(5,  "Berresu",  "Gülseçgin",  "Aktüerya Bilimleri",        93.0));
		ogrenciler.add(new Ogrenci(6,  "Enes",     "İyidil",     "E.Elektronik Mühendisliği", 97.0));
		ogrenciler.add(new Ogrenci(7,  "Hilal",    "Sönmez",     "Bilgisayar Mühendisliği",   73.0));
		ogrenciler.add(new Ogrenci(8,  "Kemal",    "Bilici",     "Makine Mühendisliği",       50.0));
		ogrenciler.add(new Ogrenci(9,  "Kral",     "Kayhan",     "E.Elektronik Mühendisliği", 55.0));
		ogrenciler.add(new Ogrenci(10, "Muhittin", "Ülker",      "Mekatronik Mühendisliği",   45.0));
		ogrenciler.add(new Ogrenci(11, "Okan",     "Şenol",      "İnşaat Mühendisliği",       75.0));
		ogrenciler.add(new Ogrenci(12, "Ozan",     "Çelebiler",  "Bilgisayar Mühendisliği",   70.0));
		ogrenciler.add(new Ogrenci(13, "Sertuğ",   "Özcan",      "Endüstri Mühendisliği",     65.0));
		ogrenciler.add(new Ogrenci(14, "T.Enes",   "Cinli",      "Mimarlık",                  60.0));
		ogrenciler.add(new Ogrenci(15, "Tolga",    "Tek",        "İnşaat Mühendisliği",       80.0));
		
		
		System.out.println("----------Soru_01: Öğrencilerin tamamını yazdıralım.----------");
		
		ogrenciler.stream().forEach(o->System.out.println(o)); //ogrenciler'den bir stream oluşturduk ve forEach() metoduyla tek tek elemanları yazdırdık.
				
		System.out.println("----------Soru_01 Alternatif Çözüm----------");
		
		ogrenciler.stream().peek(System.out::println).forEach(p->{}); //ogrenciler'den bir stream oluşturduk ve peek() metoduyla gezinerek öğrencileri yazdırdık ama peek() bir ara işlem olduğu için stream'i sonlandırmak için mecburen forEach(p->{} diyerek boş yazdırma yaparak terminal işlem olan forEach() ile sonlandırdık.
		
		System.out.println("----------Soru_02: Notu 70 üzerinde olan öğrencileri yazdıralım.----------");

		ogrenciler.stream().filter(o->o.getNot()>70).forEach(System.out::println); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla notu 70'den büyük olanları filtreleyip yeni bir stream daha oluşturmuş olduk. Daha sonra terminal işlem olan forEach() metoduyla elemanları tek tek yazdırarak akışı sonlandırdık.
				
		System.out.println("----------Soru_03: İnşaat Mühendisliği okuyan öğrencilerin sayısını yazdıralım.----------");
		
		Long insaatOkuyanlarinSayisi=ogrenciler.stream().filter(o->o.getBolum().equals("İnşaat Mühendisliği")).count(); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla bölümü İnşaat Mühendisliği olanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra terminal işlem olan count() metoduyla son stream içindeki elema sayısına erişip akışı sonlandırdık. count() geriye Long döndüğü için bir değişkene atayıp öyle yazdırdık.
		System.out.println(insaatOkuyanlarinSayisi);
				
		System.out.println("----------Soru_04: Adı Kral olan öğrencinin bilgilerini yazdıralım.----------");
	
		ogrenciler.stream().filter(o->o.getAd().equals("Kral")).forEach(System.out::println); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla adı Kral olanları filtreleyerek yeni bir stream oluşturduk ve terminal işlem olan forEach() metoduyla yazdırıp akışı sonlandırdık.
		
		System.out.println("----------Soru_04 Alternatif Çözüm----------");
		
		Optional<Ogrenci> kral=ogrenciler.stream().filter(o->o.getAd().equals("Kral")).findFirst(); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla adı Kral olanları filtreleyerek yeni bir stream oluşturduk ve terminal işlem olan findFirst() metodu kullanarak ilk bulduğu değeri dönmesini sağladık ve akışı sonlandırdık. findFirst() geriye Optional bir değer döndüğü için Optional bir değişkene aktardık ve get() metodunu kullanarak Optional içindeki değeri alıp yazdırdık.
		System.out.println(kral.get());
		
		System.out.println("----------Soru_05: Adı Ada olan öğrencinin var olup olmadığını kontrol edelim.----------");
		
		boolean varMi=ogrenciler.stream().anyMatch(o->o.getAd().equals("Ada")); //ogrenciler'den bir stream oluşturduk ve terminal işlem olan anyMatch() metoduyla adı Ada olan var mı yok mu onu sorguladık ve akışı sonlandırdık. Geriye boolean bir değer döndüğü için boolean bir değişkene atayıp öyle yazdırdık.
		System.out.println(varMi);
				
		System.out.println("----------Soru_06: Not alanına göre öğrencileri sıralayalım.----------");
		 
		ogrenciler.stream().sorted().forEach(System.out::println); //ogrenciler'den bir stream oluşturduk ve sorted() metodunu kullanarak Ogrenci sınıfı Comparable interface'i implement ettiği için sınıf içindeki compareTo() metodundaki şarta göre notları düşük olandan büyük olana doğru sıralayarak yeni bir stream oluşturmuş olduk. Daha sonra terminal işlem olan forEach() metoduyla elemanları yazdırarak akışı sonlandırdık.
		
		System.out.println("----------Soru_06 Alternatif Çözüm----------");
		
		ogrenciler.stream().sorted((o1,o2)->(int)(o2.getNot()-o1.getNot())).forEach(System.out::println); //ogrenciler'den bir stream oluşturduk ve sorted() metoduyla Comparable kullanmadan metot içinde notları yüksek olandan düşük olana doğru sıralayarak yeni bir stream oluşturduk ve terminal işlem olan forEach() metoduyla elemanları yazdırarak akışı sonlandırdık.
				
		System.out.println("----------Soru_06 Alternatif Çözüm 2----------");
		
		ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getNot)).forEach(System.out::println); //ogrenciler'den bir stream oluşturduk ve sorted() metodu içinde Comparator üzerinden comparing() metodunu çağırarak metot referansı ile Ogrenci notlarını daha düşükten daha yükseğe doğru sıralayıp yeni bir stream oluşturduk ve terminal işlem olan forEach() metoduyla elemanları yazdırarak akışı sonlandırdık.
		
		System.out.println("----------Soru_07: Notu 75 ve üstü olan öğrencilerin adlarını ve bölümlerini yazdıralım.----------");
		
		ogrenciler.stream().filter(o->o.getNot()>=75).forEach(o->System.out.println(o.getAd()+" - "+o.getBolum())); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla notu 75 ve üstü olan elemanları filtreleyerek yeni bir stream oluşturduk ve terminal işlem olan forEach() metoduyla adlarını ve bölümlerini tek tek yazdırarak akışı sonlandırdık.
		
		System.out.println("----------Soru_08: En yüksek nota sahip öğrencinin bilgilerini yazdıralım.----------");
		
		ogrenciler.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println); //ogrenciler'den bir stream oluşturduk ve sorted() metodu içinde Comparator üzerinden reverseOrder() metodunu çağırarak Ogrenci sınıfında notlara göre düşükten yükseğe sıralamıştık onun tersi şeklinde sıralamasını sağlayıp yeni bir stream oluşturmuş olduk. Daha sonra limit() metodunu kullanarak ilk elemanı aldık ve terminal işlem olan forEach() metoduyla elemanları yazdırarak akışı sonlandırdık.
	
		System.out.println("----------Soru_09: Bölümlere göre öğrencilerin not ortalamasını hesaplayalım.----------");
		
		//ogrenciler'den bir stream oluşturduk ve collect() metodu içinde Collectors sınıfından groupingBy metodunu çağırarak öğrencileri bölümlerine göre grupladık ve Collectors sınıfından averagingDouble() metodunu çağırarak bölümlerdeki öğrencilerin ortalamasını alıp o bölüme atayarak bir Map oluşturduk. collect() terminal olmasına rağmen geriye Map döndüğü için ondan sonra forEach() metodunu çağırarak Key ve Value gibi alıp yazdırdık ve akışı sonlandırdık.
		ogrenciler.stream().collect( Collectors.groupingBy (Ogrenci::getBolum, Collectors.averagingDouble(Ogrenci::getNot) ) ).forEach((k,v)->System.out.println(k+" ortalaması: "+v));
		
		System.out.println("----------Soru_09 Alternatif Çözüm----------");
		
		ogrenciler.stream().map(o->o.getBolum()).distinct().toList().forEach(bolum->{ //ogrenciler'den bir stream oluşturduk ve map() metoduyla bölümlerini alarak bir stream daha oluşturduk. Daha sonra distinct() metoduyla her bölümü bir kere barındırmasını sağladık ve toList() metoudyla List'e çevirdik ve terminal işlem olan forEach() metodu içine gönderdik.
			double toplamNot=ogrenciler.stream().filter(o->o.getBolum().equals(bolum)).map(o->o.getNot()).reduce(0.0, (toplam,not)->toplam+not); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla bölümlerini elimizdeki List içindeki bölümle aynı olanları yeni bir streame dönüştürdük ve map() metoduyla notlarını alıp yeni bir stream oluşturduk. Daha sonra terminal işlem olan reduce() metoduyla bölümleri aynı olan öğrencilerin notlarını topladık ve akışı sonlandırdık. Geriye double bir değer döneceği için not toplamını bir değişkene atadık.
			double kisiSayisi=ogrenciler.stream().filter(o->o.getBolum().equals(bolum)).count(); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla bölümleri aynı olanları filtreleyerek yeni bir stream oluşturduk. Daha sonra  terminal işlemn olan count() metoduyla bölümleri aynı olan kişi sayısını döndük ve akışı sonlandırdık. count() geriye long dönüyor ama double zaten long'u içerdiği için double değişkene atayabiliyoruz.
			System.out.println(bolum+" öğrencilerinin not ortalaması: "+(toplamNot/kisiSayisi));
		});
		
		System.out.println("----------Soru_10: Notu 60-80 arasında olan öğrencilerin sayısını bulalım.----------");
		
		long ogrenciSayisi=ogrenciler.stream().filter(o->o.getNot()>=60&&o.getNot()<=80).count(); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla notları 60 ile 80 arasında olanları filtreleyerek yeni bir stream oluşturduk. Daha sonra terminal işlem olan count() metoduyla streamin eleman sayısını dönerek akışı sonlandırdık. count() geriye long döndüğü için long bir değişkene atadık ve öyle yazdırdık.
		System.out.println(ogrenciSayisi);
		
		System.out.println("----------Soru_11: En düşük nota sahip öğrencinin bölümünü yazdıralım.----------");
		
		ogrenciler.stream().sorted().limit(1).forEach(o->System.out.println(o.getBolum())); //ogrenciler'den bir stream oluşturduk ve sorted() metodunu kullanarak Ogrenci sınıfı Comparable interface'i implement ettiği için sınıf içindeki compareTo() metodundaki şarta göre notları düşük olandan büyük olana doğru sıralayarak yeni bir stream oluşturmuş olduk. limit() metoduyla ilk elemanı yani notu en düşük öğrenciyi alarak yeni bir stream oluştuduk. Daha sonra terminal işlem olan forEach() metoduyla o öğrencinin bölümünü yazdırarak akışı sonlandırdık.
		
		System.out.println("----------Soru_11 Alternatif Çözüm----------"); 
		
		ogrenciler.stream().sorted().limit(1).map(o->o.getBolum()).forEach(System.out::println); //ogrenciler'den bir stream oluşturduk ve sorted() metodunu kullanarak Ogrenci sınıfı Comparable interface'i implement ettiği için sınıf içindeki compareTo() metodundaki şarta göre notları düşük olandan büyük olana doğru sıralayarak yeni bir stream oluşturmuş olduk. limit() metoduyla ilk elemanı yani notu en düşük öğrenciyi alarak yeni bir stream oluştuduk. map() metoduyla o öğrencinin bölümünü alıp yeni bir stream oluşturduk ve terminal işlem olan forEach() metoduyla yazdırıp akışı sonlandırdık.
		
		System.out.println("----------Soru_12: Bölümü Bilgisayar Mühendisliği olan öğrencilerin isimlerini yazdıralım.----------");
		
		ogrenciler.stream().filter(o->o.getBolum().equals("Bilgisayar Mühendisliği")).forEach(o->System.out.println(o.getAd())); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla bölümü Bilgisayar Mühendisliği olanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra forEach() metoduyla bu öğrencilerin adlarını yazdırdık ve akışı sonlandırdık.
				
		System.out.println("----------Soru_13: Her bölümde kaç tane öğrenci var map ile yazdıralım.----------");
		
		ogrenciler.stream().collect( Collectors.groupingBy ( Ogrenci::getBolum, Collectors.counting() ) ).forEach((k,v)->System.out.println(k+" "+v)); //ogrenciler'den bir stream oluşturduk ve collect() metodu içinde Collectors sınıfından groupingBy metodunu çağırarak öğrencileri bölümlerine göre grupladık ve Collectors sınıfından counting() metodunu çağırarak bölümlerdeki öğrencilerin sayılarını alıp o bölüme atayarak bir Map oluşturduk. collect() terminal olmasına rağmen geriye Map döndüğü için ondan sonra forEach() metodunu çağırarak Key ve Value gibi alıp yazdırdık ve akışı sonlandırdık.
		
		System.out.println("----------Soru_14: Bölümlerinde notu 70'den az olan öğrencilerin sayısını yazdıralım.----------");
		
		long ogrenciSayisi2=ogrenciler.stream().filter(o->o.getNot()<70).map(o->o.getBolum()).count(); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla notu 70'den küçük olanları filtreleyip yeni bir stream daha oluşturmuş olduk. Daha sonra map() metoduyla bu öğrencilerin bölümlerini alarak yeni bir stream oluşturduk ve terminal işlem olan count() metoduyla streamin eleman sayısını dönerek akışı sonlandırdık. count() geriye long döndüğü için long bir değişkene atadık ve öyle yazdırdık.
		System.out.println(ogrenciSayisi2);
		
		System.out.println("----------Soru_14 Alternatif Çözüm----------");
		
		ogrenciler.stream().filter(o->o.getNot()<70).collect(Collectors.groupingBy(Ogrenci::getBolum, Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v)); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla notu 70'den az olanları filtreleyip yeni bir stream oluşturduk. Daha sonra collect() metodu içinde Collectors sınıfından groupingBy metodunu çağırarak notu 70'den az olan öğrencileri bölümlerine göre grupladık ve Collectors sınıfından counting() metodunu çağırarak bölümlerdeki öğrencilerin sayılarını alıp o bölüme atayarak bir Map oluşturduk. collect() terminal olmasına rağmen geriye Map döndüğü için ondan sonra forEach() metodunu çağırarak Key ve Value gibi alıp yazdırdık ve akışı sonlandırdık.
		
		System.out.println("----------Soru_15: İnşaat Mühendisliği bölümündeki öğrencilerin not ortalamasını yazdıralım.----------");

		double insaatOgrenciOrtalama=ogrenciler.stream().filter(o->o.getBolum().equals("İnşaat Mühendisliği")).map(o->o.getNot()).collect(Collectors.averagingDouble(o->o)); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla bölümü İnşaat Mühendisliği olanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra map() metoduyla inşaat mühendisliği okuyanların notlarını alıp yeni bir stream oluşturduk ve terminal işlem olan collect() metoduyla Collectors sınıfından averagingDouble() metodunu çağırarak notların ortalamasını aldık ve akışı sonlandırdık. Geriye double döndüğü için double bir değişkene aktardık ve öyle yazdırdık.
		System.out.println(insaatOgrenciOrtalama);
		
		System.out.println("----------Soru_15 Alternatif Çözüm----------");
		
		OptionalDouble insaatOgrenciOrtalama2= ogrenciler.stream().filter(o->o.getBolum().equals("İnşaat Mühendisliği")).mapToDouble(Ogrenci::getNot).average(); //ogrenciler'den bir stream oluşturduk ve filter() metoduyla bölümü İnşaat Mühendisliği olanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra mapToDouble() metoduyla metot referansı kullanarak inşaat mühendisliği okuyanların notlarını alarak double bir stream oluşturduk ve terminal işlem olan average() metoduyla aldığımız notların ortalamasını aldık ve akışı sonlandırdık. Geriye OptionalDouble döneceği için OptionalDouble bir değişkene aktardık ve öyle yazdırdık.
		insaatOgrenciOrtalama2.ifPresent(ort->System.out.println(ort)); //OptionalDouble bir değişken olduğu için ifPresent() metodunu çağırarak içinde varsa yazdır demiş oluyoruz.
	
	}

}
