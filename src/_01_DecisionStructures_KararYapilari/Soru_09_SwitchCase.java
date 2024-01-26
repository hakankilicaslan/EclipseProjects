package _01_DecisionStructures_KararYapilari;

public class Soru_09_SwitchCase {

	public static void main(String[] args) {
		
		//Bir seyahat uygulaması yazıyorsunuz ve kullanıcın gideceği şehire göre bilet fiyatını hesaplamalısınız.
		//Ankara için 100tl, İstanbul için 200tl, İzmir için 150tl 
		//Diğer şehire gidecek kullanıcılara "Geçerli bir şehir giriniz" mesajı gösterilecek
		//switch-case bloğu kullanarak yazdıralım.

		String sehir="Ankara";
		
		switch (sehir) {
		case "Ankara":
			System.out.println("Ödeyeceğiniz bilet fiyatı: 100TL");
			break;
		case "İstanbul":
			System.out.println("Ödeyeceğiniz bilet fiyatı: 200TL");
			break;
		case "İzmir":
			System.out.println("Ödeyeceğiniz bilet fiyatı: 150TL");
			break;

		default:
			System.out.println("Geçerli bir şehir giriniz");
			break;
		}
 }
}
