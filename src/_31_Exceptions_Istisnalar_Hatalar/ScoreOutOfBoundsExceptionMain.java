package _31_Exceptions_Istisnalar_Hatalar;

public class ScoreOutOfBoundsExceptionMain {

	public static void main(String[] args) {

		//Sadece 0 ile 100 arası not girilmesi gerekiyor. Haricinde not girilmesi durumu için kendimiz bir Exception oluşturalım.
		
		try {
			notKontrol(130); //ScoreOutOfBoundsException bir Checked Exception'a dönüştüğü için mecbur try-catch ile sarmalamamız gerekiyor.
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage()); //e.getMessage() ile ScoreOutOfBoundsException içine yazdığımız değeri yani mesajı alıyoruz.
		}
		
		System.out.println("Program çalışmaya devam ediyor...");
		
	}
	
	public static void notKontrol(int not) throws ScoreOutOfBoundsException { //Exception'ımız Exception sınıfından mira aldığı için Checked Exception oldu ve metodun sonuna throws ScoreOutOfBoundsException yazmak zorunda kaldık.
		
		//throw new kısmına bir Checked Exception eklersek metodun sonuna mecburen throws diyerek ekliyoruz ve metot çağrılırken mecburen try-catch kullandırtıyoruz.
		//throw new kısmına Unchecked Exception girdiğimizde metodun throws etmesine ve metodun çağrıldığı yerin try-catch kullanmasını mecbur kılamıyoruz.
		//Biz kendimiz bir ScoreOutOfBoundsException isminde bir Exception oluşturuyoruz ve yanlış değer girildiği zaman onun fırlatılmasını istiyoruz. 
		//ScoreOutOfBoundsException, Exception sınıfından miras aldırdığımız için bir Checked Exception oldu. Mecburen metot sonuna throws edip çağrıldığı yerde try-catch kullanılması gerekiyor.
		if(not<0 || not>100) { //Girilen not 0-100 arasında değilse koşuluna sokup bir Exception fırlatıyoruz.
			throw new ScoreOutOfBoundsException("Not 0-100 arasinda olmalidir."); //Parametre olarak girilen String değer hata fırlatılırken mesaj olarak gösteriliyor.
		}else
			System.out.println("Not girişi başarılı...");
	}
	
}
