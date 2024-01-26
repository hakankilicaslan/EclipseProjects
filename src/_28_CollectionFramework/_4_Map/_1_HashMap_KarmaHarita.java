package _28_CollectionFramework._4_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Map: Key-Value şeklinde değerler tutulur. Keyler arka planda Set yapısında tutulduğu için tekrarlı olamaz ama Valuelar tekrarlı olabilir yani güncellenebilir.
 * Mesela 06-Ankara gibi ya da Pilav-50TL gibi ya da Apple-Elma gibi ya da Hakan-5354920892 gibi bir key ve ona karşılık gelen bir value ile kullanılır.
 * Map bir interface'dir ama HashMap, LinkedHashMap, TreeMap Map interface'ini implement eden bir sınıftır.
 * Her Key için mutlaka bir Value olmalıdır null'da olsa bir değer verilmek zorundadır. Key olarak null verilecekse de tekrarlı olamadığı için bir tane null değer alabilir.
 * Key ve Value aynı parametrelere sahip ikinci bir eleman ekleyemiyoruz.
 * Key aynı Value farklı eleman eklenmeye çalışıldığında yeni bir eleman olarak eklemiyor ama verilen değeri Value kısmında güncelliyor.
 * HashMap de aynı HashSet gibi elemanları sırasız olarak rastgele tutuyor.
 * 
 */

public class _1_HashMap_KarmaHarita {

	public static void main(String[] args) {

		HashMap<String, Integer> ogrenciler=new HashMap<>(); //HashMap sınıfından yeni bir nesne oluşturup içine Key olarak String , Value olarak Integer elemanlar tutan (öğrencileri ve notlarını tutan) bir HashMap referansının göstermesini sağlıyoruz
		
		//put() Metodu -> put(Key,Value): Öncekilerde add metodu genel olarak kullanılıyordu ama Map yapılarında Key ve Value eklerken put() metodunu kullanıyoruz.
		ogrenciler.put("Hakan", 98);
		ogrenciler.put("Hakan", 98); //Key ve Value aynı olan bir eleman eklemeye çalıştığımızda ikincisini eklemiyor
		ogrenciler.put("Selma", 70); 
		ogrenciler.put("Selma", 90); //Key aynı Value farklı olduğu zaman yeni eleman eklenmiyor ama verilen değeri Value kısmında güncelliyor.
		ogrenciler.put("Seda", 85);
		ogrenciler.put("Burak", 80);
		ogrenciler.put("Gökhan", 75);
		ogrenciler.put("Gökçen", 70);
		ogrenciler.put("Volkan", 65);
		ogrenciler.put("Burcu", 60);
		ogrenciler.put("Sultan", 55);
		ogrenciler.put("Gülsen", 50);
		
		System.out.println(ogrenciler);
		
		System.out.println("----------------------------------------");
		
		//containsKey() Metodu: Parantez içinde parametre olarak verilen Key değerinin Map içinde olup olmadığını kontrol ediyoruz ve geriye boolean bir değer dönüyor.
		System.out.println(ogrenciler.containsKey("Hakan")); //Map içinde verilen Key olduğu için true dönüyor.
		System.out.println(ogrenciler.containsKey("Ahmet")); //Map içinde verilen Key olmadığı için false dönüyor.
		
		System.out.println("----------------------------------------");
		
		//containsValue() Metodu: Parantez içinde parametre olarak verilen Value değerinin Map içinde olup olmadığını kontrol ediyoruz ve geriye boolean bir değer dönüyor.
		System.out.println(ogrenciler.containsValue(95)); //Map içinde verilen Value olduğu için true dönüyor.
		System.out.println(ogrenciler.containsValue(40)); //Map içinde verilen Value olmadığı için false dönüyor.
		
		System.out.println("----------------------------------------");
		
		//get() Metodu: Parantez içinde verilen Key hangi Value değerine karşılık geliyorsa onu getiriyor. Key Map içinde yoksa geriye null döner.
		System.out.println(ogrenciler.get("Hakan")); //Hakan isimli öğrencinin notu 95 olduğu için onu dönüyor.
		
		System.out.println("----------------------------------------");
		
		//keySet() Metodu: Map içindeki Key değerlerini listeleyerek döner.
		System.out.println(ogrenciler.keySet());
		
		System.out.println("----------------------------------------");
		
		//values() Metodu: Map içindeki Value değerlerini listeleyerek döner.
		System.out.println(ogrenciler.values());
		
		System.out.println("----------------------------------------");
		
		//entrySet() Metodu: Map içindeki elemanlar K,V şeklinde yani Key ve Value değerlerini listeleyerek döner.
		System.out.println(ogrenciler.entrySet());
		
		System.out.println("----------------------------------------");
		
		//replace() Metodu: Map içinde bulunan bir Key'e yeni bir Value değeri atamak için kullanılır. Zaten put() metodu kullanırken girilen Key değeri Map içinde varsa sadece Value değeri güncelleniyordu yani put() ve replace() metodu burda aynı işlevi görmüş oldu.
		ogrenciler.replace("Hakan", 99); //Burda replace() metodu yerine ogrenciler.put("Hakan", 99); kullansaydık aynı işlemi yapardı.
		
		System.out.println(ogrenciler.entrySet());
		
		//Farklı bir replace() kullanımı da parantez içine Key ve Value yazıp daha sonra atayacağımız yeni Value değerini yazıyoruz. Geriye boolean döner.
		//Eğer girdiğimiz Key girdiğimiz Value ile eşleşiyorsa yani Map içinde bu Key ve Value değeri varsa, yeni girilen değer Value olarak güncelleniyor.
		//Girdiğimiz Key ile Value Map içinde yoksa yani eşleşmezse değer ataması yapılmaz.
		ogrenciler.replace("Hakan",99, 100);
		System.out.println(ogrenciler.entrySet());
		
		System.out.println("----------------------------------------");
		
		//remove() Metodu: Map içindeki elemanı silmek için kullanılır. Parametre olarak sadece Key vererek ya da Key ve Value vererekte kullanabiliriz. Girdiğimiz değerler Map içinde varsa siliyor yoksa silmiyor null dönüyor.
		ogrenciler.remove("Sultan"); //remove(Key) diyerek Map içinden kaldırdık.
		ogrenciler.remove("Gülsen", 50); //remove(Key,Value) diyerek Map içinden kaldırdık.
		System.out.println(ogrenciler.entrySet());
		
		System.out.println("----------------------------------------");
		
		//foreach döngüsünde Key ve Value olarak ayrı ayrı yazdıralım. 
		for (Entry<String, Integer> entry  : ogrenciler.entrySet()) { //Tür olarak içine Map alan interface Entry giriyoruz ve ogrenciler.entrySet() geriye içine Entry alan bir Set döndüğü için onun içinde geziniyoruz.
			System.out.println("Öğrenci Ad: "+entry.getKey()+" \t Not: "+entry.getValue()); //entry.getKey() ve entry.getValue() diyerek Entry interface üzerinden elemanlara ulaşıp çağırabiliyoruz.
		}
		
		System.out.println("----------------------------------------");
		
		//Yukarıdaki foreach döngüsünün alternatifi olarak HashMap içindeki forEach metodunu çağırıp lambda function ile de sout içinde Key ve Value değerlerini aynı şekilde yazdırabiliriz.
		ogrenciler.forEach((k,v)->System.out.println("Öğrenci Ad: "+k+" \t Not: "+v));
		
		System.out.println("----------------------------------------");
		
		//Map içindeki öğrencilerin genel ortalamasını yani Map içindeki notların ortalamasını yazdıralım.
		int ogrencilerinNotlariToplami=0;
		int ogrenciSayisi=ogrenciler.size(); //ogrenciler.size() diyerek size() metoduyla Map içinde kaç tane öğrenci varsa onun sayısını alıyoruz.
		
		for (String ogrenciKey : ogrenciler.keySet()) { //foreach döngüsüyle ogrenciler.keySet() diyerek ogrenciler Map içindeki Key değerlerini dolaşıyoruz.
			ogrencilerinNotlariToplami+=ogrenciler.get(ogrenciKey); //ogrenciler.get(ogrenciKey) diyerek Map içindeki Key'lere karşılık gelen Value değerini yani öğrenci notlarını alıp toplam değişkenine ekliyoruz.
		}
		
		double genelNotOrtalamasi=(double) ogrencilerinNotlariToplami/ogrenciSayisi; //Notların toplamını notların sayısına bölerek Map içindeki notların ortalamasını buluyoruz ama iki integer bölündüğünde sonuç double çıkabileceği için sonucu double olarak cast ediyoruz.
		System.out.println(genelNotOrtalamasi);
		
		System.out.println("----------------------------------------");
		
		//clear() Metodu: Map içindeki tüm verileri siliyor.
		ogrenciler.clear();
		System.out.println(ogrenciler.entrySet());
		
		System.out.println("----------------------------------------");
		
		//Key olarak öğrenci adı verelim, Value olarak öğrencinin notlarını tutan integer bir dizi verelim ve her öğrencinin not ortalamasını yazdıralım.
		Map<String, int[]> ogrenciMap=new HashMap<>(); //HashMap sınıfından yeni bir nesne oluşturup içine Key olarak String, Value olarakta integer dizi elemanlar tutan (öğrencileri ve notlarını tutan) bir Map referansının göstermesini sağlıyoruz.
		
		ogrenciMap.put("Hakan", new int[] {93,95,98}); //put() metoduyla öğrencileri ve dizi içine notlarını girerek Map içine ekliyoruz.
		ogrenciMap.put("Selma", new int[] {83,87,93});
		ogrenciMap.put("Seda", new int[] {70,77,95});
		
		//keySet() metodu kullanarak öğrencinin notları ortalamasını bulalım:
		for (String ogrenciKey : ogrenciMap.keySet()) { //foreach döngüsüyle ogrenciMap.keySet() diyerek ogrenciMap içindeki Key değerlerini dolaşıyoruz.
			
			int[] ogrencininNotlari=ogrenciMap.get(ogrenciKey); //ogrenciMap.get(ogrenciKey) diyerek Map içindeki Key'lere karşılık gelen Value değerini yani öğrencinin notlarının olduğu integer diziyi döndüğü için bu diziyi int ogrencininNotlari dizisine atıyoruz.
			int notlarinToplami=0;
			int notSayisi=ogrencininNotlari.length; //ogrencininNotlari.length diyerek Map içindeki öğrencinin notlarının olduğu dizinin eleman sayısına yani öğrencinin not sayısına ulaşıyoruz.
			
			for (int not : ogrencininNotlari) { //Buradaki foreach döngüsünün içinde de ogrencininNotlari dizisini dolaşıyoruz.
				notlarinToplami+=not; //Dizi içindeki öğrencinin notlarını tek tek notlarinToplami değişkenine ekliyoruz.
			}
			
			double notOrtalamasi=(double) notlarinToplami/notSayisi; //Notların toplamını notların sayısına bölerek öğrencinin not ortalamasını buluyoruz ama iki integer bölündüğünde sonuç double çıkabileceği için sonucu double olarak cast ediyoruz.
			System.out.println(ogrenciKey+"'nın not ortalaması: "+notOrtalamasi);
		}
		
		System.out.println("----------------------------------------");
		
		//entrySet() metodu kullanarak öğrencinin notları ortalamasını bulalım:
		for (Entry<String, int[]> ogrenciEntry : ogrenciMap.entrySet()) { //Tür olarak içine Map alan interface Entry giriyoruz ve ogrenciMap.entrySet() geriye içine Entry alan bir Set döndüğü için onun içinde geziniyoruz.
			
			int[] ogrencininNotlari=ogrenciEntry.getValue(); //ogrenciEntry.getValue() diyerek Entry interface üzerinden ogrenciMap içindeki Value değerlerini yani öğrencinin notlarının olduğu integer diziyi döndüğü için bu diziyi int ogrencininNotlari dizisine atıyoruz.
			int notlarinToplami=0;
			int notSayisi=ogrencininNotlari.length; //ogrencininNotlari.length diyerek Map içindeki öğrencinin notlarının olduğu dizinin eleman sayısına yani öğrencinin not sayısına ulaşıyoruz.
			
			for (int not : ogrencininNotlari) { //Buradaki foreach döngüsünün içinde de ogrencininNotlari dizisini dolaşıyoruz.
				notlarinToplami+=not; //Dizi içindeki öğrencinin notlarını tek tek notlarinToplami değişkenine ekliyoruz.
			}
			
			double notOrtalamasi=(double) notlarinToplami/notSayisi; //Notların toplamını notların sayısına bölerek öğrencinin not ortalamasını buluyoruz ama iki integer bölündüğünde sonuç double çıkabileceği için sonucu double olarak cast ediyoruz.
			System.out.println(ogrenciEntry.getKey()+"'nın not ortalaması: "+notOrtalamasi);
		}
		
	}

}
