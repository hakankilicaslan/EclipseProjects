
package _30_StreamAPI_AkisUPA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Stream API -> API(Application Programming Interface): Uygulama Programlama Arayüzü demektir. Stream bir interfacedir.
 * Stream ile bir veri akışı oluşturulur. Stream kaynağı olarak bir dizi veya collection kullanılabilir.
 * Stream veriyi depolamak için kullanılmaz. Stream veriyi işlemek için kullanılır.
 * Zincirleme şekilde işlemler yaptırılabilir. Ara işlemler ve terminal(sonlandırma) işlemler olmak üzere 2 gruba ayrılır.
 * Terminal işlemlerden biri kullanılırsa stream biter yani akış sonlanır.
 * Terminal işlemlerden biri kullanılarak sonlandırılan akış üzerinde herhangi bir işlem yapılamaz çünkü akış bitmiştir.
 * Ara işlemlerde yapılan değişiklikler kaynak üzerinde değişiklik yapmaz ama terminal işlem içerisinde yapılan işlemler kaynak üzerinde değişiklik yapabilir
 * Stream kullandığı kaynakta terminal işlem içerisinde bir değişiklik yapabiliyor ama yapmamalıdır önerilmez çünkü kaynağın içini de değiştirmiş olur.
 *  
 */

public class PersonelMain {

	public static void main(String[] args) {

		//Stream Oluşturma: Stream referansına Stream.of() diyerek içine alacağı elemanları yazarak bir stream oluşturabiliriz. of() varargs kullandığı için istediğimiz kadar eleman girebiliriz.
		Stream<String> bosKayit=Stream.empty(); //İçi boş bir stream oluşturduk.
		Stream<String> tekKayit=Stream.of("Hakan"); //Tek kayıtlı bir stream oluşturduk.
		Stream<Double> cokKayit=Stream.of(2.55,5.13,3.37); //Çok kayıtlı bir stream oluşturduk.
		
		bosKayit.forEach(System.out::println); //bosKayit stream içinde eleman olmadığı için yazdırırken çıktı vermedi
		tekKayit.forEach(System.out::println); //forEach() metodu içine metot referansı kullanarak System.out::println şeklinde yazdırabiliriz.
		cokKayit.forEach(p->System.out.println(p)); //forEach bir diğer kullanımı içindeki elemanlara p dedik ve her p için sout işlemi yap demiş olduk.
		
		System.out.println("----------------------------------------");
		
		//Kaynak olarak bir collection kullanma yani bir collection'ı stream'e çevirme:
		List<String> gunler=List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"); //List oluştururken tek tek add() metoduyla eklemek yerine List.of() metoduyla elemanların hepsini bir seferde girebiliriz.
		
		Stream<String> gunlerStream=gunler.stream(); //gunler.stream() diyerek gunler List'inin bir stream'e dönüştürdük ve bir Stream referansı olan gunlerStream'e atadık.
		//gunlerStream.    ->Stream referansı üzerinden bu şekilde de stream metotlarına erişebiliriz.
		//gunler.stream(). ->Referans kullanmadan atama yapmadan bu şekilde de stream metotlarına erişebiliriz.
		
		gunlerStream.forEach(gun->{ //gunlerStream üzerinden forEach() metodunu çağırıp lambda function kullanarak elemanları büyük harfe çevirip yazdırıyoruz ve akışı sonlandırıyoruz. forEach terminal işlem ama terminal işlem içinde farklı işlemler yaptırabiliriz sadece terminal işlemden sonra akış sonlandığı için yeni bir işlem yaptıramayız.
			gun=gun.toUpperCase();
			System.out.println(gun);
		});
		
		//gunlerStream.forEach(System.out::println); //Yukarıda forEach() metodunu kullandığımız için ve forEach() terminal işlem olduğu için stream'i sonladırmış olduk yani akışı bitirmiş olduk. Akış sonlandığı için aynı stream üzerinde tekrar bir işlem yapamıyoruz hata alıyoruz.
		
		System.out.println("----------------------------------------");
		
		List<Personel> personeller=new ArrayList<>(); //Bir ArrayList nesne oluşturuyoruz ve List referansının onu göstermesini sağlıyoruz. Daha sonra add() metoduyla Personel sınıfından yeni nesneler oluşturup List içine eklemiş oluyoruz. 
		personeller.add(new Personel(1,  "Neşet",  "Ertaş",    "Müzik",  130));
		personeller.add(new Personel(2,  "Kemal",  "Sunal",    "Sinema", 130));
		personeller.add(new Personel(3,  "Cüneyt", "Arkın",    "Sinema", 150));
		personeller.add(new Personel(4,  "Şener",  "Şen",      "Sinema", 170));
		personeller.add(new Personel(5,  "Müslüm", "Gürses",   "Müzik",  110));
		personeller.add(new Personel(6,  "Barış",  "Manço",    "Müzik",  120));
		personeller.add(new Personel(7,  "Cem",    "Karaca",   "Müzik",  140));
		personeller.add(new Personel(8,  "Haluk",  "Bilginer", "Sinema", 250));
		personeller.add(new Personel(9,  "Kıvanç", "Tatlıtuğ", "Sinema", 250));
		personeller.add(new Personel(10, "Cem",    "Yılmaz",   "Sinema", 300));
		personeller.add(new Personel(11, "Haluk",  "Levent",   "Müzik",  200));
		personeller.add(new Personel(12, "Fatih",  "Terim",    "Futbol", 500));
		personeller.add(new Personel(13, "Sergen", "Yalçın",   "Futbol", 400));
		personeller.add(new Personel(14, "Merih",  "Demiral",  "Futbol", 350));
		personeller.add(new Personel(15, "Arda",   "Güler",    "Futbol", 300));
		
		//Aynı kaynaktan birden fazla stream oluşturulabiliriz.
		Stream<Personel> personelStream1=personeller.stream(); //İçinde Personel türünde elemanlar tutan bir Stream oluşturduk.
		Stream<Personel> personelStream2=personeller.stream();
		
		//forEach() Metodu: Streamdeki her bir eleman için içinde verilen işlemi gerçekleştirir. forEach() metodu terminal işlemdir yani akışı sonlandırma işlemi yapıyor. Terminal işlemden sonra aynı stream üzerinde tekrar bir işlem yaptıramayız.
		personelStream1.forEach(p->System.out.println(p)); //forEach() kullanarak stream içindeki her elemanı yazdır demiş oluyoruz.

		System.out.println("----------------------------------------");
		
		//Sonlandırma yani terminal işlemlerinde yapılan işlemlerle kaynak içindeki veriler değiştirilebilir ama önerilmez.
		personelStream2.forEach(p->p.maasArtir(1.5)); //maasArtir() metodunu çağırarak personellerin maaşlarına 50% zam yapmış olduk.
		
		//Yukarıda stream içinde terminal işlem olan forEach() metodu içinde personellerin maaşlarını artırmış olduk. İşlem terminal işlem içinde yapıldığı için artık kaynak olan personeller List içinde de maaşlar güncellenmiş oldu. Bu şekilde kaynak üzerinde değişiklik yapmış olduk.
		for (Personel p : personeller) { 
			System.out.println(p);
		}
	
		//Yukarıda personelStream1 ve personelStream2 diye iki stream oluşturduk ve ikisini de forEach() terminal işlemle sonlandırdık.
		//Her seferinde referansa atmak yerine daha kullanışlı olan personeller.stream() diyerek her seferinde bize yeni bir stream oluşturmasını sağlayabiliriz.
		
		System.out.println("----------------filter()----------------");
		
		//filter() Metodu: Streamdeki verileri koşula göre filtreleme işlemi yapar ve bu verilerden yeni bir stream oluşturur.
		
		//personeller'den bir stream oluşturduk. filter() metodu içinde getAd() ile isimleri alıp contains() metoduyla isimleri içinde "e" harfi olanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra da forEach() metoduyla bu personelleri yazdırmış olduk ve terminal işlemle akışı bitirdik.
		personeller.stream().filter(p->p.getAd().contains("e")).forEach(System.out::println);
	
		System.out.println("----------------------------------------");
		
		//personeller'den bir stream oluşturduk. filter() metodu içinde getSoyad() ile soyisimleri alıp contains() metoduyla soyisimleri içinde "a" harfi olanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra da forEach() metodu içinde lambda function kullanarak soyisminde "a" geçenlere 20% zam yapıp bu personelleri yazdırdık ve terminal işlemle akışı bitirdik.
		personeller.stream().filter(p->p.getSoyad().contains("a")).forEach(p->{
			p.maasArtir(1.2); //Terminal işlem olan forEach() içinde maasArtir() kullandığımız için yine kaynak üzerinde değişiklik yapmış olduk.
			System.out.println(p); //forEach() içinde lambda function(->) kullanarak terminal işlem içinde hem maasArtir() metodu kullandık hem de elemanları tek tek yazdırmış olduk.
		});
		
		System.out.println("----------------------------------------");
		
		//Yukarıdaki stream içinde yine terminal işlem olan forEach() metodu içinde maaş artırdığımız için kaynak üzerinde de değişiklik yapmış olduk.
		for (Personel p : personeller) { 
			System.out.println(p);
		}
		
		System.out.println("----------------------------------------");
		
		//personeller'den bir stream oluşturduk. filter() metodu içinde getAd() ile isimleri alıp startsWith() metoduyla isimleri "K" harfi ile başlayanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra da forEach() metodu içinde lambda function kullanarak ismileri "K" ile başlayanlara 10% zam yapıp bu personelleri yazdırdık ve terminal işlemle akışı bitirdik.
		personeller.stream().filter(p->p.getAd().startsWith("K")).forEach(p->{
			p.maasArtir(1.1);
			System.out.println(p);
		});
		
		System.out.println("----------------------------------------");
				
		//personeller'den bir stream oluşturduk. filter() metodu içinde getMaas() ile maaşları alıp 250'den az olanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra da forEach() metodu içinde lambda function kullanarak maaşları 250'den az olanlara 50% zam yapıp bu personelleri yazdırdık ve terminal işlemle akışı bitirdik.
		personeller.stream().filter(p->p.getMaas()<250).forEach(p->{
			p.maasArtir(1.5);
			System.out.println(p);
		});
		
		System.out.println("-----------------map()-----------------");
	
		//map() Metodu: İçindeki koşula göre yeni bir stream oluşturur. Kaynağın tamamını değil de bir kısmını almak istiyorsak map() kullanabiliriz.
		
		//personeller'den bir stream oluşturduk. map() metoduyla sadece departman alanını alıp yeni bir stream oluşturmuş olduk ve forEach() ile oluşturduğumuz map'i yazdırıyoruz.
		personeller.stream().map(p->p.getDepartman()).forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		//personeller'den bir stream oluşturduk. map() metoduyla sadece maaş alanını alıp yeni bir stream oluşturuyoruz ve getMaas()+50 diyerek map içindeki maas değerlerine 50 eklemiş oluyoruz. Daha sonra forEach() ile oluşturduğumuz map'i yazdırıyoruz.
		personeller.stream().map(p->p.getMaas()+50).forEach(System.out::println);
		
		//personeller'den bir stream oluşturduk. map() metoduyla sadece maaş alanını alıp üstüne 50 ekleyerek setMaas() ile set etmeye çalışıyoruz ama hata alıyoruz çünkü setMaas() metodu void olduğu yani geriye bir şey dönmediği için ve map geriye bir şey dönen durumlarda kullanıldığı için çalışmıyor. Bundan dolayı map içinde set kullanamayız.
		//personeller.stream().map(p->p.setMaas(p.getMaas()+50)).forEach(System.out::println);
		
		System.out.println("---------------distinct()---------------");
		
		//distinct() Metodu: Tekrarlı elemanları almadan stream oluşturmak için kullanılır.
		
		//personeller'den bir stream oluşturduk. map() metoduyla sadece departman alanını alıp yeni bir stream oluşturmuş olduk. Daha sonra distinct() metodumuzu kullanarak bu oluşturduğumuz map içindeki birden fazla olan yani tekrarlı elemanları bir kere almasını sağlamış olduk ve forEach() ile oluşturduğumuz map'i yazdırıyoruz.
		personeller.stream().map(p->p.getDepartman()).distinct().forEach(System.out::println);
		
		System.out.println("----------------sorted()----------------");
				
		//sorted() Metodu: Oluşturduğumuz stream içindeki elemanları sıralamak için kullanılır. Personel sınıfına Comparable implement edip metodunu override ederek içine verdiğimiz şarta göre sıralama yapacak.
		
		//personeller'den bir stream oluşturduk ve sorted() metodunu çağırarak Personel sınıfınına override ettiğimiz compareTo() metodunu maaşları küçükten büyüğe sıralattığımız için ona göre sıralamış olduk ve forEach() ile streamdeki elemanlarımızı yazdırıyoruz.
		personeller.stream().sorted().forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		//personeller'den bir stream oluşturduk ve sorted() metodunu çağırarak elemanları Comparable ile sıralıyoruz ama sorted içine Comparator.reverseOrder() çağırarak yaptığımız sıralamayı tersine çevirmiş olduk yani maaşları büyükten küçüğe sıralamış olduk ve forEach() ile streamdeki elemanlarımızı yazdırıyoruz.
		personeller.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		//personeller'den bir stream oluşturduk. map() metoduyla sadece maaş alanını alıp yeni bir stream oluşturuyoruz. Daha sonra sorted() metodunu çağırarak maaşları küçükten büy üğe sıralıyoruz ve forEach() ile mapteki maaşları yazdırıyoruz.
		//Sadece map() ile maaşları aldığımız için Personel sınıfında Comparable kullanıp compareTo() metodunu override edip maaş sıralama şartını oraya eklemesek bile maaşlar için sıralama yapabiliyoruz. 
		personeller.stream().map(p->p.getMaas()).sorted().forEach(System.out::println);
		
		System.out.println("----------------limit()----------------");
		
		//limit() Metodu: Streamden kaç tane eleman alınacağını belirtir. Sadece içine parametre olarak girilen sayıdaki elemanı alır.
		
		//personeller'den bir stream oluşturduk ve limit() metodunu çağırarak sadece ilk üç elemanı alan bir stream oluşturuyoruz. Daha sonra forEach() metoduyla bu üç elemanı yazdırıyoruz.
		personeller.stream().limit(3).forEach(System.out::println);
		
		System.out.println("-----------------skip()-----------------");
				
		//skip() Metodu: Stream içinde kaç eleman atlanacağını belirtir. İçine parametre olarak girilen sayı kadar stream içinde atlar.
		
		//personeller'den bir stream oluşturduk ve skip() metodunu çağırarak ilk üç elemanı atlamasını sağladık ve limit() metoduyla ondan sonraki ilk iki elemanı alan bir stream oluşturduk. Daha sonra forEach() metoduyla bu iki elemanı yazdırıyoruz.
		personeller.stream().skip(3).limit(2).forEach(System.out::println);
		
		System.out.println("----------------count()----------------");
				
		//count() Metodu: Streamdeki eleman sayısını verir. count() bir terminal yani sonlandırma işlemidir. Kullanıldıktan sonra başka bir işlem yapılamaz. count() metodu geriye long döner.
		
		//personeller'den bir stream oluşturduk ve map() metoduyla sadece departman alanını alıp yeni bir stream oluşturmuş olduk. Daha sonra distinct() metodumuzu kullanarak bu oluşturduğumuz map içindeki birden fazla olan yani tekrarlı elemanları bir kere almasını sağlamış olduk.
		//Daha sonra da count() metodunu kullanarak bu stream içindeki eleman sayısını dönüyoruz. count() bir terminal işlem olduğu için akışımız sonlandı ve geriye long döndüğü için elemanSayisi değişkenine atıp öyle yazdırıyoruz.
		Long elemanSayisi=personeller.stream().map(p->p.getDepartman()).distinct().count();
		System.out.println(elemanSayisi);
		
		System.out.println("----------------------------------------");
		
		//personeller'den bir stream oluşturduk ve count() metodunu çağırarak stream içindeki tüm elemanların sayısını dönüyor. Terminal işlem olduğu için akışımız sonlandı.
		elemanSayisi=personeller.stream().count();
		System.out.println("Tüm elemanlar: "+elemanSayisi);
		
		System.out.println("---------------anyMatch()---------------");
				
		//anyMatch() Metodu: Stream içinde koşula uygun en az bir tane eleman varsa true yoksa false döner. anyMatch() bir terminal yani sonlandırma işlemidir. anyMatch() metodu geriye boolean döner.
		
		//personeller'den bir stream oluşturduk ve anyMatch() metodunu çağırarak maaşı 500'den fazla olan eleman var mı yok mu onu sorguluyoruz. Geriye boolean döneceği için boolean bir değişkene atıp öyle yazdırıyoruz. 500'den fazla maaşı olanlar oldupu için true dönecek. Terminal işlem olduğu için akışımız sonlandı.
		boolean sonuc=personeller.stream().anyMatch(p->p.getMaas()>500);
		System.out.println(sonuc);
		
		System.out.println("---------------allMatch()---------------");
				
		//allMatch() Metodu: Stream içinde koşula bütün elemanlar uyuyorsa true ama bir tane bile eleman uymuyorsa false döner. allMatch() bir terminal yani sonlandırma işlemidir. allMatch() metodu geriye boolean döner.
		
		//personeller'den bir stream oluşturduk ve allMatch() metodunu çağırarak tüm elemanların maaşı 100'den fazla mı değil mi onu sorguluyoruz. Geriye boolean döneceği için boolean bir değişkene atıp öyle yazdırıyoruz. Tüm elemanların maaşı 100'den fazla maaşı oldupu için true dönecek. Terminal işlem olduğu için akışımız sonlandı.
		sonuc=personeller.stream().allMatch(p->p.getMaas()>100);
		System.out.println(sonuc);
		
		System.out.println("---------------noneMatch()---------------");
		
		//noneMatch() Metodu: Stream içinde koşula hiçbir eleman uymuyorsa true ama bir tane bile eleman uyuyorsa false döner. döner. allMatch() metodunun tam tersi olarak çalışır. noneMatch() bir terminal yani sonlandırma işlemidir. noneMatch() metodu geriye boolean döner.
		
		//personeller'den bir stream oluşturduk ve noneMatch() metodunu çağırarak tüm elemanların maaşı 800'den fazla mı değil mi onu sorguluyoruz. Geriye boolean döneceği için boolean bir değişkene atıp öyle yazdırıyoruz. Tüm elemanların maaşı 800'den az olduğu için hiçbiri bu koşulu sağlamadı ve geriye true dönecek. Terminal işlem olduğu için akışımız sonlandı.
		sonuc=personeller.stream().noneMatch(p->p.getMaas()>800);
		System.out.println(sonuc);
		
		System.out.println("----------------reduce()----------------");
		
		//reduce() Metodu: Elemanları tek bir değerde işlemek için kullanılır. reduce() bir terminal yani sonlandırma işlemidir. Geriye değer döner.
		
		List<Integer> sayilar=Arrays.asList(1,2,2,9,3); //List interfaceden bir referans oluşturuyoruz ve içine asList() metoduyla girilen elemanları List olarak dönüyor.
		
		//sayilar'dan bir stream oluşturuyoruz. Daha sonra reduce() metodunu çağırarak toplama işlemi yapmak istiyoruz. Bundan dolayı toplam'ın başlangıç değerini 0 veriyoruz ve stream içindeki her sayıyı bu toplam üstüne eklemiş oluyoruz. List'imiz Integer olduğu için geriye Integer bir değer döneceği için toplamReduce değişkenine atıp öyle yazdırıyoruz. Terminal işlem olduğu için akışımız sonlandı.
		int toplamReduce=sayilar.stream().reduce(0,(toplam,sayi)->toplam+sayi);
		System.out.println(toplamReduce);
		
		System.out.println("----------------------------------------");
		
		//sayilar'dan bir stream oluşturuyoruz. Daha sonra reduce() metodunu çağırarak çarpma işlemi yapmak istiyoruz. Bundan dolayı carpim'in başlangıç değerini 1 veriyoruz ve stream içindeki her sayıyı bu carpim ile çarparak ekliyoruz. List'imiz Integer olduğu için geriye Integer bir değer döneceği için carpimReduce değişkenine atıp öyle yazdırıyoruz. Terminal işlem olduğu için akışımız sonlandı.
		int carpimReduce=sayilar.stream().reduce(1,(carpim,sayi)->carpim*sayi);
		System.out.println(carpimReduce);
		
		System.out.println("----------------------------------------");
		
		List<Double> doubleSayilar=Stream.of(3.14, 7.25,8.3).collect(Collectors.toList()); //Stream.of() diyerek içine double elemanlar giriyoruz ve oluşan stream üzerinden collect() metodunu çağırarak streamden collection oluşturuyoruz ve metodun içine Collectors.toList() yazarak List'e çevirebiliyoruz. Daha sonra List interface'inin referansına atama yapıyoruz.
				
		//doubleSayilar'dan bir stream oluşturuyoruz. Daha sonra reduce() metodunu çağırarak çarpma işlemi yapmak istiyoruz. Bundan dolayı carpim'in başlangıç değerini 1.0 veriyoruz ve stream içindeki her sayıyı bu carpim ile çarparak ekliyoruz. List'imiz Double olduğu için geriye Double bir değer döneceği için carpimReduce2 değişkenine atıp öyle yazdırıyoruz. Terminal işlem olduğu için akışımız sonlandı.
		double carpimReduce2=doubleSayilar.stream().reduce(1.0,(carpim,sayi)->carpim*sayi);
		System.out.println(carpimReduce2);
		
		System.out.println("----------------Optional----------------");
		
		//Optional(Opsiyonel): İçinde değer olabilir ama olmayadabilir. NullPointerException almaktan kurtarır. Bir değeri kutu ile sarmalamak gibi düşünebiliriz. Kutunun içi boş olabilir ama hala bir kutu vardır.
		
		//sayilar'dan bir stream oluşturuyoruz. Daha sonra reduce() metodunu çağırarak Integer::max metot referansını kullanıp sayilar stream içindeki en büyük sayıyı dönmesini istemiş oluyoruz. reduce() metodu bu koşulda geriye Optional Integer döneceği için Optional Integer alan bir değişkene atıp yazdırıyoruz. Terminal işlem olduğu için akışımız sonlandı.
		Optional<Integer> max=sayilar.stream().reduce(Integer::max);
		
		System.out.println(max); //sayilar içinde elemanlar olduğu için geriye en büyük elemanı Optional[9] diyerek dönmüş oldu yani tanımlamaya göre Optional kutusu içindeki en büyük elemanı döndü. Eğer sayilar içinde hiç eleman olmasaydı bu kez geriye Optional.empty dönecekti yani kutu boş demiş olacaktı. Bu şekilde içinde eleman olmadığı zaman hata almamızı engellemiş olduk yani bizi NullPointerException almaktan kurtardı.
	
		System.out.println(max.get()); //max.get() diyerekte Optional içindeki değeri direkt alabiliyoruz. Artık yazdırırken sadece içindeki 9 değerini yazdırıyor ama içinde eleman yoksa empty ise o zaman NosuchElementException hatası alıyoruz çünkü listenin içinde get() ile alabileceği bir eleman yok.
		
		//Listemizin boş olup olmadığı durumu Optional metotlarıyla kontrol edebiliriz.
		if(max.isPresent()) { //if koşulu içine max.isPresent() diyerek listenin içinde eleman olduğu koşulunu ekliyoruz. Geriye boolean döndüğü için true olduğu durumda yani eleman varsa içeri girecek. max.isPresent() yerine !max.isEmpty() tam tersi olduğu için onu da kullanabiliriz.
			System.out.println(max.get()); //İçinde eleman olduğu şartını ekleyerek eleman varsa max.get() diyerek en büyük elemanın değerini almış oluyoruz. Bu şekilde de hata almaktan kaçınabiliriz.
		}
		
		if(max.isEmpty()) { //if koşulu içine max.isEmpty() diyerek listenin içinde eleman olmadığı koşulunu ekliyoruz. Geriye boolean döndüğü için true olduğu durumda yani eleman yoksa içeri girecek.
			System.out.println("Liste boş olduğu için sonuç hesaplanamadı."); //İçinde eleman olmadığı durumda da burdaki çıktıyı ekrana yazdıracak.
		}
		
		//Optional için metot referansı yerine lambda kullanarak max bulalım.
		//sayilar'dan bir stream oluşturuyoruz. Daha sonra reduce() metodunu çağırarak stream içindeki elemanları lambda ile Tenary kullanarak en büyük sayıyı dönmesini sağladık. reduce() metodu bu koşulda geriye Optional Integer döneceği için Optional Integer alan bir değişkene atıp yazdırıyoruz. Terminal işlem olduğu için akışımız sonlandı.
		Optional<Integer> maxLambda=sayilar.stream().reduce((sayi1,sayi2)-> sayi1>sayi2 ? sayi1 : sayi2);
		
		if(maxLambda.isPresent()) { //if koşulu içine max.isPresent() diyerek listenin içinde eleman olduğu koşulunu ekliyoruz.  Geriye boolean döndüğü için true olduğu durumda yani eleman varsa içeri girecek ve max.get() diyerek Optional içindeki değeri alıyoruz.
			System.out.println("MaxLambda: "+maxLambda.get());
		}
		
		System.out.println("----------------collect()----------------");
		
		//collect() Metodu: Streamden collection oluşturmaya yarıyor. collect() metodu içine Collectors çağırarak hangi collection'a dönüştürmek istiyorsak onu yazıyoruz. Aşağıda toList dediğimizde Stream bir List'e dönüştü toSet dediğimizde Stream bir Set'e dönüştü. collect() bir terminal yani sonlandırma işlemidir. Geriye içine girdiğimiz collection'ı döner.
		
		//personeller'den bir stream oluşturduk. filter() metodu içinde getMaas() ile maaşları alıp 500'den fazla olanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra map() metoduyla maaşı 500'den fazla olanların maaş kısmını alıp her birini 100 ile çarpıp sonuna $ ekleyerek yeni bir String stream oluşturmuş olduk.
		//Daha sonra da collect() metoduyla Collectors çağırıp toList diyerek bu Stream'i List'e çevirmiş oluyoruz ve terminal işlemle akışı bitirdik. Geriye List döndüğü içinde String elemanlar alan bir List referansına atıyoruz.
		List<String> zamliMaasListesi=personeller.stream().filter(p->p.getMaas()>500).map(p->p.getMaas()*100+" $").collect(Collectors.toList()); //.collect(Collectors.toList()) yerine .toList() de kullanabiliriz. İkisi de List'e çeviriyor.
		
		for (String item : zamliMaasListesi) { //foreach döngüsüyle zamliMaasListesi List'imizin içinde dolaşarak tek tek elemanları yazdırıyoruz.
			System.out.println(item);
		}
		
		//personeller'den bir stream oluşturduk. filter() metodu içinde getMaas() ile maaşları alıp 500'den az olanları filtreleyerek yeni bir stream oluşturmuş olduk. Daha sonra map() metoduyla maaşı 500'den az olanların maaş kısmını alıp her birini 100 ile çarpıp sonuna $ ekleyerek yeni bir String stream oluşturmuş olduk.
		//Daha sonra da collect() metoduyla Collectors çağırıp toSet diyerek bu Stream'i Set'e çevirmiş oluyoruz ve terminal işlemle akışı bitirdik. Geriye Set döndüğü içinde String elemanlar alan bir Set referansına atıyoruz.
		Set<String> zamliMaasSeti=personeller.stream().filter(p->p.getMaas()<500).map(p->p.getMaas()*100+" $").collect(Collectors.toSet());
		
		for (String item : zamliMaasSeti) { //foreach döngüsüyle zamliMaasSeti Seti'mizin içinde dolaşarak tek tek elemanları yazdırıyoruz. Maaşı aynı olanları bir sefer alacaktı ama bütün maaşlar farklı olduğu için hepsini aldı.
			System.out.println(item);
		}
		
		System.out.println("-----------------peek()-----------------");
		
		//peek() Metodu: Stream içinde göz gezdirmek için yani elemanları dolaşmak için kullanılır.
		
		//personeller'den bir stream oluşturduk ve peek() metodunu çağırarak her personeli dolaşarak maaşını yazdırıyoruz. Daha sonra map() metoduyla personellerin maaş kısmını alıp her birini 2 ile çarpıp sonuna $ ekleyerek yeni bir String stream oluşturmuş olduk ve peek() metodunu çağırarak her maaşı dolaşarak zamlı halini yazdırıyoruz.
		//Daha sonra da collect() metoduyla Collectors çağırıp toSet diyerek bu Stream'i Set'e çevirmiş oluyoruz ve terminal işlemle akışı bitirdik. Geriye Set döndüğü içinde String elemanlar alan bir Set referansına atıyoruz.
		Set<String> zamliMaasPeekSet=personeller.stream().peek(p->System.out.println("Zamdan Önceki Maaş: "+p.getMaas())).map(p->p.getMaas()*2+" $").peek(m->System.out.println("Zamdan sonraki maaş: "+m)).collect(Collectors.toSet());
		
		System.out.println("----------------------------------------");
		
		for (String item : zamliMaasPeekSet) { //foreach döngüsüyle zamliMaasPeekSet Seti'mizin içinde dolaşarak tek tek elemanları yazdırıyoruz. Maaşı aynı olanları bir sefer alacaktı ama bütün maaşlar farklı olduğu için hepsini aldı.
			System.out.println(item);
		}
		
		System.out.println("----------------------------------------");
		
		//collect() metodu içinde Collectors.joining kullanımı:
		List<String> gunlerCollect=List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"); //List.of() diyerek içine direkt elemanları verip bir List oluşturuyoruz ve içine String elemanlar alan List referansına atıyoruz.
		
		//gunlerCollect'ten bir stream oluşturuyoruz ve collect() metoduyla Collectors çağırıp joining() metodunu kullanıyoruz ve elemanların arasına joining() içinde parametre olarak verilen değeri koyarak geriye String bir değer döndüğü için yeniGunlerCollect değişkenine atıyoruz. Terminal işlem olduğu için akışımız sonlandı.
		String yeniGunlerCollect=gunlerCollect.stream().collect(Collectors.joining("-"));
		
		System.out.println(yeniGunlerCollect);
		System.out.println(gunlerCollect); //collect() metodu terminal işlem olsa da değişiklik yapmadı hala yazdırdığımız da ilk halini yazdırıyor.
		
	}

}
