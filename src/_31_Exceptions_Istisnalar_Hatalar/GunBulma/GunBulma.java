package _31_Exceptions_Istisnalar_Hatalar.GunBulma;

import java.util.List;

public class GunBulma {

	public String hangiGun(String gun, int gunSayisi) throws YanlisDegerException, YanlisIsimException { //İki hata fırlatılabilecek iki farklı durum olduğu için iki exceptionı da throws kısmına ekliyoruz. Hangisini içeren hata oluşursa onun hatası fırlatılacak.
		
		List<String> gunler=List.of("pazartesi","salı","çarşamba","perşembe","cuma","cumartesi","pazar"); //İçinde günleri barındıran bir liste oluşturuyoruz.
		
		//Parametre olarak girilen gun değeri gunler listemizin içinde var mı yok mu diye contains() metoduyla kontrol ediyoruz. Eğer yoksa throw new kısmından YanlisIsimException fırlatılacak.
		//gunler listemizdeki elemanların hepsini küçük harfle yazdık çünkü kullanıcı büyük harfle yazsa bile hata almamak için toLowerCase() metoduyla kullanıcının girdiği değerin harflerini küçültüp öyle şarta sokuyoruz.
		if(!gunler.contains(gun.toLowerCase())) 
			throw new YanlisIsimException("Gun degeri yanlis girildi...");
		
		//Parametre olarak girilen gunSayisi negatif olursa throw new kısmından YanlisDegerException fırlatılacak.
		if(gunSayisi<0) {
			throw new YanlisDegerException("Girilen gun sayisi negatif olamaz...");
		} 
		
		//Parametre olarak girilen gun değerinin büyük harfle girilme olasılığı olduğu için toLowerCase() metoduyla harflerini küçülterek indexini alıyoruz çünkü aksi durumda listemizle parametre olarak girilen gun değeri eşleşmeyebilir.
		//Daha sonra girilen değerin gunler listesinde hangi indexe denk geldiğini bulmak için indexOf() metodunu kullanıyoruz ve çıkan değeri int i değişkenine atıyoruz.
		int i=gunler.indexOf(gun.toLowerCase()); 
		
		//Verilen gun değerinin bulduğumuz listedeki indexi(yani i) üstüne parametre olarak verilen gunSayisi'nı ekliyoruz. Daha sonra çıkan değeri listemizin size'ına göre modunu alıp kalan değeri buluyoruz.
		//Bu çıkan değer bizim bulmamız gereken günün listedeki indexine denk geliyor. Daha sonra gunler.get() diyerek bu bulduğumuz indexle bulmamız gereken günü listeden çekiyoruz ve bulunanGun değişkenine atıyoruz.
		String bulunanGun=gunler.get((i+gunSayisi)%gunler.size());
		
		return bulunanGun;
		
	}
	
}
