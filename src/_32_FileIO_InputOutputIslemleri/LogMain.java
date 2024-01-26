package _32_FileIO_InputOutputIslemleri;

import java.util.Optional;

public class LogMain {

	@SuppressWarnings({ "unused", "null", "unchecked", "rawtypes" }) //Java belirtilen durumlarla ilgili uyarı yapıyor.
	public static void main(String[] args) {

		/*
		 * Exception hatası fırlatacak bir işlem yaptığımızda try-catch bloğuyla sarmalıyorduk.
		 * Daha sonra bir hata oluştuğunda program çalışmayı durdurmadan catch bloğuna düşerek hata fırlatmasını ya da mesaj vermesini sağlıyorduk.
		 * Şimdi program hata aldığında catch bloğuna düşünce oluşan hata için sadece hata fırlatmak yerine oluşan hatayı da kayıt altına alacağız.
		 * Bu oluşan hataları Log dosyasında tutacağız. Bir Log sınıfı oluşturacağız ve onun nesnesiyle oluşan hatayı ilgili dosya içine kaydedeceğiz.
		 * 
		 */
		
		LogIslemleri<Log> logIslemleri=new LogIslemleri(); //LogIslemleri sınıfı generic olduğu için nesne oluştururken hangi tür nesne tutacağını da belirtiyoruz. Log tutan bir nesne oluşturuyoruz.
		
		try {
			
			//String bir değişken oluşturup null atıyoruz ve substring() metoduyla bir parçasını almaya çalışıyoruz ama NullPointerException hatası alacağız.
			String metin=null;
			String parcaMetin=metin.substring(5);
			
		} catch (NullPointerException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı NullPointerException hatası
			System.out.println("İşlem yapmaya çalıştığınız değişken null...");
			
			//NullPointerException hatası alınca catch bloğuna düştüğünde oluşan hatayı Log dosyamıza kaydedeceğiz.
			//Log sınıfından bir nesne oluşturuyoruz ve içine istenen parametreleri giriyoruz.
			//e.getMessage() ile oluşan hatanın mesajını tutuyoruz.
			//e.getStackTrace()[0].getClassName() ile oluşan hata hangi sınıfta olduysa onun ismini tutuyoruz.
			//e.getStackTrace()[0].getMethodName() ile oluşan hata hangi metot içinde olduysa onun ismini tutuyoruz.
			//System.currentTimeMillis() ile oluşan hatanın zamanını tutuyoruz. Sistemin o anki zamanını long olarak dönüyor.
			Log log=new Log(e.getMessage(), e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName(), "Metin parçalama işlemi yapılırken bir hata oluştu.", System.currentTimeMillis());
			
			//LogIslemleri sınıfından logKaydet() metodumuzu çağırıp oluşturduğumuz log'u ve yazacağı dosyanın yolunu parametre olarak veriyoruz.
			//Bu şekilde NullPointerException hatası aldığımızda Log nesnemiz oluşacak ve ilgili dosyanın içine yazmış yani kaydetmiş olacağız.
			logIslemleri.logKaydet(log,"log.txt"); //Dosyamız oluşturulurken içinde bulunduğumuz Java projesi nerdeyse onun bulunduğu klasöre oluşturuluyor.
						
		} catch (Exception e) {
			//e.printStackTrace(); //Sistemin fırlatacağı Exception hatası
			System.out.println("Program çalışırken bir hata oluştu...");
		}
		
		System.out.println("----------logOku()----------");
		System.out.println(logIslemleri.logOku("log.txt")); //İlk önce sadece Log dosyaları okumak için oluşturduğumuz metot ile okuma işlemi yapıyoruz.
		
		//dosyaOku() metodumuzu generic yaptık ve geriye Optional dönmesini sağladık. Bundan dolayı dosyaOku() metodumuza parametre olarak okunacak dosyayının yolunu veriyoruz.
		//Metot geriye Optional<Log> döneceği için Optional<Log> tutan bir değişkene atıyoruz.
		Optional<Log> okunanLog=logIslemleri.dosyaOku("log.txt"); //Burada da generic olan verilen nesneyi okuyan dosyaOku() metodumuz ile okuma işlemi yapıyoruz.
		
		//okunanLog değişkenimiz Optional bir değişken olduğundan okuma işlemi yapıldı mı yapılmadı mı yani dosya boş mu değil mi koşuluna sokuyoruz.
		//isPresent() metoduyla değişken dolu mu yani okuma yapıldı mı koşuluna sokuyoruz ve içindeki değeri almak için get() metodu kullanıp yazdırıyoruz.
		if(okunanLog.isPresent()) {
			System.out.println("----------dosyaOku()----------");
			System.out.println(okunanLog.get());
		}else
			System.out.println("Log kaydı bulunmuyor..."); //else durumunda yani isEmpty durumunda da kayıt olmadığı için çıktı da bilgilendirme mesajı veriyoruz.
		
	}

}
