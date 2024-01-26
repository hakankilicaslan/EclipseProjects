package _31_Exceptions_Istisnalar_Hatalar;

import java.util.Scanner;

public class WrongSelectionExceptionMain {
	
	public static void main(String[] args) {
		
		//Bir matematik işlemi yapan menü oluşturalım ve kullanıcı yanlış seçim yaptığında hata fırlatan bir Exception oluşturalım.
		
		int sayi1=20;
		int sayi2=5;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Matematik İşlemleri"+"\n1-Toplama İşlemi"+"\n2-Çıkarma İşlemi"+"\n3-Çarpma İşlemi"+"\n4-Bölme İşlemi"+"\n0-Çıkış");
		
		//WrongSelectionException RuntimeException sınıfından miras aldığı için bir Unchecked Exception oldu. Bundan dolayı program bizi try-catch bloğu ile sarmalatmaya zorlamadığından biz kendimiz almalıyız.
		//Hatanın olduğu yeri yani default kısmında WrongSelectionException eklediğimiz kısmı try bloğunun içine almalıyız. Bundan dolayı tüm switch-case'i try bloğu içine alıyoruz.
		
		try {
			int secim= sc.nextInt(); sc.nextLine(); sc.close();
			switch (secim) {
		case 1:
			System.out.println(sayi1+sayi2);
			break;
		case 2:
			System.out.println(sayi1-sayi2);
			break;
		case 3:
			System.out.println(sayi1*sayi2);
			break;
		case 4:
			System.out.println(sayi1/sayi2);
			break;
		case 0:
			System.exit(0);
			break;
		default:
			throw new WrongSelectionException("0 ile 4 arasi secim yapmalisiniz..."); //Kullanıcı 0-4 arası seçim yapmadığında throw new diyerek oluşturduğumuz WrongSelectionException fırlatılacak ve içindeki mesaj yazdırılacak.
			//break; //break kısmına erişemediği için hata veriyor. Zaten yanlış değer girildiğinde direkt hata fırlatacağı için break satırına geçemiyoruz.
			}
		} catch (Exception e) { //catch kısmına direkt Exception geliyor ama biz kendi oluşturduğumuz WrongSelectionException da koyabiliriz. Integer değer girmediği zamanda program durmasın hata fırlatabilelim diye Exception olarak bıraktım.
			e.printStackTrace();
		}
		
		System.out.println("Program çalışmaya devam ediyor...");
		
	}

}
