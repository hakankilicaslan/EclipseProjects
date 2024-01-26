package _15_Composition;

public class Ev {
	
	/*
	 * Composition:
	 * Odalarımızı Ev sınıfında constructor içinde oluşturuyoruz.
	 * Bu durumda Ev ile Odalar arasında sıkı bir bağlılık oluşturuyor.
	 * Genelde böyle bir durum istenmez.
	 * Ev ortadan kalkması durumunda arada bağlılık olduğu için Odalara erişimimiz kalmıyor.
	 */
	
	private Oda oda1;
	private Oda oda2;
	private Oda oda3;
	
	public Ev() { 
		this.oda1=new Oda(1, "Salon");
		this.oda2=new Oda(2, "Oturma odası");
		this.oda3=new Oda(3, "Yatak odası");
	}
	
	public void evBilgileriGetir() {
		System.out.println("Bu evdeki odalarımız: ");
		oda1.odaBilgileriGetir();
		oda2.odaBilgileriGetir();
		oda3.odaBilgileriGetir();
		
	}

}
