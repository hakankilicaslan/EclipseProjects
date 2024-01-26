package _Threads;
/*
 * Thread Life Cycle:
 * New      : Threadin yeni yaratıldığı durum
 * Runnable : Start metodu ile geçilen durum
 * Running  : Threadin çalışmaya başladığında geçtiği durum
 * Blocked  : Bir başka thread tarafından geçici olarak pasifize edildiği durum. (Lock)
 * Waiting  : Timeout, Sleep ile beklemeye geçtiği durum.
 * Dead     : Thread içindeki tüm işlemleri bitirince geçtiği durum
 * 
 * ExecutorsService: Thread yönetimini devralan yapı. Thread oluşturma/sonlandırma işlemlerini devralır.
 * 
 */
public class MyThread extends Thread{

	String isim;

	public MyThread(String isim) {
		super();
		this.isim = isim;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public void run() {
		System.out.println(isim+" isimli thread çalışıyor: "+Thread.currentThread().toString());
		for (int i = 0; i < 5 ; i++) {
			System.out.println(isim+" yazdı"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(isim+" isimli thread çalışmayı bitirdi.");
	}

}
