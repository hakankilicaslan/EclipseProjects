package _32_FileIO_InputOutputIslemleri;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _09_ObjectInputStream {

	public static void main(String[] args) {

		/*
		 * ObjectInputStream sınıfını kullanarak parametre olarak verdiğimiz dosya içindeki nesneleri okuma yani görüntüleme işlemi yapabiliriz.
		 * Nesne olarak okuma görüntüleme işlemi yapacaksak hangi sınıfın nesnesini okuyacaksak o sınıfın serileştirilmesi gerekiyor.
		 * Otomobil sınıfının nesneleri okuyacağımız için Otomobil sınıfının Serializable interfaceden implement edilmesi gerekiyor.
		 * Ayrıca Otomobil sınıfından nesne oluştururken Motor sınıfı nesnesini de kullandığımız için Motor sınıfının da Serializable interface'i implement etmesi gerekiyor.
		 * Bir dosya içine yazmak istediğimiz her şey Serializable olmak zorundadır. Serializable bir Marker Interface'dir. 
		 * Sadece bu interface implement edilince işaretlemiş oluyoruz yani Otomobil ve Motor sınıfını serileştirmiş oluyoruz.
		 * Serializable interface kullanılarak Serialization işlemi yapılan ve kaydedilen dosyayı okumak için Deserialization işlemi yapıyoruz.
		 * 
		 * Otomobil ve Motor sınıflarını implements Serializable diyerek serileştirdik. Daha sonra oluşturduğumuz dosya içine yazma ve dosyadan okuma işlemleri yaptık.
		 * Başka bir sistemde bu nesne yazma ve okuma işlemleri yaptığımız dosya okumaya çalışılırsa bizim oluşturduğumuz Otomobil ve Motor sınıflarına da ihtiyaç var.
		 * Çünkü biz Otomobil ve Motor sınıflarını oluşturduktan sonra implements Serializable yaptığımızda sistem sınıfa long türünde bir serialVersionUID ataması yapıyor.
		 * Deserialization işlemi yaparken sistem yazma işlemi sırasında sınıfın serialVersionUID ile okuma sırasındaki serialVersionUID karşılaştırması yapıyor.
		 * Eğer serialVersionUID'ler birbirini tutarsa okuma işlemini gerçekleştirebiliyor ama tutmazsa sistem hata fırlatıyor.
		 * Bundan dolayı sınıflarımız olmadan okuma yapmak istenirse tekrar sınıfları oluştursalar bile serialVersionUID'ler eşleşmezse okuma işlemi yapılamaz.
		 * 
		 */
		
		//try-with-resources kullanarak parantez içine ObjectInputStream nesnesi oluşturuyoruz ve kaynak olarak FileInputStream nesnesi oluşturup onun da içine oluşturduğumuz dosyayı veriyoruz.
		try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("otomobiller.bin"))){
			
			//Burada tek tek okuma işlemi yapıyoruz yani kaç tane nesne varsa hepsini görüntülemek için tek tek okuyup yazdırmalıyız.
			//Okunacak nesne bittikten sonra tekrar okumaya çalışırsak EOFException(End of File) yani dosyanın sonuna geldik hatası alıyoruz.
			//Tek tek uzun yoldan okumak yerine bir döngü kurup onun içinde bütün nesnelerimizi okuyabiliriz.
			//Otomobil oto1=(Otomobil)objectInputStream.readObject();
			//System.out.println(oto1);
			
			//ObjectInputStream içinde birçok read() metodu versiyonu var. Biz nesne okumak istediğimiz için readObject() kullanıyoruz.
			//readObject() okunacak nesne kalmayınca geriye null döndüğü için null değilse şartına sokup bütün nesneleri okuyabiliyoruz.
			//readObject() metodu geriye Object döndüğü için okuduğumuz nesneleri Otomobil'e cast ediyoruz.
			//Dosya sonuna gelince null dönse bile sistem yine de End of File EOFException fırlatması yapıyor. 
			//Hata olarak değilde sistem bize dosya içinde okunacak nesne kalmadı uyarısı vermeş oluyor.
			Otomobil oto;
			while( (oto=(Otomobil)objectInputStream.readObject()) != null ) {
				System.out.println(oto);
			}
			
		} catch (EOFException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı EOFException hatası.
			System.out.println("Okuma işlemi tamamlandı. Dosyada görüntülenecek nesne kalmadı...");
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Okuma işleminde bir hata meydana geldi...");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı ClassNotFoundException hatası.
			System.out.println("Sistemde sınıf bulunamadı...");
		}
		
	}

}
