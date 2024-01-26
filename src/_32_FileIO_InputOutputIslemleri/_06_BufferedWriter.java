package _32_FileIO_InputOutputIslemleri;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _06_BufferedWriter {

	public static void main(String[] args) {

		//Buffered kullanımı tamponlama işlemi olarak geçiyor. Daha hızlı ve performanslı yazma ve okuma işlemi yapıyor. Bundan dolayı büyük dosyalar için Buffered kullanmak daha doğru olur.
		
		//try-with-resources kullanarak parantez içine BufferedWriter nesnesi oluşturuyoruz ve kaynak olarak FileWriter nesnesi oluşturup onun da içine oluşturduğumuz dosyayı veriyoruz.
		//FileWriter içine append true versiyonu kullanıyoruz. Bu yazma işlemi bittikten sonra tekrar write() metoduyla yazma işlemi yapıldığında bu yazdıklarımızı tutup yeni yazılanı ona ekleyecek yani true diyerek dosya sonuna ekleme yapılabileceğini belirtiyoruz.
		try(BufferedWriter writer=new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
			
			//BufferedWriter sınıfında da writer() metodu kullanırken parametre olarak String bir ifade verebiliyoruz.
			writer.write("Hakan Kılıçaslan, 456 \n");
			writer.write("Selma Kılıçaslan, 756 \n");
			writer.write("Seda Gelişken, 777 \n");
			writer.write("Burak Gelişken, 160 \n"); 
			
			
		} catch (IOException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı IOException hatası.
			System.out.println("Yazma işleminde bir hata meydana geldi...");
		}
		
		System.out.println("Yazma işlemi tamamlandı...");
		
	}

}
