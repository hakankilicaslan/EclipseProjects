package _31_Exceptions_Istisnalar_Hatalar.GunBulma;

public class GunException extends Exception{ //GunException'ın Checked Exception olmasını istediğimiz için Exception sınıfından miras alıyoruz.

	//Oluşabilecek iki hata durumu olduğu için yani hem gün ismi yanlış girilebileceği için hem de gün sayısı eksi değer girilebileceği için iki tane ayrı ayrı exception tanımladık.
	//Bu exceptionlarında GunException sınıfından miras almasını sağladık. GunException da Exception sınıfından miras aldığı için excepitonların hepsi Checked Exception oldu.
	//Üç ayrı exception kullanmak yerine YanlisDegerException ve YanlisIsimException tanımlayıp Exception sınıfından miras aldırıp GunException sınıfını kullanmadan da yapabilirdik.
	
	//Serileştirme mekanizmasında kullanılan bir kimlik numarasını temsil ediyor. Sınıfın yapısının değiştiği durumlarda güncellenmelidir. Aksi takdirde serileştirme işleminde uyumsuzluklar ortaya çıkabilir.
	private static final long serialVersionUID = 1L;

	//Dolu Constructor: Dolu constructor oluşturarak hata fırlatılırken mesaj da verebilmesini sağlıyoruz.
	public GunException(String mesaj) {
		super(mesaj);
	}
}
