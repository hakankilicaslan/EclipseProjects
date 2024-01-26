
package _32_FileIO_InputOutputIslemleri;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_FileReader {

	public static void main(String[] args) {

		//Projemize sağ tıklayıp New -> Untitled Text File seçip içine metin girdikten sonra Ctrl+S basıp dosyamıza isim olarak ogrenciler.txt veriyoruz.
		//Daha sonra içinde bulunduğumuz projeyi seçerek projenin bulunduğu klasöre txt uzantılı dosyamızı kaydedebiliyoruz.
		
		//Metin belgesi ogrenciler.txt içindeki bilgilerden Ogrenci nesnesi oluşturalım ve bu nesneleri bir ArrayList içine atalım ve ArrayListteki bilgileri yazdıralım.
		
		List<Ogrenci> ogrenciListesi=new ArrayList<>(); //içine Ogrenci alan bir ArrayList oluşturuyoruz.
		
		//try-with-resources kullanarak parantez içine Scanner nesnesi oluşturuyoruz ve kaynak olarak FileReader nesnesi oluşturup onun da içine oluşturduğumuz dosyayı veriyoruz.
		try(Scanner sc=new Scanner(new FileReader ("ogrenciler.txt"))){
			
			while(sc.hasNextLine()) { //Scanner nesnesi üzerinden hasNextLine() metodunu çağırıyoruz ve while döngüsü içinde bir sonraki satır varsa şartı koyuyoruz.
				String okunanSatir=sc.nextLine(); //nextLine() metodu ile her satırı String ifadeye atıyoruz. Bu şekilde karakter karakter değil satır satır okuma yapıyoruz.
				String[] dizi=okunanSatir.split(","); //Aldığımız her satırı split() metodunu kullanarak virgülden sonra ayır diyerek bir String dizisine atıyoruz.
				//Dizinin ilk elemanı dizi[0] öğrenci ad ve soyadı olduğu için trim() metoduyla boşluk varsa hata almamak için onlardan kurtarıp oluşturduğumuz Ogrenci nesnesinin ilk parametresi olan adSoyad kısmına atıyoruz.
				//Dizinin ikinci elemanı dizi[1] öğrenci numarası olduğu için trim() metoduyla boşluk varsa hata almamak için onlardan kurtarıp String olan ifadeyi Integer.parseInt() metoduyla int'e çevirip Ogrenci nesnesinin ikinci parametresi olan ogrNo kısmına atıyoruz.
				Ogrenci ogr=new Ogrenci(dizi[0].trim(), Integer.parseInt(dizi[1].trim()));
				ogrenciListesi.add(ogr); //Oluşturduğumuz Ogrenci nesnesini içine Ogrenci alan ogrenciListesi ArrayList içine ekliyoruz.
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı FileNotFoundException hatası.
			System.out.println("Sistemde dosya bulunamadı...");
		}
		
		for (Ogrenci ogr : ogrenciListesi) { //foreach döngüsü kullanarak ogrenciListesi içindeki öğrencileri tek tek yazdırıyoruz.
			System.out.println(ogr);
		}
	}

}
