package _Threads;

public class ThreadSorun {
	
	public static int sayac;
	
	public static void main(String[] args) {
		
		threadleriBaslat();
		
	}

	public static void threadleriBaslat() {
		
		Thread th1=new Thread( () -> {
			for (int i = 0; i < 5000; i++) {
				//sayac++; //Bu işlem senkron olmalı.
				sayacArtir("Thread 1");
			}
			
		}); 
		
		Thread th2=new Thread( () -> {
			for (int i = 0; i < 5000; i++) {
				//sayac++;
				sayacArtir("Thread 2");
			}
			
		}); 
		
		th1.start();
		th2.start();
		
		System.out.println("Join Öncesi Sayaç: "+sayac);
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Join Sonrası Sayaç: "+sayac);
		
	}
	
	public static synchronized void sayacArtir(String threadName) {
		sayac++;
		System.out.println(threadName+": "+sayac);
	}

}
