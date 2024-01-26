package _28_CollectionFramework._2_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1_Queue_Kuyruk {

	public static void main(String[] args) {
		
		//Queue(Kuyruk) -> FIFO: First In First Out -> ilk giren ilk çıkar. Stack mantığının tersi gibi 
		//Queue kendi içindeki metotlar -> add ve offer ekleme, remove ve poll ilk elemanı siliyor, element ve peek ilk elemanı gösteriyor.
		
		Queue<String> kuyruk=new LinkedList<>(); //LinkedList nesnesi oluşturup Queue interface'inin referansının onu göstermesini sağladık.
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("İşlem seçiniz:");
			System.out.println("1-Bilet al");
			System.out.println("2-Bilet ver");
			System.out.println("3-Kuyruk listele");
			System.out.println("4-Çıkış");
			
			int secim=sc.nextInt();sc.nextLine(); //Kullanıcı hem int hem String ifadeler gireceği için nextInt() ile nextLine() beraber kullanıyoruz. Sadece birini girersek diğer türden bir şey girdiğimizde sistem hata veriyor.
			
			switch (secim) {
			case 1:
				System.out.println("Adınız:");
				kuyruk.offer(sc.nextLine()); //Kullanıcı Bilet Al seçtiği zaman adını istiyoruz ve girilen ad değerini offer() metoduyla kuyruk içine ekliyoruz.
				System.out.println("Kuyruğa eklendi.");
				break;
			case 2:
				if(kuyruk.isEmpty()) { //Bilet Ver seçeneğini seçtiğinde isEmpty() metodunu kullanıyoruz ve kuyrukta kimse yoksa çıktı veriyoruz.
					System.out.println("Kuyrukta kimse yok!");
				}else
					System.out.println(kuyruk.poll()+" kişisi bilet aldı."); //else durumunda kuyrukta birileri olduğu için poll() metoduyla ilk sıradaki kişiyi bilet almış gibi kuyruktan çıkarıyoruz.
				break;
			case 3:
				System.out.println("Kuyruk: "+kuyruk);
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
	
}
