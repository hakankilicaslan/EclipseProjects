package _28_CollectionFramework._4_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class RastgeleSayiSayaci {

	public static void main(String[] args) {
		
		//1 ile 100 arasında 1000 tane rastgele sayılar oluşturalım. Bu sayılardan kaç tane üretildiği bilgisiyle beraber Map yapısında tutalım.
		//Key kısmında üretilen sayı, Value kısmında o sayıdan kaç tane üretildiği bilgisi tutulacak şekilde yazdıralım.
		//Daha sonra sayıları en çok üretilenden en az üretilene doğru sıralayalım.
		
		//Rastgele sayı oluşturma kısmı: 
		Map<Integer, Integer> rastgeleSayilar=new HashMap<>(); //HashMap sınıfından nesne oluşturup içine Key ve Value olarak Integer değerler alan bir Map interface'inin referansına atıyoruz. 
		
		Random rnd=new Random(); //Rastgele sayı üretmek için Random sınıfından bir nesne oluşturup Random sınıfının referansına atıyoruz.
		
		for (int i = 0; i < 1000; i++) { //1000 tane sayı üreteceği için 1000'e kadar dönen bir for döngüsü oluşturuyoruz. 
			int sayi=rnd.nextInt(1,101); //Random sınıfının referansı üzerinden nextInt() metodunu çağırıyoruz ve içine 1 ile 100 arasında sayı üretmesi için nextInt(1,101) yazıyoruz ve üretilen sayıyı sayi değişkenine atıyoruz.
			
			//Üretilen sayının rastgeleSayilar Map içinde Key kısmında olup olmadığını kontrol etmek için containsKey() metodunu kullanıyoruz.
			//Eğer sayi rastgeleSayilar içinde varsa put() metoduyla Key kısmına sayi, Value kısmına da rastgeleSayilar.get(sayi) diyerek Key olan sayi'nin karşılığı olan Value değerini çağırmış oluyoruz.
			//Daha sonra eski Value değerinin üzerine bir tane daha ekliyoruz yani Key olan sayi'nin Value değerini put() metodu ile güncellemiş oluyoruz.
			//Bu şekilde döngüden çıkınca o sayıdan kaç tane üretildiyse Value kısmında üretilme sayısını tutmuş oluyoruz.
			//else durumunda yani sayi daha önceden Map içine eklenmediyse rastgeleSayilar.put(sayi,1) diyerek ilk defa üretildiği için Value kısmına 1 atıyoruz.
			if(rastgeleSayilar.containsKey(sayi))
				rastgeleSayilar.put(sayi, rastgeleSayilar.get(sayi)+1); 
			else
				rastgeleSayilar.put(sayi, 1);
			
			//Yukarıdaki if-else koşulunun alternatifi olarak getOrDefault() metodunu kullanabiliriz.
			//getOrDefault() Metodu: put() metoduna Key kısmına yine sayımızı giriyoruz, Value kısmına rastgeleSayilar üzerinden çağırdığımız getOrDefault() metodunu giriyoruz.
			//Metodun içine getOrDefault(sayi, 0) diyerek sayi Map içinde varsa onun Value değerini dön yoksa 0 dön demiş oluyoruz.
			//Sonuna +1 ekleyerekte Map içinde sayi yoksa 0 dönüyor ve 1 eklemiş oluyoruz ama sayi daha önce Map'te varsa olduğu değeri dönüyor ve üstüne 1 eklemiş oluyoruz. Bu şekilde üstteki if-else koşulunu tek satırda yapmış oluyoruz.
			//rastgeleSayilar.put(sayi, rastgeleSayilar.getOrDefault(sayi, 0)+1);
			
		}
		
		System.out.println(rastgeleSayilar.entrySet()); //rastgeleSayilar Map üretilen sayı ve üretilen sayı adedini tuttuğu için o bilgileri yazdırıyoruz.
		 
		System.out.println("----------------------------------------");
		
		//Oluşturulan sayıları üretilme adedine göre en çok üretilenden en az üretilene sıralama kısmı:
		//Collections.sort() metodu içine parametre olarak sadece List alabiliyordu. Bundan dolayı rastgeleSayilar Map'i bir List'e dönüştürmeliyiz.
		//Yeni bir ArrayList nesnesi oluşturuyoruz ve parametre olarak rastgeleSayilar.entrySet() yani Map'in Key ve Value değerlerini gönderiyoruz.
		//rastgeleSayilar.entrySet() geriye bir entry döndüğü için List'e tür olarak içine Map alan interface Entry tanımlıyoruz.
		//Artık rastgeleSayilar Map'imiz bir List olan siraliSayiList'e dönüşmüş yani aktarılmış oldu.
		List< Entry<Integer, Integer> > siraliSayiList=new ArrayList<>(rastgeleSayilar.entrySet());
		 
		Comparator< Entry<Integer, Integer> > siralamaComparator=new Comparator< Entry<Integer,Integer> >() { //Comparator Interface için Anonymous Inner Type kullanarak içindeki compare() metodunu override ediyoruz ve istediğimiz koşula göre sıralama yaptırıyoruz ve siralamaComparator referansına atıyoruz.
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue()-o1.getValue(); //siralamaComparator verilen Entry değerleri için sonrakinin Value değerinden öncekinin Value değerini çıkarıyoruz ve üretilme sayılarına göre çok üretilenden az üretilene göre sıralamış oluyoruz.
			}
		};
		
		Collections.sort(siraliSayiList, siralamaComparator); //sort() metodu içine sıralanacak List ve sıralayacak Comparator yazarak siraliSayiList içindeki elemanları siralamaComparator içindeki şarta göre sıralamış oluyor.
		
		System.out.println(siraliSayiList);
	
		System.out.println("----------------------------------------");
		
		//foreach döngüsü kullanarak Key ve Value değerlerini ayrı ayrı da yazdırabiliriz.
		for(Entry<Integer, Integer> entry : siraliSayiList) {
			System.out.println(entry.getKey()+" sayısı "+entry.getValue()+" kere üretilmiştir.");
		}
		
	}

}
