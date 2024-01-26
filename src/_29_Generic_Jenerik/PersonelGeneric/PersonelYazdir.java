package _29_Generic_Jenerik.PersonelGeneric;

public class PersonelYazdir {
	
	/*
	 * Generic Metot: Hem metot tanımlamasında hem de parametre olarak <T> veriyoruz.
	 * Bu şekilde tek nesne üzerinden metoda ulaşıp hangi tipte referans olursa olsun metodu kullanmasını sağlıyoruz. 
	 * T extends Personel diyerek Personel sınıfından miras alan sınıfların referansı üzerinden bu metoda erişilmesine yani metodu çağırmasına izin veriyoruz.
	 * Daha sonra T extends Personel&IPersonel diyerekte hem Personel sınıfından miras alan hem de IPersonel interface implement eden sınıfların referansı üzerinden bu metoda erişilmesine yani metodu çağırmasına izin veriyoruz.
	 * 
	 */
	
	public <T extends Personel&IPersonel> void yazdir(T[] dizi) {
		for (T item : dizi) {
			System.out.println(item);
		}
	}
	
}
