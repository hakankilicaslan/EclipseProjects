package _29_Generic_Jenerik.YazdirGeneric;

public class YazdirMain {

	public static void main(String[] args) {

		Integer[] sayiDizisi={40,52,77,16}; //Integer eleman tutan bir dizi oluşturuyoruz.
		String[] kelimeDizisi={"Hakan","Selma","Seda","Burak"}; //String eleman tutan bir dizi oluşturuyoruz.
		
		YazdirInteger yazdir1=new YazdirInteger(); //YazdirInteger sınıfından bir nesne oluşturup YazdirInteger referansına atıyoruz.
		yazdir1.yazdirInteger(sayiDizisi); //YazdirInteger referansı üzerinden Integer dizileri yazdıran yazdirInteger metodunu çağırıyoruz.
			
		YazdirString yazdir2=new YazdirString(); //YazdirString sınıfından bir nesne oluşturup YazdirString referansına atıyoruz.
		yazdir2.yazdirString(kelimeDizisi); //YazdirString referansı üzerinden String dizileri yazdıran yazdirString metodunu çağırıyoruz.
	
		/*
		 *Integer bir diziyi yazdırmak için Integer dizi yazdıran metodu barındıran bir sınıftan nesne ürettik ve onun referansıyla metoda ulaşabildik.
		 *String bir diziyi yazdırmak için String dizi yazdıran metodu barındıran bir sınıftan nesne ürettik ve onun referansıyla metoda ulaşabildik.
		 *
		 *Aynı işlevi gören ama farklı tipte eleman alan iki metot için iki farklı sınıf oluşturduk ya da aynı sınıf içinde iki farklı metot oluşturduk.
		 *Kod tekrarı yapmış olduk aynı metodu farklı tür elemanlar alan haliyle yeniden yazdık ve aynı işlevi gören iki farklı sınıf oluşturduk.
		 *Bunun yerine generic kullanarak tür problemini halledebiliriz.
		 *Oluşturduğumuz sınıfı ya da oluşturduğumuz metodu generic tanımlarsak içine alacağı türü de kendimiz verebiliriz.
		 * 
		 */
		
		System.out.println("-------------Generic Class-------------");
		
		//YazdirGenericClass sınıfından bir nesne oluşturup tip olarak Integer elemanlar alan YazdirGenericClass referansına atıyoruz.
		//Tip olarak Integer girildiği için artık sınıf içindeki metotta tip olarak Integer elemanlar alacak. Bu şekilde Integer dizimizi yazdırabiliyoruzz.
		YazdirGenericClass<Integer> yazdir3=new YazdirGenericClass<>(); 
		yazdir3.yazdir(sayiDizisi);
		
		//YazdirGenericClass sınıfından bir nesne oluşturup tip olarak String elemanlar alan YazdirGenericClass referansına atıyoruz.
		//Tip olarak String girildiği için artık sınıf içindeki metotta tip olarak String elemanlar alacak. Bu şekilde String dizimizi yazdırabiliyoruzz.
		YazdirGenericClass<String> yazdir4=new YazdirGenericClass<>();
		yazdir4.yazdir(kelimeDizisi);
		
		System.out.println("-------------Generic Method-------------");
		
		//Generic Class uygulamasında nesne oluştururken mecburen tipte belirtmek zorunda kalıyoruz ve her tip için ayrı ayrı nesne oluşturmak zorunda kalıyoruz.
		//Generic Method uygulamasında ise sınıf bazında tip belirtilmiyor. Metot oluşturulurken hem metot tanımında hem parametre için <T> tanımlıyoruz.
		//Bu şekilde tek nesne üzerinden metoda ulaşıp hangi tipte referans olursa olsun metodu çağırabilmesini sağlıyoruz. 
		
		YazdirGenericMetot yazdir5=new YazdirGenericMetot(); //YazdirGenericMetot sınıfından bir nesne oluşturup YazdirGenericMetot referansına atıyoruz.
		yazdir5.yazdir(sayiDizisi); //yazdir() metodu içine Integer bir dizi gönderdiğimiz için parametre olarak Integer alıyor ve onun için metodu çalıştırıyor.
		yazdir5.yazdir(kelimeDizisi); //yazdir() metodu içine String bir dizi gönderdiğimiz için parametre olarak String alıyor ve onun için metodu çalıştırıyor.

		
	}

}
