package _DesignPatterns;
/*
 * Oluşturulan sınıfın sadece bir tane instance'i oluşturulmak istenirse kullanılır.
 * 
 * Neden kullanıcının istediği kadar nesne üretilmesini istemeyiz?
 * Bellek ve performans problemleri
 * 
 * Adım adım uygulaması: (Lazy)
 * 1. Singleton sınıfa ait olan default constructor private yapılmalıdır.
 *    Böylece sınıf dışından new keywordü ile nesne oluşturmak engellenmiş olur.
 * 2. Singleton sınıfı instance'i sınıf içinde private static olarak tutulmalıdır.
 * 3. Bu tutulan instance'i dönecek public ve static bir metot yazılmalıdır.
 * 4. Bu metot içinde instance boş ise yeni nesne üretilmelidir ama boş değilse yeni nesne üretilmemelidir.
 */
public class Singleton {

	public static void main(String[] args) {

		Araba a1=Araba.getInstance("Volkswagen");
		System.out.println(a1);
		a1=Araba.getInstance("Seat");
		System.out.println(a1);
		a1=Araba.getInstance("Volvo");
		System.out.println(a1);
		
		ArabaEager ae1=ArabaEager.getInstance();	
		System.out.println(ae1);
		ae1=ArabaEager.getInstance();
		System.out.println(ae1);
		ae1=ArabaEager.getInstance();
		System.out.println(ae1);
	}

}
