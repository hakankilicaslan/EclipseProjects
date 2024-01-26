package _29_Generic_Jenerik;

public class OgrenciMain {

	public static void main(String[] args) {

		//Nesne oluştururken tip olarak neyi seçtiysek artık o nesne üzerinden ulaştığımız dogumTarihi değişkeni de o tipte oluyor.
		//İlk nesne için tip String girildiği için artık o nesnenin dogumTarihi de String girilmiş oluyor.
		//İkinci nesne için tip Integer girildiği için artık o nesnenin dogumTarihi de Integer girilmiş oluyor.
		
		Ogrenci<String> ogr1=new Ogrenci<>(); //Ogrenci nesnesi oluştururken tip olarak String seçtiğimiz için artık dogumTarihi içinde tip olarak String seçmiş oluyoruz.
		ogr1.setDogumTarihi("12.02.1993");
		
		Ogrenci<Integer> ogr2=new Ogrenci<>(); //Ogrenci nesnesi oluştururken tip olarak Integer seçtiğimiz için artık dogumTarihi içinde tip olarak Integer seçmiş oluyoruz.
		ogr2.setDogumTarihi(2023);
		
		
		
	}

}
