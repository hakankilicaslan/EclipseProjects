package _32_FileIO_InputOutputIslemleri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class _13_CompositeDeSerialization {

	public static void main(String[] args) {

		//try-with-resources kullanarak parantez içine ObjectInputStream nesnesi oluşturuyoruz ve kaynak olarak FileInputStream nesnesi oluşturup onun da içine oluşturduğumuz dosyayı veriyoruz.
		try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("otomobiller.bin"))){
			
			//ObjectInputStream üzerinden readObject() kullanarak nesne okuması görüntülemesi yapıyoruz.
			//readObject() metodu geriye Object döndüğü için okuduğumuz nesneleri ArrayList'e cast ediyoruz.
			//Bu şekilde dosya içine ArrayList olarak kaydettiğimiz nesneleri readObject() kullanarak Bir ArrayList'e atayıp görüntüleyebiliyoruz.
			@SuppressWarnings("unchecked") //Objecti ArrayListe cast ettiğimiz için Java type safety olabileceğini öngörerek uyarı veriyor. Java tip güvenliğine çok önem veriyor.
			ArrayList<Otomobil> okunanArrayList=(ArrayList<Otomobil>)objectInputStream.readObject();
			
			for (Otomobil oto : okunanArrayList) {
				System.out.println(oto);
			}
			
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
		
	}

}
