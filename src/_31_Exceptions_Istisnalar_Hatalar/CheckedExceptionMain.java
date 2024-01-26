package _31_Exceptions_Istisnalar_Hatalar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionMain {
/*
 * Checked Exception (Kontrol Edilen Exception) -> Exception, IOException, ClassNotFoundException, InterruptedException, SQLException, FileNotFoundException...
 * Checked Exceptionlar programın yüksek ihtimalle çalışamayacağı durumlarda ya da hata olabileceğini öngördüğü yerlerde try-catch bloğuyla sarmalamamızı ya da throw declaration kullanarak hata fırlatmasını sağlayacağı exceptionlara denir. 
 * Program hata olabileceğini öngördüğü kısmı try-catch bloğu ile sarmalamaya zorlar ya da metot içinde bir durum varsa o metoda throw declaration ekleyerek çağırıldığı yerde try-catch bloğuyla sarmalama yapmamıza zorlar ve bu şekilde hata alındığında programın durması engellenir.
 *
 */
	public static void main(String[] args) {

		System.out.println("Program çalışmaya başladı...");
		
		System.out.println("----------------------------------------");
	
		dosyaOku();
		
		System.out.println("----------------------------------------");
		
		try {
			dosyaOku2(); //throws IOException kullanıldığı için metodu çağırırken try-catch bloğu içine almamız gerekiyor.
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası
			System.out.println(e.getMessage()); //e.getMessage() ile tüm hatayı değil sadece mesaj kısmını yazdırmış olduk.
			System.out.println(e.getClass().toString()); //e.getClass().toString() ile hatanın fırlatıldığı sınıfı görebiliriz.
			System.out.println(e.toString()); //e.toString() ile hem hatanın fırlatıldığı sınıfı hem de mesajı yazdırmış olduk.
		}
		
		System.out.println("----------------------------------------");
		
		dosyaOku3();
		
		System.out.println("\n----------------------------------------");
		
		System.out.println("Program çalışmaya devam ediyor..."); //Hata olabilecek durumları try-catch bloğu ile sarmalattığımız için artık program hata fırlattığında durmayacak ve bu satıra kadar çalışmaya devam edecek.
		
	}
		
	
	public static void dosyaOku() { //try-catch bloğu ile sarmalama kullanmak yerine throw declaration kullanarak metot sonuna throws FileNotFoundException eklersek metodun çağırıldığı yerde try-catch bloğu kullanımına zorlamış oluruz.
		
		//hello dosyasını çekmeye çalıştığımızda program FileNotFoundException yani dosya bulunamadı durumunun olabileceğini öngörüyor ve handle etmemizi istiyor.
		//Hata olabilecek kısmı try bloğuna hata olursa yapacağı işlemleri catch bloğuna ekliyoruz. try bloğunda hata olabilecek durumu deniyor ve hata olursa catch bloğuna geçip ordaki işlemi yapıyor yani hata fırlatıyor.
		//try-catch sarmalamasında try bloğunda hata oluşsa da oluşmasa da yani catch bloğuna girse de girmese de çalıştırmamız gereken kodlar varsa onlar içinde finally bloğu açıyoruz. Bu şekilde her iki durumda olsa finally içine girecek ve ordaki kodları çalıştıracak.
		
		FileInputStream dosya=null; //dosya başlangıç değeri girilmediği için hata verdiğinden null ataması yaptık.
		
		try { 
			dosya=new FileInputStream("C:/javaFiles/hello.txt"); //Program hata olabileceğini öngörüyor ve handle etmemizi istiyor. -> CHECKED EXCEPTION
			System.out.println("Sistemde hello.txt dosyası bulundu...");
			} catch (FileNotFoundException e) { 
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası
			System.out.println("Sistemde hello.txt dosyası bulunamadı...");
		} finally {
			try {
				dosya.close(); //dosya ile işimiz bittikten sonra bellekte yer kaplamaması için close() metoduyla dosyayı kapatıyoruz ama sistem dosyayı açamama durumunu öngördüğü için bu satırı da try-catch ile sarmalamamızı istiyor.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void dosyaOku2() throws IOException {
		
		//FileInputStream kısmından dolayı FileNotFoundException hatası verebileceği için o kısmı try-catch içine sarmalamalıyız. dosya.read() kısmından dolayı da IOException hatası verebileceği için o kısmı da try-catch içine sarmalamalıyız. Çok fazla kod kalabalığı olacağı için direkt metoda throw declaration uyguluyoruz.
		//dosya kısmından dolayı FileNotFoundException throws ediyoruz ama daha sonra read() metodundan dolayı IOException throws etmek zorunda kalıyoruz. FileNotFoundException sınıfı IOException sınıfından miras aldığı için sadece IOException throws etmemiz yeterli oluyor.
	
		FileInputStream dosya=new FileInputStream("C:/javaFiles/hello2.txt"); //Sistemde olmayan bir dosyayı arattığımız için hata verecek ve metodun çağırıldığı yerde catch bloğuna düşecek.	
		int b; 
		//read() metodu dosya içinden bir byte datayı okuyabiliyor ve geriye int bir değer dönüyor. Dosya içindeki her şeyi okuyabilmek için read() metodunu döngüye sokuyoruz ve byte byte okuyarak geriye okuduğu karakterin ascii code değerini dönüyor.
		//Dosyanın sonuna geldiğinde yani okunacak data kalmadığında geriye -1 dönüyor. dosya.read() -1 olmayana kadar yani dosyanın tamamını okuyana kadar döngünün devam etmesini sağlıyoruz. Data bitince -1 dönecek ve döngüden çıkacak.
		//int b değişkenine atama kısmını while döngüsünün şart kısmında yapıyoruz çünkü read() metoduyla aldığımız değeri daha sonra çıktı olarak yazdıracağımız için sout kısmında yine dosya.read() kullansak orda tekrar okuma yapacak ve istediğimiz sonucu vermeyecek.
		while( (b=dosya.read()) != -1 ) { //Dosyanın sonuna gelip -1 dönene kadar döngümüz devam ediyor.
			System.out.print((char)b); //Karakterlerin ascii code değerlerini döndüğü için char'a cast ederek harflere çeviriyoruz ve öyle yazdırıyoruz.
		}
		dosya.close(); //dosya ile işimiz bittikten sonra close() metoduyla dosyayı kapatıyoruz.
		
	}
	
	public static void dosyaOku3() {
		
		//try-catch bloğu içinde birden çok hata alabilecek durum varsa try bloğu ilk hatayla karşılaştığında ikinci durumu denemiyor ve ilgili catch bloğuna geçiyor demiştik. Bundan dolayı birbirinden alakasız durumlar için tek try bloğu kullanmak doğru değil demiştik.
		//Buradaki durumda hata olabilecek kısımlar birbiriyle bağlantılı olduğu için yani zaten dosya yoksa alt satıra geçip o dosyayı da okuyamayacağımız için tek try bloğu içine durumları alabiliriz. Hangi durumla ilgili hata varsa o catch bloğuna düşerek bize hata fırlatacak.
		//Başka hata alacağımızı öngöremediğimiz durumlarda ya da her durumda en sona üst sınıf olan bütün hataları yakalayan Exception catch bloğu ekleyebiliriz ama Exception için eklenen catch bloğu üst sınıf olduğu için en sonda olmalıdır. Ondan sonraki catch bloklarına erişilemeyeceğinden yani onları kontrol edemeyeceği için hata alırız.
		//try-catch sarmalamasında try bloğunda hata oluşsa da oluşmasa da yani catch bloğuna girse de girmese de çalıştırmamız gereken kodlar varsa onlar içinde finally bloğu açıyoruz. Bu şekilde her iki durumda olsa finally içine girecek ve ordaki kodları çalıştıracak.
		
		FileInputStream dosya=null; //dosya başlangıç değeri girilmediği için hata verdiğinden null ataması yaptık.
		
		try {
			dosya = new FileInputStream("C:/javaFiles/hello.txt");
			int b; 
			//read() metodu dosya içinden bir byte datayı okuyabiliyor ve geriye int bir değer dönüyor. Dosya içindeki her şeyi okuyabilmek için read() metodunu döngüye sokuyoruz ve byte byte okuyarak geriye okuduğu karakterin ascii code değerini dönüyor.
			//Dosyanın sonuna geldiğinde yani okunacak data kalmadığında geriye -1 dönüyor. dosya.read() -1 olmayana kadar yani dosyanın tamamını okuyana kadar döngünün devam etmesini sağlıyoruz. Data bitince -1 dönecek ve döngüden çıkacak.
			//int b değişkenine atama kısmını while döngüsünün şart kısmında yapıyoruz çünkü read() metoduyla aldığımız değeri daha sonra çıktı olarak yazdıracağımız için sout kısmında yine dosya.read() kullansak orda tekrar okuma yapacak ve istediğimiz sonucu vermeyecek.
			while( (b=dosya.read()) != -1 ) { //Dosyanın sonuna gelip -1 dönene kadar döngümüz devam ediyor.
				System.out.print((char)b); //Karakterlerin ascii code değerlerini döndüğü için char'a cast ederek harflere çeviriyoruz ve öyle yazdırıyoruz.
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası
			System.out.println("FileNotFound Exception catch bloğu çalıştı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası
			System.out.println("IO Exception catch bloğu çalıştı...");
		} catch (Exception e) {
			e.printStackTrace(); //Sistemin fırlatacağı Exception hatası
			System.out.println("Exception catch bloğu çalıştı...");
		} finally {
			try {
				dosya.close(); //dosya ile işimiz bittikten sonra bellekte yer kaplamaması için close() metoduyla dosyayı kapatıyoruz ama sistem dosyayı açamama durumunu öngördüğü için bu satırı da try-catch ile sarmalamamızı istiyor.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
