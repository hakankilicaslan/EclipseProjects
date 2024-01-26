package _28_CollectionFramework._1_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_ArrayList_DiziListesi {

	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> sayiListesi1 = new ArrayList<>(10); 
		 * Parantez içine yazdığımız 10 sayısı ArrayList eleman sayısı yani size ifade etmiyor sadece başlangıç kapasitesini temsil ediyor.
		 * Başlangıç kapasitesini yazmak ya da yazmamak bir şeyi etkilemiyor. Liste oluşturulurken eklenedebilir ya da hiç belirtilmeyebilir.
		 * ArrayList başlangıç kapasitesi belirtilmese bile başlangıç kapasitesi olarak sistem 10 kabul ediyor.
		 * for döngüsü içinde 13'e kadar olan sayıları listemize ekledik ama başlangıç kapasitesini 10 belirlememize rağmen hata vermedi ekleyebildik. 
		 * Başlangıç kapasitesi yarısı kadar eleman dolduğunda kapasitesini yarısı kadar artırıyor.
		 * Başlangıç kapasitesi 10 olduğu için liste 5 tane eleman alınca kapasitesini 15'e çıkarıyor. Daha sonra 7nci elemandan sonra 22 ya da 23'e çıkarıyor.
		 * Liste içine eleman eklendikçe o anki kapasitesinin yarısı dolunca liste yarısı kadar daha genişliyor.
		 * Emin olmamakla beraber eleman sayısı sınıfın kapasitesini aştığında artırılıyor da olabilir.
		 * 
		 */
		
		ArrayList<Integer> sayiListesi1 = new ArrayList<>(10); 
		
		System.out.println(sayiListesi1.size()); //sayiListesi1.size() metodu bize dizilerdeki length() metodu gibi listemizin içindeki eleman sayısını dönüyor. 

		for (int i = 1; i <= 13; i++) { 
			sayiListesi1.add(i); //sayilar.add(i) metoduyla listemize eleman ekleyebiliyoruz.
		}
		
		System.out.println(sayiListesi1.size());
		System.out.println(sayiListesi1); //ArrayList yazdırırken foreach ile de yazdırabiliriz direktte yazdırabiliriz.
		
		System.out.println("----------------------------------------");
		
		Integer[] sayiDizisi = {12,2,17,5}; //Dizimizi ArrayList'e çevireceğimiz için int değil Integer tanımladık.

		//asList Metodu: Bir diziyi ArrayList'e çevirmek aktarmak için kullanılır. Arrays.asList(sayiDizisi) derken parantez içine attığımız değerleri bir liste olarak bize dönüyor.
		ArrayList<Integer> sayiListesi2 = new ArrayList<>(Arrays.asList(sayiDizisi));
		System.out.println(sayiListesi2); 
		
		System.out.println("----------------------------------------");

		//Bir ArrayList oluştururken parantez içine başka bir ArrayList tanımlarsak onun kopyasını oluşturmuş oluruz yani ordaki elemanların aynısını kendisine kopyalar.
		ArrayList<Integer> sayiListesiKopya = new ArrayList<>(sayiListesi1);
		System.out.println(sayiListesiKopya);

		System.out.println("----------------------------------------");
		
		//addAll() Metodu: Bir ArrayList içindeki tüm elemanları diğer ArrayList içine tek seferde eklemeye yarar. 
		ArrayList<Integer> sayilar = new ArrayList<>();
		sayilar.add(93);
		sayilar.addAll(sayiListesi2); //sayiListesi2 içindeki tüm elemanları sayilar listemizin içine ekledik.
		System.out.println(sayilar);
		
		System.out.println("----------------------------------------");

		//size() Metodu: ArrayList içindeki eleman sayısını getirir.
		System.out.println(sayilar.size());
		
		System.out.println("----------------------------------------");

		//get() Metodu: ArrayList içindeki elemana erişmek için kullanılır. Parantez içine girilen indexteki elemanı getirir. get(index)
		System.out.println(sayilar.get(1)); //1 nolu indexteki yani dizinin ikinci elemanını yazdırır.
		
		System.out.println("----------------------------------------");

		//set() Metodu: ArrayList içinde belirli bir indexe değer atamak için kullanılır. Parantez içine önce değiştireceğimiz indexi yazıyoruz daha sonra o indexe hangi elemanı atayacaksak onu yazıyoruz. set(index, atanacak değer)
		sayilar.set(0, 10);
		sayilar.set(0, 13); //0 indexine önce 10 daha sonra 13 set ediyoruz. Son set edilen sayı o indexe atanıyor. Direkt index üzerinde işlem yaptığı için onu değiştiriyor. İlk önce verdiğimizi ekleyip tekrar oraya atayınca yana kaydırma işlemi yapmıyor.
		System.out.println(sayilar.get(0));
		System.out.println(sayilar);

		System.out.println("----------------------------------------");
		
		//remove() Metodu: ArrayList içinde belirli bir indexteki değeri silmemizi kaldırmamızı sağlar. remove(index)
		sayilar.remove(0); //0 indexindeki elemanı yani ilk elemanı siliyor.
		System.out.println(sayilar);
		sayilar.remove(0); //Artık ilk eleman 12 olduğu için onu siliyor.
		System.out.println(sayilar);
		sayilar.remove(0); //Artık ilk eleman 2 olduğu için onu siliyot
		System.out.println(sayilar);
		sayilar.remove(sayilar.size() - 1); //sayilar.size()-1 yazarsakta ArrayList içindeki son elemanı siliyoruz.
		System.out.println(sayilar);
		
		System.out.println("----------------------------------------");
		
		//clear() Metodu: ArrayList içindeki tüm elemanları tek seferde silmemize yarar. ArrayList'i tamamen boşaltır.
		sayilar.clear();
		System.out.println(sayilar);

		System.out.println("----------------------------------------");
		
		//isEmpty() Metodu: ArrayList boş mu değil mi onu kontrol etmemizi sağlar. Boş ise true değilse false döner.
		sayilar.isEmpty();
		System.out.println(sayilar.isEmpty());
		sayilar.add(13);
		System.out.println(sayilar.isEmpty());
		
		System.out.println("----------------------------------------");
		
		//indexOf() Metodu: Aradığımız elemanın listedeki indexini geri döner. O elemandan birden fazla varsa ilk gördüğü elemanın indexini döner. Eğer yoksa -1 döner. indexOf(ArananEleman)
		sayilar.addAll(sayiListesi2);
		sayilar.addAll(sayiListesi2); //sayiListesi2 listemizi iki kere sayilar listemize eklemiş olduk.
		System.out.println(sayilar);
		System.out.println(sayilar.indexOf(12)); //ArrayList içinde iki tane 12 sayısı var ama daha öndeki indexte olanın indexini döndü.
		System.out.println(sayilar.indexOf(26)); //ArrayList içinde 26 sayısı olmadığı için -1 dönüyor.
		
		System.out.println("----------------------------------------");
		
		//lastIndexOf Metodu: Aradığımız elemanın en son bulunduğu indexini geri döner yani sondan başa doğru ilk denk geldiğinin indexini döner.
		System.out.println(sayilar.lastIndexOf(12));
		System.out.println(sayilar.lastIndexOf(5));
		
		System.out.println("----------------------------------------");
		
		//subList() Metodu: ArrayList içinden belirli bir aralıktaki elemanları almak için kullanılır. sublist(başlangıçIndex,bitişIndex) -> başlangıç indexi dahil ama bitiş indexi dahil değil
		List<Integer> altListe = new ArrayList<Integer>();
		altListe = sayilar.subList(2, 5); //2nci index dahil 5nci index dahil değil yani 2, 3 ve 4 indexindeki elemanları alıyor.
		System.out.println(altListe);

		System.out.println("----------------------------------------");
		
		//toArray() Metodu: Bir ArrayList'i Array'e yani diziye çevirmek için kullanılır. İki yolu var.
		Object[] sayiDizisi2 = new Integer[sayilar.size()]; //Dizi tanımlarken boyutunu girmek zorunda olduğumuz için sayilar listemizin eleman sayısını sayilar.size() ile dizimizin boyutunu tanımlıyoruz.
		sayiDizisi2 = sayilar.toArray(); // Buradaki toArray() kullanımında Object döndüğü için dizimi Object tipinde tanımladık.
		System.out.println(Arrays.toString(sayiDizisi2));

		Integer[] sayiDizisi3 = new Integer[sayilar.size()];
		sayilar.toArray(sayiDizisi3); //Buradaki toArray() kullanımında aktarılacak dizinin adını yazarak listeyi o diziye aktarmış oluyoruz.
		System.out.println(Arrays.toString(sayiDizisi3));
		
		System.out.println("----------------------------------------");
		
		//Lambda Expr. ile forEach kullanımı: Arrow function kullanarak sayilar listemizin içindeki sayıları 2 ile çarpıp yazdırıyoruz.
		sayilar.forEach((sayi) -> {
			sayi *= 2;
			System.out.print(sayi + " ");
		});
		
	}
	
}
