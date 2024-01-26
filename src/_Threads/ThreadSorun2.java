package _Threads;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSorun2 {

	public static void main(String[] args) {

		//int i=1;
		AtomicInteger i=new AtomicInteger(1);
		List<String> isimListesi=List.of("Hakan","Selma","Volkan","Burcu","Gökhan","Gökçen");
		isimListesi.forEach(x->{
			System.out.println(i+".Kişi: "+x);
			//i++;
			i.getAndIncrement(); //i++ yerine metodu kullanıyoruz.
		});
	}

}
