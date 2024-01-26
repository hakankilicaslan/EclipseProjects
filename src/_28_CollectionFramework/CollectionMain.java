package _28_CollectionFramework;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionMain {

	public static void main(String[] args) {

		/* 
		 * Collection interface'inden nesne oluşturamıyoruz.
		 * ArrayList sınıfından yeni bir nesne oluşturup Collection interface'i referansının bu nesneyi tutmasını göstermesini sağlıyoruz.
		 * Bu durumda ArrayList sınıfının metotlarına ulaşamıyoruz ya da çağıramıyoruz.
		 * ArrayList nesnesini refere eden koleksiyon referansının özelliklerini kullanıyoruz yani Collection interface'inin metotlarına ulaşıyoruz.
		 * Yani oluşturduğumuz nesnenin değil bu nesneyi gösteren referans neyse onun metotlarına ulaşabiliyoruz. Sadece o referansın oluşturduğumuz nesneyi göstermesini sağlamış oluyoruz.
		 * 
		 */
		
		Collection<String> koleksiyon = new ArrayList<>(); //String Elementler içeren bir Collection interface referansının ArrayList sınıfından oluşturulan yeni nesneyi göstermesini sağlamış olduk.
		koleksiyon.add("Pul"); //Collection içindeki add() metoduyla ArrayList içine eleman ekliyoruz.
		koleksiyon.add("Lego");
		koleksiyon.add("Oyuncak");

		for (String eleman : koleksiyon) { //foreach kullanarak koleksiyon bir ArrayList listesini gösterdiği için içindeki elemanları yazdırabiliyoruz.
			System.out.println(eleman);
		}
		
		System.out.println("----------------------------------------");
		
		koleksiyon = new LinkedList<>(); //koleksiyon referansımızın artık LinkedList nesnesi tutmasını sağlıyoruz.
		koleksiyon.add("Pul"); //Collection içindeki add() metoduyla LinkedList içine eleman ekliyoruz.
		koleksiyon.add("Lego");
		koleksiyon.add("Oyuncak");

		for (String eleman : koleksiyon) { //foreach kullanarak koleksiyon bir LinkedList listesini gösterdiği için içindeki elemanları yazdırabiliyoruz.
			System.out.println(eleman);
		}
		
		/*
		 * ArrayList ve LinkedList sınıflarından nesneler oluşturup koleksiyon referansının göstermesini sağladık.
		 * İkisine de add() metoduyla eleman ekledik yaptığımız işlemler aynı görünüyor aralarında herhangi bir fark görünmüyor.
		 * Aslında ArrayList içine eklerken ordaki add() metodunun arka plandaki çalışma mantığına göre ekledi, LinkedList içine eklerken ordaki add() metodunun arka plandaki çalışma mantığına göre ekledi.
		 * Öbür türlü hepsi aynı şekilde çalışıyor olsa diğerine gerek kalmazdı.
		 * 
		 */
		
		System.out.println("----------------------------------------");
		
		//List<String> liste = new ArrayList<>(); //Bu şekilde dimond operatör olarak String atadığımızda içine String türünde elemanlar ekleyebiliyoruz.
		//List liste = new ArrayList<>(); //Burada List içine dimond operatör olarak belirtmediğimiz de elemanları Object olarak alıyor.
		List<Object> liste = new ArrayList<>(); //Dimond operatör kısmına Object olarakta belirtebiliriz ama yazmasakta en üst sınıf olduğu için kendisi Object alıyor.
		liste.add(10); //Artık listemizin içine Object olarak istediğimizi integer, String, boolean ekleyebiliyoruz.
		liste.add("Merhaba");
		liste.add(true);

		for (Object eleman : liste) { //foreach metoduyla List içindeki elemanları yazdırabiliyoruz ama tür olarak Object belirtmemiz gerekiyor.
			System.out.println(eleman);
		}
		
		System.out.println("----------------------------------------");
		
		liste = new LinkedList<>(); //Artık listemiz ArrayList nesnesi değil yeni oluşturulan LinkedList nesnesi tutuyor.
		liste.add(13);
		liste.add("Hello");
		liste.add(false);
		
		for (Object eleman : liste) { //liste yazdırdığımızda artık LinkedList içine eklenen elemanları gösterecek.
			System.out.println(eleman);
		}
		
		System.out.println("----------------------------------------");
		
		ArrayList<String> isimler = new ArrayList<>(); //String elemanlar içeren ArrayList referansının yeni bir ArrayList nesnesi tutmasını göstermesini sağlıyoruz. 
		isimler.add("Hakan");
		isimler.add("Selma");
		isimler.add("Seda");
		isimler.add("Burak");

		Iterator<String> iterator =	isimler.iterator(); //isimler.iterator() diyerek isimler üzerinden iterator() metodunu çağırıyoruz ve Iterator interface'in referansı olan iterator'e atıyoruz ve iterator kullanarak foreach döngüsü yerine başka bir şekilde yazdırmasını sağlayacağız.

		while (iterator.hasNext()) { //iterator.hasNext() metoduyla isimler listesinin içinde bir sonraki eleman var mı yok mu şartını kontrol ediyoruz.
			System.out.println(iterator.next()); //iterator.next() ile de sıradaki elemanı çağırıyoruz ve yazdırmasını sağlıyoruz. get() metodu olmayan durumlarda iterator kullanılarak çağırma yazdırma işlemi yaptırılabilir.
		}
		
		System.out.println("----------------------------------------");
		
		ListIterator<String> listIterator = isimler.listIterator(); //isimler.listIterator() metodunu listIterator referansına atıyoruz. ListIterator ile Iterator farkı ListIterator içinde next() ve hasNext() metotlarına ek olarak previous() ve hasPrevious() metotları da var.
		listIterator.next(); //Listemiz ilk olarak boşluğu yani ilk elemandan öncesini gösteriyor ve biz next() metodunu çağırdığımzıda artık listenin ilk elemanını işaret ediyor.
		listIterator.next();
		listIterator.next();
		listIterator.next(); //isimler listemiz ilk başta ilk elemandan öncesini gösterdiği için hasPrevious() şartını sağlamıyor ve hiçbir şey yazdırmıyor. Bundan dolayı 4 kere next() kullanarak listenin sonuna gitmiş oluyoruz. Bu şekilde yazdırdığımızda listeyi sondan başa doğru yazdıracak.
		
		listIterator.set("Sultan"); //next() metodunu 4 kere çağırdığımız için şu an listenin sonuncu elemanını işaret ediyor. Bu durumda listIterator içindeki set() metodunu çağırdığımızda bu sonuncu elemanın yerine parametre olarak verdiğimiz elemanı set edecek.
		
		while (listIterator.hasPrevious()) { //listIterator.hasPrevious() metoduyla isimler listesinin içinde bir önceki eleman var mı yok mu şartını kontrol ediyoruz.
			System.out.println(listIterator.previous()); //listIterator.previous() ile de önceki elemanları yazdırmasını sağlıyoruz.
		}
		
		System.out.println("----------------------------------------");
		
		//Collection Interface haricinde bir de Collections sınıfı var. Bu sınıfta hazır metotlar var.
		//Collections sınıfındaki sort() metodu doğal sıralama yapıyor yani String ifadelerde ascii code'a göre sayısal değerlerde küçükten büyüğe sıralıyor.
		
		ArrayList<String> sehirler = new ArrayList<>();
		sehirler.add("Ankara");
		sehirler.add("İstanbul");
		sehirler.add("eskişehir");
		sehirler.add("Kırşehir");
		sehirler.add("Yalova");
		sehirler.add("Ordu");
		
		Collections.sort(sehirler); //Listemiz String ifadeler olduğu için ascii code'a göre önce büyük harflar arası doğal sıralama sonra küçük harfler arası doğal sıralama sonra Türkçe karakterleri sıralıyor.
		
		for (String eleman : sehirler) {
			System.out.println(eleman);
		}
		
		System.out.println("----------------------------------------");
		
		ArrayList<Integer> sayilar=new ArrayList<>();
		sayilar.add(12);
		sayilar.add(2);
		sayilar.add(17);
		sayilar.add(5);
		sayilar.add(93);
		
		Collections.sort(sayilar); //Listemiz Integer değerlerden oluştuğu için eklenen elemanları küçükten büyüğe sıralıyor.
		
		for (Integer item : sayilar) {
			System.out.println(item);
		}
		
	}
	
}
