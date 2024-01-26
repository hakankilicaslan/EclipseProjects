package _30_StreamAPI_AkisUPA;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamMain {

	public static void main(String[] args) {

		//Stream interface haricinde IntStream, DoubleStream, LongStream gibi farklı interface çeşitleri de var.
		
		IntStream sayilar=IntStream.of(12,2,17,5,93); //Bir IntStream referansına IntStream üzerinden of() metodunun varargs(istediğimiz kadar sayı girebiliyoruz) yoluyla Integer elemanlar ekliyoruz.
		sayilar.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		sayilar=IntStream.iterate(0, i->i+2).limit(10); //IntStream üzerinden iterate() metodunu çağırıp 0'dan başla ve 2'şer artırarak sayılar oluştur diyerek yeni bir IntStream oluşturuyoruz ve limit() metoduyla kaç tane sayı oluşturulacağını belirleyerek yani döngünün kaç defa döneceğini belirleyerek yeni bir IntStream daha oluşturuyoruz. Geriye bir IntStream döneceği için daha önce oluşturduğumuz sayilar IntStream'e aktarıyoruz.
		sayilar.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		sayilar=IntStream.generate(()->new Random().nextInt(1,101)).limit(6); //IntStream üzerinden generate() metodunu çağırıp lambda function kullanarak yeni Random nesnesi ile 1 ile 100 arasında sayılar üreterek yeni bir IntStream oluşturuyoruz ve limit() metoduyla kaç tane sayı oluşturulacağını belirleyerek yani döngünün kaç defa döneceğini belirleyerek yeni bir IntStream daha oluşturuyoruz. Geriye bir IntStream döneceği için daha önce oluşturduğumuz sayilar IntStream'e aktarıyoruz.
		sayilar.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		sayilar=IntStream.range(5, 10); //IntStream üzerinden range() metodunu çağırarak 5'den 10'a kadar olan sayıları alarak yani aralık belirleyerek yeni bir IntStream oluşturuyoruz. Geriye bir IntStream döneceği için daha önce oluşturduğumuz sayilar IntStream'e aktarıyoruz. [5,10) -> 5 dahil ama 10 dahil değil
		sayilar.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		sayilar=IntStream.rangeClosed(5, 10); //IntStream üzerinden rangeClosed() metodunu çağırarak 5'den 10'a kadar(10 dahil) sayıları alarak yani aralık belirleyerek yeni bir IntStream oluşturuyoruz. Geriye bir IntStream döneceği için daha önce oluşturduğumuz sayilar IntStream'e aktarıyoruz. [5,10] -> hem 5 hem 10 dahil
		sayilar.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		//Aggregate Functions -> sum(), max(), min(), average(), count() 
		int toplam=IntStream.rangeClosed(1, 5).sum(); //IntStream üzerinden rangeClosed() metodunu çağırarak 1'den 5'e kadar(5 dahil) sayıları alarak yani aralık belirleyerek yeni bir IntStream oluşturuyoruz Daha sonra sum() metodunu çağırarak bu sayıların toplamını almış oluyoruz. Geriye Integer bir değer döneceği için Integer bir değişkene atıyoruz.
		System.out.println("sum(): "+toplam);
		
		System.out.println("----------------------------------------");
		
		OptionalInt min=IntStream.rangeClosed(1, 5).min(); //IntStream üzerinden rangeClosed() metodunu çağırarak 1'den 5'e kadar(5 dahil) sayıları alarak yani aralık belirleyerek yeni bir IntStream oluşturuyoruz. Daha sonra min() metodunu çağırarak bu sayılardan en küçük değeri alıyoruz. Geriye OptionalInt döndüğü için OptionalInt bir değişkene atıyoruz.
		System.out.println("min.getAsInt(): "+min.getAsInt());
		
		System.out.println("----------------------------------------");
		
		OptionalInt max=IntStream.rangeClosed(1, 5).max(); //IntStream üzerinden rangeClosed() metodunu çağırarak 1'den 5'e kadar(5 dahil) sayıları alarak yani aralık belirleyerek yeni bir IntStream oluşturuyoruz. Daha sonra max() metodunu çağırarak bu sayılardan en büyük değeri alıyoruz. Geriye OptionalInt döndüğü için OptionalInt bir değişkene atıyoruz.
		System.out.println("max(): "+max);
		
		System.out.println("----------------------------------------");
		
		OptionalDouble ort=IntStream.rangeClosed(1, 5).average(); //IntStream üzerinden rangeClosed() metodunu çağırarak 1'den 5'e kadar(5 dahil) sayıları alarak yani aralık belirleyerek yeni bir IntStream oluşturuyoruz. Daha sonra average() metodunu çağırarak bu sayıların ortalamasını alıyoruz. Geriye OptionalDouble döndüğü için OptionalDouble bir değişkene atıyoruz.
		System.out.println("ort.getAsDouble(): "+(ort.isPresent() ? ort.getAsDouble() : 0.0)); //OptionalDouble üzerinden isPresent() metoduyla Tenary kullanarak eleman varsa getAsDouble() metodunu çağır yani elemanı yazdır yoksa 0.0 yazdır demiş oluyoruz.
		
		System.out.println("----------------------------------------");
		
		long elemanSayisi=IntStream.rangeClosed(1, 5).count(); //IntStream üzerinden rangeClosed() metodunu çağırarak 1'den 5'e kadar(5 dahil) sayıları alarak yani aralık belirleyerek yeni bir IntStream oluşturuyoruz. Daha sonra count() metodunu çağırarak bu sayıların adedini alıyoruz. Geriye long döndüğü için long bir değişkene atıyoruz.
		System.out.println("count(): "+elemanSayisi);
		
	}

}
