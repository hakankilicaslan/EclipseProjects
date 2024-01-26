package _32_FileIO_InputOutputIslemleri;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _04_FileWriter {

	public static void main(String[] args) {
				
		/*
		 * FileInputStream ve FileOutputStream ile bütün dosya türlerinde input ve output işlemleri yapılabilir.
		 * Sadece metin dosyaları üzerinde işlem yapacaksak FileWriter ve FileReader kullanılabiliriz. Daha efektif ve daha hızlı çözüm alınıyor.
		 * 
		 * FileOutputStream için write() metodunda parametre olarak String bir ifadeyi direkt veremezken FileWriter için verebiliyoruz.
		 * Ayrıca FileWriter kullanımında yazma işleminin tamamlanması için close() metoduyla dosyanın kapatılması gerekiyor.
		 * Bir nevi program yazmak için dosyanın kapatılmasını bekliyor yani kapatılmadan yazma işlemi sonlandırılmıyor. 
		 * 
		 * Sadece metin dosyası üzerinde yazma işlemi yapacaksak FileWriter nesnesine ihtiyacımız var. FileWriter constructor türlerinde birçok çeşit var.
		 * Bunlar FileOutputStream'de olduğu gibi FileWriter nesnesine parametre olarak bir File nesnesi oluşturup onun referansını yazdığımızdır.
		 * Bunun yanında File nesnesiyle beraber boolean append ve Charset alan versiyonları da vardır.   
		 * Diğer kullanımda String türünde direkt dosyanın kesin yolunu yazdığımız versiyondur. 
		 * Bunda da String dosya yoluyla beraber boolean append ve Charset alan versiyonları da vardır.
		 * Diğer parametre olan boolean append öncekilerde olduğu gibi sadece true ya da false alabilir.
		 * true kullanırsak tekrar write() metodu kullanımında mevcut yazıyı silmeden yanına ekleme yapıyor.
		 * false kullanırsak her write() metodu kullanımında mevcut yazıyı tamamen silip yerine yeni yazılanı kaydediyor.
		 * 
		 * FileWriter için write() metodu kullanırken parametre olarak 3 kullanım şekli bulunuyor.
		 * İlki parametre olarak int değer veriliyor. Girilen değer karakterin ascii code değerine karşılık gelmelidir.
		 * İkincisi bir char dizisi girilebiliyor. Ayrıca char dizisiyle beraber hangi karakterden itibaren ve kaç karakter yazılacağı girilen versiyonu da var.
		 * Üçüncüsü direkt String bir ifade girilebiliyor. Ayrıca String ifadeyle beraber hangi karakterden itibaren ve kaç karakter yazılacağı girilen versiyonu da var.
		 * 
		 */
		
		
		
		FileWriter fw1=null; //fw1 finally bloğunda da görülebilsin diye try dışında tanımladık ve close() metodu başlangıç değeri istediği için null ataması yaptık.
		try {
			
			fw1=new FileWriter("C:/javaFiles/hello.txt",true); //Yazma işlemi yapabilmek için bir FileWriter nesnesi oluşturuyoruz ve yazmak istediğimiz dosyanın yolunu parametre olarak giriyoruz.
			
			fw1.write("AVRUPA FATIHI"); //FileOutputStream için write() kullanımında String ifade yazamıyorduk ama bu kullanımda parametre olarak String verebiliyoruz.
			
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Yazma işleminde bir hata meydana geldi...");
		} finally {
			try {
				fw1.close(); //Yazma işleminin tamamlanabilmesi için finally bloğunda close() metoduyla dosyamızı kapatıyoruz.
			} catch (IOException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
				System.out.println("Dosya kapatma işleminde bir hata meydana geldi...");
			}
		}
		
		//try-with-resources: Kaynaklarla çalışırken kullanılan try-catch yapısıdır. Bu kullanımda try içinde açılan yapılar otomatik olarak kapatılır.
		//Artık IO Stream işlemleri için açılan öğeleri finally bloğu içinde tekrar close() metoduyla kapatmamıza gerek kalmıyor.
		//try-with-resources yapısını kullanabilecek sınıfların Closeable interface'ini implement etmesi gerekir.
		//try-with-resources kullanırken try sonrası parantez içine yazma işlemi için kullanacağımız sınıfın nesnesini oluşturup parametre olarakta dosyayı veriyoruz.
		try(FileWriter fw2=new FileWriter("C:/javaFiles/hello.txt",true)){
			fw2.write(" GALATASARAY ");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Yazma işleminde bir hata meydana geldi...");
		}
		
		//Dosyaya yazılacak metni kullanıcı girsin -1 girene kadar yazma işlemi devam etsin.
		
		//try-with-resources kullanarak parantez içine FileWriter nesnesi oluştururken dosya yolumuzu da giriyoruz.
		try(FileWriter fw3=new FileWriter("C:/javaFiles/hello.txt",true)){
			
			Scanner sc=new Scanner(System.in); //Kullanıcıdan girdi almak için Scanner nesnesi tanımlıyoruz.
			String girdi=""; //while döngüsü için girdi başlangıç değeri istediği için boş String ifade atıyoruz.
			System.out.println("Metin giriniz. Çıkmak için -1 giriniz."); //Kullanıcıdan metin girmesini istiyoruz.
			
			while( !(girdi=sc.nextLine()).equals("-1") ) { //Kullanıcının girdiği String değerin -1'e eşit olmadığı durumu while döngüsüne sokuyoruz. Bu şekilde kullanıcı -1 girene kadar yazmaya devam edecek.
				fw3.write(girdi); //write() metoduyla kullancının girdiği değeri dosyamızın içine yazıyoruz.
			}
			
			sc.close(); //Scanner nesnesiyle işimiz bittikten sonra kapatıyoruz.
			
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Yazma işleminde bir hata meydana geldi...");
		}
		
		//Bütün yazma işlemlerinde aynı dosyayı kullandığımız için önceki yazılan silinmesin diye hepsinde append olarak true kullandık.
		
		System.out.println("Yazma işlemi tamamlandı...");
		
	}
	
}
