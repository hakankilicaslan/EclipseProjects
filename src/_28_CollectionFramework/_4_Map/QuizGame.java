package _28_CollectionFramework._4_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int dogruCevapSayisi=0;

		Map<String, String> quizGame =new HashMap<>(); //HashMap sınıfından yeni bir nesne oluşturup içine Key ve Value olarak elemanlar tutan bir Map referansının göstermesini sağlıyoruz. Key kısmına sorularımızı Value kısmına da bu soruların cevaplarını ekliyoruz. 
		
		//put() metoduyla Map içine sorularımızı ve cevaplarını ekliyoruz.
		quizGame.put("Türkiye Cumhuriyeti'nin ilk cumhurbaşkanı kimdir?", "Atatürk");
		quizGame.put("TBMM'nin kuruluş tarihi nedir?", "23 Nisan 1920");
		quizGame.put("Türkiye Cumhuriyeti'nin kuruluş tarihi nedir?", "29 Ekim 1923");
		quizGame.put("Osmanlı hilafeti TBMM tarafından hangi tarihte feshedilmiştir?", "3 Mart 1924");
		quizGame.put("Mustafa Kemal Atatürk'ün ölüm tarihi nedir?", "10 Kasım 1938");
		quizGame.put("Hatay Türkiye Cumhuriyeti'ne hangi tarihte katılmıştır?", "7 Temmuz 1939");
		
		System.out.println("*****Quiz Game Oyuna Hoşgeldiniz*****");
		
		for (Entry<String, String> entry : quizGame.entrySet()) { //Tür olarak içine Map alan interface Entry giriyoruz ve quizGame.entrySet() geriye içine Entry alan bir Set döndüğü için onun içinde geziniyoruz.
			
			System.out.println(entry.getKey()); //entry.getKey() ile kullanıcıya Map içindeki Key değerini yani sorumuzu gönderiyoruz.
		
			String oyuncuCevap=sc.nextLine(); //sc.nextLine() ile kullanıcının yazdığı cevabı oyuncuCevap değişkenine atıyoruz.
			
			if(oyuncuCevap.equalsIgnoreCase(entry.getValue())) { //if koşulunda oyuncunun verdiği cevabın sorunun cevabına yani entry.getValue()'ye eşit olup olmadığı koşulu sorguluyoruz. equalsIgnoreCase() metoduyla da kullanıcının büyük küçük harf girip girmediği durumu önemsememiş oluyoruz.
				System.out.println("Tebrikler doğru cevap verdiniz.");
				System.out.println("Yeni soruyu görmek istiyorsanız Enter'a basın.");
				sc.nextLine(); //Doğru cevap verdikten sonra döngüye devam edebilmesi için yani diğer soruyu görebilmesi için kullanıcı Enter tuşuna bassın diye sc.nextLine() kullanıyoruz.
				dogruCevapSayisi++; //Kullanıcı doğru cevap verdiyse dogruCevapSayisi'nı bir artırıyoruz.
			}else {
				System.out.println("Üzgünüz yanlış cevap verdiniz.");
				System.out.println("Yeni soruyu görmek istiyorsanız Enter'a basın.");
				sc.nextLine(); //Yanlış cevap verdikten sonra döngüye devam edebilmesi için yani diğer soruyu görebilmesi için kullanıcı Enter tuşuna bassın diye sc.nextLine() kullanıyoruz.
			}
			
		}
		
		System.out.println("Oyun bitti. Toplam doğru cevap: " +dogruCevapSayisi);
		
		sc.close();
	
	}

}
