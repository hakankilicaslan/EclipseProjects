package _ZamanlanmisThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {

	private static long start;
	
	public static void main(String[] args) {

		System.out.println("Uygulama başladı...");
		
		start=System.currentTimeMillis();
		
		//Geriye değer dönmeyen işlemler için Runnable ama geriye değer dönmemiz gerekiyorsa Callable kullanabiliriz.
		Runnable r1=() -> {
			System.out.println("Birinci uygulama çalıştı.");
			System.out.println("Çalışma zamanı: "+(System.currentTimeMillis()-start));
		};
		
		Runnable r2=() -> {
			System.out.println("İkinci uygulama çalıştı.");
			System.out.println("Çalışma zamanı: "+(System.currentTimeMillis()-start));
		};
		
		ScheduledExecutorService ses=Executors.newSingleThreadScheduledExecutor();
		ses.schedule(r1, 5, TimeUnit.SECONDS);
		ses.schedule(r2, 5, TimeUnit.SECONDS);
		
		ses.scheduleAtFixedRate(r1, 10, 5, TimeUnit.SECONDS); //10sn bekle her 5 snde bir çalış
		
	}

}
