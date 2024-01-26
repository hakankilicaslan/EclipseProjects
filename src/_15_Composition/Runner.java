package _15_Composition;

public class Runner {

	public static void main(String[] args) {
		
		//Composition: Odalarımız Ev sınıfı içerisinde oluşturulduğu için arada sıkı bir bağlılık durumu var. Ev kaldırıldığında Odalarımızı da kaybediyoruz.
		Ev ev1=new Ev();
		ev1.evBilgileriGetir();
		
		//Aggregation: Odalarımızı EvAgg içirisinde değil dışarda oluşturup daha sonra EvAgg içine ekleyerek aradaki bağlılığın daha gevşek olmasını sağladık. Odalarımızı dışarda oluşturduğumuz için EvAgg kaldırıldığında Odalarımızı da kaybetmiyoruz. 
		EvAgg ev2=new EvAgg();
		Oda oda1=new Oda(1,"Mutfak");
		ev2.odaEkle(oda1);
		Oda oda2=new Oda(2,"Banyo");
		ev2.odaEkle(oda2);
		ev2.evBilgileriGetir();
	}
}
