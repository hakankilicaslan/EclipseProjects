package _28_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OgrenciMain {

	public static void main(String[] args) {

		List<Ogrenci> ogrenciList=new ArrayList<>();//Bir ArrayList nesnesi oluşturuyoruz ve List referansının bunu işaret etmesini sağlıyoruz. Daha sonra Ogrenci sınıfından yeni nesneler oluşturarak add() metoduyla listemize ekliyoruz.
		ogrenciList.add(new Ogrenci("Hakan",30,99.99));
		ogrenciList.add(new Ogrenci("Selma",30,85.4));
		ogrenciList.add(new Ogrenci("Gökhan",36,80.8));
		ogrenciList.add(new Ogrenci("Gökçen",32,75.5));
		ogrenciList.add(new Ogrenci("Volkan",38,84.8));
		ogrenciList.add(new Ogrenci("Burcu",38,77.5));
		ogrenciList.add(new Ogrenci("Seda",28,72.12));
		ogrenciList.add(new Ogrenci("Burak",27,79.55));
		ogrenciList.add(new Ogrenci("Sultan",22,66.6));
		
		Collections.sort(ogrenciList); //Ogrenci sınıfında Comparable Interfaceden implement edip compareTo metodunu override ettiğimiz için metot içine hangi koşulu verdiysek sort() metodu ona göre sıralama yapacak.

		for (Ogrenci ogrenci : ogrenciList) {
			System.out.println(ogrenci);
		}
		
		System.out.println("----------------------------------------");
		
		//Yukarıdaki durumda sort() metodu kullandığımızda Ogrenci sınıfı içine override edilen compareTo metoduna hangi koşul verildiyse sadece ona göre sıralama yapabiliyoruz ama başka bir şart sunamıyoruz.
		//Bunun önüne geçmek için ikinci bir kullanım olan sort() metodu içinde Comparator ve sıralanacak listeyi vererekte Comparatordeki şarta göre sıralamasını yaptırabiliriz.
		
		Comparator<Integer> sayisalComparator = new Comparator<>() { //Comparator Interface için Anonymous Inner Type kullanarak içindeki compare() metodunu override ediyoruz ve istediğimiz koşula göre sıralama yaptırabiliyoruz.
			@Override
			public int compare(Integer o1, Integer o2) { //sayisalComparator verilen Integer değerlerin için öncekinden sonrakini çıkararak yine aradaki farka göre negatifse küçük, pozitifse büyük, eşitse 0 dönecek ve sıralayacak.
				return o1 - o2;
			}
		};

		ArrayList<Integer> sayilarlistesi = new ArrayList<>(); //Integer değerler tutan bir ArrayList oluşturuyoruz.
		sayilarlistesi.add(12);
		sayilarlistesi.add(2);
		sayilarlistesi.add(17);
		sayilarlistesi.add(5);
		sayilarlistesi.add(93);

		Collections.sort(sayilarlistesi, sayisalComparator); //sort() metodunun ikinci yolu ile önce sıralamak istediğimiz listeyi yazıyoruz. Daha sonra içindeki koşula göre sıralayacak Comparator'u yazıyoruz.

		for (Integer item : sayilarlistesi) {
			System.out.println(item);
		}
		
		System.out.println("----------------------------------------");
		
		Comparator<Ogrenci> ogrenciAdComparator = new Comparator<>() { //ogrenciAdComparator ile ogrenciList içindeki elemanları isimlerine göre yani ascii code değerlerine göre küçükten büyüğe doğru sıralıyoruz.
			@Override
			public int compare(Ogrenci o1, Ogrenci o2) {
				return o1.getAd().compareTo(o2.getAd());
			}
		};
		
		Collections.sort(ogrenciList,ogrenciAdComparator); 
		
		for (Ogrenci ogrenci : ogrenciList) {
			System.out.println(ogrenci);
		}
		
		System.out.println("----------------------------------------");
		
		Comparator<Ogrenci> ogrenciYasComparator = new Comparator<>() { //ogrenciYasComparator ile ogrenciList içindeki elemanları yaşlarına göre küçükten büyüğe doğru sıralıyoruz.
			@Override
			public int compare(Ogrenci o1, Ogrenci o2) {
				return o1.getYas()-o2.getYas();
			}
		};
		
		Collections.sort(ogrenciList,ogrenciYasComparator); 
		
		for (Ogrenci ogrenci : ogrenciList) {
			System.out.println(ogrenci);
		}
		
		System.out.println("----------------------------------------");
		
		Comparator<Ogrenci> ogrenciYasEsitseOrtComparator = new Comparator<>() { //ogrenciYasEsitseOrtComparator ile ogrenciList içindeki elemanları yaşlarına göre sıralıyoruz ve yaşları aynı olanlarında ortalamasına göre sıralamasını yaptırıyoruz.
			@Override
			public int compare(Ogrenci o1, Ogrenci o2) {
				int sonuc = o1.getYas() - o2.getYas(); //Önce yaşlara göre bir sıralama yapılması için yaşları farkını alıyoruz ve sonuc değişkenine atıyoruz.
				if (sonuc == 0) {
					sonuc = (int) (o1.getOrt() - o2.getOrt()); //Daha sonra sonuc değişkenini if içinde 0'a eşit olduğu koşulunda ortalamaların farkını alıyoruz ve yaşları aynı olanları da ortalamaya göre sıralamasını sağlıyoruz.
				}return sonuc;
			}
		};
		
		Collections.sort(ogrenciList, ogrenciYasEsitseOrtComparator);
		
		for (Ogrenci item : ogrenciList) {
			System.out.println(item);
		}
		
		System.out.println("----------------------------------------");
		
		//LAMBDA VERSİYONU: new Comparator<>() yerine ()-> kullanıyoruz eğer parametre alıyorsa parantez için yazıyoruz. (o1, o2) parametreleri girince artık kendisi süslü parantez içindeki işlemleri yapıyor.
		Comparator<Ogrenci> ogrenciYasEsitseOrtComparatorLambda = (o1, o2) -> { //ogrenciYasEsitseOrtComparatorLambda ile ogrenciList içindeki elemanları yaşlarına göre sıralıyoruz ve yaşları aynı olanlarında önce ortalaması büyük olan sonra küçük olana doğru sıralamasını yaptırıyoruz.
			int sonuc = o1.getYas() - o2.getYas(); //Önce yaşlara göre bir sıralama yapılması için yaşları farkını alıyoruz ve sonuc değişkenine atıyoruz.
			if (sonuc == 0) {
				sonuc = (int) (o2.getOrt() - o1.getOrt()); //Daha sonra sonuc değişkenini if içinde 0'a eşit olduğu koşulunda ortalamaların farkını alıyoruz ve yaşları aynı olanları da ortalamaya göre sıralamasını sağlıyoruz.
			}return sonuc;
		};

		Collections.sort(ogrenciList, ogrenciYasEsitseOrtComparatorLambda);
		
		for (Ogrenci item : ogrenciList) {
			System.out.println(item);
		}
		
		System.out.println("----------------------------------------");
		
		Comparator<Ogrenci> ogrenciAdUzunlukComparator = new Comparator<Ogrenci>() {
			
			@Override
			public int compare(Ogrenci o1, Ogrenci o2) {
				return o2.getAd().length()-o1.getAd().length();
			}
		};

		Collections.sort(ogrenciList, ogrenciAdUzunlukComparator);
		
		for (Ogrenci item : ogrenciList) {
			System.out.println(item);
		}
		
	}
	
}
