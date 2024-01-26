package _22_Enum_Numaralandirma;

public class RenkEnum {

	enum Renk{ //İçinde bulunduğumuz sınıfta da enum tanımlayabiliriz.
		KIRMIZI,
		YESIL,
		MAVI;
		
		//Boş Constructor:
		private Renk() {
			System.out.println("Default construtor çalıştı."); //Constructor çalışırken enum içindeki tüm elemanlar için çalışıyor. Enum çağrıldığında bütün elemanlar oluşturuluyor.
		}
	}
	
	public static void main(String[] args) {
		
		//Renk renk1=Renk.KIRMIZI; //Renk enumdan bir elemanı onun referansına bu şekilde atayabiliriz. Artık renk1 KIRMIZI value tutacak. Yine enum çağrıldığında default constructor 3 eleman içinde çalışmış yani oluşturulmuş olacak.
		
		Renk[] renkDizisi=Renk.values(); //Sınıf içinde tanımladığımız enum içinde yine values() ile değerlerini bir diziye atıp ulaşabiliyoruz.
		for (Renk renk : renkDizisi) {
			System.out.println(renk+" Index: "+renk.ordinal());
		}
		
		System.out.println(Renk.valueOf("KIRMIZI")); //valueOf() ile String bir ifade verdiğimizde bunun enum içindeki karşılığını dönüyor. Value zaten KIRMIZI olduğu için onu bize geri döndü.
	}
}
