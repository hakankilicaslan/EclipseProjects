package _29_Generic_Jenerik.SiralayiciGeneric;

import java.util.Collections;
import java.util.List;

/*
 * ?           : Genellikle bilinmeyen bir tür için kullanılır.
 * ? extends T : ? olan yere T sınıfından miras alan herhangi bir alt sınıf gelebilir.
 * ? super T   : ? olan yere T'nin üst sınıfı olan herhangi bir sınıf gelebilir.
 * T           : Tek başına kullanırsanız her tipi kabul eder.
 * 
 * < >         : Diamond -> bu bir operatör değildir.
 *
 */

public class Siralayici {
 
	//Collections.sort() metodu içine parametre olarak List aldığı için sirala() metodumuzun parametresini List olarak belirliyoruz.
	//Collections.sort() metodu T extends Comparable<T> istediği için yani çalışmak için Comparable interface'in implements edilmesini istediği için extends kısmına onu da ekliyoruz.
	//T extends Number diyerekte Collections.sort() metodunu sadece içinde tür olarak Number barındıran List'ler için kullanılmasını sağlıyoruz.
	//Nesne oluşturmadan direkt sınıf üzerinden metodumuza ulaşılabilinsin diye metodu static tanımlıyoruz.
	public static < T extends Number&Comparable<T> > void sirala(List<T> liste) {
		
		Collections.sort(liste); //Collections.sort() metodu içine parametre olarak verilen List atılıyor ve gelen liste sıralanmış oluyor.
		
		for (T item : liste) { //Parametre olarak verilen liste sıralandıktan sonra foreach döngüsünde elemanları tek tek yazdırıyoruz.
			System.out.println(item);
		}
		
	}
	
}
