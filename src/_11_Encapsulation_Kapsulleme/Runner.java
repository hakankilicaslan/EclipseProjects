package _11_Encapsulation_Kapsulleme;

public class Runner {
	
	public static void main(String[] args) {
		
		Otomobil oto1=new Otomobil();
		System.out.println(oto1.getHiz()); //getHiz diyerek oto1 için hız değerine erişebiliyoruz. İlk değer girilmediği için default olarak 0 değerini dönecek.
		oto1.marka="BMW";
		oto1.model="M8";
		oto1.yil=2022;
		
		oto1.setHiz(130); //setHiz metoduyla oto1'in hiz değeri olarak 130 ataması yaptık.
		System.out.println(oto1.getHiz());
		oto1.hizlan(20); //hizlan metoduyla hiz değerine 20 daha eklemiş olduk artık hızımız 150 oldu
		System.out.println(oto1.getHiz());
		
		System.out.println(oto1.bilgileriGetir());
		
		Motor motor1=new Motor();
		motor1.setSaseNo("17051993"); //saseNo değişkenimize dışardan bu değeri atadık eğer koşulu sağlıyorsa atadığımız değeri saseNo olarak alacak.
		motor1.bilgileriYaz();
		
	}
}
