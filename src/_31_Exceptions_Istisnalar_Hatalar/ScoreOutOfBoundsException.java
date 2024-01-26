package _31_Exceptions_Istisnalar_Hatalar;

public class ScoreOutOfBoundsException extends Exception { //Bir Checked Exception oluşturmak istediğimiz için Exception sınıfından miras alıyoruz. Unchecked Exception oluşturmak isteseydik RuntimeException sınıfından miras alabilirdik.

	//Serileştirme mekanizmasında kullanılan bir kimlik numarasını temsil ediyor. Sınıfın yapısının değiştiği durumlarda güncellenmelidir. Aksi takdirde serileştirme işleminde uyumsuzluklar ortaya çıkabilir.
	private static final long serialVersionUID = 1L;

	//Boş Constructor:
	public ScoreOutOfBoundsException() {
		super();
	}
	
	//Dolu Constructor: Dolu constructor oluşturarak hata fırlatılırken mesaj da verebilmesini sağlıyoruz.
	public ScoreOutOfBoundsException(String mesaj) {
		super(mesaj);
	}
	
}
