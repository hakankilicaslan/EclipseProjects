package _28_CollectionFramework._4_Map;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map.Entry;

public class _3_TreeMap_AgacHarita {

	public static void main(String[] args) {

		//TreeMap, TreeSet sıralaması gibi elemanları doğal sıralamada yani sayısal ise küçükten büyüğe String ise ascii code değerlerine göre listeliyor ama comparator varsa one göre elemanları listeliyor.
		//Sıralamayı da elemanların Key değerine göre tutuyor. Keydeki değere göre A'dan Z'ye ya da küçükten büyüğe sıralıyor.
		
		TreeMap<String, Integer> treeMap=new TreeMap<>(); //TreeMap sınıfından yeni bir nesne oluşturup TreeMap sınıfının referansının onu göstermesini sağlıyoruz.
				
		treeMap.put("Hakan", 13); //Öncekilerde olduğu gibi put() metoduyla eleman ekliyoruz.
		treeMap.put("Selma", 52);
		treeMap.put("Seda", 77);
		treeMap.put("Burcu", 37);
		treeMap.put("Gökçen", 61);
		treeMap.put("Sultan", 6);
		treeMap.put("Sultan", 40); //Diğerlerindeki gibi Key aynı olan eleman eklemeye çalışırsak sadece Value kısmı güncelleniyor.
		
		System.out.println(treeMap); //Elemanları Key değerlerinin ascii code değerlerine göre sıralayıp döndü.
		
		System.out.println("----------------------------------------");
		
		//size() Metodu: Map içindeki eleman sayısını getirir.
		System.out.println(treeMap.size());
		
		System.out.println("----------------------------------------");
		
		//get() Metodu: Parantez içinde verilen Key hangi Value değerine karşılık geliyorsa onu getiriyor. Key Map içinde yoksa geriye null döner.
		System.out.println(treeMap.get("Hakan"));
		
		System.out.println("----------------------------------------");
		
		//firstKey() Metodu: Map içindeki ilk Key değerini döner.
		System.out.println(treeMap.firstKey());
		
		System.out.println("----------------------------------------");
		
		//firstEntry() Metodu: Map içindeki ilk Entry değerini yani Key ve Value değerlerini döner.
		System.out.println(treeMap.firstEntry());
		
		System.out.println("----------------------------------------");
		
		//lastKey() Metodu: Map içindeki son Key değerini döner.
		System.out.println(treeMap.lastKey());
		
		System.out.println("----------------------------------------");
		
		//lastEntry() Metodu: Map içindeki son Entry değerini yani Key ve Value değerlerini döner.
		System.out.println(treeMap.lastEntry());
		
		System.out.println("----------------------------------------");

		//Key olarak String, Value olarakta Arraylist tutan bir müşteri TreeMap oluşturalım ve Key kısmında bu müşterinin baş harfini, Value kısmında müşterinin ad soyad bilgilerini tutsun bu şekilde yazdıralım.
		
		TreeMap< String, ArrayList<String> > musteriTreeMap =new TreeMap<>(); //TreeMap sınıfından yeni bir nesne oluşturup içine Key olarak String, Value olarak ArrayList alan TreeMap sınıfının referansının onu göstermesini sağlıyoruz.
		
		//Parametrelerimizi verip musteriEkle() metodunu çağırıyoruz ve musteriTreeMap içine ilkHarf ve ad soyad eklediğimiz ArrayList'leri eklemiş oluyoruz. 
		musteriEkle(musteriTreeMap, "Hakan",  "Kılıçaslan");
		musteriEkle(musteriTreeMap, "Selma",  "Kılıçaslan");
		musteriEkle(musteriTreeMap, "Gökhan", "Kılıçaslan");
		musteriEkle(musteriTreeMap, "Gökçen", "Kılıçaslan");
		musteriEkle(musteriTreeMap, "Burcu",  "Kılıçaslan");
		musteriEkle(musteriTreeMap, "Volkan", "Kılıçaslan");
		musteriEkle(musteriTreeMap, "Seda",   "Gelişken");
		musteriEkle(musteriTreeMap, "Burak",  "Gelişken");
		
		System.out.println(musteriTreeMap); //musteriTreeMap yazdırdığımızda Key olarak ilkHarf Value olarakta ad soyad eklediğimiz ArrayList yazdırılacak.
		
		System.out.println("----------------------------------------");
		
		//foreach döngüsüyle musteriTreeMap.entrySet() içinde dolaşarak ayrı ayrı yazdırabiliriz.
		for (Entry< String, ArrayList<String> > entry : musteriTreeMap.entrySet()) {
			System.out.print(entry.getKey()+": \n"); //entry.getKey() ile Map içindeki Key değerlerini yazdırmış oluyoruz.
			for (String adSoyad : entry.getValue()) { //foreach döngüsüyle entry.getValue() diyerek ArrayList içinde dolaşmış oluyoruz ve tek tek elemanları yazdırmış oluyoruz.
				System.out.println(adSoyad);
			}
		}
		
	}
	
	//main() metot dışına bir musteriEkle() metodu oluşturup onun içinde işlemlerimizi yapıyoruz.
	public static void musteriEkle(TreeMap< String, ArrayList<String> > musteriTreeMap, String ad, String soyad) { //Bir musteriEkle metodu oluşturuyoruz. Parametre olarak bir TreeMap ad ve soyad istiyoruz
		
		String ilkHarf=ad.substring(0,1).toUpperCase(); //Parametre olarak girilen adın substring(0,1) diyerek ilk harfini alıyoruz ve toUpperCase() metoduyla büyük harfe dönüştürüyoruz.
		
		if(!musteriTreeMap.containsKey(ilkHarf)) { //if koşulunda musteriTreeMap içinde containsKey() metoduyla Key olarak ilkHarf'in olmadığı şartını koyuyoruz.
			musteriTreeMap.put(ilkHarf, new ArrayList<>()); //Eğer Map içinde Key olarak ilkHarf yoksa put() metoduyla Key olarak ilkHarf, Value olarak yeni bir ArrayList eklemiş oluyoruz.
		}
		
		//if koşulu yerine getOrDefault() metodunu kullanarak yapmak istersek Map içine put() metoduyla Key olarak yine ilkHarf veriyoruz ama Value kısmına musteriTreeMap üzerinden getOrDefault() metodunu çağırıyoruz.
		//Daha sonra parametre olarak (ilkHarf, new ArrayList<>()) veriyoruz. Burada eğer ilkHarf Map içinde varsa onun Value değerini yani içindeki değeri getir demiş oluyoruz ama ilkHarf Map içinde yoksa o zaman yeni bir Arraylist oluştur demiş oluyoruz.
		//musteriTreeMap.put(ilkHarf, musteriTreeMap.getOrDefault(ilkHarf, new ArrayList<>()));
		
		//Map içinde Key olarak ilkHarf varsa ordaki ArrayList içine, Key olarak ilkHarf yoksa yukarıdaki if şartında oluşturduğumuz ArrayList içine ad ve soyad eklemiş oluyoruz.
		musteriTreeMap.get(ilkHarf).add(ad+" "+soyad); // get() metoduna Key olan ilkHarf verilince Value değerini yani ArrayList dönüyor ve add() metoduyla ad ve soyad Arraylist içine eklenmiş oluyor.
		
	}
	
}
