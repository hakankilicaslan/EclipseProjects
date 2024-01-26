package _32_FileIO_InputOutputIslemleri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class _08_ObjectOutputStream {

	public static void main(String[] args) {

		/*
		 * writer.write(new Ogrenci("Hakan Kılıçaslan", 456)); diyerek write() metoduyla nesne olarak yazma kaydetme işlemi yapmak istiyoruz.
		 * Önceki kullanımlarda yazma işlemi yaparken nesne oluşturarak kaydetme işlemi yapamıyorduk. Onlar bu yapı için uygun değildi
		 * Nesne yani obje olarak kaydetme ya da okuma işlemi yapmak istersek bunlar için özelleştirilmiş sınıfları kullanmalıyız.
		 *
		 * ObjectOutputStream sınıfını kullanarak parametre olarak verdiğimiz dosya içine yazma yani nesne kaydetme işlemi yapabiliriz.
		 * Nesne olarak kaydetme işlemi yapacaksak hangi sınıfın nesnesini kaydedeceksek o sınıfın serileştirilmesi gerekiyor.
		 * Otomobil sınıfının nesnelerini kaydedeceğimiz için Otomobil sınıfının Serializable interface'i implement etmesi gerekiyor.
		 * Ayrıca Otomobil sınıfından nesne oluştururken Motor sınıfı nesnesini de kullandığımız için Motor sınıfının da Serializable interface'i implement etmesi gerekiyor.
		 * Bir dosya içine yazmak istediğimiz her şey Serializable olmak zorundadır.Serializable bir Marker Interface'dir. 
		 * Sadece bu interface implement edilince işaretlemiş oluyoruz yani Otomobil ve Motor sınıflarını serileştirmiş oluyoruz.
		 * Bu şekilde Serialization yaparak nesnelerimizi dosyamıza yazmış yani kaydetmiş oluyoruz.
		 * 
		 */
		
		Motor motor1=new Motor(425260); //Otomobil nesnesi oluştururken içine Motor nesnesi de istediği için motorNo girerek bir Motor nesnesi oluşturuyoruz.
		
		//try-with-resources kullanarak parantez içine ObjectOutputStream nesnesi oluşturuyoruz ve kaynak olarak FileOutputStream nesnesi oluşturup onun da içine oluşturduğumuz dosyayı veriyoruz.
		//Dosya oluştururken uzantısını ne girersek o uzantıya göre dosya oluşuyor. Bu kez bin uzantılı bir dosya oluşturmuş olduk.
		try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("otomobiller.bin"))){
			
			//Parametreleri girerek yeni Otomobil nesneleri oluşturuyoruz.
			Otomobil oto1=new Otomobil("Volkswagen","Golf 7",2013,motor1);
			Otomobil oto2=new Otomobil("Seat","Leon",2011,motor1);
			Otomobil oto3=new Otomobil("Volvo","XC90",2023,motor1);
			
			//ObjectOutputStream içinde birçok write() metodu versiyonu var. Biz nesne kaydetmek istediğimiz için writeObject() metodunu kullanıyoruz ve oluşturuduğumuz Otomobilleri verdiğimiz dosyanın içine kaydediyoruz.
			objectOutputStream.writeObject(oto1);
			objectOutputStream.writeObject(oto2);
			objectOutputStream.writeObject(oto3);
			
		} catch (NotSerializableException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı NotSerializableException hatası.
			System.out.println("Serileştirme işleminde bir hata meydana geldi...");
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
