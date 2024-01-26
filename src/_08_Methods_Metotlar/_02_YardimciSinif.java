package _08_Methods_Metotlar;

public class _02_YardimciSinif {

	//Access Modifiers:
	//public: Her yerden erişilebilir. Package dışı packagelardan bile erişilebilir.
	//protected: Farklı packagelardan erişilemez. Aynı package içindeki sınıflardan erişilebilir.
	//private: Farklı packagelardan ve aynı package içindeki farklı sınıflardan erişilemez. Sadece yazıldığı sınıf içinde erişilebilir.
	//default: Hiçbir şey yazılmamış halidir. Farklı packagelardan erişilemez. Aynı package içindeki sınıflardan erişilebilir. Protected ile farkı miras alma olayıdır.
		
	//Yazacağımız metotları main metot içine tanımlayamıyoruz. Main metot bittikten sonra dışarda tanımlamalıyız ya da main metot olmayan farklı bir sınıfta tanımlamalıyız..
	
	//Bir metotun imzası başka bir metotla aynı olamaz yani isim ve parametre sayısı aynı olduğunda hata alırız. Bundan dolayı isimleri aynı ise ya parametre adetleri farklı olmalı ya da return tipleri farklı olmalıdır.
	
	//YardimciSinif içinde birden fazla aynı isimli metotlar var(max gibi). Bunlar aynı isimli ama farklı imzalara sahip olarak farklı işlevler yerine getirebilir. Buna da metot overloading denir.
	
	//Yazdığımız metotları static olarak tanımlıyoruz. Static class dosyası oluştuğu anda hazır demektir. Main metot static olduğu için yazdığımız metotlarda static olmalıdır.
		
	/**
	 * 2 sayıdan büyük olanı geri döner.
	 * @param sayi1 1.sayı int olmalıdır.
	 * @param sayi2 2.sayı int olmalıdır.
	 * @return: büyük olanı geri döner.
	 */

	//Metotun üst kısmına arayüzle ilgili bilgi vermek için üstteki gibi JavaDoc dökümantasyonu kullanabilirz.
	
	public static int max (int sayi1,int sayi2) { //Metot içindeki değişkenlerimizi tanımlarken ikisi içinde tiplerini ayrı giriyoruz. hem sayi1 hem sayi2 için int tanımlattık.

		if(sayi1>sayi2)
			return sayi1; //Geriye dönülecek değeri return ile yazdırıyoruz. return kısmında dönecek değerin return type ile uyumlu olması gerekir. Metot kısmında int max dediği için dönüceği değerinde int olması gerekiyor.
		else
			return sayi2; //Metotlar geriye tek değer döner. Burada koşul olduğu için iki return yazdık çünkü koşulu sağlarsa birisi sağlamazsa diğeri dönecek.
	}
	
	public static int max(int sayi1, int sayi2, int sayi3) { //Üstteki metotla aynı isimli bir metot daha yazdık ama hata almadık. Çünkü isimleri aynı olsa bile girilen parametre sayıları farklı olduğu için ikisi de çalışıyor. Hangi sayıda parametre girersek o metot çalışır.
		return sayi3;
	}
	
	public static double max (double sayi1, double sayi2) { //Yine metot ismimizi aynı girdik ama parametre tipimiz farklı olduğunda yine hata almaz. Girilen değişkenler double olduğunda bu metot çalışır.
		return sayi1;
	}
	
	public static int topla(int sayi3, int sayi4) { //İstediğimiz metotta iki parametre girdisi olduğu için çağırırken de iki parametre girerek çağırıyoruz. Daha az ya da daha fazla parametre giremeyiz. Ayrıca int girdiğimiz için çağırırken de int olarak çağırmalıyız.
		return sayi3+sayi4;
	}
	
	public static int karesi(int sayi1) { //Üstteki metotlarda da sayi1 tanımladık ama hata vermedi bloklar içinde tanımlanan değer o blok için geçerlidir.
		return sayi1*sayi1; //Bir metot en fazla bir return dönebilir. Altına bir return daha verip küpünü al komutu giremeyiz hata verir.
	}
	
	public static double gravity=9.8; //Gravity burada bir değişken olarak tanımlandı. Bunu çağırmak istediğimizde gravity olarak çağırıyoruz.
	public static double gravity() { // Gravity burada ise metot olarak tanımlandı. Bunu çağırmak istediğimizde gravity() olarak çağırıyoruz.
		return 9.8;
	}
	
	public static void isim() { //Bir metot değer dönmek zorunda değildir. Bu durumda dönüş tipi void olarak ifade edilir ve return hiç kullanılmayabilir ya da return; yazılabilir.
		System.out.println("Hakan");
	}
	
	//Varargs: Değişen sayıda parametre için varargs kullanıyoruz
	public static int cokluTopla(int...sayilar) { //Tek tek farklı sayıda parametre girilen metotları kullanmak yerine toplama için kullanıcı kaç tane değer girerse girsin varargs sayesinde onun toplamını dönüyor. İmza kısmına tanımlarken ... koyarak kullanıyoruz. Bu sayede sistem bunu bir dizi gibi görüyor ve girilen eleman kadar arka planda dizi oluşturarak toplayıp geri dönüyor.
		int toplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam+=sayilar[i];
		}return toplam;
	}
	
	//Parametre olarak primitive type veriyoruz. (pass-by-value)
	public static int artir1(int i) { //Primitive type kullanırken metotta aslında sadece j değişkenindeki değeri i değişkenine göndermiş olduk adresleri farklı olduğu için j=10 i=11 olarak kaldı. j değişkeninde herhangi bir değişiklik olmayacak.
		return ++i;
	}
	
	//Parametre olarak Referans Type veriyoruz.
	public static void artir2(Adet adet) { //Referans type kullanırken metotta adet nesnesine adetReferansi nesnenin adresini gönderiyor artık aynı adresi gösteriyorlar bu yüzden ikisinin değeri de 6 oldu.
		adet.i++;
	}
	
	public static void ekle(String yeniMetin) { //String özel durumundan dolayı primitive gibi davranıyor.
		yeniMetin+="TL";
	}
	
	public static void hizArtir(final int hiz) { //Eğer geçtiğimiz parametre değerinin değişmesini istemiyorsak final keywordü kullanabiliriz.
		int yeniHiz=hiz+30; //hiz final olduğu için artık son değerini almış oluyor. hiz için artırma azaltma gibi değerini değiştirecek bir işlem yapamayız sadece o değeri kullanarak işlem yapıp başka bir değere atıyoruz.
	}
}

class Adet{
	int i=5;
}
