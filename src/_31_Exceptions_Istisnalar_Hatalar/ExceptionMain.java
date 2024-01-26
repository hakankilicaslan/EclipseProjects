package _31_Exceptions_Istisnalar_Hatalar;

public class ExceptionMain {
/*
 * java.lang > Object > Throwable > Error and Exception
 * Java da hatalar Error olarak geçiyor. Error -> Compiletime Error ve Runtime Error olarak ikiye ayrılıyor.
 * 
 * Compiletime Error (Derleme Zamanı Hataları) -> Syntax Errors yani kod yazarken aldığımız ve programın bizi düzeltmeye ittiği yazım hatalarıdır.
 * 
 * Runtime Error     (Çalışma Zamanı Hataları) -> can not be handled(Error)  Bir şey yapamayacağımız programcının yakalayamayacağı sistemsel hatalardır.(mesela stack-overflow -> bellek doldu hatası)
 * 											   -> can be handled(Exception)  İstisnalar, bir hata oluştuğunda yapabileceğimiz durumların olduğu hatalardır.
 * 
 * Exception -> Program çalıştığı esnada ortaya çıkan, beklenmeyen ve öngörülemeyen hatalara verilen isimdir. Bu hatalar, program akışını sonlandırarak çalışmasına mani olur.
 * 				Programcılar tarafından belirli kodlarla idare edilebilir(handle) ve kontrol altına alınabilir. Bu şekilde program çalışmaya devam ettirilebilir.
 * 				Exception, normal Java uygulama akışımızın kesintiye uğramasına neden olur. Sıfıra bölünme, dizi uzunluğunun ötesine geçme, atama yapılmamış referans kullanımı gibi şeyler Exception'lara neden olabilir.
 * 				Exception'lar(hatalar) nedeniyle oluşabilecek sorunları önlemek ve programların daha güvenli ve stabil çalışmasını sağlamak için exception handling(hata ele alma) mekanizması kullanılır.
 * 				Exception handling programcıların, programın çalışma zamanında oluşan hataları ele alarak, bu hataların etkisini minimize etmelerine yardımcı olur.
 * 
 * Exceptionların iki türü vardır. User-Defined Exception(Kullanıcının tanımlayacağı exceptionlar) ve Built-in Exception(Java kütüphanesinde mevcut olan exceptionlar)
 * 
 * User-Defined Exception oluşturulurken Checked Exception oluşturmak istiyorsak Exception sınıfından, Unchecked Exception oluşturmak istiyorsak RuntimeException sınıfından miras alabiliriz.
 * Built-in Exceptions: Checked Exception(Kontrol Edilen Exception) ve Unchecked Exception(Kontrol Edilemeyen Exception)
 *
 */
	public static void main(String[] args) {
		
		System.out.println("Program çalışmaya başladı...");
		
		//Thread.sleep(1000); dediğimizde Main Thread'imizi 1 sn beklet, uyut demiş oluyoruz ama program InterruptedException olabileceğini öngörüyor ve handle etmemizi istiyor.
		//Program hata olabilecek kısmı try bloğuna hata olursa yapacağı işlemleri catch bloğuna ekliyor. try bloğunda hata olabilecek durumu deniyor ve hata olursa catch bloğuna geçip ordaki işlemi yapıyor yani hata fırlatıyor.
		try {
			Thread.sleep(1000); //Program hata olabileceğini öngörüyor ve handle etmemizi istiyor. -> CHECKED EXCEPTION
			System.out.println("Program 1 saniye bekletildi...");
		} catch (InterruptedException e) {
			e.printStackTrace(); //Sistemin fırlatacağı InterruptedException hatası
			System.out.println("Program 1 saniye bekletilemedi...");
		}		
		
		System.out.println("Program çalışmaya devam ediyor..."); //Hata olabilecek durumları try-catch bloğu ile sarmalattığımız için artık program hata fırlattığında durmayacak ve bu satıra kadar çalışmaya devam edecek.
		
	}
	
}
