package _09_OOP_Siniflar;

public class Runner {

	public static void main(String[] args) {
	//Kullandığımız metotlar ve main metodu stack içinde tutuluyor ama işi bittikten sonra ordan kaldırılıyor. Stack->Primitive Type ya da adresler tutuluyor
	//Özellikler sınıf değişkenleri ise Heap içinde tutuluyor ve belli bir süre Garbage Collector kaldırana kadar orada tutuluyor. Heap->Nesneler ve bazı referanslar tutuluyor.
		
	//Program her RUN edildiğinde tekrardan yeni nesne oluşturuyor, tekrardan o atamaları yapıyor son satıra kadar bütün kodların üstünden tekrar geçiyor yani new diyerek oluşturduğumuz nesneler her run edildiğinde yeniden oluşturulmuş oluyor.	
		
	Otomobil otomobil1=new Otomobil(); //new keywordü ile Constructor metot çağırarak yeni bir nesne oluşturduk. (boş yani default constructor sayesinde oluşturduk). Constructorlar new olmadan çağrılamaz.
	//new Otomobil(); dediğimizde her seferinde başka bir nesne oluşturmuş oluyoruz yani bir önceki oluşturduğumuz nesneden farklı adreste yeni bir nesne oluşturuyoruz.
	//Otomobil sınıfında otomobil1 diye yeni bir nesne oluşturduk. Artık otomobil1. dediğimizde Otomobil sınfındaki özelliklere ve metotlara ulaşabiliyoruz. 
	System.out.println(otomobil1.bilgileriGetir());	//bilgileriGetir dediğimizde yeni oluşturduğumuz nesneye değer ataması yapmadığımız için başlangıç yani default değerleri yazdırmış oluyoruz.
	otomobil1.marka="Audi";
	otomobil1.model="A8";
	otomobil1.yil=2023;
	otomobil1.km=0;
	otomobil1.hiz=0; //Oluşturduğumuz nesneye Otomobil sınıfındaki sınıf değişkenlerine yani özelliklere ulaşarak yeni nesnemize değerler atamış olduk.
	System.out.println(otomobil1.marka); //Artık otomobil1'in marka değişkenine Audi atamış olduk ve yazdırdığımızda markayı Audi diye yazdıracak.
	System.out.println(otomobil1.bilgileriGetir());	//Nesnemize artık değerler atadığımız için bilgileriGetir dediğimizde yeni verilen değerleri bize yazdırıyor.
	
	System.out.println("*************");
	
	Otomobil otomobil2=new Otomobil(); //new Otomobil(); diyerek yukarıdakinden farklı olarak yeni bir nesne daha oluşturmuş olduk. Sınıf içinde istediğimiz kadar yeni nesne oluşturabiliriz.
	otomobil2.marka="BMW";
	otomobil2.model="M8";
	otomobil2.yil=2023;
	System.out.println(otomobil2.bilgileriGetir());
	otomobil2.hizlan(50); //hizlan metodunu çağırıp hızımızı 50 artırmış olduk. İlk default değerimiz 0 olduğu için artık hızımız 50 olacak.
	System.out.println(otomobil2.bilgileriGetir());	
	otomobil2.hizlan(80); //Tekrar hizlan metodunu çağırırsak artık hızımız 50 olduğu için 80 daha eklemiş olacağız ve hızımız 130 olacak.
	System.out.println(otomobil2.bilgileriGetir());
	
	System.out.println("*************");
	
	otomobil1=otomobil2; //Bu durumda otomobil1 artık otomobil2 ile aynı adresi gösteriyor. Artık otomobil1 de otomobil2 nin değerlerini gösterecek. otomobil1 için önceden verilen değerlere artık o adresi göstermediği için ulaşamayız.
	System.out.println(otomobil1.marka); //BMW
	System.out.println(otomobil2.marka); //BMW
	otomobil2.marka="Mercedes"; //otomobil1 ve otomobil2 de aynı adresi gösterdiği için markayı değiştirdiğimiz de ikisininde markaları değişmiş oluyor.
	System.out.println(otomobil1.marka); //Mercedes
	System.out.println(otomobil2.marka); //Mercedes
	
	System.out.println("*************");
	
	Otomobil otomobil3=new Otomobil();
	otomobil3.marka="Volvo";
	otomobil3.model="XC90";
	otomobil3.yil=2020;
	otomobil3.km=0;
	otomobil3.hiz=0;
	
	System.out.println(otomobil3.bilgileriGetir());
	//System.out.println(otomobil3.hizlan(130)); //hizlan metodumuz void olduğu için geriye değer dönmüyor bundan dolayı sout diyerek yazdıramıyoruz. Alt satırdaki gibi sadece metodumuzu çağırabiliriz.
	otomobil3.hizlan(130);
	System.out.println(otomobil3.bilgileriGetir());
	System.out.println("Geçen süre: "+otomobil3.git(1300)+" saat"); //git metodumuz return olarak zamanı döndüğü için sout diyerek yazdırabildik.
	System.out.println(otomobil3.bilgileriGetir());
	
	System.out.println("*************");
	
	Motor motor1=new Motor();
	motor1.beygir=100;
	motor1.motorHacmi=1500;
	motor1.saseNo="AF14 5241";
	motor1.tork=300;
	
	otomobil1.motor=motor1; //otomobil1'in motoru motor1'in adresini göstermesini sağladık yani anlayacağımız şekilde motor1 motorunu otomobil1 otomobiline taktık diyebiliriz.
	System.out.println("Motor Hacmi: "+otomobil1.motor.motorHacmi); //otomobil1 motoru artık motor1 ile aynı adresi göstediği için otomobil1.motor.motorHacmi diyerek motor1 içinde motorHacmi'ne ulaşabiliyoruz.
	otomobil1.motor.bilgileriYaz(); //bilgileriYaz metodumuz void olduğu için geriye dönmüyor o yüzden sout dersek değer dönmediği için yazdıramayız. void olduğu için çağırdığımızda direkt değerleri yazıyor.
	
	System.out.println("*************");
	
	//Otomobil nesnesi oluştururken boş olarak değil de içine değişkenleri atayarakta oluşturabilmek için dolu constructor kullanıyoruz. Bunu yapabilmek için default boş constructoru kaldırıyoruz yani yazmıyoruz. 
	//Normalde boş constructor yazmasakta hiçbir constructor yazılmadığı için kendi arka planda oluşturuyordu ama biz dolu constructor yazarsak artık boş constructor oluşturmuyor. Bu yüzden artık nesne oluştururken boş olarak oluşturamıyoruz.
	//Hem boş hem dolu constructor yazarsak bu durumda hem değişken girmeden boş nesne hem değişken ekleyerek dolu nesne oluşturabiliyoruz.
	Otomobil otomobil4=new Otomobil("Volkswagen","Golf",2013,140000,210,motor1); //Önceki otomobil nesnelerini parametresiz boş olarak oluşturduğumuz için default constructor çalışmış ve ekrana sout olarak "Otomobil classında default constructor çalıştı." çıktısını da yazdırmıştık ama bu nesneyi dolu constructor kullanarak oluşturduğumuz için bu sefer bu çıktıyı yazmadı.
	System.out.println(otomobil4.bilgileriGetir());
	otomobil4.model="Polo"; //Yeni nesne oluşturulurken parametreleri vererek dolu constructor ile oluşturduk ama daha sonra modeli golf değil de polo olsun istersek modeline polo atamış oluyoruz. Bunu yapınca artık modelimiz polo olarak devam edecek.
	System.out.println(otomobil4.bilgileriGetir());
	
	Otomobil otomobil5=new Otomobil("Seat","Leon"); //İki parametreli bir nesne oluşturuyoruz ve iki parametreli constructor'a gidip this(); metodu ile kalan parametreleri elimizle girerek 6 parametreli constructor çağırıp nesne oluşturmuş oluyoruz.
	System.out.println(otomobil5.bilgileriGetir());
	
	System.out.println("*************");
	
	System.out.println(otomobil1.tekerSayisi); 
	System.out.println(otomobil5.tekerSayisi);
	System.out.println(Otomobil.tekerSayisi); //otomobil1 diyerek nesne üzerinde tekerSayisi'na ulaşabildiğimiz gibi static değişken yani sınıf değişkeni olduğu için Otomobil sınıfı üzerinden de tekerSayisi'na ulaşabiliyoruz.
	otomobil3.tekerSayisi=5; //otomobil3 nesnesinin tekerSayisini 5 olarak değiştirdiğimiz de artık nesne bazında değil static olduğu yani sınıf değişkeni olduğu için bütün sınıfın tekerSayisini 5 olarak atamış oluyoruz. Çünkü tekerSayisi otomobil3'e ait değil Otomobil sınıfına ait olduğu için sınıf bazında değişiklik yapıyor. 
	System.out.println(otomobil2.tekerSayisi);
	
	Otomobil.uretilenOtomobilSayisiYazdir(); //Constructor çağrılarak oluşturulan yeni nesne sayısı yani otomobil sayısını veriyor. uretilenOtomobilSayisi static yani sınıf değişkeni olduğu için Otomobil. diyerek erişip yazdırabiliyoruz.
	}
}
