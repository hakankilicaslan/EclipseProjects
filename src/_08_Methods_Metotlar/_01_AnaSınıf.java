package _08_Methods_Metotlar;

public class _01_AnaSınıf {

	public static void main(String[] args) {
		
		//(_02_YardimciSinif.cagiracagimizMetotAdi();) -> Aynı package içinde olduğunda diğer sınıftan metot çağırmak için sınıf ve metot adı ile çağırabiliriz.
		//(import _06_Metotlar._02_YardimciSinif;) -> _02_YardimciSinif farklı bir package içinde olsaydı bu şekilde import package sınıf şeklinde import edip sınıf adı ve metot ile çağırabiliriz.
		//(_06_Metotlar._02_YardimciSinif.cagiracagimizMetotAdi();) -> Farklı bir package içinden çağırırken her seferinde package ve sınıf ismi yazarakta package sınıf metot adı ile çağırabiliriz.
		//(import static _06_Metotlar._02_YardimciSinif.*;) -> Package ve sınıf ismini her metot çağırdığımızda kullanmak istemezsek o zamanda static metotlar için her seferinde sınıf adını yazmaktan kurtulmak için import static package sınıf * ile import edip sadece metot adını çağırmak yeterli olacaktır.
		
		int enBuyuk=_02_YardimciSinif.max(5,8); 
		System.out.println(enBuyuk);
		
		System.out.println(_02_YardimciSinif.max(5,8,13));
		
		System.out.println(_02_YardimciSinif.max(20,30)); 
		
		System.out.println(_02_YardimciSinif.topla(5,10));
		
		System.out.println(_02_YardimciSinif.karesi(10));
		
		double cekimKuvveti=_02_YardimciSinif.gravity()*80/20;
		System.out.println(cekimKuvveti);
		
		for (int i = 1; i<=5 ; i++) 
			_02_YardimciSinif.isim();
		
		System.out.println(_02_YardimciSinif.cokluTopla(1,2,3,4,5,6,7,8,9,10));

		int j=10;
		int metottanGelenDeger=_02_YardimciSinif.artir1(j); //primitive type olarak j değişkenini artir metotuna gönderdik ama sadece j değişkenindeki 10 değerini artir metotuna göndermiş olduk.
		System.out.println("j="+j ); //artir metotuna gönderdikten sonra tekrar j yazdırdığımızda değeri hala 10 görünüyor çünkü j primitive type olduğu için sadece değeri artir metotunda i değişkenine atamış oldu j de herhangi bir değişiklik olmadı.
		System.out.println("i="+metottanGelenDeger); //j değişkeninin değeri yani 10 metota gönderildi ve i artık 10 değerini aldı bir artırarak yazdırdığımızda i artık 11 değerini almış oldu.
		
		Adet adetReferansi=new Adet();
		System.out.println(adetReferansi.i); //adetReferansi adet nesnesiyle aynı yeri gösteriyor o yüzden adetReferansı artık 5 oldu.
		_02_YardimciSinif.artir2(adetReferansi);
		System.out.println(adetReferansi.i); //adetReferansi nesnesini artir metotuna gönderdik ve hem adet hem adetReferansi bir artmış oldu ve ikisi de artık adres olarak 6 gösteriyor.
		
		String deger=new String("10"); //Stringte nesne oluşturmamıza rağmen primitive type gibi davranıyor. Metota göndermiş olsakta değerde herhangi bir değişiklik olmadı.
		System.out.println("Değer:"+deger);
		_02_YardimciSinif.ekle(deger);
		System.out.println("Değer:"+deger);
		
	} 		
}
