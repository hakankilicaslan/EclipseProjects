package _11_Encapsulation_Kapsulleme;

public class Motor {

	//Nesne Değişkenleri, Member Variable, Üye Değişkenler, Attributes, Fields
	public int motorHacmi;
	private String saseNo; //saseNo private yaptık ve dışardan direkt erişimi engellemiş olduk sadece bulunduğu sınıftan erişilebilecek. Kontrollü bir şekilde erişebilmesi ve değişiklik yapabilmesi içinde set ve get metotlarını kullanacağız. Bu metotlar dışardan erişilip çağrılacağı için public olmalıdır.
	public int tork;
	public int beygir;
	
	/*
	 * Sınıf içerisindeki nesne değişkenlerimize dışardan direkt erişim ve değişiklik yapılmasını istemediğiz durumlarda private yapıyoruz ve dışardan kontrollü erişim ve değişiklik yapılmasını sağlamak içinde get ve set metotlarını kullanıyoruz.
	 * Bu get set metotlarını tek tek yazmak yerine hazır bir şekilde oluşturmak için sağ tıklayıp Source -> Generate Getters and Setters... -> get set metodu oluşturmak istediğimiz nesne değişkenlerini seçiyoruz -> Generate tıklıyoruz. Bu şekilde bize hazır şekilde get ve set metotları yazdırılıyor.
	 *
	 */
	
	//saseNo 8 karakterden oluşması şartını koymak istiyoruz. Bu yüzden private yaptık ve get set metotları kullanarak kontrollü bir şekilde değişiklik yapılmasını ve erişilebilmesini sağlayacağız.
	public String getSaseNo() {
		return saseNo;
	}

	public void setSaseNo(String saseNo) { //set metodunda saseNo 8 karakterden oluşmasını istediğimiz için kullanıcının girdiği saseNo değeri için koşul oluşturuyoruz. 
		if(saseNo.length()>8) { 
			System.err.println("Sase no 8 karakterden olusmalidir. Ilk 8 karakteriniz alinir");
			this.saseNo = saseNo.substring(0,8);	
		}
		else if(saseNo.length()<8) {
			System.err.println("Sase no 8 karakterden olusmalidir.");
		}
		else {
			this.saseNo=saseNo;
		}
	}
	
	public void bilgileriYaz() {
		System.out.println("Motor Hacmi: "+motorHacmi+" Şase No: "+saseNo+" Tork: "+tork+" Beygir: "+beygir);
	
	}
}

