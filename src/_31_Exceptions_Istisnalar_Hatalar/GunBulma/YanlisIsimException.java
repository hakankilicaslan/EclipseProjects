package _31_Exceptions_Istisnalar_Hatalar.GunBulma;

public class YanlisIsimException extends GunException{ //GunException sınıfından miras aldığımız için ve GunException sınıfı da Exception sınıfından miras aldığı için dolaylı olarak YanlisIsimException'da Exception sınıfından miras alıyor ve Checked Exception oluyor.

	//Serileştirme mekanizmasında kullanılan bir kimlik numarasını temsil ediyor. Sınıfın yapısının değiştiği durumlarda güncellenmelidir. Aksi takdirde serileştirme işleminde uyumsuzluklar ortaya çıkabilir.
	private static final long serialVersionUID = 1L;

	//Dolu Constructor: Dolu constructor oluşturarak hata fırlatılırken mesaj da verebilmesini sağlıyoruz.
	public YanlisIsimException(String mesaj) {
		super(mesaj);
		
	}

}
