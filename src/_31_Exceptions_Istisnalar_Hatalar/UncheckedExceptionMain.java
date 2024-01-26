package _31_Exceptions_Istisnalar_Hatalar;

public class UncheckedExceptionMain {
/*
 * Unchecked Exception(Kontrol Edilemeyen Exception) -> RuntimeException > ArithmeticException, ClassCastException, NullPointerException, IndexOutOfBoundException, NumberFormatException, IllegalArgumentException, IllegalStateException...
 * Unchecked Exceptionlar programın bizi try-catch için zorlamadığı oluşabilecek bir hata varsa bunu kullanıcıya bıraktığı durumlardaki exceptionlara denir. Runtime Exceptionlardır.
 * Program bu durumlarda programcıya bıraktığı için try-catch sarmalamasına ya da throw declaration eklemeye zorlamıyor. Derleyici bu tür exceptionları kontrol edemez. 
 * Kullanıcı try-catch bloğu kullanarak hata oluştuğu durumda programın sonlanması önler ve hata fırlatılarak hata oluşan yerle ilgili bilgi verilir.
 * try-catch sarmalaması yapmak istediğimiz yeri seçip sağ tıklayıp Surround With -> Try/catch Block diyerek try-catch bloğunu hazır oluşturabiliriz.
 * 
 * Sıfıra bölme hatasında Exception çıktısı ne anlama geliyor:
 * Exception in thread "main" -> Main Thread'de bir exception oluştu demektir.
 * java.lang.ArithmeticException -> Bu hatanın oluştuğu sınıf tarafından fırlatılan exception türünü gösteriyor.
 * / by zero -> Mesaj olarak sıfıra bölünme hatası olduğu söylüyor.
 */
	public static void main(String[] args) {

		System.out.println("Program çalışmaya başladı...");
		
		System.out.println("----------------------------------------");
		
		int a=10;
		int b=0;		
		//double sonuc=a/b; işlemi yaptırdığımızda hata alacağız ama program bunu öngörüp handle etmemizi istemiyor yani kullanıcının öngörmesi ve handle etmesi gerekiyor.
		//Hata olabilecek kısmı try bloğuna hata olursa yapacağı işlemleri catch bloğuna ekliyoruz. try bloğunda hata olabilecek durumu deniyor ve hata olursa catch bloğuna geçip ordaki işlemi yapıyor yani hata fırlatıyor.
		try {
			double sonuc=a/b; //Çalıştırılmadan önce herhangi bir uyarı vermedi. Biz kendimiz try-catch bloğu içine aldık -> UNCHECKED EXCEPTION
			System.out.println(sonuc);
		} catch (ArithmeticException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı ArithmeticException hatası
			System.out.println("Sıfıra bölme hatası var...");
		}
		
		System.out.println("----------------------------------------");
		
		try {
			sifiraBolme(); //throws declaration kullandığımız için metodu try-catch ile sarmalıyoruz.
		} catch (Exception e) { //catch kısmına Exception yazsakta hata ArithmeticException sınıfından geldiği için sistem ArithmeticException hatası fırlatıyor.
			//e.printStackTrace(); //Sistemin fırlatacağı ArithmeticException hatası
			System.out.println("Arithmetic Exception tespit edildi. Sıfıra bölme hatası var...");
		}
		
		System.out.println("----------------------------------------");
		
		//try-catch bloğu içinde iki tane hata alabilecek durum varsa try bloğu ilk hatayla karşılaştığında ikinci durumu denemiyor ve ilgili catch bloğuna geçiyor.
		//parseInt() metodunda da boyu integer'a dönüştürürken NumberFormatException hatası yakalayacağımıza rağmen try bloğu çalışmaya devam etmediği için ordaki hatayı yakalayamıyoruz. 
		//Bundan dolayı birbirinden alakasız durumlar için tek try bloğu içine birden fazla hata olabilecek durumların hepsini peş peşe yazmak doğru değil.
		try {
			String ad="Hakan";
			//String ad=null; //NullPointerException hatası alacağımız için try bloğu çalışmaya devam etmeyecek ve NullPointerException catch bloğuna geçecek.
			ad.length(); 
			System.out.println("try bloğu çalışmaya devam ediyor...");
			String boy="193cm";
			int i=Integer.parseInt(boy);
			System.out.println(i);
		} catch (NullPointerException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı NullPointerException hatası
			System.out.println("NullPointer Exception catch kısmı çalıştı...");
		} catch (NumberFormatException e) {
			//e.printStackTrace(); //Sistemin fırlatacağı NumberFormatException hatası
			System.out.println("NumberFormat Exception catch kısmı çalıştı...");
		} 
		
		System.out.println("----------------------------------------");
		
		System.out.println("Program çalışmaya devam ediyor..."); //Hata olabilecek durumları try-catch bloğu ile sarmalattığımız için artık program hata fırlattığında durmayacak ve bu satıra kadar çalışmaya devam edecek.
		
	}
	
	//ArithmeticException Unchecked Exception olduğu için throws ArithmeticException kullanırsak sifiraBolme() çağırıldığında try-catch sarmalamasını zorunlu kılmıyor.
	//Ama üst sınıf olan Exception ile throw declaration kullandığımızda throws Exception yazdığımızda sifiraBolme() çağırıldığında try-catch sarmalamasını zorunlu kılıyor.
	//Exception kullanmamıza rağmen hata ArithmeticException üzerinden geldiği için yine çıktı da ArithmeticException hatası gösteriyor. 
	//Exception ana sınıf olduğu için bütün hataları yakalıyor ve Exception üst sınıf olduğu için tüm exceptionlar doğrudan ya da dolaylı olarak bu sınıftan miras alıyorlar.
	public static void sifiraBolme() throws Exception { 
		int a=10;
		int b=0;
		double sonuc=a/b;
		System.out.println(sonuc);
	}
	
}
