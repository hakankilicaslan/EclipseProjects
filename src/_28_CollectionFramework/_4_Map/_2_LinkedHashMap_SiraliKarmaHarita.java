package _28_CollectionFramework._4_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 * HashMap özelliklerini kullanır. Artı olarak ekleme sırasına göre listeler.
 * Linked List yapısını kullanır. ÖncekiDeğer <- Değer -> SonrakiDeğer
 * Linked HashMap: Önceki <- Key, Value -> Sonraki (çift bağlı liste yapısı kullanılır)
 * Ekleme sırası önemliyse bu yapı kullanılabilir.
 * 
 */
public class _2_LinkedHashMap_SiraliKarmaHarita {

	public static void main(String[] args) {

		HashMap<String, String> renklerHashMap=new HashMap<>(); //HashMap sınıfından yeni bir nesne oluşturup içine Key ve Value olarak String elemanlar tutan bir HashMap referansının göstermesini sağlıyoruz.
		
		//Red Green Blue (RGB) ->       R G B
		renklerHashMap.put("Kırmızı", "#FF0000");
		renklerHashMap.put("Yeşil",   "#00FF00");
		renklerHashMap.put("Mavi",    "#0000FF");
		renklerHashMap.put("Sarı",    "#FFFF00");
		
		System.out.println(renklerHashMap); //HashMap elemanları rastgele listeliyor.
		
		LinkedHashMap<String, String> renklerLinkedHashMap=new LinkedHashMap<>(); //LinkedHashMap sınıfından yeni bir nesne oluşturup içine Key ve Value olarak String elemanlar tutan bir LinkedHashMap referansının göstermesini sağlıyoruz
		
		//Red Green Blue (RGB) ->             R G B
		renklerLinkedHashMap.put("Kırmızı", "#FF0000");
		renklerLinkedHashMap.put("Yeşil",   "#00FF00");
		renklerLinkedHashMap.put("Mavi",    "#0000FF");
		renklerLinkedHashMap.put("Sarı",    "#FFFF00");
		
		System.out.println(renklerLinkedHashMap); //LinkedHashMap elemanları ekleme sıramıza göre listeliyor.
	
	}

}
