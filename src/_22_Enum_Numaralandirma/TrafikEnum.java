package _22_Enum_Numaralandirma;

enum TrafikIsiklar{ //Sınıfın içine tanımladığımız gibi sınıfın dışına aynı dosyaya da enum tanımlayabiliriz.
	
	KIRMIZI("DUR"),
	SARI("HAZIRLAN"),
	YESIL("GEÇ");
	
	private String durum;
	
	private TrafikIsiklar(String durum) {
		this.durum=durum;
	}
	
	public String getDurum() {
		return durum;
	}
	
}

public class TrafikEnum {

	public static void main(String[] args) {
		
		for (TrafikIsiklar isiklar : TrafikIsiklar.values()) { //TrafikIsiklar.values() bir dizi döndüğü için enum içindeki değerleri ve String durumları yazdırabiliyoruz.
			System.out.println(isiklar+"-->"+isiklar.getDurum());
		}
		
		//name() ile enum içindeki değeri String yaptığı için başka bir String ifadeye == ya da equals() kullanarak eşit olup olmadığı durumu sorgulayabiliriz.
		System.out.println(TrafikIsiklar.KIRMIZI.name()=="KIRMIZI");
		System.out.println(TrafikIsiklar.KIRMIZI.name().equals("KIRMIZI"));
		
		TrafikIsiklar isik1=null;
		System.out.println(isik1==TrafikIsiklar.KIRMIZI); //İçeriği değil adresleri kontrol ettiği için false dönecek.
		//System.out.println(isik1.equals(TrafikIsiklar.KIRMIZI)); //isik1 boş olduğu yani null olduğundan nesne olmadığı için equals() gibi herhangi bir metoda erişim sağlarken hata alırız.
		
		TrafikIsiklar isik2=TrafikIsiklar.KIRMIZI;
		System.out.println(isik2.equals(TrafikIsiklar.KIRMIZI)); //Artık isik2'nin içi dolu olduğu yani KIRMIZI atandığı için equals() metodunu kullanabiliyoruz.
	}

}
