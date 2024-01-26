package _28_CollectionFramework._2_Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class _3_Deque_IkıUcluKuyruk {
	
	public static void main(String[] args) {

		//Deque(Double Ended Queue) -> İki Uçlu Kuyruk -> Deque bir interface ve Queue interface'inden miras alıyor.
		//Hem baştan hem sondan ekleme/çıkarma yapılabilir. FIFO, LIFO ikisini de kullanabiliyoruz. İkisininde metotlarını kullanabiliyoruz.
		//Aşağıdaki örnekte push() ile başa ekleyip pop() ile baştan çıkarıyoruz Queue gibi ->  FIFO
		//offerLast() ile sona ekleyip removeLast() diyerek sondan da çıkarabiliriz. Stack gibi -> LIFO
		
		Deque<String> deque=new LinkedList<String>(); //LinkedList nesnesi oluşturup Deque interface'inin referansının onu göstermesini sağladık.
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.println("İşlem seçiniz:");
			System.out.println("1-Bilet al");
			System.out.println("2-Bilet ver");
			System.out.println("3-Deque listele");
			System.out.println("4-Çıkış");

			int secim = sc.nextInt();sc.nextLine(); //Kullanıcı hem int hem String ifadeler gireceği için nextInt() ile nextLine() beraber kullanıyoruz. Sadece birini girersek diğer türden bir şey girdiğimizde sistem hata veriyor.
			
			switch (secim) {
			case 1:
				System.out.println("Adınız:");
				deque.push(sc.nextLine()); //Kullanıcı Bilet al seçtiği zaman adını istiyoruz ve girilen ad değerini push() metoduyla kuyruğun başına ekliyoruz.
				System.out.println("Kuyruğa eklendi.");
				break;
			case 2:
				if(deque.isEmpty()) { //Bilet ver seçeneğini seçtiğinde isEmpty() metodunu kullanıyoruz ve kuyrukta kimse yoksa çıktı veriyoruz.
					System.out.println("Kuyrukta kimse yok!");
				}else
					System.out.println(deque.pop() + " kişisi bilet aldı."); //else durumunda kuyrukta birileri olduğu için pop() metoduyla ilk sıradaki kişiyi bilet almış gibi kuyruktan çıkarıyoruz.
				break;
			case 3:
				System.out.println("Kuyruk: "+deque);
				break;
			case 4:
				System.exit(0); //System.exit(0) diyerekte çıkış yapıyoruz.
				sc.close();
				break;
			default:
				System.out.println("Lütfen 1-4 arası seçim yapınız.");
				break;
			}
			
		}
		
	}
	
	/*
	 * ArrayList     -> Arama yapmada ve listelemede hızlıdır. Kullanılabilir ama eleman silme, ekleme işlemlerinde yavaştır.
	 * LinkedList    -> Eleman ekleme silme gibi işlemlerde hızlıdır. Elemanlara erişmek için O(n) zaman karmaşıklığına sahiptir.
	 * Queue         -> FIFO, İşlem sırası önemliyse kullanılabilir.
	 * PriorityQueue -> Öncelikli kuyruk. Elemanlar değere göre sıralanıyor. Arama işlemleri O(n) karmaşıklıkta olur.
	 * Stack         -> LIFO, İşlem yığını uygulaması için kullanılabilir. Arama işlemleri O(n) karmaşıklıkta olur.
	 * 
	 * Sort: Sıralama demekti. Bir çok sıralama algoritması bulunuyor.
	 * Big O Notasyonu.
	 * n=8
	 * O(1) - O(n) - O(n log n) - O(n^2) - O(n!)  
	 *  1   -  8   -  8*3       -  8*8   -  8!   
	 *  1   -  8   -  24        -  64    -       
	 *  En hızlıdan algoritmadan en yavaş algoritmaya doğru
	 *  
	 *  O(n!) > O(2^n) > O(n^3) > O(n^2) > O(n log n) > O(n) > O(log n) > O(1) Büyükten küçüğe sıralama
	 *  
	 *  log n -> Örnek log 8=3 tür. n sayısının 2'nin kaçıncı kuvveti olduğunu bulur.
	 *  Logaritma fonksiyonu, özellikle veri boyutu büyüdükçe hesaplama sürelerinin arttığı durumlarda kullanılır.
	 *  
	 *  İçinde for döngüsü olan bir metot ya da sınıf verilen değer kadar ya da eleman sayısı kadar dönüyor diyelim.
	 *  O zaman döngünün toplam zaman karmaşıklığı O(n) olacaktır. n -> döngüye giren eleman sayısı
	 *  İki tane for döngüsü iç içe olduğunda zaman karmaşıklığı O(n^2) olacaktır.
	 *  Her zaman en karmaşık neresiyse oranın karmaşıklık durumu baz alınır daha düşük olanlara bakılmaz
	 *  
	 */

}
