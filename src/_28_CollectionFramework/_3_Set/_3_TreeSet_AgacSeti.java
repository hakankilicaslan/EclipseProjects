package _28_CollectionFramework._3_Set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * HashSet - LinkedHashSet - TreeSet -> Üçü de tekrarlı eleman almıyor. Tekrarlı eleman tutulmayacaksa kullanılabilir. 
 * 
 * HashSet: Elemenları sıralı tutmuyor rastgele tutuyor. En fazla 1 tane null değer alabilir. Ekleme, silme erişim işlemleri O(1)
 * 
 * LinkedHashSet: Eklediğimiz sıraya göre elemanları tutuyor. Eleman ekleme yine pointer ile olduğu için daha hızlıdır.
 * Hem değerleri hem de pointerları tuttuğu için bellekte daha fazla yer kaplar.
 * En fazla bir tane null değer alabilir. Ekleme, silme erişim işlemleri O(1)
 *
 * TreeSet: Elemanları doğal sıralamada tutuyor(Küçükten büyüğe ya da ascii codelara göre) ama eğer comparator varsa one göre elemanları tutar.
 * TreeSet içine eleman eklerken ağaç sistemi kullanıyor. Her seferinde eklenen eleman büyükse sağına küçükse soluna ekleme yapıyor.
 * Eleman ekleme sırasında içindeki dengeyi korumak için gezinmesi gerekir ve bu da performansı düşürür.
 * Null değer tutulamaz hata veriyor. Ekleme, silme erişim işlemleri O(log n)
 * HashSet ve LinkedHashSet sınıflarının nesnelerini Set interface referansına atama yapabilirken TreeSet sınıfının nesnesini SortedSet interface referansına da atama yapabiliyoruz.
 * 
 */

public class _3_TreeSet_AgacSeti {

	public static void main(String[] args) {

		SortedSet<String> isimler= new TreeSet<>(); //TreeSet sınıfından yeni bir nesne oluşturup içine String elemanlar alan bir SortedSet referansına atama yapıyoruz ve add() metoduyla String ifadeler ekliyoruz.
		
		isimler.add("Hakan"); //add() metodu ile setimize eleman ekliyoruz.
		isimler.add("Selma");
		isimler.add("Seda");
		isimler.add("Gökçen");
		isimler.add("Burcu");
		isimler.add("Sultan");
		isimler.add("Hakan"); //Aynı elemanı tekrar eklemeye çalışıyoruz yine birden fazla kez elemanı eklemiyor.
		
		System.out.println(isimler); //Elemanları ascii code numaralarına göre sıralıyor.
		
		SortedSet<String> isimler2= new TreeSet<>(Comparator.comparing(String::length)); //Metot referansı kullanarak Comparator interface ile elemanları karakter uzunluklarına göre sıralamış oluyoruz.
		
		isimler2.add("Hakan"); 
		isimler2.add("Selma"); //Aynı uzunluktaki başka bir eleman eklemeye çalışınca ikinci ekleneni içine eklemiyor.
		isimler2.add("Seda");
		isimler2.add("Gökçen");
		isimler2.add("Burcu");
		isimler2.add("Sultan");
		isimler2.add("Hakan"); //Aynı elemanı tekrar eklemeye çalışıyoruz yine birden fazla kez elemanı eklemiyor.
		
		System.out.println(isimler2); //Karakter uzunluklarına göre küçükten büyüğe sıralıyr ama aynı karakter sayısına sahip olan kelimelerden sadece bir tane tutuyor. Aynı karakter sayısına sahip diğer kelimeleri eklememiş.
	
	}

}
