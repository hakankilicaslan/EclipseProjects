package _26_AnonymousInnerClass;

public class Runner {

	public static void main(String[] args) {
		
		/*
		 * BraunTermometre sınıfını sadece sicaklikOlc metodunu kullanmak için oluşturduk.
		 * sicaklikOlc metodunu çağırabilmek için o metodun bulunduğu interface'i implement eden BraunTermometre sınıfından nesneye ihtiyacımız var.
		 * Bundan dolayı ITermometre interface'ini implement eden BraunTermometre sınıfından bir nesne oluşturuyoruz.
		 * Oluşturduğumuz nesnenin referansını kullanarak sicaklikOlc() metodunu çağırabiliyoruz.
		 * Sadece interface içindeki bir metoda ulaşmak için yeni bir sınıf oluşturduk. Interface implement edip metodu override ettik. O sınıftan nesne oluşturup ancak o metodu çağırabildik.
		 * Tek bir iş için bu kadar uğraşmak yerine Anonymous Inner Type kullanarak tek seferde halledebiliriz.
		 * 
		 */
		
		BraunTermometre bt=new BraunTermometre();
		int sicaklik1=bt.sicaklikOlc();
		System.out.println(sicaklik1);
		
		/*
		 * Interfacelerden nesne oluşturulamaz demiştik yani new keywordü kullanılamaz.
		 * ITermometre it1=new ITermometre(); diyerek interfaceden nesne oluşturmaya kalktığımızda hata alıyoruz.
		 * 
		 * ITermometre it1=new ITermometre() derken Anonymous Inner Type kullanırsak arka planda bizim için isimsiz bir sınıf üretiyor.
		 * ITermometre interface'ini implement etmiş gibi isimsiz sınıftan new ile yeni bir nesne oluşturuyor.
		 * ITermometre implement etmiş gibi içindeki metodu override ediyor ve kullanmamızı sağlıyor.
		 * Bu sayede BraunTermometre sınıfının yaptığı işi Anonymous Inner Type kullanarak tek seferde halletmiş oluyoruz.
		 * Bizi BraunTermometre sınıfını oluşturup ITermometre implement edip içindeki metodu override etmekten daha sonra bu sınıftan nesne oluşturup metodu çağırmaktan kurtarıyor.
		 * Anonymous Inner Type -> Gereksiz nesne üretiminden kaçınmak için kullanılabilir. Kodun okunurluğunu artırır ama küçük ve geçici işlemler için kullanılır.
		 * 
		 */
		
	  	//Anonymous Inner Type Kullanımı:	
		ITermometre it1=new ITermometre() { 
			
			@Override
			public int sicaklikOlc() {
				return 30;
			}
			
		};
		
		int sicaklik2=it1.sicaklikOlc();
		System.out.println(sicaklik2);
		
		//Anonymous Inner Type yapısı baz alınarak lambda ifadeleri javada(Java8 ve sonrasında) kullanılmaya başlandı.
		//LAMBDA EXPRESSION -> Anonymous Inner Type kullanımının alternatifi lambda expr. kullanmak için interface/abstract class içinde sadece 1 tane abstract metot olmak zorundadır.
		ITermometre it2=()->50; //ITermometre interface içinde sadece sicaklikOlc() metodu olduğu için Lambda Expression kullanarak 50 değerini dönmesini sağladık ama başka bir metot daha olsaydı kullanamazdık.
		int sicaklik3=it2.sicaklikOlc();
		System.out.println(sicaklik3);
		
		//METOT REFERANSLARI -> Anonymous Inner Type kullanımının diğer alternatifi
		Runner r=new Runner(); //Runner sınıfımız statik deneme() metodumuz olmadığı için Runner sınıfı üzerinden yeni bir nesne oluşturup metodu öyle çağırıyoruz.
		r.deneme();
		
	}
	
	public void deneme() {
		ITermometre it3=this::sicaklikOlc; //this bu sınıfı temsil ediyor ve :: diyerek bu sınıf içindeki sicaklikOlc() metodunu çalıştır demiş oluyoruz. Bu şekilde metot referansı yapmış oluyoruz.
		int sicaklik4=it3.sicaklikOlc();
		System.out.println(sicaklik4);
	}
	
	public int sicaklikOlc() {
		return 130;
	}
	
}
