package _15_Composition;

import java.util.ArrayList;
import java.util.List;

public class EvAgg {

	/*
	 * Aggregation:
	 * Odalarımızı EvAgg içinde oluşturmuyoruz.
	 * List oluşturup kullanıcıdan değer olarak dışardan girilmesini istiyoruz.
	 * Daha sonra EvAgg odalar eklemiş oluyoruz.
	 * Bu durumda EvAgg ile Odalar arasında daha gevşek bir bağlılık oluşturuluyor.
	 */
	private List<Oda> odalar;

	public EvAgg() {
		odalar=new ArrayList<>();
	}
	
	public void odaEkle(Oda oda) {
		odalar.add(oda);
	}
	
	public void evBilgileriGetir() {
		System.out.println("Bu evdeki odalarımız: ");
		for (Oda oda : odalar) {
			oda.odaBilgileriGetir();
		}
	}
}
