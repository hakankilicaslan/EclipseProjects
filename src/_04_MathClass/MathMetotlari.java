package _04_MathClass;

public class MathMetotlari {

	public static void main(String[] args) {
		
		// MathSabitleri
		
		//Math.PI Math.E Math.TAU 
		//Math.PI=8.2; //PI bir math sabiti olduğu için yani final bir değer olduğu için yeni bir değer atayamıyoruz.
		System.out.println(Math.PI); //PI sabitini yazdırıyor.
		
		
		//MathMetotları
		int X=2;
		int y=5;
		//Math.abs(x);    |2|         //Sayının mutlak değerini alır.
		//Math.max(x,y);   5          //Büyük olan sayıyı verir.
		//Math.min(x,y);   2          //Küçük olan sayıyı verir.
		//Math.pow(x,y);   32         //x üssü y sonucunu verir.
		//Math.sqrt(x);    Karekök 2  //Sayının karekökünü verir.
		//Math.ceil(5.4);  6.0        //Verilen sayıyı yukarıya yuvarlar.
		//Math.floor(5.9); 5.0        //Verilen sayıyı aşağı yuvarlar.
		//Math.round(7.3); 7.0        //Verilen sayıyı en yakın tam sayıya yuvarlar.
		//Math.random();              //0 ile 1 arasında rastgele bir sayı döndürür.
		
		
		//Daire alanını hesaplama
		int r=5;
		double alan=Math.PI*Math.pow(r,2);
			System.out.println("Yarıçapı 5 olan dairenin alanı: "+alan);
		
			
		System.out.println("*************");
			
			
		//Math.random() ile 0'dan 10'a kadar sayı üretme
		int rastgeleSayi=(int)(Math.random()*10); //0 ile 1 arasında bir sayı ürettik ve 10 ile çarptık. Sayımız double olduğu için başına (int) ekledik. Ondalıklı kısmı attı ve sayımız 0 ile 10 arasında bir sayıya dönüştü.
			System.out.println("0 ile 10 arası rastgele sayı: "+rastgeleSayi);
	}
}
