package _24_NestedClass_IcIceSinif;

/*
 * Nested Class: İç içe yerleştirilen sınıflar anlamına gelir.
 * Outer Class olarak Universite sınıfını oluşturduk. Bu sınıfın içine de Inner Class olarak Ogrenci sınıfını oluşturduk.
 * 
 */

public class Universite { //Outer Class

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String ad;

	//Dolu Constructor:
	public Universite(String ad) {
		super();
		this.ad = ad;
	}
	
	public class Ogrenci{ //Inner Class
		
		//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
		private String ogrenciAd;
		private int ogrenciNo;
		
		//Dolu Constructor:
		public Ogrenci(String ogrenciAd, int ogrenciNo) {
			super();
			this.ogrenciAd = ogrenciAd;
			this.ogrenciNo = ogrenciNo;
		}
		
		public void ogrenciBilgiGetir() {
			System.out.println("Üniversite Adı: "+ad+" Öğrenci Adı: "+ogrenciAd+" Öğrenci No: "+ogrenciNo);
		}
			
	}
	
}
