package _32_FileIO_InputOutputIslemleri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class _03_FileCopy {

	//Bir dosyayı kopyalamak için FileInputStream kullanarak dosya içindeki dataları(txt,jpg vb.) read() metoduyla okuyup Integer eleman tutan bir ArrayList içine ekliyoruz.
	//Daha sonra FileOutputStream kullanarak write() metoduyla ArrayList içindeki dataları tek tek yeni oluşturacağımız dosya içine yazıyoruz. Bu şekilde dosyamızın bir kopyasını oluşturmuş oluyoruz.
	//Metotlarımızı ve ArrayList'imizi aynı sınıf içinde oluşturduğumuzdan main içinden ulaşılacağı için static olarak tanımlıyoruz.
	
	public static ArrayList<Integer> dosyaIcerik=new ArrayList<>();
	
	public static void main(String[] args) {
		
		dosyaOkuyarakArrayListeKaydet("C:/javaFiles/hello.txt"); //Verilen dosya okuma işlemiyle ArrayList içine ekleniyor.
		
		arrayListiYazarakDosyayaKaydet("C:/javaFiles/helloCopy.txt"); //ArrayListteki datalar yazma işlemiyle oluşturulacak kopyanın içine yazılıyor.
		
		try {
			dosyaKopyala("C:/javaFiles/hello.txt", "C:/javaFiles/helloCopy.txt"); //Metodumuz exception fırlattığı için metodu çağırırken mecbur try-catch bloğuyla sarmalıyoruz.
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Dosya kopyalama işleminde bir hata meydana geldi...");
		}
		
		System.out.println("Dosyanın bir kopyası oluşturuldu.");
		
	}
	
	public static void dosyaOkuyarakArrayListeKaydet(String dosyaYolu) {
		
		FileInputStream fis=null; //fis finally bloğunda da görülebilsin diye try dışında tanımladık ve close() metodu başlangıç değeri istediği için null ataması yaptık.
		
		try {
			
			fis=new FileInputStream(dosyaYolu); //Okunacak dosyayı parametre olarak dışardan alıyoruz. Program dosyayı bulamama hatası öngördüğü için bizi try-catch ile sarmalatmaya zorladı.
		
			int okunanKarakter;
			while( (okunanKarakter=fis.read()) != -1 ) { //Dosyanın içindeki bütün dataları okuyabilsin diye while döngüsü içinde gelen değer -1 olmayana kadar read() metoduyla int değerleri alıyoruz.
				dosyaIcerik.add(okunanKarakter); //Aldığımız değerleri add() metoduyla int eleman tutan ArrayList içine ekliyoruz.
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
		
	}

	public static void arrayListiYazarakDosyayaKaydet(String dosyaYolu) {
		
		FileOutputStream fos=null; //fos finally bloğunda da görülebilsin diye try dışında tanımladık ve close() metodu başlangıç değeri istediği için null ataması yaptık.
		
		try {
			
			fos=new FileOutputStream(dosyaYolu); //Yazılacak dosyayı parametre olarak dışardan alıyoruz. Program dosyayı bulamama hatası öngördüğü için bizi try-catch ile sarmalatmaya zorladı.
			
			for (Integer data : dosyaIcerik) { //foreach metoduyla ArrayList içindeki elemanları yani dataları dolaşıyoruz.
				fos.write(data); //write() metoduyla dataları tek tek yeni oluşturacağımız kopya dosyanın içine yazıyoruz.
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Yazma işleminde bir hata meydana geldi...");
		} finally {
			try {
				fos.close(); //Dosyayla işimiz bittikten sonra bellekte yer kaplamasın diye ve catch bloklarına düşse bile kapatılabilsin diye finally bloğu içinde close() ile kapatıyoruz ama bu işlem içinde input output hatası öngördüğü için burda da try-catch sarmalaması yapmak zorunda kalıyoruz.
			} catch (IOException e) {
				//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
				System.out.println("Dosya kapatma işleminde bir hata meydana geldi...");
			}
		}
		
	}
	
	public static void dosyaKopyala(String kopyalanacakDosya, String kopyaDosya) throws IOException{
		
		FileInputStream fis=new FileInputStream(kopyalanacakDosya); //FileInputStream nesnesi oluşturup içerisine parametre olarak kopyalanacak dosyanın yolunu yazıyoruz.
		FileOutputStream fos=new FileOutputStream(kopyaDosya); //FileOutputStream nesnesi oluşturarak içerisine parametre olarak kopya olacak dosyanın yolunu yazıyoruz.
			
		 	//read() metoduyla geriye -1 dönene kadar yani kopyalanacak dosyadaki data kalmayana kadar tek tek dataları okuyoruz.
			//Okuduğumuz dataları tek tek write() metoduyla kopya olacak dosya içerisine yazıyoruz. Bu şekilde elimizdeki dosyanın kopyasını oluşturmuş oluyoruz.
			int okunanKarakter;
			while( (okunanKarakter=fis.read()) != -1 ) { 
				fos.write(okunanKarakter); 
			}
		fis.close(); //Dosyayla işimiz bittikten sonra bellekte yer kaplamasın diye close() ile kapatıyoruz.
		fos.close(); //Dosyayla işimiz bittikten sonra bellekte yer kaplamasın diye close() ile kapatıyoruz.
		
	}
	
}
