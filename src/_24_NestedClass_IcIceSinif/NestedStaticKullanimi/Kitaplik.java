package _24_NestedClass_IcIceSinif.NestedStaticKullanimi;

public class Kitaplik { //Outer Class

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String kitaplikAdi;

	//Dolu Constructor:
	public Kitaplik(String kitaplikAdi) {
		super();
		this.kitaplikAdi = kitaplikAdi;
	}
	
	public void kitaplikBilgileriniYazdir() {
		System.out.println("Kitaplık Adı: "+kitaplikAdi);
	}
	
	public static class Kitap{ //Inner Class -> Bir sınıfın içerisinde başka bir sınıfı static olarakta tutabiliyoruz.
		
		//Nesne Değişkenleri:
		private String kitapAd;
		private String yayinEvi;
		
		//Dolu Constructor:
		public Kitap(String kitapAd, String yayinEvi) {
			super();
			this.kitapAd = kitapAd;
			this.yayinEvi = yayinEvi;
		}
		
		/*
		 * System.out.println("Kitaplık Adı: "+kitaplikAdi+" Kitap Adı: "+kitapAd+" YayınEvi "+yayinEvi); -> yazdırmaya çalışırken hata alıyoruz.
		 * Çünkü Inner Class static olarak tanımladık ama Outer Class static olarak tanımlanmadı.
		 * Statik sınıfların içinde sadece statik ögeler tutabiliriz. Kitap sınıfından Kitaplık sınıfının herhangi bir değişkenine erişemiyoruz.
		 * Bundan dolayı kitaplikAdi statik olmayan bir sınıfın statik olmayan bir elemanı olduğu için ona ulaşıp yazdıramıyoruz.
		 * 
		 */
		
		public void kitapBilgileriniYazdir() {
			//System.out.println("Kitaplık Adı: "+kitaplikAdi+" Kitap Adı: "+kitapAd+" YayınEvi "+yayinEvi);
			System.out.println("Kitap Adı: "+kitapAd+" YayınEvi: "+yayinEvi);
		}
		
	}
	
}
