package _06_Arrays_Diziler;

import java.util.Arrays;

public class _10_DiziMetotlari {

	public static void main(String[] args) {
	
		//DİZİ METOTLARI
	
		
		//.sort() METOTU -> Dizi içindeki elemanları küçükten büyüğe sıralamamızı sağlar
		int[] sayilar1= {1,5,3,7,9,7};
		//int siraliDizi=Arrays.sort(sayilar);  //.sort() void bir metod olduğu için geriye değer dönmez.
		Arrays.sort(sayilar1);
		System.out.println(Arrays.toString(sayilar1));
		
		String[] iller= {"Ankara", "antalya", "İstanbul", "İzmir", "Zonguldak", "Eskişehir"};
		Arrays.sort(iller);
		System.out.println(Arrays.toString(iller)); //Büyük küçük harfi ve Türkçe karakteri önemsemiyor. Ascii code'a göre sıralama yapıyor.
		
		
		System.out.println("**************************");
		
		
		//.binarySearch() METOTU -> Dizide belirli bir elemanın var olup olmadığını kontrol eder. Eğer eleman varsa bu elemanın dizideki indexini verir.
		int[] sayilar2= {1,5,9,3,9,7};
		int index=Arrays.binarySearch(sayilar2,9);
		System.out.println(index); //İlk denk geldiği 9 2 numaralı indexte olduğu için 2 sayısını döner. 
		
		
		System.out.println("**************************");
		
		
		//.equals() METOTU -> İki dizinin birbirine eşit olup olmadığını kontrol eder. Geriye boolean bir değer döner yani eşitse true değilse false döner.
		int[] dizi1= {1,2,3};
		int[] dizi2= {1,2,3};
		int[] dizi3= {2,1,3};
		boolean esitMi1=Arrays.equals(dizi1,dizi2);
		System.out.println(esitMi1); //Dizilerin elemanları birbirini tutuyor yani eşit olduğu için true döner.
		boolean esitMi2=Arrays.equals(dizi1,dizi3);
		System.out.println(esitMi2); //Dizilerin elemanları aynı ama sırası birbirini tutmuyor yani eşit olmadığı olduğu için false döner.
		
		
		System.out.println("**************************");
		
		
		//.fill() METOTU -> Dizinin tüm elemanlarını belirlediğimiz değerle doldurur.
		int[] dizi4= {1,2,3};
		int[] dizi5=new int[10];
		Arrays.fill(dizi4,5); //dizi4 ün içindeki tüm elemanları 5 yapıyor.
		Arrays.fill(dizi5,1); //dizi5 in içindeki tüm elemanları 1 yapıyor.
		System.out.println(Arrays.toString(dizi4));
		System.out.println(Arrays.toString(dizi5));
		
		
		System.out.println("**************************");
		
		
		//.toString() METOTU -> Dizinin tüm elemanlarını bir String olarak döndürür. Genelde dizinin elemanlarını yazdırmak için kullanılır.
		int[] dizi6= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(dizi6));
		
		
		System.out.println("**************************");
		
		
		//.copyOf() METOTU -> Dizinin belirli bir bölümünü kopyalar ve yeni bir dizi oluşturur.
		int[] dizi7= {4,5,6,0};
		int[] dizi8=Arrays.copyOf(dizi7,2); //dizi7'den 2 eleman kopyala ve dizi8'e yapıştır demiş olduk. Elemanları soldan yani ilk elemandan başlayarak kopyalıyor.
		System.out.println(Arrays.toString(dizi8));
		int[] dizi9=Arrays.copyOfRange(dizi7,1,4); //En baştan kopyalamasını istemediğimiz durumlarda copyOfRange kullanarak belirttiğimiz index aralığını kopyalamaya yarıyor.
		System.out.println(Arrays.toString(dizi9));//dizi7'den 1 numaralı indexten 4 numaralı indexe kadar kopyalamış olduk ama 4 numaralı index dahil değil.

		
		System.out.println("**************************");
		
		
		//.asList() METOTU -> Bir dizi içindeki elemanları bir liste olarak döndürür. İlerde işleyeceğiz.
		
		//.stream METOTU -> Dizideki elemanları bir stream nesne olarak döndürür ve dizi üzerinde çeşitli işlemler gerçekleştirmemizi sağlar.
		int[] dizi10= {4,5,6,0,7,8,9};
		int toplam=Arrays.stream(dizi10).sum(); //Dizi içerisindeki elemanların toplamını bulmamızı sağlar.
		double ortalama=Arrays.stream(dizi10).average().getAsDouble(); //Dizi içerisindeki elemanların ortalamasını bulmamızı sağlar.
		System.out.println("Dizi elemanlarının toplamı: "+toplam);
		System.out.println("Dizi elemanlarının ortalaması: "+ortalama);
		
		
		System.out.println("**************************");
		
		
		//.deepToString -> Çok boyutlu dizilerin tüm elemanlarını tek seferde yazdırmamızı sağlar.
		int[][] dizi11= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(Arrays.deepToString(dizi11));
	}
}
