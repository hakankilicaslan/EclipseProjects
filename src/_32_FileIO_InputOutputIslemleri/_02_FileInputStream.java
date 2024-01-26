package _32_FileIO_InputOutputIslemleri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * IO -> Input Output -> Giriş Çıkış : Byte byte gerçekleştirilir. 8 bit = 1 byte = 1 karakter
 * Source -> Stream -> Destination : Kaynaktan bir stream(akış) yaratarak verilerimizi hedefimize gönderiyoruz.
 * 
 * Scanner sc=new Scanner(System.in); //System.in diyerek console'dan programa veri girdisi yapmış oluyoruz.
 * 
 * InputStream: Okuma işlemleri için kullanılan abstract sınıftır. Bu sınıfı kullanarak istediğimiz kaynaktan, dosyadan okuma işlemini gerçekleştirebiliriz.
 * Source -> FileInputStream -> Java Programı: Bu şekilde akışımız oluşacak yani kaynağımızdan Java programına dosyamızı taşımız olacağız. Önemli metotları:
 * read() : byte şeklinde veriyi okumak için kullanılır. Dosyada okunacak karakter bulamazsa yani akışın sonuna ulaşmışsa geriye -1 döner.
 * read() metodunun üç kullanımı vardır. Parametresiz kullanıldığı zaman tek karakter okuyor ve geriye int döner yani karakterin ascii code karşılığını döner. 
 * Parametre olarak byte dizisi verilebilir ya da byte dizisi ile beraber başlangıç noktası ve okunacak karakter sayısı verilerek sadece o kısmın okunması sağlanabilir ve geriye int döner yani karakterin ascii code karşılığını döner. 
 * close(): InputStream'i kapatmaya yarar.
 * 
 * InputStream metotları throws IOException(InputOutputExcepiton) içerdikleri için metotları kullanırken try-catch bloğuyla sarmalamamız gerekiyor.
 * 
 */

public class _02_FileInputStream {

	public static void main(String[] args) {

		/*
		 * İlk olarak bir dosyayı okumak için bir FileInputStream nesnesine ihtiyacımız var. FileInputStream constructor türlerinde genel kullanımda 2 çeşit var.
		 * İlki FileInputStream nesnesine parametre olarak File türünde nesne alan versiyondur. Bunun için bir File nesnesi oluşturup onun referansını parametre olarak yazmalıyız. Buna relative path yani göreceli yol denir.
		 * İkincisi FileInputStream nesnesine parametre olarak String türünde direkt dosyanın kesin yolunu yazdığımız versiyonudur. Bu kullanımda bilgisayarımızdaki dosyanın kesin yolunu yazıyoruz. Buna da absolute path yani kesin yol denir.
		 *  
		 */
			
		//Yeni bir File nesnesi oluşturduk ve içine parametre olarak text uzantılı bir dosya verdik. Bu dosya yazma işlemi için kullandığımız içinde bulunduğumuz Java projesi nerdeyse onun içinde oluşturulan dosyadır.
		//Java içinde bu sınıfın olduğu projeyi sağ tıklayıp refresh ettiğimizde packageların altına belge.txt olarak görüntülediğimiz dosyadır.
		//File sınıfı üzerinden parametre olarak dosyayı vererek okumanın yanı sıra direkt FileInputStream içine parametre olarak belge.txt diye verdiğimizde File nesnesi kullanmadan da yine projenin içinde bulunduğu klasördaki dosyaya ulaşabiliyoruz.
		File file=new File("belge.txt");
		
		FileInputStream fis1=null; //fis1 finally bloğunda da görülebilsin diye try dışında tanımladık ve close() metodu başlangıç değeri istediği için null ataması yaptık.
		
		try {
			
			fis1=new FileInputStream(file); //relative path yani göreceli yol. Program dosyayı bulamama hatası öngördüğü için bizi try-catch ile sarmalatmaya zorladı. 
		
			//read() metodu ile datayı byte olarak okuyoruz ve geriye int değer yani karakterin ascii code karşılığını dönüyor. Karakater dönmesi için char'a cast ediyoruz.
			//read() metodunu her çağırdığımızda sadece bir karakter dönüyor bu şekilde kullanımda her karakter için ayrı ayrı çağırmamız gerekiyor ve kod tekrarı yapmış oluyoruz.
			//read() metodu kullanınca program input output hatası öngördüğü için IOException catch bloğu da ekliyoruz.
			int okunanKarakter1=fis1.read();
			System.out.print((char)okunanKarakter1);
			char okunanKarakter2=(char)fis1.read();
			System.out.print(okunanKarakter2);
			char okunanKarakter3=(char)fis1.read();
			System.out.print(okunanKarakter3);
			char okunanKarakter4=(char)fis1.read();
			System.out.print(okunanKarakter4);
			char okunanKarakter5=(char)fis1.read();
			System.out.print(okunanKarakter5);
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde okunacak dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Okuma işleminde bir hata meydana geldi...");
		} finally {
			try {
				fis1.close(); //Dosyayla işimiz bittikten sonra bellekte yer kaplamasın diye ve catch bloklarına düşse bile kapatılabilsin diye finally bloğu içinde close() ile kapatıyoruz ama bu işlem içinde input output hatası öngördüğü için burda da try-catch sarmalaması yapmak zorunda kalıyoruz.
			} catch (IOException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
				System.out.println("Dosya kapatma işleminde bir hata meydana geldi...");
			}
		}
		
		System.out.println("\n----------------------------------------");
		
		//Yukarıda projenin olduğu klasöre yazma işleminde File sınıfını kullanarak yeni bir dosya açıp yazma işlemi yapmıştık. Burada da o dosyayı FileInputStream içine parametre olarak vererek okuma işlemi yaptık.
		//İkinci kullanımda yazma işleminde String ifade olarak dosyanın tam adresini vererek o dosya içine yazma işlemi yapmıştık. Şimdi o dosyayı FileInputStream içine parametre olarak vererek okuma işlemi yapacağız.
		
		FileInputStream fis2=null; //fis2 finally bloğunda da görülebilsin diye try dışında tanımladık ve close() metodu başlangıç değeri istediği için null ataması yaptık.
		
		try {
			
			fis2=new FileInputStream("C:/javaFiles/hello.txt"); //absolute path yani kesin yol. Program dosyayı bulamama hatası öngördüğü için bizi try-catch ile sarmalatmaya zorladı.
			
			//Karakterlerin hepsini tek seferde okuyabilmek için while döngüsünde read() metodundan aldığımız int değeri değişkene atayıp -1 değilse koşulunda char'a cast edip karakterleri tek tek yazdırıyoruz.
			//read() metodu dosyanın sonuna geldiğinde yani okuyacak data kalmadığında geriye -1 döndüğü için bu şekilde dosyanın sonuna gelene kadar karakterleri yazdırmış oluyoruz. Dosyanın sonuna gelince -1 döneceği için döngü sonlanacak.
			//read() metodu kullanınca program input output hatası öngördüğü için IOException catch bloğu da ekliyoruz.
			int okunanKarakter; 
			while( (okunanKarakter=fis2.read()) != -1 ) { //read() metodu direkt değer döndüğü için mecburen while döngüsünde değişkene atayıp o değişkeni yazdırıyoruz.
				System.out.print((char)okunanKarakter);
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde okunacak dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Okuma işleminde bir hata meydana geldi...");
		} finally {
			try {
				fis2.close(); //Dosyayla işimiz bittikten sonra bellekte yer kaplamasın diye ve catch bloklarına düşse bile kapatılabilsin diye finally bloğu içinde close() ile kapatıyoruz ama bu işlem içinde input output hatası öngördüğü için burda da try-catch sarmalaması yapmak zorunda kalıyoruz.
			} catch (IOException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
				System.out.println("Dosya kapatma işleminde bir hata meydana geldi...");
			}
		}
		
		System.out.println("\n----------------------------------------");
		
		System.out.println(dosyaOku("C:/javaFiles/hello.txt")); //Okuma işlemini metoda çeviriyoruz ve sadece okunacak dosyayı parametre olarak dışardan alıp geriye dosya içindeki metini geri dönüyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println(dosyaOku("C:/javaFiles/hello.txt",15,11)); //Okuma işlemini metoda çeviriyoruz ve okunacak dosyayı, atlanacak karakter sayısını ve atlandıktan sonra okunacak karakter sayısını parametre olarak dışardan alıp geriye dosya içindeki istenile kısmı geri dönüyoruz.
		
		System.out.println("----------------------------------------");
		
		System.out.println("Okuma işlemi tamamlandı...");
		
	}
	
	public static String dosyaOku(String dosyaYolu) { 
		
		FileInputStream fis=null; //fis finally bloğunda da görülebilsin diye try dışında tanımladık ve close() metodu başlangıç değeri istediği için null ataması yaptık.
		String metin=""; //metin try bloğunun dışında return ettiğimiz için tanımlamayı dışarda yapıyoruz ve başlangıç değeri gerektiği için null yazarsak onu da çıktı da vereceği için boş bir String oluşturuyoruz.
		
		try {
			
			fis=new FileInputStream(dosyaYolu); //Okunacak dosyayı parametre olarak dışardan alıyoruz. Program dosyayı bulamama hatası öngördüğü için bizi try-catch ile sarmalatmaya zorladı.
		
			//Karakterlerin hepsini tek seferde okuyabilmek için while döngüsünde read() metodundan aldığımız int değeri değişkene atayıp -1 değilse koşulunda char'a cast edip karakterleri tek tek alıp String ifade olan metin'e ekliyoruz.
			//read() metodu dosyanın sonuna geldiğinde yani okuyacak data kalmadığında geriye -1 döndüğü için bu şekilde dosyanın sonuna gelene kadar karakterleri eklemiş oluyoruz. Dosyanın sonuna gelince -1 döneceği için döngü sonlanacak.
			//read() metodu kullanınca program input output hatası öngördüğü için IOException catch bloğu da ekliyoruz.
			int okunanKarakter;
			while( (okunanKarakter=fis.read() ) != -1 ) {
				metin+=(char)okunanKarakter; //Okuduğumuz her karakteri metin içine ekletiyoruz.
			}
			
			} catch (FileNotFoundException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
				System.out.println("Sistemde okunacak dosya bulunamadı...");
			} catch (IOException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
				System.out.println("Okuma işleminde bir hata meydana geldi...");
			} finally {
				try {
					fis.close(); //Dosyayla işimiz bittikten sonra bellekte yer kaplamasın diye ve catch bloklarına düşse bile kapatılabilsin diye finally bloğu içinde close() ile kapatıyoruz ama bu işlem içinde input output hatası öngördüğü için burda da try-catch sarmalaması yapmak zorunda kalıyoruz.
				} catch (IOException e) {
					//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
					System.out.println("Dosya kapatma işleminde bir hata meydana geldi...");
				}
			}
		return metin;
	}
	
	public static String dosyaOku(String dosyaYolu, int baslangic, int okunacakKarakterSayisi) {
		
		FileInputStream fis=null; //fis finally bloğunda da görülebilsin diye try dışında tanımladık ve close() metodu başlangıç değeri istediği için null ataması yaptık.
		String metin=""; //metin try bloğunun dışında return ettiğimiz için tanımlamayı dışarda yapıyoruz ve başlangıç değeri gerektiği için null yazarsak onu da çıktı da vereceği için boş bir String oluşturuyoruz.
		
		try {
			
			fis=new FileInputStream(dosyaYolu); //Okunacak dosyayı parametre olarak dışardan alıyoruz. Program dosyayı bulamama hatası öngördüğü için bizi try-catch ile sarmalatmaya zorladı.
			
			fis.skip(baslangic); //FileInputStream üzerinden skip() metodunu çağırıyoruz. Bu metot içine verilen parametre kadar byte yani karakter atlıyor.
			
			//Karakterlerin hepsini tek seferde okuyabilmek için while döngüsünde read() metodundan aldığımız int değeri değişkene atayıp -1 değilse koşulunda char'a cast edip karakterleri tek tek alıp String ifade olan metin'e ekliyoruz.
			//read() metodu dosyanın sonuna geldiğinde yani okuyacak data kalmadığında geriye -1 döndüğü için bu şekilde dosyanın sonuna gelene kadar karakterleri eklemiş oluyoruz. Dosyanın sonuna gelince -1 döneceği için döngü sonlanacak.
			//read() metodu kullanınca program input output hatası öngördüğü için IOException catch bloğu da ekliyoruz.
			int okunanKarakter;
			while( (okunanKarakter=fis.read()) != -1 ) {
				metin+=(char)okunanKarakter;
				if(metin.length()==okunacakKarakterSayisi) //Okunacak karakter sayısını da dışardan aldığımız için o kadar karakter okunduysa okumaya devam etmesin ve break ile döngüden çıksın diye metin uzunluğunu okunacak karakter sayısına eşit olduğu şartı ekliyoruz.
					break;
			}
			
			} catch (FileNotFoundException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
				System.out.println("Sistemde okunacak dosya bulunamadı...");
			} catch (IOException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
				System.out.println("Okuma işleminde bir hata meydana geldi...");
			} finally {
				try {
					fis.close(); //Dosyayla işimiz bittikten sonra bellekte yer kaplamasın diye ve catch bloklarına düşse bile kapatılabilsin diye finally bloğu içinde close() ile kapatıyoruz ama bu işlem içinde input output hatası öngördüğü için burda da try-catch sarmalaması yapmak zorunda kalıyoruz.
				} catch (IOException e) {
					//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
					System.out.println("Dosya kapatma işleminde bir hata meydana geldi...");
				}
			}
		return metin;
	}
	
}
