package _32_FileIO_InputOutputIslemleri;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Date;

public class _14_FileMethods {

	public static void main(String[] args) throws IOException { //Input Output hatası alabileceğimiz için direkt main metodumuza throws IOException ekliyoruz.

		File file=new File("C:/javaFiles/hello.txt"); //Bir File nesnesi oluşturup parametre olarak dosyamızın kesin yolunu veriyoruz.
		
		System.out.println("Bu dosya mevcut mu.........."+file.exists()); //exists() ile dosyanın olup olmadığını sorguluyoruz. Verilen dosya varsa true yoksa false dönüyor.
		
		System.out.println("Bu dosyanın tam yolu........"+file.getAbsolutePath()); //getAbsolutePath() metodu dosyanın kesin yolunu dönüyor.
		
		System.out.println("Bu dosyanın adı............."+file.getName()); //getName() metodu sadece dosyanın adını dönüyor.
		
		System.out.println("Bu dosyanın konumu.........."+file.getParent()); //getParent() metodu dosyanın konumunu yani içinde bulunduğu klasörün kesin yolunu dönüyor.
		
		System.out.println("Bu bir dosya mıdır.........."+file.isFile()); //isFile() ile verilen parametrenin bir dosya olup olmadığını sorguluyoruz. Dosya ise true değilse false dönüyor.
		
		System.out.println("Bu bir dizin midir.........."+file.isDirectory()); //isDirectory() ile verilen parametrenin bir klasör olup olmadığını sorguluyoruz. Klasör ise true değilse false dönüyor.
		
		System.out.println("Bu dosyanın boyutu.........."+file.length()+" byte"); //length() metodu dosyanın boyutunu byte olarak dönüyor.
		
		System.out.println("Dosya değiştirilme tarihi..."+file.lastModified()); //lastModified() metodu dosyanın değiştirilme tarihini Epoch Time olarak dönüyor.
		System.out.println("Dosya değiştirilme tarihi..."+new Date(file.lastModified())); //Date nesnesi içine atarak Date formatında dosyanın değiştirilme tarihini dönüyor.
		
		Path path=Path.of("C:/javaFiles/helloCopy.txt"); //Path.of() metoduyla parametre olarak verdiğimiz kesin yolu bir Path'e çeviriyoruz.
		
		Files.delete(path); //delete() metodu parametre olarak verilen Path içindeki dosyayı silmemize yarıyor. Dosya yoksa NoSuchFileException hatası fırlatıyor.
		
	    System.out.println("Dosya silindi mi............"+Files.deleteIfExists(path)); //deleteIfExists() metodu parametre olarak verilen Path içindeki dosyayı varsa siliyor yani dosya varsa siliyor ve geriye true dönüyor yoksa false dönüyor.
		
		Files.copy(Path.of("C:/javaFiles/hello.txt"), Path.of("C:/javaFiles/helloCopy.txt")); //copy() metoduyla parametre olarak kopyalanacak dosyanın Path'ini ve kopya dosyanın Path'ini vererek o dosyanın kopyasını verilen ikinci Path deki kesin yola o isimle kopyalıyor.
		
		Files.copy(Path.of("C:/javaFiles/hello.txt"), Path.of("C:/javaFiles/helloCopy.txt"), StandardCopyOption.REPLACE_EXISTING); //copy() metodunda parametre olarak StandardCopyOption.REPLACE_EXISTING kullandığımız da üzerine yazma işlemi yapmış oluyoruz yani dosya içinde bir değişiklik yapıldıysa bu şekilde önceki silinip yerine bu kopyalanmış oluyor
		
		Files.move(Path.of("C:/javaFiles/helloCopy.txt"), Path.of("C:/javaFiles/kopyalar/helloCopy.txt")); //move() metoduyla parametre olarak taşınacak dosyanın Path'ini ve taşınacağı yerin Path'ini vererek o dosyayı verilen ikinci Path deki kesin yola o isimle taşıyor.
				
	}

}
