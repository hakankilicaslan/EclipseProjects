package _01_DecisionStructures_KararYapilari;

public class Soru_03_If {

	public static void main(String[] args) {
		
		//Bir seyahat uygulaması yazıyorsunuz ve kullanıcın gideceği şehire göre bilet fiyatını hesaplamalısınız.
		//Ankara için 100tl, İstanbul için 200tl, İzmir için 150tl 
		//Diğer şehire gidecek kullanıcılara "Geçerli bir şehir giriniz" mesajı gösterilecek
		
		
		String sehir="Ankara";
						
		if(sehir.equals("Ankara"))
			System.out.println("Ödeyeceğiniz bilet fiyatı: 100TL");
		else if(sehir.equals("Istanbul"))
			System.out.println("Ödeyeceğiniz bilet fiyatı: 200TL");
		else if(sehir.equals("Izmir"))
			System.out.println("Ödeyeceğiniz bilet fiyatı: 150TL");
		else 
			System.out.println("Geçerli bir şehir giriniz");
 }
}
