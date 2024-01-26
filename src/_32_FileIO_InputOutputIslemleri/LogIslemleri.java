package _32_FileIO_InputOutputIslemleri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class LogIslemleri<T> { //Generic Class: Oluşturduğumuz dosyaOku metodunun parametre olarak alacağı türü sınıfımızdan nesne oluştururken girilmesini istiyoruz.
	
	public void logKaydet(Log log, String filename) { //logKaydet metodumuzu da genericleştirmek istersek Log log yerine T t yazdığımızda artık sadece Log türündeki değil hangi türde nesne verirsek onun için yazma işlemi yapacak.
		
		//try-with-resources kullanarak parantez içine ObjectOutputStream nesnesi oluşturuyoruz ve kaynak olarak FileOutputStream nesnesi oluşturup onun da içine parametre olarak gönderilen dosyayı veriyoruz.
		try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(filename))){
			
			//ObjectOutputStream üzerinden writeObject() metoduyla oluşturduğumuz Log nesnesini dosyanın içine yazıyoruz, kaydediyoruz.
			objectOutputStream.writeObject(log);
			System.out.println("Log kaydetme işlemi tamamlandı...");
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Yazma işleminde bir hata meydana geldi...");
		}
	}
	
	public Log logOku(String filename) {
		
		Log logOkunan=null; //return kısmında da logOkunan döndüğü için try bloğu dışında tanımlıyoruz ve null ataması yapıyoruz.
		
		//try-with-resources kullanarak parantez içine ObjectInputStream nesnesi oluşturuyoruz ve kaynak olarak FileInputStream nesnesi oluşturup onun da içine parametre olarak gönderilen dosyayı veriyoruz.
		try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(filename))){
			
			//ObjectInputStream üzerinden readObject() kullanarak dosyamızın içindeki Log nesnesini okuyoruz. Geriye Object döndüğü için Log'a cast ediyoruz ve bir Log değişkenine atayıp return kısmında dönüyoruz.
			logOkunan=(Log)objectInputStream.readObject();
			
			System.out.println("Epoch Time: "+logOkunan.getZaman()); //Hatanın oluştuğu zamanı geriye Epoch Time olarak dönüyor.
		 	System.out.println("Date: "+new Date(logOkunan.getZaman())); //Date nesnesi içine atarak hatanın oluştuğu zamanı Date olarak dönüyor.
		 	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); //SimpleDateFormat nesnesi oluşturarak nasıl bir format istiyorsak parametre olarak giriyoruz.
		 	System.out.println("Formatlı Date: "+dateFormat.format(new Date(logOkunan.getZaman()))); //SimpleDateFormat nesnesine Date nesnemizi parametre olarak verip yazdığımız formata göre dönmesini sağlıyoruz.
			
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
		
		return logOkunan;
	}
	
	//logOku metodumuzu genericleştirmek yani sadece Log türünde nesneler için değilde hangi tür verilirse verilsin okuma işlemini yapmak istiyoruz.
	//Metodumuzu Optional generic bir metoda çeviriyoruz. Metodumuz geriye Optional<T> dönüyor çünkü NullPointer hatası almamak için yani dosya boşsa hata almamak için ve ekstra null check yapmamak için Optional tanımlıyoruz.
	@SuppressWarnings("unchecked") //Java type safety olabileceğini öngörerek uyarı veriyor.
	public Optional<T> dosyaOku(String filename) {
		
		T dosyaOkunan=null; //Generic olduğu için değişkenimiz T olarak tanımlıyoruz. return kısmında da dosyaOkunan döndüğü için try bloğu dışında tanımlıyoruz ve null ataması yapıyoruz.
		
		//try-with-resources kullanarak parantez içine ObjectInputStream nesnesi oluşturuyoruz ve kaynak olarak FileInputStream nesnesi oluşturup onun da içine parametre olarak gönderilen dosyayı veriyoruz.
		try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(filename))){
			
			//ObjectInputStream üzerinden readObject() kullanarak dosyamızın içindeki nesne(T) hangi türde ise onu okuyoruz. Geriye Object döndüğü için T'e yani verilen nesneye cast ediyoruz ve bir T değişkenine atayıp return kısmında dönüyoruz.
			dosyaOkunan=(T)objectInputStream.readObject();
			
			return Optional.of(dosyaOkunan); //try bloğu içinde dönecekse dosya boş değildir. Bundan dolayı metot geriye Optional döneceği için Optional sınıfı üzerinden of() metoduyla dosyaOkunan nesnemizi Optional bir nesneye çevirip dönüyoruz
			
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
		
		return Optional.empty(); //catch bloğuna düşerse hata oluşacağı için try bloğu içindeki return çalışmayacak yani dosyamızı okuyamadığımız için metotta geriye Optional değer döneceği için Optional.empty() dönüyoruz yani içi boş dönüyoruz.
		
	}
	
}
