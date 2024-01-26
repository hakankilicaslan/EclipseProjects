package _03_StringClass;

public class _02_StringVsStringBuilder {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		String str1="Merhaba";
		
		int islemAdedi=100000;
		long baslangicZamani=System.currentTimeMillis(); //.currentTimeMillis() sistem zamanını veriyor.
		
		for(int i=0; i<islemAdedi; i++) 
			str1+=i;
		
		long bitisZamani=System.currentTimeMillis();
		System.out.println("İşlem bitti.String ile Geçen süre:" +(bitisZamani-baslangicZamani)); //1000ms=1sn
		//String ile oluşturduğumuz nesnenin for döngüsünde 1'den 100000'e kadar olan sayıları eklediğimizde ne kadar sürede çalıştığını bulduk.
		
		StringBuilder str2=new StringBuilder();
		str2.append("Merhaba");
		long baslangicZamaniSb=System.currentTimeMillis();
		
		for(int i=0; i<islemAdedi; i++) 
			str2.append(i);
	
		long bitisZamaniSb=System.currentTimeMillis();
		System.out.println("İşlem bitti.String Builder ile Geçen süre:" +(bitisZamaniSb-baslangicZamaniSb));
		//StringBuilder ile oluşturduğumuz nesnenin for döngüsünde 1'den 100000'e kadar olan sayıları eklediğimizde ne kadar sürede çalıştığını bulduk.
  }
}