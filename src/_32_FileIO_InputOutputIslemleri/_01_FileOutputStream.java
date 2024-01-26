package _32_FileIO_InputOutputIslemleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO -> Input Output -> Giriş Çıkış : Byte byte gerçekleştirilir. 8 bit = 1 byte = 1 karakter
 * Source -> Stream -> Destination : Kaynaktan bir stream(akış) yaratarak verilerimizi hedefimize gönderiyoruz.
 * 
 * System.out.println("Merhaba"); //System.out diyerek console'a programdan veri çıktısı yapmış oluyoruz.
 *  
 * OutputStream: Yazma işlemleri için kullanılan abstract sınıftır. Bu sınıfı kullanarak istediğimiz kaynağa, dosyaya yazma işlemini gerçekleştirebiliriz.
 * Java Programı -> FileOutputStream -> Dosya: Bu şekilde akışımız oluşacak yani kaynağımız Java programı olacak hedefimizde dosya olacak. Önemli metotları:
 * write(): byte şeklindeki verileri yazmak için kullanılır. Parametre olarak int(ascii code), karakter ve byte dizisi alabilir.
 * flush(): Tamponlanmış veriyi hızlı bir şekilde yazmayı sağlar.
 * close(): Outputstream'i kapatmaya yarar.
 *  
 * OutputStream metotları throws IOException(InputOutputExcepiton) içerdikleri için metotları kullanırken try-catch bloğuyla sarmalamamız gerekiyor.
 * 
 */

public class _01_FileOutputStream {

	public static void main(String[] args) {
		
		/*
		 * İlk olarak bir dosyaya yazı yazmak için bir FileOutputStream nesnesine ihtiyacımız var. FileOutputStream constructor türlerinde genel kullanımda 4 çeşit var.
		 * İlki FileOutputStream nesnesine parametre olarak File türünde nesne alan versiyondur. Bunun için bir File nesnesi oluşturup onun referansını parametre olarak yazmalıyız. Buna relative path yani göreceli yol denir.
		 * İkincisi FileOutputStream nesnesine parametre olarak String türünde direkt dosyanın kesin yolunu yazdığımız versiyonudur. Bu kullanımda bilgisayarımızdaki dosyanın kesin yolunu yazıyoruz. Buna da absolute path yani kesin yol denir.
		 * Üçüncü ve dördüncü kullanımlar ise FileOutputStream nesnesine parametre olarak File ya da String dosya yolu verildikten sonra ikinci parametre olarak boolean append verilen versiyonlardır.
		 * İkinci parametre olan append boolean olduğu için sadece true ya da false alabilir. 
		 * true seçtiğimizde write() metodunu kullandıktan sonra tekrar write() metoduyla bir şey yazdığımızda mevcut yazıya ekleme yapıyor yani önceki yazılanı silmeyip kaydedip yenisini yanına ekliyor. -> Önceki yazılanları tutar kaydeder. Burada, olan dosyayı tutup ona ek olarak yazmaya devam ediyor.
		 * false seçtiğimizde write() metodunu kullandıktan sonra tekrar write() metoduyla bir şey yazdığımızda mevcut yazıyı siliyor yani önceki yazılanı siliyor onun yerine yenisini yazıyor. -> Önceki yazılanları siler onun üstüne yazar. Burada, her seferinde yeni dosya oluşturup tekrar yazıyor gibi
		 * 
		 */
		
		//Yeni bir File nesnesi oluşturduk ve içine parametre olarak text uzantılı bir dosya verdik. Bu dosya oluşturulurken içinde bulunduğumuz Java projesi nerdeyse onun bulunduğu klasöre oluşturuyor.
		//Dosya oluştuktan sonra Java içinde bu sınıfın olduğu projeyi sağ tıklayıp refresh ettiğimizde packageların altına belge.txt dosyası da geliyor, görüntüleyebiliyoruz.
		//File sınıfı üzerinden parametre olarak dosyayı vererek oluşturmanın yanı sıra direkt FileOutputStream içine parametre olarak belge.txt diye verdiğimizde File nesnesi kullanmadan da yine projenin içinde bulunduğu klasöre dosyamızı oluşturabiliyoruz.
		File file=new File("belge.txt"); 
		
		FileOutputStream fos1=null; //fos1 finally bloğunda da görülebilsin diye try dışında tanımladık ve close() metodu başlangıç değeri istediği için null ataması yaptık.
		
		try {
			//append'li versiyon kullanmamamıza rağmen default olarak false olan versiyonu kullanmış sayılıyoruz yani tekrar write() metoduyla yazma işlemi yaptığımızda öncekini silip yerine yeni yazdığımızı yazıyor.
			fos1=new FileOutputStream(file); //relative path yani göreceli yol. Program dosyayı bulamama hatası öngördüğü için bizi try-catch ile sarmalatmaya zorladı. 
			//FileOutputStream referansı fos1 üzerinden write() metodunu çağırarak oluşturulan dosya içine yazabiliyoruz. write() metodu kullanınca program input output hatası öngördüğü için IOException catch bloğu da ekliyoruz.
			//write() metodu parametre olarak içine int alabiliyor. Bu değer karakterlerin ascii code karşılıkları olmalı ya da char olarak tek tırnak içinde karakterleri de yazabiliriz.
			fos1.write(72); //72->H
			fos1.write('A');
			fos1.write('K');
			fos1.write('A');
			fos1.write('N');
			//fos1.write("HAKAN"); //FileOutputStream sınıfındaki write() metodu parametre olarak String ifade alamaz. Bundan dolayı kelime kelime yazdırma işlemi yapamayız.
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Yazma işleminde bir hata meydana geldi...");
		} finally {
			try {
				fos1.close(); //Dosyayla işimiz bittikten sonra bellekte yer kaplamasın diye ve catch bloklarına düşse bile kapatılabilsin diye finally bloğu içinde close() ile kapatıyoruz ama bu işlem içinde input output hatası öngördüğü için burada da try-catch sarmalaması yapmak zorunda kalıyoruz.
			} catch (IOException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
				System.out.println("Dosya kapatma işleminde bir hata meydana geldi...");
			}
		}
		
		//Yukarıda projenin olduğu klasöre File sınıfını kullanarak yeni bir dosya açmıştık ve o dosyayı parametre olarak gösterip içine yazma işlemi yaptık.
		//İkinci kullanımda String ifade olarak dosyanın tam adresini yazıp orda dosya oluşturarak o dosya üzerine yazma işlemi yapacağız.
			
		FileOutputStream fos2=null; //fos2 finally bloğunda da görülebilsin diye try dışında tanımladık ve close() metodu başlangıç değeri istediği için null ataması yaptık.
		
		try {
			//append true versiyonu kullanıyoruz. Bu yazma işlemi bittikten sonra tekrar write() metoduyla yazma işlemi yapıldığında bu yazdıklarımızı tutup yeni yazılanı ona ekleyecek yani true diyerek dosya sonuna ekleme yapılabileceğini belirtiyoruz.
			fos2=new FileOutputStream("C:/javaFiles/hello.txt",true); //absolute path yani kesin yol. Program dosyayı bulamama hatası öngördüğü için bizi try-catch ile sarmalatmaya zorladı.
						
			byte[] byteDizisi= {'U','E','F','A'}; //İçine karakterler alan bir byte dizisi oluşturuyoruz.
			fos2.write(byteDizisi); //write() metodu parametre olarak içine byte dizisi de alabiliyor. Bu şekilde tek tek karakterleri yan yana yazdırabiliyoruz.
			
			String takim=" SAMPIYONU ";
			byte[] byteDizisi2=new byte[takim.length()]; //Bir byte dizisi oluşturuyoruz ve boyut olarak oluşturduğumuz String ifadenin uzunluğunu veriyoruz.
			
			for (int i = 0; i < takim.length(); i++) { //String ifadenin uzunluğu kadar dönen bir for döngüsü oluşturuyoruz.
				byteDizisi2[i]=(byte)takim.charAt(i); //String ifadenin her bir karakterini byte'a cast ederek oluşturduğumuz byte dizisine eleman olarak atıyoruz.
			}
			fos2.write(byteDizisi2); //Oluşturduğumuz byte dizisini write() metoduyla dosyamızın içine yazabiliyoruz.
			
			String sampiyon="GALATASARAY ";
			fos2.write(sampiyon.getBytes()); //Oluşturduğumuz String üzerinden getBytes() metodunu çağırırsak bu metot geriye String içindeki ifadeleri bir byte dizisi olarak dönüyor. write() metodu da parametre olarak byte dizisi istediği için bu şekilde daha kolay bir yoldan yazdırabiliyoruz.
			
			//Programı her çalıştırdığımızda append true belirttiğimiz kısımda olan write() metotları içindeki ifadeleri tekrar tekrar yazıyor.
			//Yazma işlemini her zaman yana doğru yapıyor yani alt satıra geçmiyor. Alt satıra geçmek için escape karakter olan \n kullanmamız gerekiyor. 
			//Yazma işlemlerinde Türkçe karakter kullansakta sorun olmuyor yazıyor ama okuma işlemi yaparken Türkçe karakterler olduğunda çıktı da Türkçe karakterleri doğru getirmeyebilir.
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Yazma işleminde bir hata meydana geldi...");
		} finally {
			try {
				fos2.close(); //Dosyayla işimiz bittikten sonra bellekte yer kaplamasın diye ve catch bloklarına düşse bile kapatılabilsin diye finally bloğu içinde close() ile kapatıyoruz ama bu işlem içinde input output hatası öngördüğü için burda da try-catch sarmalaması yapmak zorunda kalıyoruz.
			} catch (IOException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
				System.out.println("Dosya kapatma işleminde bir hata meydana geldi...");
			}
		}
		
		System.out.println("Yazma işlemi tamamlandı...");
		
	}

}
