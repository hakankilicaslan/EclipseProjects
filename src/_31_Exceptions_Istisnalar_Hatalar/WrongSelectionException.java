package _31_Exceptions_Istisnalar_Hatalar;

//Unchecked Exceptionlar runtime da hatalara sebep olurlar. Genellikle de kontrol edilmeleri gerekmez. NullPointerException, ArithmeticException vb. gibi
public class WrongSelectionException extends RuntimeException { //Bir Unchecked Exception oluşturmak istediğimiz için RuntimeException sınıfından miras alıyoruz.
	
	//Serileştirme mekanizmasında kullanılan bir kimlik numarasını temsil ediyor. Sınıfın yapısının değiştiği durumlarda güncellenmelidir. Aksi takdirde serileştirme işleminde uyumsuzluklar ortaya çıkabilir.
	private static final long serialVersionUID = 1L;

	//Boş Constructor:
	public WrongSelectionException() {
		super();
	}

	//Dolu Constructor: Dolu constructor oluşturarak hata fırlatılırken mesaj da verebilmesini sağlıyoruz.
	public WrongSelectionException(String mesaj) {
		super(mesaj);
	}
}
