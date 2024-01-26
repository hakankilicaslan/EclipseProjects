package _32_FileIO_InputOutputIslemleri;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _07_BufferedReader {

	public static void main(String[] args) {

		dosyadanSatirOkuma();
		
		System.out.println("--------------------");
		
		dosyaninTamaminiOkuma();
	}

	public static void dosyadanSatirOkuma() {
		
		//try-with-resources kullanarak parantez içine BufferedReader nesnesi oluşturuyoruz ve kaynak olarak FileReader nesnesi oluşturup onun da içine oluşturduğumuz dosyayı veriyoruz.
		try(BufferedReader reader=new BufferedReader(new FileReader("ogrenciler.txt"))){
			
			//BufferedReader kullanımında da Scanner nextline() kullanımındaki gibi readLine() metoduyla satır satır okuma yapılabilir.
			String okunanSatir=reader.readLine(); //readLine() metoduyla dosyamızın içindeki ilk satırı okumuş olduk.
			System.out.println(okunanSatir);
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Okuma işleminde bir hata meydana geldi...");
		}
		
	}
	
	public static void dosyaninTamaminiOkuma() {
		
		//try-with-resources kullanarak parantez içine BufferedReader nesnesi oluşturuyoruz ve kaynak olarak FileReader nesnesi oluşturup onun da içine oluşturduğumuz dosyayı veriyoruz.
		try(BufferedReader reader=new BufferedReader(new FileReader("ogrenciler.txt"))){
			
			String okunanSatir; 
			
			//BufferedReader üzerinden readLine() metodunu çağırarak satır satır okuma yapıyoruz. Geriye okuyacak satır kalmadıysa null döner.
			//Metot dosyadaki tüm satırları okuyana kadar yani geriye null dönene kadar while döngüsünde null olmadığı şarta sokuyoruz.
			while( (okunanSatir=reader.readLine()) != null ) {
				System.out.println(okunanSatir);
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde dosya bulunamadı...");
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Okuma işleminde bir hata meydana geldi...");
		}
		
	}

}
