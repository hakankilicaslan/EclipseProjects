package _28_CollectionFramework;

public class Ogrenci implements Comparable<Ogrenci> { //implements Comparable<Ogrenci> diyerek Ogrenci sınıfını baz alarak sıralama yapabilsin diye Comparable Interface'den compareTo metodunu override ediyoruz.

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	private String ad;
	private int yas;
	private double ort;
	
	//Dolu Constructor:
	public Ogrenci(String ad, int yas, double ort) {
		super();
		this.ad = ad;
		this.yas = yas;
		this.ort = ort;
	}

	//Getters and Setters:
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public double getOrt() {
		return ort;
	}

	public void setOrt(double ort) {
		this.ort = ort;
	}

	//toString:
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", yas=" + yas + ", ort=" + ort + "]";
	}
	
	//compareTo metodu verilen değerler arasındaki fark büyükse pozitif, küçükse negatif, eşitse 0 dönüyor. Bu şekilde küçükten büyüğe doğru sıralıyor ama büyükten küçüğe doğru sıralamak istersek 1 ile -1 yer değiştiriyoruz ve büyükten küçüğe sıralıyor.
	@Override
	public int compareTo(Ogrenci o) {//this.ort o değeri o.ort da listedeki bir sonraki değeri alıyor ve karşılaştırıyor.
		if(this.ort<o.ort)      //Bir sonraki değerle karşılaştırınca küçükse negatif dönmesi lazım o yüzden -1 yazıyoruz.
			return -1;
		else if(this.ort>o.ort) //Bir sonraki değerle karşılaştırınca büyükse pozitif dönmesi lazım o yüzden 1 yazıyoruz.
			return 1;
		else 					//else durumu da eşitlik olduğu için 0 yazıyoruz.
			return 0;
		//if, else if şartına sokup uzatmak yerine direk aradaki farkları alıp farkın sonucuna göre yaptırabiliriz. return this.ort-o.ort; yaptığımızda yine fark negatifse küçük, pozitifse büyük, eşitse 0 dönecek.
		
		/*
		 * Küçükten Büyüğe Sıralama:
		 * double -> return(int)(this.ort-o.ort); int döndüğü için double çıkan farkı int'e cast ediyoruz.
		 * int -> return this.yas-o.yas;
		 * String -> return this.ad.compareTo(o.ad); //String ifadeler için compareTo() metodu ascii code'a göre aradaki farkları döndüğü için burada da kullanabiliriz.
		 * 
		 * Büyükten Küçüğe Sıralama: o.ort-this.ort yani sonraki değerden önceki değerin farkını alıyoruz.
		 * 
		 */
	}
	
	
}
