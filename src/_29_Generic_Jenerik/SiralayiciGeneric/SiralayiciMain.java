package _29_Generic_Jenerik.SiralayiciGeneric;

import java.util.ArrayList;
import java.util.List;

public class SiralayiciMain {

	public static void main(String[] args) {

		List<Integer> liste1=new ArrayList<>(); //Yeni bir ArrayList sınıfı nesnesi oluşturup List referansının onu göstermesini sağlıyoruz ve içine add() metoduyla sayılar ekliyoruz. 
		
		liste1.add(17);
		liste1.add(5);
		liste1.add(12);
		liste1.add(2);
		liste1.add(93);
		
		//Metodumuz static olduğu için nesne oluşturmadan direkt sınıf üzerinden erişebiliyoruz.
		//Metodumuzda T extends Number&Comparable etme koşulu olduğu için sadece bu koşulu sağlayanlar metodumuzu çağırıp kullanabilecek.
		//liste1 içindeki elemanlarımız Integer olduğu için ve Integer sınıfı da Number sınıfından miras aldığı ve Comparable interface'ini implement ettiği için metodumuzu çağırıp kullanabiliyoruz.
		Siralayici.sirala(liste1); 
		
		List<String> liste2=new ArrayList<>(); //Yeni bir ArrayList sınıfı nesnesi oluşturup List referansının onu göstermesini sağlıyoruz ve içine add() metoduyla String ifadeler ekliyoruz. 
		
		liste2.add("Hakan");
		liste2.add("Selma");
		liste2.add("Gökhan");
		liste2.add("Volkan");
		liste2.add("Sultan");
		
		//Metodumuz static olduğu için nesne oluşturmadan direkt sınıf üzerinden erişebiliyoruz.
		//Metodumuzda T extends Number&Comparable etme koşulu olduğu için sadece bu koşulu sağlayanlar metodumuzu çağırıp kullanabilecek.
		//liste2 içindeki elemanlarımız String olduğu için ve String sınıfı Comparable interface'ini implement etmesine rağmen Number sınıfından miras almadığı için metodumuzu çağırıp kullanamıyoruz.
		//Siralayici.sirala(liste2);

	}

}
