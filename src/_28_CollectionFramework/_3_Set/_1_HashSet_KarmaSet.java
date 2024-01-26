package _28_CollectionFramework._3_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * Set bir interfacedir. Thread safe değildir. Yani senkronize değildir.
 * Set'in diğer collectionlardan en önemli farkı içinde tekrarlı değer barındırmaz.
 * Setlerde elemanlar eklenme sırasına ya da doğal sıralamaya göre tutulmuyor.
 * 
 * Set Interface'i implement eden yapılar: HashSet, LinkedHashSet
 * HashSet içine eklenen her elemanın değeri bir hashCode içinde saklanıyor yani hashleniyor.
 * Integer ise kendi değerinde, char ise ascii code karşılığında, String ise herhangi bir integer değer içinde tutuluyor.
 * Veriye erişirken bu hashlenmiş kayıtlar içinde arama yapar. Bu yüzden veri işlemi hızlıdır.
 * Elemanı da o hashlenmiş kayıt içinde barındırdığı için aynı elemandan bir daha eklemeye çalışırsak kaydı olduğu için bir daha eklemiyor.
 * HashSet de LinkedHasSet de parametre olarak null değer alabiliyorlar. Diğerlerinde olduğu gibi birden fazla eklenmiyor.
 * 
 * Set metotları öncekilerdeki gibi add(),clear(),contains(),equals(),forEach(),isEmpty(),remove(),size(),toArray() metotlarını barındırıyor.
 * Set içinde get() metodu bulunmuyor bundan dolayı index numarası ile erişim yapılamıyor. 
 * Set içindeki elemanlara ulaşabilmek için foreach döngüsü ya da iterator kullanabiliriz.
 * 
 */

public class _1_HashSet_KarmaSet {

	public static void main(String[] args) {

		Set<String> hashSet=new HashSet<>(); //HashSet sınıfından yeni bir nesne oluşturup Set interface'in referansının onu göstermesini tutmasını sağlıyoruz.
		
		hashSet.add("Hakan"); //add() metodu ile setimize eleman ekliyoruz.
		hashSet.add("Selma");
		hashSet.add("Seda");
		hashSet.add("Gökçen");
		hashSet.add("Burcu");
		hashSet.add("Sultan");
		hashSet.add("Hakan"); //Aynı elemanı tekrar eklemeye çalışıyoruz.
				
		System.out.println(hashSet); //Elemanları eklediğimiz sıraya göre yazdırmıyor ve aynı elemandan birden fazla eklemeye çalıştığımızda hash'leri aynı olduğu için bir tanesini ekliyor ve onu yazdırıyor.
		
		System.out.println("----------------------------------------");
		
		//foreach ile gezinerek elemanları yazdırabiliyoruz. foreach gezinmek için iterator kullanıyor. Aynı şekilde iterator ile while döngüsünde hasNext() ve next() metotlarını kullanarakta elemanları yazdırabiliriz.
		for (String item : hashSet) { 
			System.out.println(item);
		}
		
		System.out.println("----------------------------------------");
		
		Iterator<String> it=hashSet.iterator(); //hashSet üzerinden iterator() metodunu çağırıp it referansına atama yapıyoruz.
		
		//Set interface içinde get() metodu bulunmuyor. Elemanlara erişebilmek için iterator metodunu kullanabiliriz.
		//Iterator interface içinde de next() ve hasNext() dışında çok fazla metot bulunmuyor.
		//Bundan dolayı kullanırken it.next() String döndüğü için bu şekilde o elemana ulaşıp daha sonra String metotlarına erişebiliriz.
		//Bu yaptığımız işlemleri foreach döngüsünde de yapabiliriz. item String ifade döneceği için onun üzerinden de String metotlarına ulaşabiliriz.
		while (it.hasNext()) { //Döngü içinde it.hasNext() ile bir sonraki elemanın olup olmadığı şartını kontrol ediyoruz.
			if(it.next().equals("Sultan"))//it.next() ile de sıradaki elemanı çağırıyoruz ve gelen eleman String olduğu için equals() metoduna ulaşıp yazdığımız String ifadeye eşit olup olmadığı şartına sokuyoruz.
				it.remove(); //Eşitse de silsin çıkarsın diye remove() metodunu çağırıyoruz.
		}
		
		System.out.println(hashSet);
		
		System.out.println("----------------------------------------");
		
		//Verilen bir cümledeki farklı kelime sayısını yani tekrar eden kelimeleri tekrar tutmayan kelimelerin sayısını bulunuz.
		
		String[] cumle= {"Merhaba","Ben","Hakan","Kılıçaslan","Ben","Java","Öğreniyorum","Java","Çok","Çok","Güzel","Güzel","Ben","Hakan","Kılıçaslan"}; //İçinde aynı kelimeleri barındıran String bir dizi oluşturuyoruz.
		
		HashSet<String> kelimelerHashSet=new HashSet<>(); //Kelimeleri içine ekleyeceğimiz yeni bir HashSet nesnesi oluşturuyoruz.
	
		HashSet<String> tekrarlayanKelimelerHashSet=new HashSet<>(); //Tekrar eden kelimeleri ekleyeceğimiz farklı bir HashSet nesnesi oluşturuyoruz.
		
		for (String kelime : cumle) { //Bir foreach döngüsü oluşturup dizi içerisinde tek tek elemanları dolaşıyoruz.
			if(kelimelerHashSet.add(kelime)==false) //add() metodu boolean döndüğü için ve HashSet aynı kelimeyi tekrar eklemeyeceği ve add() metodu aynı kelimeyi tekrar eklerken false döneceği için metodun false olduğu şartını ekliyoruz.
				tekrarlayanKelimelerHashSet.add(kelime); //Şartımız false dönerse yani add() metodu o kelimeyi eklemezse bu kelime tekrar eden bir kelime demektir. Bu durumda da o kelimeyi tekrar edenleri barındıran HashSet içine ekliyoruz.
		}
		
		System.out.println("Farklı kelime sayısı: "+kelimelerHashSet.size()); //Farklı kaç tane kelime olduğunu görmek için o HashSet'in size() metodunu çağırıyoruz.
		System.out.println("Farklı kelimeler: "+kelimelerHashSet); //Farklı kelimeleri tutan HashSet'i yazdırıyoruz.
		System.out.println("Tekrarlı kelimeler: "+tekrarlayanKelimelerHashSet); //Tekrar eden kelimeri tutan HashSet'i yazdırıyoruz.
		
		System.out.println("------------------------");
		
		//retainAll() Metodu: Aynı elemanları barındıran iki HashSet varsa sadece diğer HashSet ile ortak olan elemanları yani kesişim kümesi olan elemanları tutmak için kullanılır.
		HashSet<Integer> set1=new HashSet<>(); //HashSet sınıfından yeni bir nesne oluşturup içine Integer elemanlar alan bir HashSet referansına atama yapıyoruz ve add() metoduyla sayı ekliyoruz.
		
		set1.add(17);
		set1.add(5);
		set1.add(24);
		set1.add(6);
		set1.add(23);
		
		HashSet<Integer> set2=new HashSet<>(); //HashSet sınıfından yeni bir nesne daha oluşturup içine Integer elemanlar alan bir HashSet referansına atama yapıyoruz ve add() metoduyla sayı ekliyoruz.
		
		set2.add(12);
		set2.add(2);
		set2.add(24);
		set2.add(6);
		set2.add(23);
		
		System.out.println("set1:"+set1);
		System.out.println("set2:"+set2);
		
		set1.retainAll(set2); //retainAll() metoduyla set1 içine sadece set1 ile set2 içinde ortak olan elemanları tutmasını sağlıyoruz.
		
		System.out.println("set1:"+set1);
		System.out.println("set2:"+set2);
		
		System.out.println("----------------------------------------");
		
		HashSet<Integer> sayilarHashSet=new HashSet<>(); //HashSet sınıfından yeni bir nesne daha oluşturup içine Integer elemanlar alan bir HashSet referansına atama yapıyoruz ve add() metoduyla sayı ekliyoruz.
		
		sayilarHashSet.add(12);
		sayilarHashSet.add(2);
		sayilarHashSet.add(17);
		sayilarHashSet.add(5);
		sayilarHashSet.add(93);
		
		System.out.println(sayilarHashSet); //sayilarHashSet yazdırdığımızda bazen sıralı olarak yazdırıyor ama güvenilir değil bazen sıralamadan da verebiliyor. Elemanları hangi sırayla tuttuğunu bilmiyoruz.
		
		//HashSet içindeki elemanları sıralamak istediğimiz zaman sort() metodunu kullanabiliriz ama sort() metodu parametre olarak sadece List istiyor.
		//Parametre olarak HashSet gönderemeyeceğimiz için biz de HashSet içindeki verileri herhangi bir List türüne çevirebiliriz.		
		List<Integer> liste=new ArrayList<>(sayilarHashSet); //Yeni bir ArrayList nesnesi oluşturuyoruz ve Integer eleman tutan bir List referansına atama yapıyoruz. ArrayList içine parantez içinde sayilarHashSet diyerek bunun içindeki elemanları ArrayList içine aktarmış oluyoruz.
		
		Collections.sort(liste); //Artık sayilarHashSet içindeki elemanları liste içine aktardığımız için liste kullanarak Collections üzerinden sort() metodunuz çağırıp elemanları sıralayabiliyoruz.
		
		System.out.println(liste); //liste yazdırdığımızda artık küçükten büyüğe sıralı olarak yazdırıyor.
		
		System.out.println("----------------------------------------");
		
		//hashCode() Metodu: HashSet içindeki elemanları arka planda bir hashCode olarak Integer bir değer içinde tutuyor. Eleman Integer ise kendi karşılığında String ise herhangi bir integer değer içinde tutuyor.
		for (Integer item : sayilarHashSet) {
			System.out.println(item+" hashCode'u -> "+item.hashCode()); //sayilarHashSet için bir foreach döngüsü oluşturup içindeki elemanların hashCode'larını yazdırdığımızda elemanlar Integer olduğu için kendi değerlerinde tutuyor.
		}
		
		System.out.println("----------------------------------------");
		
		HashSet<String> isimlerHashSet =new HashSet<>(); //HashSet sınıfından yeni bir nesne oluşturup içine String elemanlar alan bir HashSet referansına atama yapıyoruz ve add() metoduyla String ifadeler ekliyoruz.
				
		isimlerHashSet.add("Hakan");
		isimlerHashSet.add("Selma");
		isimlerHashSet.add("Burak");
		isimlerHashSet.add("Seda");
		
		for (String item : isimlerHashSet) {
			System.out.println(item+" hashCode'u -> "+item.hashCode());//isimlerHashSet için bir foreach döngüsü oluşturup içindeki elemanların hashCode'larını yazdırdığımızda elemanlar String olduğu için herhangi bir integer değerde tutuyor.
		}
		
		System.out.println("----------------------------------------");
		
		//Kullanıcıdan sayılar alıp onları bir yerde saklamak istiyoruz ama tekrarlı sayıları almak istemiyoruz. SET kullanarak yapalım.
		
		HashSet<Integer> sayilar=new HashSet<>(); //HashSet sınıfından bir nesne oluşturup içine Integer elemanlar alan bir HashSet referansına atama yapıyoruz.
				
		Scanner sc=new Scanner(System.in); //Kullanıcıdan parametre alacağımız için Scanner sınıfından bir nesne oluşturuyoruz.
				
		System.out.println("Kaç eleman gireceksiniz.");
		int elemanSayisi=sc.nextInt();sc.nextLine(); //Kullanıcıdan alacağımız parametreyi nextInt() ve nextLine() metotlarıyla değişkene atıyoruz.
				
		for (int i = 0; i < elemanSayisi; i++) { //Kullanıcının gireceği sayıları for döngüsü oluşturup nextInt() metoduyla tek tek oluşturduğumuz sayilar HashSet'i içine add() metoduyla ekliyoruz.
			System.out.println((i+1)+". sayıyı giriniz:");
			sayilar.add(sc.nextInt()); //sayilar HashSet olduğu için aynı sayıdan tekrar girdiğimizde içine eklemeyecek.
		}
				
		System.out.println(sayilar); //sayilar yazdırdığımızda tekrar aynı sayıyı girsek bile bir kere tutacağı için o sayıyı bir kere gösteriyor.
		
		sc.close();
		
	}

}
