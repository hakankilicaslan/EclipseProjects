package _31_Exceptions_Istisnalar_Hatalar.GunBulma;

public class GunBulmaMain {

	public static void main(String[] args) {

		//Bu sınıf içinde iki parametre alan bir metot olsun. İlk parametre String tipinde gün alacak. ikinci parametre int tipinde sayı alacak.
		//Şu kadar gün sonra hangi gündür onu öğrenmek istiyoruz. Geri dönüş olarak String tipinde gün değerini dönecek.
		//Gün ismi yanlış girilirse(cuama gibi) ve ikinci int değer sıfırdan küçük olursa da hata fırlatsın. Exception'ımız Checked Exception olsun. 
		
		GunBulma gunbulma=new GunBulma(); //Metodu çağırabilmek için GunBulma sınıfından bir nesne oluşturuyoruz ve gunbulma değişkenine atıyoruz.
		
		try {
			String arananGun=gunbulma.hangiGun("Cuma", 13); //Metot sonuna throws ile iki tane Checked Exception eklediğimiz için metot çağrılınca program hata oluşabileceğini öngördü ve try-catch bloğuna sarmalatmamızı istedi.
			System.out.println(arananGun);
		} catch (YanlisDegerException | YanlisIsimException e) { //İki ayrı catch bloğu açmak yerine tek catch içine ya da (|) kullanarak yazabiliriz. Hangisinden dolayı hata oluşacaksa onun için hata fırlatılacak.
			e.printStackTrace();
		} 
	}

}
