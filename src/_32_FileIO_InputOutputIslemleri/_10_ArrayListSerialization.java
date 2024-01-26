package _32_FileIO_InputOutputIslemleri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class _10_ArrayListSerialization {

	public static void main(String[] args) {

		//ArrayList sınıfı da Serializable interface implement ediyor yani serileştirilmiş bir sınıftır.
		//Bundan dolayı nesne yazma okuma işlemlerinde ArrayList sınıfını da kullanabiliyoruz.
		//ArrayList Serializable olsa bile nesnesini tuttuğu sınıfta yani Otomobil sınıfı da Serializable olmalıdır.
		//Otomobil sınıfının nesnesi oluşturulurken Motor sınıfı nesnesi de atandığı için Motor sınıfı da Serializable olmalıdır.
		//Bir dosya içine yazmak istediğimiz her şey Serializable olmak zorundadır yoksa hata alırız.
		
		Motor motor1=new Motor(425260); //Otomobil nesnesi oluştururken içine Motor nesnesi de istediği için motorNo girerek bir Motor nesnesi oluşturuyoruz.
		
		//İçine Otomobil nesnesi alan bir ArrayList oluşturuyoruz ve add() metodu içinde Otomobil nesneleri oluşturarak listemize ekliyoruz.
		ArrayList<Otomobil> otomobilListesi=new ArrayList<>();
		otomobilListesi.add(new Otomobil("Volkswagen","Golf 7",2013,motor1));
		otomobilListesi.add(new Otomobil("Seat","Leon",2011,motor1));
		otomobilListesi.add(new Otomobil("Volvo","XC90",2023,motor1));
		
		//try-with-resources kullanarak parantez içine ObjectOutputStream nesnesi oluşturuyoruz ve kaynak olarak FileOutputStream nesnesi oluşturup onun da içine oluşturduğumuz dosyayı veriyoruz.
		try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("otomobiller.bin"))) {
			
			//ObjectOutputStream üzerinden writeObject() metoduyla içine Otomobil nesnesi alan ArrayList'imizi dosyanın içine yazıyoruz, kaydediyoruz.
			objectOutputStream.writeObject(otomobilListesi);
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Yazma işleminde bir hata meydana geldi...");
		}
		
		System.out.println("Yazma işlemi tamamlandı...");
		
	}

}
