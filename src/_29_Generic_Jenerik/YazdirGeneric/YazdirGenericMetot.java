package _29_Generic_Jenerik.YazdirGeneric;

public class YazdirGenericMetot {

	//Generic Metot: Hem metot tanımlamasında hem de parametre olarak <T> veriyoruz.
	//Bu şekilde tek nesne üzerinden metoda ulaşıp hangi tipte referans olursa olsun metodu kullanmasını sağlıyoruz. 
	public <T> void yazdir(T[] dizi) {
		for (T item : dizi) {
			System.out.println(item);
		}
	}
}
